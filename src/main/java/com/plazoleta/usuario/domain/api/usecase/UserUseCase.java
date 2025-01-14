package com.plazoleta.usuario.domain.api.usecase;
import com.plazoleta.usuario.domain.api.IUserServicePort;
import com.plazoleta.usuario.domain.exception.EmailAlreadyExistsException;
import com.plazoleta.usuario.domain.exception.RoleNoDataFoundException;
import com.plazoleta.usuario.domain.exception.UserNullException;
import com.plazoleta.usuario.domain.model.Role;
import com.plazoleta.usuario.domain.model.User;
import com.plazoleta.usuario.domain.spi.IRolePersistencePort;
import com.plazoleta.usuario.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserUseCase implements IUserServicePort{
    private final IUserPersistencePort userPersistencePort;
    private final IRolePersistencePort rolePersistencePort;
    @Override
    public User saveUserAdmin(User user) {
        validateUser(user);
        user.setRole(getRole("ADMIN"));
        User userSaved = userPersistencePort.saveUser(user);
        return userSaved;
    }
    public User saveUserOwner(User user) {
        validateUser(user);
        User userSaved = userPersistencePort.saveUser(user);
        return userSaved;
    }
    private Role getRole(String role){
        Role roleSaved = rolePersistencePort.findByName(role);
        if (roleSaved ==  null){
            throw new RoleNoDataFoundException("rol no puede ser nulo");
        }
        return roleSaved;
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

