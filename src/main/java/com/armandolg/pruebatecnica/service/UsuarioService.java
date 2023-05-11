package com.armandolg.pruebatecnica.service;

import com.armandolg.pruebatecnica.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public Optional<Usuario> getUser(Long id);

    public List<Usuario> getAllUsers();

    public void deleteUser(Long id);

    public Usuario updateUser(Usuario usuario);

    public Usuario saveUser(Usuario usuario);
}
