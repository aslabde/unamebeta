package tk.uname.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "futboluname.player")
public class PlayerJPA implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String pl_name;
	private int real_team;
	private int user_team;
	private int field_position; 
	private int market_value;
	private int points;
	private int updated_market_value;
	private int updated_points;
	
	public PlayerJPA(){}

	public PlayerJPA(String pl_name, int real_team, int user_team,
			int field_position, int market_value, int points,
			int updated_market_value, int updated_points) {
		super();
		this.pl_name = pl_name;
		this.real_team = real_team;
		this.user_team = user_team;
		this.field_position = field_position;
		this.market_value = market_value;
		this.points = points;
		this.updated_market_value = updated_market_value;
		this.updated_points = updated_points;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPl_name() {
		return pl_name;
	}

	public void setPl_name(String pl_name) {
		this.pl_name = pl_name;
	}

	public int getReal_team() {
		return real_team;
	}

	public void setReal_team(int real_team) {
		this.real_team = real_team;
	}

	public int getUser_team() {
		return user_team;
	}

	public void setUser_team(int user_team) {
		this.user_team = user_team;
	}

	public int getField_position() {
		return field_position;
	}

	public void setField_position(int field_position) {
		this.field_position = field_position;
	}

	public int getMarket_value() {
		return market_value;
	}

	public void setMarket_value(int market_value) {
		this.market_value = market_value;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getUpdated_market_value() {
		return updated_market_value;
	}

	public void setUpdated_market_value(int updated_market_value) {
		this.updated_market_value = updated_market_value;
	}

	public int getUpdated_points() {
		return updated_points;
	}

	public void setUpdated_points(int updated_points) {
		this.updated_points = updated_points;
	}
	
	
	
}
