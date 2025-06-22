package com.Ecomarket.Ecomarket.repository;

import com.Ecomarket.Ecomarket.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}