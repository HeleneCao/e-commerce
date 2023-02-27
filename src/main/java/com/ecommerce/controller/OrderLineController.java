package com.ecommerce.controller;

import com.ecommerce.entity.OrderLineEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.OrderLineService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orderline")
@Slf4j
public class OrderLineController {

    private final OrderLineService orderLineService;

    @PostMapping("/Register")
    public ResponseEntity<OrderLineEntity> register(@RequestBody @Valid OrderLineEntity orderLineEntity){
        log.debug("Registering order line {}", orderLineEntity);
        return ResponseEntity.ok(orderLineService.save(orderLineEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting order line by id {}", id);
        orderLineService.deleteById(id);
        try {
            orderLineService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderLineEntity> update(@PathVariable Long id, @RequestBody OrderLineEntity orderLineEntity) {
        log.debug("Updating order line {}", orderLineEntity);
        return ResponseEntity.ok(orderLineService.update(id, orderLineEntity));
    }

}
