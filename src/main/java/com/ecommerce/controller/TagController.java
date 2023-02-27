package com.ecommerce.controller;

import com.ecommerce.entity.TagEntity;
import com.ecommerce.entity.TypeEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.TagService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tag")
@Slf4j
public class TagController {

    private final TagService tagService;

    @PostMapping("/register")
    public ResponseEntity<TagEntity> register(@RequestBody @Valid TagEntity tagEntity) {
        log.debug("Registering tag {}", tagEntity);
        return ResponseEntity.ok(tagService.save(tagEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting tag by id {}", id);
        tagService.deleteById(id);
        try {
            tagService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Page<TagEntity>> findAllWithPagination(Pageable pageable) {
        log.debug("Finding all tags");
        return ResponseEntity.ok(tagService.findAll(pageable));
    }
}
