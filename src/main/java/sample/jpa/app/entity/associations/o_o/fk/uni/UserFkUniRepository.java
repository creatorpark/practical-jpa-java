package sample.jpa.app.entity.associations.o_o.fk.uni;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface UserFkUniRepository extends GenericRepository<UserFkUni, Long> {

}
