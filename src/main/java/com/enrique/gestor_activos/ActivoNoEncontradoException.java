package com.enrique.gestor_activos;

public class ActivoNoEncontradoException extends RuntimeException {
    public ActivoNoEncontradoException(int id) {

        super("No existe un activo con id: "+ id);
    }
}