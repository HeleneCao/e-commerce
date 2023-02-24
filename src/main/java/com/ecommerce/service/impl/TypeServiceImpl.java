package com.ecommerce.service.impl;

import com.ecommerce.dto.TypeDto;
import com.ecommerce.dto.mapper.TypeMapper;
import com.ecommerce.repository.TypeRepository;
import com.ecommerce.service.TypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TypeServiceImpl implements TypeService {

    private final TypeMapper typeMapper;
    private final TypeRepository typeRepository;
    @Override
    public TypeDto save(TypeDto typeDto) {
        return null;
    }

    @Override
    public TypeDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public TypeDto update(Long id, TypeDto typeDto) {
        return null;
    }
}
