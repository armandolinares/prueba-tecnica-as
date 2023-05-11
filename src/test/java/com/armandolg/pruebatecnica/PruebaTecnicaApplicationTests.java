package com.armandolg.pruebatecnica;

import com.armandolg.pruebatecnica.model.Usuario;
import com.armandolg.pruebatecnica.repository.UsuarioRepo;
import com.armandolg.pruebatecnica.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PruebaTecnicaApplicationTests {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepo usuarioRepo;

    // Obtener usuario especifico por ID
    @Test
    public void testGetSpecificUser() {
        Usuario usuario = new Usuario();
        usuario.setId(9);
        usuario.setNombre("New");
        usuario.setApellido("New");
        usuario.setCorreo_electronico("new@gmail.com");
        usuario.setFecha_nacimiento("2023-11-11");

        Usuario savedUsuario = usuarioService.saveUser(usuario);

        Optional<Usuario> retrievedUsuario = usuarioService.getUser(savedUsuario.getId());

        assertTrue(retrievedUsuario.isPresent());

        assertEquals("New", retrievedUsuario.get().getNombre());
        assertEquals("New", retrievedUsuario.get().getApellido());
        assertEquals("new@gmail.com", retrievedUsuario.get().getCorreo_electronico());
        assertEquals("2023-11-11", retrievedUsuario.get().getFecha_nacimiento());
    }

    // Modificacion de usuario existente
    @Test
    public void testUpdateUser() {
        Usuario usuario = new Usuario();
        usuario.setId(8);
        usuario.setNombre("To Update");
        usuario.setApellido("To Update");
        usuario.setCorreo_electronico("junti@gmail.com");
        usuario.setFecha_nacimiento("2000-01-01");

        Usuario savedUsuario = usuarioService.saveUser(usuario);

        savedUsuario.setNombre("UPDATED");
        savedUsuario.setApellido("UPDATED");
        savedUsuario.setCorreo_electronico("UPDATED@gmail.com");
        savedUsuario.setFecha_nacimiento("1999-12-30");

        Usuario updatedUsuario = usuarioService.updateUser(savedUsuario);

        assertNotNull(updatedUsuario);

        // Assert that the updated user's attributes match the expected values
        assertEquals("UPDATED", updatedUsuario.getNombre());
        assertEquals("UPDATED", updatedUsuario.getApellido());
        assertEquals("UPDATED@gmail.com", updatedUsuario.getCorreo_electronico());
        assertEquals("1999-12-30", updatedUsuario.getFecha_nacimiento());
    }

    // Creacion de nuevo usuario
    @Test
    public void testNewUser() {
        Usuario usuario = new Usuario();
        usuario.setId(7);
        usuario.setNombre("JUnit");
        usuario.setApellido("Test");
        usuario.setCorreo_electronico("junti@gmail.com");
        usuario.setFecha_nacimiento("2000-01-01");

        Usuario savedUsuario = usuarioService.saveUser(usuario);
        assertNotNull(savedUsuario);

        assertEquals(7, savedUsuario.getId());
        assertEquals("JUnit", savedUsuario.getNombre());
        assertEquals("Test", savedUsuario.getApellido());
        assertEquals("junti@gmail.com", savedUsuario.getCorreo_electronico());
        assertEquals("2000-01-01", savedUsuario.getFecha_nacimiento());
    }

    // Borrar un usuario por ID
    @Test
    public void testDeleteUser() {
        Usuario usuario = new Usuario();
        usuario.setId(10);
        usuario.setNombre("Delete");
        usuario.setApellido("Delete");
        usuario.setCorreo_electronico("delete@gmail.com");
        usuario.setFecha_nacimiento("2000-01-10");

        Usuario savedUsuario = usuarioService.saveUser(usuario);

        usuarioService.deleteUser(savedUsuario.getId());

        Optional<Usuario> retrievedUsuario = usuarioRepo.findById(savedUsuario.getId());

        assertFalse(retrievedUsuario.isPresent());
    }

}
