package sample.jpa.app.entity.associations.o_n.uni;

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
@EqualsAndHashCode(of= {"id"})
@Entity
public class PlayerUni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String uniformNumber;
	
	public static PlayerUni createPlayer( String name, String uniformNumber) {
		PlayerUni player = new PlayerUni();
		player.setName(name);
		player.setUniformNumber(uniformNumber);
		return player;
	}
}
