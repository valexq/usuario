package com.plazoleta.usuario.adapters.driven.adapter;

import com.plazoleta.usuario.adapters.driven.entity.UserEntity;
import com.plazoleta.usuario.adapters.driven.mapper.IUserMapperEntity;
import com.plazoleta.usuario.adapters.driven.repository.IUserRepository;
import com.plazoleta.usuario.domain.model.User;
import com.plazoleta.usuario.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;
import java.util.Optional;

@RequiredArgsConstructor
public class UserAdapter implements IUserPersistencePort {
    private final IUserRepository userRepository;
    private final IUserMapperEntity userMapperEntity;
    @Override
    public User saveUser(User user) {
        UserEntity userEntity = userRepository.save(userMapperEntity.userToUserEntity(user));
        return userMapperEntity.userEntityToUser(userEntity);
    }

    @Override
    public Optional<User> existsUserByEmail(String email) {
        return userRepository.findByEmail(email).map(userMapperEntity::userEntityToUser);
    }
}
