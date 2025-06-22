package com.Ecomarket.Ecomarket.repository;

import com.Ecomarket.Ecomarket.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}