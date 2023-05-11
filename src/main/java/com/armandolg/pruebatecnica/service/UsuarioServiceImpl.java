package com.armandolg.pruebatecnica.service;

import com.armandolg.pruebatecnica.model.Usuario;
import com.armandolg.pruebatecnica.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepo usuarioRepo;

    @Override
    public Optional<Usuario> getUser(Long id) {
        return usuarioRepo.findById(id);
    }

    @Override
    public List<Usuario> getAllUsers() {
        return usuarioRepo.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario updateUser(Usuario usuario) {
        Usuario update = usuarioRepo.findById(usuario.getId()).get();
        update.setNombre(usuario.getNombre());
        update.setApellido(usuario.getApellido());
        update.setCorreo_electronico(usuario.getCorreo_electronico());
        update.setFecha_nacimiento(usuario.getFecha_nacimiento());
        return usuarioRepo.save(update);
    }

    @Override
    public Usuario saveUser(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
}
