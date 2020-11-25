package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable{
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private Integer cantidadDeEjes;
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	//private Integer limiteDeVelocidad = 80;
	
	public Camion(String patente, Integer numeroTelepase) {
		super();
		this.setPatente(patente);
		//this.numeroTelepase = numeroTelepase;
		this.setLimiteVelocidad(80);
		
	}
	
	@Override
	public Boolean enInfraccion() {
		if(this.getVelocidadActual()>this.getLimiteVelocidad())
			return true;
		
		return false;
	}

	
}
