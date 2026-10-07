package com.enrique.gestor_activos;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioActivosEnMemoria implements RepositorioActivos{
    private final List<Activo> activos = new ArrayList<>();

    @Override
    public void guardar(Activo activo){
        activos.add(activo);
    }

    @Override
    public List<Activo> buscarTodos() {
        return activos;
    }

    @Override
    public Optional<Activo> buscarPorId(int id) {
        for (Activo activo : activos) {
            if (activo.getId() == id) {
                return Optional.of(activo);
            }
        }
        return Optional.empty();
    }
}

