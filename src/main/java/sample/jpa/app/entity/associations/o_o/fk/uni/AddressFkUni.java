package sample.jpa.app.entity.associations.o_o.fk.uni;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@Entity(name="address_fk")  // Source Entity
public class AddressFkUni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String state;
	private String city;
	
	@OneToOne( cascade= CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private UserFkUni user;
	
	public static AddressFkUni createAddress(UserFkUni user, String state, String city) {
		AddressFkUni address = new AddressFkUni();
		address.setState( state );
		address.setCity( city );
		address.setUser( user );
		return address;
	}
	
	public void setUser(UserFkUni user) {
		// 2번 세팅해준다. 별로네 양방향 mapsId가 좋다.
		this.user = user;
	}
	
}
