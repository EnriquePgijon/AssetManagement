package com.enrique.gestor_activos.repository;

import com.enrique.gestor_activos.model.Activo;

import java.util.List;
import java.util.Optional;
public interface RepositorioActivos {
    void guardar(Activo activo);
    List<Activo> buscarTodos();
    Optional<Activo> buscarPorId(int id);
    void eliminar(int id);

}