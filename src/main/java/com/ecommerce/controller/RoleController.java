package com.ecommerce.controller;

import com.ecommerce.entity.RoleEntity;
import com.ecommerce.entity.TypeEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.RoleService;
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
@RequestMapping("/api/role")
@Slf4j
public class RoleController {

    private final RoleService roleService;

    @PostMapping("/register")
    public ResponseEntity<RoleEntity> register(@RequestBody @Valid RoleEntity roleEntity) {
        log.debug("Registering role {}", roleEntity);
        return ResponseEntity.ok(roleService.save(roleEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting role by id {}", id);
        roleService.deleteById(id);
        try {
            roleService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Page<RoleEntity>> findAllWithPagination(Pageable pageable) {
        log.debug("Finding all type");
        return ResponseEntity.ok(roleService.findAll(pageable));
    }

}
