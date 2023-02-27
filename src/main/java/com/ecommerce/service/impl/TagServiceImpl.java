package com.ecommerce.service.impl;


import com.ecommerce.entity.TagEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.TagRepository;
import com.ecommerce.service.TagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;


    @Override
    public TagEntity save(TagEntity tagEntity) {
        log.debug("Saving tag {}", tagEntity);
        return tagRepository.save(tagEntity);
    }

    @Override
    public TagEntity findById(Long id) {
        log.debug("Finding tag by id {}", id);
        Optional<TagEntity> tag = tagRepository.findById(id);
        return tag.orElseThrow(() -> new NotFoundException("Tag not found"));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting tag by id {}", id);
        Optional<TagEntity> tag = tagRepository.findById(id);
        if (tag.isEmpty()) {
            throw new NotFoundException("error.tag.notFound");
        }
        tagRepository.deleteById(id);
    }

}
