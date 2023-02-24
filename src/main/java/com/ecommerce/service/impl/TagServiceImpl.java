package com.ecommerce.service.impl;

import com.ecommerce.dto.TagDto;
import com.ecommerce.service.TagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TagServiceImpl implements TagService {
    @Override
    public TagDto save(TagDto tagDto) {
        return null;
    }

    @Override
    public TagDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public TagDto update(Long id, TagDto tagDto) {
        return null;
    }
}
