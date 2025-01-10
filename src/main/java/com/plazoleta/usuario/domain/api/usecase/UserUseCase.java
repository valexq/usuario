package com.plazoleta.usuario.domain.api.usecase;
import com.plazoleta.usuario.domain.api.IUserServicePort;
import com.plazoleta.usuario.domain.exception.EmailAlreadyExistsException;
import com.plazoleta.usuario.domain.exception.UserNullException;
import com.plazoleta.usuario.domain.model.User;
import com.plazoleta.usuario.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase implements IUserServicePort{
    private final IUserPersistencePort userPersistencePort;
    @Override
    public User saveUser(User user) {
        validateUser(user);
        userPersistencePort.saveUser(user);
        return null;
    }
    private void validateUser(User user){
        if (user == null){
            throw new UserNullException("El usuario no puede ser nulo"); //Usamos la excepcion creada
        }
        if (user.getDni().isEmpty()){
            throw new UserNullException("El DNI no puede ser nulo");
        }
        if (!isUserValid(user)){
            throw new UserNullException("El usuario no es válido");
        }
        if (userPersistencePort.existsUserByEmail(user.getEmail()).isPresent()){
            throw new EmailAlreadyExistsException("El usuario ya existe");
        }
    }
    private boolean isUserValid(User user){
        return true;
    }
}

