package com.generation.services;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UsuarioService {

    /** Logica de negocio o validaciones del sistema*/

    /** llamar al Repository (inyeccion de dependencia)*/

    @Autowired
    UsuarioRepository usuarioRepository;

    public void saveUsuario(@Valid Usuario usuario) {

        usuarioRepository.save(usuario);

    }

}
