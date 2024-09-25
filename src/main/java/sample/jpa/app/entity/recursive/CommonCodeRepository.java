package sample.jpa.app.entity.recursive;

import org.springframework.stereotype.Repository;

import sample.jpa.infra.app.GenericRepository;

@Repository
public interface CommonCodeRepository extends GenericRepository<CommonCode, Long> {


	public CommonCode findByCode(Integer code);
}
 