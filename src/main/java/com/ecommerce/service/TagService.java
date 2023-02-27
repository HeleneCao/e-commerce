package com.ecommerce.service;

import com.ecommerce.dto.TagDto;
import com.ecommerce.entity.TagEntity;
import com.ecommerce.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TagService {


    TagEntity save(TagEntity tagEntity);

    TagEntity findById(Long id);

    void deleteById(Long id);

    Page<TagEntity> findAll(Pageable pageable);
}
