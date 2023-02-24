package com.ecommerce.service;

import com.ecommerce.dto.TagDto;

public interface TagService {

    TagDto save(TagDto tagDto);

    TagDto findById(Long id);

    void deleteById(Long id);

    TagDto update(Long id, TagDto tagDto);
}
