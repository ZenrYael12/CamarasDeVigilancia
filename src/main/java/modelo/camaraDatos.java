package modelo;

public class camaraDatos {

	private String fecha;
	private String matricula;
	private String foto;
	
	public camaraDatos(String fecha, String matricula, String foto) {
		this.fecha = fecha;
		this.matricula = matricula;
		this.foto = foto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
	
}
