package tk.uname.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "futboluname.user_teamr")
public class UserTeam implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long id;
	@OneToOne(optional=false)
	private UserJPA user;
	@OneToOne(optional=false)
	private PlayerJPA player;
	@Column(name="field_position")
	private int fieldPosition;
	
	public UserTeam(){}

	public UserTeam(long id, UserJPA user, PlayerJPA player, int fieldPosition) {
		super();
		this.user = user;
		this.player = player;
		this.fieldPosition = fieldPosition;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserJPA getUser() {
		return user;
	}

	public void setUser(UserJPA user) {
		this.user = user;
	}

	public PlayerJPA getPlayer() {
		return player;
	}

	public void setPlayer(PlayerJPA player) {
		this.player = player;
	}

	public int getFieldPosition() {
		return fieldPosition;
	}

	public void setFieldPosition(int fieldPosition) {
		this.fieldPosition = fieldPosition;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	};
	
	

}
