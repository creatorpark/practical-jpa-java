package creatorpark.jpa.app.entity.associations.o_o.fk.bi;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@Entity // Source Entity
public class UserFkBi implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String password;

	@OneToOne(cascade= CascadeType.ALL)
	private AddressFkBi address;
	
	public void setAddress(AddressFkBi address) {
		address.setUser( this );
		this.address = address;
	}
	
	public static UserFkBi createUser(String name, AddressFkBi address) {
		UserFkBi user = new UserFkBi();
		user.setName(name);
		user.setAddress( address );
		return user;
	}
}
