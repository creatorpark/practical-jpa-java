package sample.jpa.app.entity.associations.o_o.pk.uni;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface UserPkUniRepository extends GenericRepository<UserPkUni, Long> {

}
