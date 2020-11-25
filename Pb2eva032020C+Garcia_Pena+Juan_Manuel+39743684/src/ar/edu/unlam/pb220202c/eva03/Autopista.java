package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		Boolean resultado = false;
		if(this.telepase.put(numeroTelpase, vehiculo)==null)
			resultado = true;
			
		return resultado;
	}
	public Boolean ingresarAutopista (Integer numeroTelepase) throws VehiculoNotFounException {
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista	
		if(this.telepase.get(numeroTelepase) == null) /// exception
			throw new VehiculoNotFounException();
		
		this.vehiculosEnCirculacion.add(this.telepase.get(numeroTelepase));
		return true;
	}
	
	public void salirAutpista (Vehiculo vehiculo) throws VehiculoNotFounException {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		if(!this.vehiculosEnCirculacion.remove(vehiculo))
			throw new VehiculoNotFounException();
		
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
		TreeSet<Vehiculo> vehiculosEnExceso = new TreeSet<Vehiculo>(); 

		this.telepase.entrySet().forEach(entry->{
			if(entry.getValue().enInfraccion())
				vehiculosEnExceso.add(entry.getValue());
		 });
	
		return vehiculosEnExceso;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
		
		return vehiculosEnCirculacion.size();
	}
	
	//codigo agregado
	
	public String nombre;

	public Autopista(String nombre) {
		super();
		this.nombre = nombre;
		telepase = new HashMap <>();
		vehiculosEnCirculacion = new HashSet <Vehiculo>();
	}
	
	
	

}
