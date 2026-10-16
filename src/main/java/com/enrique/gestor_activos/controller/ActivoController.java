package com.enrique.gestor_activos.controller;
import com.enrique.gestor_activos.model.Activo;
import com.enrique.gestor_activos.dto.NuevoActivoRequest;
import com.enrique.gestor_activos.service.ServicioActivos;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/activos/{id}")
    public Activo buscarPorId(@PathVariable int id){
        return servicio.buscarPorId(id);
    }

    @DeleteMapping("/activos/{id}")
    public void eliminarPorId(@PathVariable int id){
         servicio.eliminar(id);
    }
}
