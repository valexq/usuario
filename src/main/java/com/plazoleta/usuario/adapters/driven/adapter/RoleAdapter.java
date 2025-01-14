package com.plazoleta.usuario.adapters.driven.adapter;

import com.plazoleta.usuario.adapters.driven.mapper.IRoleMapperEntity;
import com.plazoleta.usuario.adapters.driven.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;
import com.plazoleta.usuario.domain.model.Role;
import com.plazoleta.usuario.domain.spi.IRolePersistencePort;

@RequiredArgsConstructor
//Toda interfaz debe ser implementada por un adaptador
public class RoleAdapter implements IRolePersistencePort{
    //Se hace la inyeccion del mapper y del repositorio
    private final IRoleRepository roleRepository;
    private final IRoleMapperEntity roleMapperEntity;
    @Override
    public Role findByName(String name){
        return roleMapperEntity.roleEntityToRole(roleRepository.findByName(name));
    }
}
