package sample.jpa.app.entity.associations.m_n.extra;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface BookRepository extends GenericRepository<Book, Long> {

}
