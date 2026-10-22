package com.daw2.funkos.models;

import java.math.BigDecimal;


public record Producto(
        Long id,
        String nombre,
        BigDecimal precio,
        Integer unidades,
        String desc

) {
}
