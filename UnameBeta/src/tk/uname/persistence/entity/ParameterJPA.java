package tk.uname.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "futboluname.parameter")
public class ParameterJPA implements Serializable{

	private static final long serialVersionUID = 1L;
	private String key;
	private String par_value;
	
	public ParameterJPA(String key, String par_value) {
		super();
		this.key = key;
		this.par_value = par_value;
	}
	
	public ParameterJPA(){
		super();
	}
	@Id
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getPar_value() {
		return par_value;
	}

	public void setPar_value(String par_value) {
		this.par_value = par_value;
	}
	
	
}
