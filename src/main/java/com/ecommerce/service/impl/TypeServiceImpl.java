package com.ecommerce.service.impl;

import com.ecommerce.dto.TypeDto;
import com.ecommerce.dto.mapper.TypeMapper;
import com.ecommerce.entity.TypeEntity;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.TypeRepository;
import com.ecommerce.service.TypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TypeServiceImpl implements TypeService {

    private final TypeMapper typeMapper;

    private final TypeRepository typeRepository;
    @Override
    public TypeDto save(TypeDto typeDto) {
        log.debug("Saving type {}", typeDto);
        TypeEntity type = typeMapper.toTypeEntity(typeDto);
        return typeMapper.toTypeDto(typeRepository.save(type));
    }

    @Override
    public TypeDto findById(Long id) {
        log.debug("Finding type by id {}", id);
        Optional<TypeEntity> type = typeRepository.findById(id);
        return typeMapper.toTypeDto(type.orElseThrow(() -> new NotFoundException("Type not found")));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting type by id {}", id);
        Optional<TypeEntity> type = typeRepository.findById(id);
        if (type.isEmpty()) {
            throw new NotFoundException("error.type.notFound");
        }
        typeRepository.deleteById(id);
    }

    @Override
    public TypeDto update(Long id, TypeDto typeDto) {
        log.debug("Updating type {}", typeDto);
        TypeEntity typeOptional = typeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.type.notFound"));
        TypeEntity type = typeMapper.toType(typeDto, typeOptional);
        return typeMapper.toTypeDto(typeRepository.save(type));
    }
}
