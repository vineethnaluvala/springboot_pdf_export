package in.vini.repository;

import org.springframework.data.repository.CrudRepository;

import in.vini.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {

}
