package com.ecommerce.service;

import com.ecommerce.dto.TagDto;
import com.ecommerce.entity.TagEntity;

public interface TagService {


    TagEntity save(TagEntity tagEntity);

    TagEntity findById(Long id);

    void deleteById(Long id);

}
