package com.ecommerce.controller;

import com.ecommerce.entity.TypeEntity;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.TypeService;
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
@RequestMapping("/api/type")
@Slf4j
public class TypeController {


   private final TypeService typeService;

    @PostMapping("/register")
    public ResponseEntity<TypeEntity> register(@RequestBody @Valid TypeEntity typeEntity) {
        log.debug("Registering user {}", typeEntity);
        return ResponseEntity.ok(typeService.save(typeEntity));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting user by id {}", id);
        typeService.deleteById(id);
        try {
            typeService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Page<TypeEntity>> findAllWithPagination(Pageable pageable) {
        log.debug("Finding all type");
        return ResponseEntity.ok(typeService.findAll(pageable));
    }






}
