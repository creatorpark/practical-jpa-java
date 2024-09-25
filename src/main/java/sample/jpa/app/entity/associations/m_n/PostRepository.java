package sample.jpa.app.entity.associations.m_n;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface PostRepository extends GenericRepository<Post, Long> {

}
