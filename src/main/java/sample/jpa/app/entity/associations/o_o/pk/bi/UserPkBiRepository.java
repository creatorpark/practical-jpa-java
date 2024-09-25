package sample.jpa.app.entity.associations.o_o.pk.bi;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface UserPkBiRepository extends GenericRepository<UserPkBi, Long> {

}
