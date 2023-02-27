package com.ecommerce.controller;

import com.ecommerce.entity.OrderEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.OrderService;
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
@RequestMapping("/api/order")
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/register")
    public ResponseEntity<OrderEntity> register(@RequestBody @Valid OrderEntity orderEntity) {
        log.debug("Registering order {}", orderEntity);
        return ResponseEntity.ok(orderService.save(orderEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting order by id {}", id);
        orderService.deleteById(id);
        try {
            orderService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderEntity> update(@PathVariable Long id, @RequestBody OrderEntity orderEntity) {
        log.debug("Updating order {}", orderEntity);
        return ResponseEntity.ok(orderService.update(id, orderEntity));
    }

    @GetMapping("/all")
    public ResponseEntity<Page<OrderEntity>> findAllWithPagination(Pageable pageable) {
        log.debug("Finding all order");
        return ResponseEntity.ok(orderService.findAll(pageable));
    }

}
