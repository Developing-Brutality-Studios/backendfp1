package co.com.arocanestor.jpa;

import co.com.arocanestor.jpa.entities.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface JPARepository extends CrudRepository<Persona, Integer>, QueryByExampleExecutor<Persona> {

}
