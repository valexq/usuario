package com.plazoleta.usuario.configuration.bean;

import com.plazoleta.usuario.adapters.driven.adapter.UserAdapter;
import com.plazoleta.usuario.adapters.driven.mapper.IUserMapperEntity;
import com.plazoleta.usuario.adapters.driven.repository.IUserRepository;
import com.plazoleta.usuario.domain.api.IUserServicePort;
import com.plazoleta.usuario.domain.api.usecase.UserUseCase;
import com.plazoleta.usuario.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
//Inyección de dependencias
public class BeanConfiguration {
    private final IUserMapperEntity userMapperEntity;
    private final IUserRepository userRepository;

    @Bean
    public IUserServicePort userServicePort(IUserPersistencePort userPersistencePort){
        //Como el IUserServicePort es implementado por el UserCase (final) se debe retornar un UserUseCase
        return new UserUseCase(userPersistencePort);
    }
    @Bean
    public IUserPersistencePort userPersistencePort(){
        return new UserAdapter(userRepository, userMapperEntity);
    }

}
