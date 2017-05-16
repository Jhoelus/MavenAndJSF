package joel.hernandez.bean.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import joel.hernandez.bean.alcances.BeanAlcanceApplication;
import joel.hernandez.bean.alcances.BeanAlcancePeticion;
import joel.hernandez.bean.alcances.BeanAlcanceSesion;
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
	
	@ManagedProperty(value="#{sesionB}")
	private BeanAlcanceSesion alcanceSesion;	
	
	@ManagedProperty(value="#{aplicationB}")
	private BeanAlcanceApplication alcanceapp;
	
	public void cambiaValores(ActionEvent e){
		System.out.println("Valores almacenados en bean");
		System.out.println("Valor alcance request " + this.alcancePeticion.getValor());
		System.out.println("Valor alcance view " + this.alcanceView.getValor());
		System.out.println("Valor alcance Sesion " + this.alcanceSesion.getValor());
		System.out.println("Valor alcance Aplication " + this.alcanceapp.getValor());

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

	public BeanAlcanceSesion getAlcanceSesion() {
		return alcanceSesion;
	}

	public void setAlcanceSesion(BeanAlcanceSesion alcanceSesion) {
		this.alcanceSesion = alcanceSesion;
	}
	
	public BeanAlcancePeticion getAlcancePeticion() {
		return alcancePeticion;
	}

	public void setAlcancePeticion(BeanAlcancePeticion alcancePeticion) {
		this.alcancePeticion = alcancePeticion;
	}

	public BeanAlcanceApplication getAlcanceapp() {
		return alcanceapp;
	}

	public void setAlcanceapp(BeanAlcanceApplication alcanceapp) {
		this.alcanceapp = alcanceapp;
	}
	
	
}
