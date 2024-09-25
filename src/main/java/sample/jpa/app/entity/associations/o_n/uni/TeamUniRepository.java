package sample.jpa.app.entity.associations.o_n.uni;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface TeamUniRepository extends GenericRepository<TeamUni, Long> {

}
