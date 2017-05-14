package joel.hernandez.bean.alcances;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "vista")
@ViewScoped
public class BeanAlcanceVista {
	
	private String valor; 
	
	public BeanAlcanceVista() {
		// TODO Auto-generated constructor stub
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
