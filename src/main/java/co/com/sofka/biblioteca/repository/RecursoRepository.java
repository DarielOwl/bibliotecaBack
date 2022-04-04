package co.com.sofka.biblioteca.repository;

import co.com.sofka.biblioteca.model.Recurso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecursoRepository extends MongoRepository<Recurso, String> {

}
