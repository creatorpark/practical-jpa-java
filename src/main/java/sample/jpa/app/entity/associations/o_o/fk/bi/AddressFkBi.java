package sample.jpa.app.entity.associations.o_o.fk.bi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@Entity(name="address_fk")  // Source Entity, Child
public class AddressFkBi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	private UserFkBi user;
	  
	private String state;
	private String city;
	
	public static AddressFkBi createAddress(String state, String city) {
		AddressFkBi address = new AddressFkBi();
		address.state = state;
		address.city = city;
		return address;
	}
}
