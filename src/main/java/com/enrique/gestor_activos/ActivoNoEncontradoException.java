package com.enrique.gestor_activos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ActivoNoEncontradoException extends RuntimeException {
    public ActivoNoEncontradoException(int id) {

        super("No existe un activo con id: "+ id);
    }
}