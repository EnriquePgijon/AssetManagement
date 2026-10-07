package com.enrique.gestor_activos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivoController {

    private final ServicioActivos servicio;

    public ActivoController(ServicioActivos servicio){
        this.servicio= servicio;
    }

    @GetMapping("/activos")
    public List<Activo> listar() {
        return servicio.listar();
    }

    @PostMapping("/activos")
    public void registrar(@RequestBody NuevoActivoRequest request){
        servicio.registrar(request.nombre());
    }
}
