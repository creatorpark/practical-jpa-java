package sample.jpa.app.entity.associations.o_o.pk.uni;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of={"id"})
@Entity(name="address_pk")  // Source Entity
public class AddressPkUni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String state;
	private String city;
	
	@OneToOne(cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private UserPkUni user;
	
	public static AddressPkUni createAddress(UserPkUni user, String state, String city) {
		AddressPkUni address = new AddressPkUni();
		address.setState( state );
		address.setCity( city );
		address.setUser( user );
		return address;
	}
	
	public void setUser(UserPkUni user) {
		// 2번 세팅해준다. 별로네 양방향 mapsId가 좋다.
		this.id = user.getId(); 
		this.user = user;
	}
}
