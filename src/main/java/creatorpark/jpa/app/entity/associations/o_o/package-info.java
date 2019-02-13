package creatorpark.jpa.app.entity.associations.o_o;

/* 
 * @OneToOne 관계에서
 * 
 * Source Entity (owning : FK를 소유하는(own))
 * - @JoinColumn( name=FK 칼럼을 적는다.)
 * - FK필드를 소유하고 관리하는 주체를 말한다.
 * 
 * Target Entity (non-owning)
 * - mappedBy 속성을 적는다.
 * - FK를 변경하지 못하고 읽기만 가능하다.
 * 
 */
