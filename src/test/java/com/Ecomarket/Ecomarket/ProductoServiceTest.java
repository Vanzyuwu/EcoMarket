package com.Ecomarket.Ecomarket;


import com.Ecomarket.Ecomarket.model.Producto;
import com.Ecomarket.Ecomarket.repository.ProductoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.Ecomarket.Ecomarket.service.ProductoService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGuardarProducto() {
        Producto producto = new Producto();
        producto.setNombre("Taladro");
        producto.setPrecio(29990);

        when(productoRepository.save(producto)).thenReturn(producto);

        Producto resultado = productoService.guardarProducto(producto);
        assertNotNull(resultado);
        assertEquals("Taladro", resultado.getNombre());
    }

    @Test
    public void testListarProductos() {
        Producto p1 = new Producto();
        p1.setNombre("Martillo");
        Producto p2 = new Producto();
        p2.setNombre("Destornillador");

        when(productoRepository.findAll()).thenReturn(Arrays.asList(p1, p2));

        List<Producto> lista = productoService.listarProductos();
        assertEquals(2, lista.size());
    }

    @Test
    public void testObtenerProductoPorId() {
        Producto producto = new Producto();
        
        producto.setNombre("Taladro");

        when(productoRepository.findById(1L)).thenReturn(Optional.of(producto));

        Optional<Producto> resultado = productoService.obtenerProductoPorId(1L);
        assertTrue(resultado.isPresent());
        assertEquals("Taladro", resultado.get().getNombre());
    }

    @Test
    public void testEliminarProducto() {
        Long id = 5L;

        doNothing().when(productoRepository).deleteById(id);

        productoService.eliminarProducto(id);

        verify(productoRepository, times(1)).deleteById(id);
    }
}
