package co.com.sofka.biblioteca.controller;

import co.com.sofka.biblioteca.model.Recurso;
import co.com.sofka.biblioteca.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class RecursoController {

    @Autowired
    private RecursoService service;


    //CRUD-------------------------
    @GetMapping(value = "/allRecurso")
    private List<Recurso> findAll() {
        return this.service.findAll();
    }

    @PostMapping("/addRecurso")
    @ResponseStatus(HttpStatus.CREATED)
    private Recurso save(@RequestBody Recurso recurso) {
        return this.service.save(recurso);
    }

    @PutMapping("/updateRecurso/{id}")
    private Recurso update(@PathVariable("id") String id, @RequestBody Recurso recurso) {
        return this.service.update(id, recurso);
    }

    @DeleteMapping("/removeRecurso/{id}")
    private void delete(@PathVariable("id") String id) {
        this.service.delete(id);
    }


    //Another Functions-------------------------
    @GetMapping("/buscarRecurso/{id}")
    private Optional<Recurso> findByid(@PathVariable("id") String id) {
        return this.service.findById(id);
    }


    @GetMapping("/disponibilidadRecurso/{id}")
    private String disponibilidadById(@PathVariable("id") String id) {
        return this.service.disponibilidadById(id);
    }


    @PutMapping("/prestamoRecurso/{id}/prestamo")
    private String perstarRecursoById(@PathVariable("id") String id) {
        return this.service.prestarRecursoById(id);
    }


    @GetMapping("/recomendacionRecurso/{tipoRecurso}/tipo")
    private List<Recurso> recomendarRecursosByTipo(@PathVariable("tipoRecurso") String tipo) {
        return this.service.recomendarRecursosByTipo(tipo);
    }


    @GetMapping("/recomendacionRecurso/{categoriaRecurso}/categoria")
    private List<Recurso> recomendarRecursosByCategoria(@PathVariable("categoriaRecurso") String categoria) {
        return this.service.recomendarRecursosByCategoria(categoria);
    }


    @GetMapping("/recomendacionRecurso/{categoriaRecurso}/{tipoRecurso}/categoriaAndTipo")
    private List<Recurso> recomendarRecursosByCategoriaAndTipo
            (@PathVariable("categoriaRecurso") String categoria, @PathVariable("tipoRecurso") String tipo) {
        return this.service.recomendarRecursosByCategoriaAndTipo(categoria, tipo);
    }


    @PutMapping("/devolucionRecurso/{id}")
    private String devolverRecursoById(@PathVariable("id") String id) {
        return this.service.devolverRecursoById(id);
    }

}
