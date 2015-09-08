package tk.uname.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
@Table(name = "futboluname.user")
public class UserJPA implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String team_name;
	private int cash;
	private int points;
	
	private TacticJPA tactic;
	
	public UserJPA(){}

	public UserJPA(long id, String name, String team_name, int cash,
			int points, TacticJPA tactic) {
		super();
		this.name = name;
		this.team_name = team_name;
		this.cash = cash;
		this.points = points;
		this.tactic = tactic;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@ManyToOne(optional=false) 
	public TacticJPA getTactic() {
		return tactic;
	}

	public void setTactic(TacticJPA tactic) {
		this.tactic = tactic;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	};
	
	
}
