package com.Ecomarket.Ecomarket.controller;

import com.Ecomarket.Ecomarket.model.CestaCompra;
import com.Ecomarket.Ecomarket.service.CestaCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cestas")
public class CestaCompraController {

    @Autowired
    private CestaCompraService cestaCompraService;

    @GetMapping
    public List<CestaCompra> listarCestas() {
        return cestaCompraService.listarCestas();
    }

    @GetMapping("/{id}")
    public Optional<CestaCompra> obtenerCestaPorId(@PathVariable Long id) {
        return cestaCompraService.obtenerCestaPorId(id);
    }

    @PostMapping
    public CestaCompra guardarCesta(@RequestBody CestaCompra cesta) {
        return cestaCompraService.guardarCesta(cesta);
    }

    @DeleteMapping("/{id}")
    public void eliminarCesta(@PathVariable Long id) {
        cestaCompraService.eliminarCesta(id);
    }
}
