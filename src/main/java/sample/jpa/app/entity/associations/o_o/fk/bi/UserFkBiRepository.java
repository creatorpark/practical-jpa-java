package sample.jpa.app.entity.associations.o_o.fk.bi;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface UserFkBiRepository extends GenericRepository<UserFkBi, Long> {

}
