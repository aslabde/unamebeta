package tk.uname.to;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class MarketPlayerTO implements Serializable {


	private static final long serialVersionUID = 1L;
	private String playerName;
	private String ownerName;
	private String teamName;
	private int sellPrize;
	
	public MarketPlayerTO(){};
	
	public MarketPlayerTO(String playerName, String ownerName, String teamName,
			int sellPrize) {
		super();
		this.playerName = playerName;
		this.ownerName = ownerName;
		this.teamName = teamName;
		this.sellPrize = sellPrize;
	}

	@Id
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getSellPrize() {
		return sellPrize;
	}

	public void setSellPrize(int sellPrize) {
		this.sellPrize = sellPrize;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
