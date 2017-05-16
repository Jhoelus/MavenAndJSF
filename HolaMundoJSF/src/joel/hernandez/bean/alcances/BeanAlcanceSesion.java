package joel.hernandez.bean.alcances;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="sesionB")
@SessionScoped
public class BeanAlcanceSesion {
	
	private String valor;
	
	public BeanAlcanceSesion() {
		// TODO Auto-generated constructor stub
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
