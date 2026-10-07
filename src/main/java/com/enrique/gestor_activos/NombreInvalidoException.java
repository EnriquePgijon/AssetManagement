package com.enrique.gestor_activos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NombreInvalidoException extends RuntimeException {
    public NombreInvalidoException() {

        super("El nombre del activo no puede estar vacio");
    }
}
