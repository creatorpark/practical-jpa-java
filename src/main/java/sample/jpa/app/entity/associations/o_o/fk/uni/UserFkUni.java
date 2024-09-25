package sample.jpa.app.entity.associations.o_o.fk.uni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode( of= {"id"} )
@Entity(name="user_fk") // Target Entity
public class UserFkUni implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String password;
	
	public static UserFkUni createUser(String name ) {
		UserFkUni user = new UserFkUni();
		user.setPassword("FK_HELLO");
		user.setName(name);
		return user;
	}
}
