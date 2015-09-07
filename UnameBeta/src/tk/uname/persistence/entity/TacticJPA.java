package tk.uname.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "futboluname.tactic")
public class TacticJPA {

	private static final long serialVersionUID = 1L;
	private long id;
	private String value;
	
	public TacticJPA(){};
	
	public TacticJPA(long id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
