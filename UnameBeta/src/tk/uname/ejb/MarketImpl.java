package tk.uname.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import tk.uname.persistence.entity.PlayerJPA;
import tk.uname.persistence.entity.UserTeam;
import tk.uname.to.MarketPlayerTO;

@Path("/market")
@Stateless
@LocalBean
public class MarketImpl {

	
	// Persistence Unit Context
	@PersistenceContext(unitName = "unamebeta")
	private EntityManager entman;
	
	@GET
	@Path("/getallplayers")
	@Produces("application/json")
	public List<MarketPlayerTO> getMarketPlayersList(){
				
		StringBuffer sql = new StringBuffer("")
		.append(" SELECT p.pl_name as playerName, 'computer' as ownerName, m.sell_prize as sellPrize, ")
		.append(" r.t_name as teamName ")
		.append(" FROM futboluname.player p ")
		.append(" JOIN futboluname.market m ")
		.append(" ON p.id = m.player ")
		.append(" JOIN futboluname.real_team r ")
		.append(" ON p.real_team = r.id ");
	
		Query query = entman.createNativeQuery(sql.toString(),MarketPlayerTO.class);
		List<MarketPlayerTO> playersMarket =  query.getResultList();
		/*List<MarketPlayerTO> playersMarket = new ArrayList<MarketPlayerTO>();
		for(Object o: playersMarketObj){
			MarketPlayerTO mp = new MarketPlayerTO();
			mp.setOwnerName(((MarketPlayerTO)o).getOwnerName());
			mp.setPlayerName(((MarketPlayerTO)o).getPlayerName());
			mp.setSellPrize(((MarketPlayerTO)o).getSellPrize());
			mp.setTeamName(((MarketPlayerTO)o).getTeamName());
			playersMarket.add(mp);
		}*/
		
		return playersMarket;
	}
	
	@GET
	@Path("/getteamuserplayers/{userId}")
	@Produces("application/json")
	public List<UserTeam> getUserTeamPlayers(@PathParam("userId") int userId){
		StringBuffer sql = new StringBuffer("")
			.append(" SELECT * FROM ")
			.append(" futboluname.USER_TEAM ")
			.append(" WHERE ")
			.append(" USER_ID = userId ")
			;
		
		String sqlS = sql.toString();
		sqlS=sqlS.replace("userId", userId+"");
		
		Query query = entman.createNativeQuery(sqlS,UserTeam.class);
		List<UserTeam> teamPlayers =  query.getResultList();
		
		return teamPlayers;
	}
	
	
}
