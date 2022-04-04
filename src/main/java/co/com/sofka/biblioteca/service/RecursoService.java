package co.com.sofka.biblioteca.service;

import co.com.sofka.biblioteca.model.Recurso;

import java.util.List;
import java.util.Optional;

public interface RecursoService {

    //CRUD-------------------------
    Recurso save(Recurso cliente);

    void delete(String id);

    Recurso update(String id, Recurso cliente);

    List<Recurso> findAll();

    Optional<Recurso> findById(String id);

    //Another Functions-------------------------
    String disponibilidadById(String id);

    String prestarRecursoById(String id);

    List<Recurso> recomendarRecursosByTipo(String tipo);

    List<Recurso> recomendarRecursosByCategoria(String categoria);

    List<Recurso> recomendarRecursosByCategoriaAndTipo(String categoria, String tipo);

    String devolverRecursoById(String id);
}
