package joel.hernandez.bean.navegar;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="navigation")
public class NavegationEjemplo {

	private String pagina = "nada";
	
	public NavegationEjemplo() {
		// TODO Auto-generated constructor stub
	}
	
	public String determinaPagina(){
		switch(this.pagina){
		case "joel":
			String x = "entrar";
			return x;
		case "gaby":
			return "salir";
		default:
			return "nada";
		} 
	} 
	
	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	
}
