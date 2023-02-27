package com.ecommerce.controller;

import com.ecommerce.service.TypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/type")
@Slf4j
public class TypeController {


    private final TypeService typeService;


}
