package joel.hernandez.bean.backing;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import joel.hernandez.bean.model.Candidato;

@ManagedBean
public class VacanteForm {

	public VacanteForm() {
		// TODO Auto-generated constructor stub
	}
	
	@ManagedProperty(value = "#{candi}")
	private Candidato candidato;

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	public String enviar(){
		System.out.println("Nombre" + candidato.getNombre());
		System.out.println("Apellido" + candidato.getApellido());
		System.out.println("Sueldo" +candidato.getSueldo());
		System.out.println("Fecha nacimiento" +candidato.getFechaNacimiento());
		
		if(candidato.getNombre().equalsIgnoreCase("Gaby") &&
				candidato.getApellido().equalsIgnoreCase("alvarez")){
			String msgError = "Lo sentimos ya tenemos una Gaby Alvarez";
			FacesMessage msgFaces = new FacesMessage(FacesMessage.SEVERITY_ERROR,msgError,msgError);
			FacesContext facescontext = FacesContext.getCurrentInstance();
			facescontext.addMessage(null, msgFaces);
			return "formularioMB";
		}
		
		if(this.candidato.getNombre().equalsIgnoreCase("joel")){
			return "exito";
		}else{
			return "fallo";
		}
	}
}
