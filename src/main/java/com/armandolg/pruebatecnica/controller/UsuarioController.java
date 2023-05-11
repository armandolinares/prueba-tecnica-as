package com.armandolg.pruebatecnica.controller;

import com.armandolg.pruebatecnica.model.Usuario;
import com.armandolg.pruebatecnica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    // Obtener todos los usuarios
    @GetMapping(value = "/usuario/all")
    public List<Usuario> getAllUsers() {
        return usuarioService.getAllUsers();
    }

    // Obtener usuario especifico por ID
    @GetMapping(value = "/usuario/{id}")
    public Optional<Usuario> getUser(@PathVariable Long id) {
        return usuarioService.getUser(id);
    }

    // Guardar nuevo usuario
    @PostMapping(value = "/save")
    public Usuario saveUser(@RequestBody Usuario usuario) {
        return usuarioService.saveUser(usuario);
    }

    // Actualizar un usuario ya existente
    @PutMapping(value = "/update")
    public Usuario updateUser(@RequestBody Usuario usuario) {
        return usuarioService.updateUser(usuario);
    }

    // Borrar usuario por ID
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        usuarioService.deleteUser(id);
        return "Deleted ID: " + id;
    }
}
