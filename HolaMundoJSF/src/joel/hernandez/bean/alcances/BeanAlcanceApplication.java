package joel.hernandez.bean.alcances;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="aplicationB")
@ApplicationScoped
public class BeanAlcanceApplication {
	
	private String valor;
		
	public BeanAlcanceApplication() {
		// TODO Auto-generated constructor stub
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
