package com.ecommerce.service.impl;

import com.ecommerce.dto.TagDto;
import com.ecommerce.dto.mapper.TagMapper;
import com.ecommerce.entity.TagEntity;
import com.ecommerce.entity.TypeEntity;
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

    private final TagMapper tagMapper;
    private final TagRepository tagRepository;
    @Override
    public TagDto save(TagDto tagDto) {
        log.debug("Saving tag {}", tagDto);
        TagEntity tag = tagMapper.toTagEntity(tagDto);
        return tagMapper.toTagDto(tagRepository.save(tag));
    }

    @Override
    public TagDto findById(Long id) {
        log.debug("Finding tag by id {}", id);
        Optional<TagEntity> tag = tagRepository.findById(id);
        return tagMapper.toTagDto(tag.orElseThrow(() -> new NotFoundException("Tag not found")));
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

    @Override
    public TagDto update(Long id, TagDto tagDto) {
        log.debug("Updating tag {}", tagDto);
        TagEntity tagOptional = tagRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.tag.notFound"));
        TagEntity tag = tagMapper.toTag(tagDto, tagOptional);
        return tagMapper.toTagDto(tagRepository.save(tag));
    }
}
