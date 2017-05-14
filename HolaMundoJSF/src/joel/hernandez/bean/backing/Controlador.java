package joel.hernandez.bean.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import joel.hernandez.bean.alcances.BeanAlcancePeticion;
import joel.hernandez.bean.alcances.BeanAlcanceVista;

@ManagedBean
@RequestScoped
public class Controlador {

	public Controlador() {
		// TODO Auto-generated constructor stub
	}
	
	@ManagedProperty(value="#{alcance}")
	private BeanAlcancePeticion alcancePeticion;
	
	@ManagedProperty(value="#{vista}")
	private BeanAlcanceVista alcanceView;
	
	public BeanAlcancePeticion getAlcancePeticion() {
		return alcancePeticion;
	}

	public void setAlcancePeticion(BeanAlcancePeticion alcancePeticion) {
		this.alcancePeticion = alcancePeticion;
	}
	
	public void cambiaValores(ActionEvent e){
		System.out.println("Valores almacenados en bean");
		System.out.println("Valor alcance request " + this.alcancePeticion.getValor());
		System.out.println("Valor alcance view " + this.alcanceView.getValor());
		
	}
	
	public String cambiaPagina(){
		System.out.println("Cambio de pagina");
		return "despliega";
	}

	public BeanAlcanceVista getAlcanceView() {
		return alcanceView;
	}

	public void setAlcanceView(BeanAlcanceVista alcanceView) {
		this.alcanceView = alcanceView;
	}
}
