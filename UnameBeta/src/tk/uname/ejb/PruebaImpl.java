package tk.uname.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import tk.uname.persistence.entity.ParameterJPA;

@Path("/parameters")
@Stateless
@LocalBean
public class PruebaImpl {
	
	// Persistence Unit Context
	@PersistenceContext(unitName = "unamebeta")
	private EntityManager entman;
	
	@GET
	@Path("/")
	public List<ParameterJPA> getPars(){
		List<ParameterJPA> parameters = entman.createQuery("from ParameterJPA").getResultList();
		return parameters;
	}
	
	
}
