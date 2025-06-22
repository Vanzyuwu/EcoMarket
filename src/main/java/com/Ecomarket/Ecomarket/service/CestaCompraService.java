package com.Ecomarket.Ecomarket.service;

import com.Ecomarket.Ecomarket.model.CestaCompra;
import com.Ecomarket.Ecomarket.repository.CestaCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CestaCompraService {

    @Autowired
    private CestaCompraRepository cestaCompraRepository;

    public List<CestaCompra> listarCestas() {
        return cestaCompraRepository.findAll();
    }

    public Optional<CestaCompra> obtenerCestaPorId(Long id) {
        return cestaCompraRepository.findById(id);
    }

    public CestaCompra guardarCesta(CestaCompra cesta) {
        return cestaCompraRepository.save(cesta);
    }

    public void eliminarCesta(Long id) {
        cestaCompraRepository.deleteById(id);
    }
}