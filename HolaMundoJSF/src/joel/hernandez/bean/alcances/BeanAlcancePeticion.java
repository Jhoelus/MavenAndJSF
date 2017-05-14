package joel.hernandez.bean.alcances;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="alcance")
@RequestScoped
public class BeanAlcancePeticion {
	
	private String valor;
	
	public BeanAlcancePeticion() {
		// TODO Auto-generated constructor stub
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
