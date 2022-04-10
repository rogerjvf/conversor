package com.conversor.models;

import com.conversor.model.Moneda;

import java.math.BigDecimal;
import java.util.Optional;

public class DatosMoneda {

    public static Optional<Moneda> crearMoneda(String descripcion, String simbolo, Double valor, boolean monedaBase){
        Moneda moneda = new Moneda();
        moneda.setDescripcion("Dolar");
        moneda.setSimbolo("USD");
        moneda.setValor(new BigDecimal("1"));
        moneda.setMonedaBase(true);
        return Optional.of(moneda);
    }
}
