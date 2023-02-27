package com.ecommerce.controller;

import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.UserService;
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
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> register(@RequestBody @Valid UserEntity userEntity) {
        log.debug("Registering user {}", userEntity);
        return ResponseEntity.ok(userService.save(userEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting user by id {}", id);
        userService.deleteById(id);
        try {
            userService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Page<UserEntity>> findAllWithPagination(Pageable pageable) {
        log.debug("Finding all users");
        return ResponseEntity.ok(userService.findAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserEntity> update(@PathVariable Long id, @RequestBody UserEntity userEntity) {
        log.debug("Updating user {}", userEntity);
        return ResponseEntity.ok(userService.update(id, userEntity));
    }





}
