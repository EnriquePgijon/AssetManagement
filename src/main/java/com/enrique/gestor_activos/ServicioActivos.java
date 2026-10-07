package com.enrique.gestor_activos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioActivos {
    private final RepositorioActivos repositorio;
    private int siguienteId = 1;

    public ServicioActivos(RepositorioActivos repositorio){
        this.repositorio= repositorio;
    }

    public void registrar(String nombre){
        if(nombre.isBlank()){
            throw new NombreInvalidoException();
        }
        Activo activo = new Activo(siguienteId, nombre);
        siguienteId++;
        repositorio.guardar(activo);
    }

    public List<Activo> listar() {
        return repositorio.buscarTodos();
    }

    public int contar(){
        return repositorio.buscarTodos().size();
    }
    public Activo buscarPorId(int id) {
        Optional<Activo> resultado = repositorio.buscarPorId(id);

        if (resultado.isEmpty()) {
            throw new ActivoNoEncontradoException(id);
        }

        return resultado.get();
    }
}
