package com.ecommerce.service.impl;



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

    private final UserRepository userRepository;


    @Override
    public UserEntity save(UserEntity userEntity) {
        log.debug("Saving user {}", userEntity);
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity findByEmail(String email) {
        log.debug("Finding user by email {}", email);
        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity findById(Long id) {
        log.debug("Finding user by id {}", id);
        Optional<UserEntity> user = userRepository.findById(id);
        return user.orElseThrow(() -> new NotFoundException("User not found"));
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
    public Page<UserEntity> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public UserEntity update(Long id, UserEntity userEntity) {
        log.debug("Updating user {}", userEntity);
        UserEntity userOptional = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.user.notFound"));
            userOptional.setFirstName(userEntity.getFirstName());
        userOptional.setLastName(userEntity.getLastName());
        userOptional.setEmail(userEntity.getEmail());
        userOptional.setPassword(userEntity.getPassword());
        userOptional.setRoleEntity(userEntity.getRoleEntity());
        return userRepository.save(userOptional);
    }
}
