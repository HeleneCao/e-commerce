package com.ecommerce.service.impl;

import com.ecommerce.dto.UserDto;
import com.ecommerce.dto.mapper.UserMapper;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    @Override
    public UserDto save(UserDto userDto) {
        log.debug("Saving user {}", userDto);
        UserEntity user = userMapper.toUserEntity(userDto);
        return userMapper.toUserDto(userRepository.save(user));
    }

    @Override
    public UserDto findByEmail(String email) {
        log.debug("Finding user by email {}", email);
        return userMapper.toUserDto(userRepository.findByEmail(email));
    }

    @Override
    public UserDto findById(Long id) {
        log.debug("Finding user by id {}", id);
        Optional<UserEntity> user = userRepository.findById(id);
        return userMapper.toUserDto(user.orElseThrow(() -> new NotFoundException("User not found")));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting user by id {}", id);
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new NotFoundException("error.user.notFound");
        }
        userRepository.deleteById(id);
    }


    @Override
    public Page<UserDto> findAll(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toUserDto);
    }

    @Override
    public UserDto update(Long id, UserDto userDto) {
        log.debug("Updating user {}", userDto);
        UserEntity userOptional = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.user.notFound"));
        UserEntity user = userMapper.toUserEntity(userDto, userOptional);
        return userMapper.toUserDto(userRepository.save(user));
    }
}
