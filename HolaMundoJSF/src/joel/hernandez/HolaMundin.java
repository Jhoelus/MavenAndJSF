package joel.hernandez;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HolaMundin {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
