package com.myfinance.service;


import com.myfinance.dto.UsuarioCadastroDTO;
import com.myfinance.entity.Usuario;
import com.myfinance.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(UsuarioCadastroDTO dados) {

        Usuario usuario = new Usuario();

        usuario.setNome(dados.getNome());
        usuario.setEmail(dados.getEmail());

        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);

    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }
}
