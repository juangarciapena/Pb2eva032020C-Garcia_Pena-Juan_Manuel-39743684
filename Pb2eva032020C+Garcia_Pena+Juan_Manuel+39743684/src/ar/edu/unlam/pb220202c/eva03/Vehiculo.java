package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo implements Imultable {

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;

	
	public void incrmentarVelocidad(Integer Velocidad) {
		this.setVelocidadActual(Velocidad);
	}

// MI CODIGO
	@Override
	public Boolean enInfraccion() {
		
		if(this.getVelocidadActual()>this.getLimiteVelocidad())
			return true;
		
		return false;
	}
	
	
	public String getPatente() {
		return Patente;
	}


	public void setPatente(String patente) {
		Patente = patente;
	}


	public Integer getVelocidadActual() {
		return VelocidadActual;
	}


	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}


	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}


	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}
	
	
	
	
}
