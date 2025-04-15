package mx.uv.hefv.copsboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.uv.hefv.copsboot.jpa.UserId;
import mx.uv.hefv.copsboot.models.user.User;
import mx.uv.hefv.copsboot.models.user.UserRole;
import mx.uv.hefv.copsboot.repository.user.UserRepository;
import mx.uv.hefv.copsboot.repository.user.UserRepositoryImpl;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;  // El repositorio CRUD

    @Autowired
    private UserRepositoryImpl userRepositoryImpl;  // El repositorio con la lógica personalizada


    @Test
    public void testUserCreation() {
        UserId id = userRepositoryImpl.nextId();
        User userRegistered = new User(id, "nombre", "correo@gmail.com", "password", UserRole.OFFICIER);
        userRepository.save(userRegistered); // Genera un nuevo ID único para el usuario
        System.out.println("Usuario creado: " + userRepository.findById(id).get().getName());

        assertEquals("nombre", userRepository.findById(id).get().getName());
    }
}
