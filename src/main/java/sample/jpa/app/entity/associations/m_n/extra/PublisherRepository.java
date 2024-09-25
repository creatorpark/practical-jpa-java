package sample.jpa.app.entity.associations.m_n.extra;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface PublisherRepository extends GenericRepository<Publisher, Long> {

}
