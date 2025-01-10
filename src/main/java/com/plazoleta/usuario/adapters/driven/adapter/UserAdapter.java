package com.plazoleta.usuario.adapters.driven.adapter;

import com.plazoleta.usuario.adapters.driven.mapper.IUserMapperEntity;
import com.plazoleta.usuario.adapters.driven.repository.UserRepository;
import com.plazoleta.usuario.domain.model.User;
import com.plazoleta.usuario.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserAdapter implements IUserPersistencePort {
    private final UserRepository userRepository;
    private final IUserMapperEntity userMapperEntity;
    @Override
    public User saveUser(User user) {
        return userMapperEntity.userEntityToUser(userRepository.save(userMapperEntity.userToUserEntity(user)));
    }

    @Override
    public Boolean existsUserByEmail(String email) {
        return null;
    }
}
