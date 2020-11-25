package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista actual = new Autopista("nuevaAutopista");
		Vehiculo nuevoVehiculo = new Automovil("ABC123", 1);
		
		assertTrue(actual.registrarTelepase( 1 , nuevoVehiculo));
	}

	
	///quedo dudoso
	@Test
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {
		Autopista actual = new Autopista("nuevaAutopista");
		Vehiculo nuevoVehiculo = new Automovil("ABC123", 1);
		Vehiculo nuevoVehiculo2 = new Automovil("ABC124", 2);
		
		try {
			actual.ingresarAutopista(1);
			
		} catch (VehiculoNotFounException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {actual.salirAutpista(nuevoVehiculo2);
			
		}  catch (VehiculoNotFounException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		Autopista actual = new Autopista("nuevaAutopista");
		Vehiculo nuevoVehiculo = new Automovil("ABC123", 1);
		Vehiculo nuevoVehiculo2 = new Automovil("ABC124", 2);
		try {
			actual.ingresarAutopista(1);
			actual.ingresarAutopista(2);
		} catch (VehiculoNotFounException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nuevoVehiculo.setVelocidadActual(200);
		nuevoVehiculo2.setVelocidadActual(233);
		
		assertEquals(actual.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente().size(), 2);
		
		
		
		
	}
	@Test
	public void queLanceExceptionAlQuererIngresarConUnTelepaseIncorrecto() {
		
	}
	@Test
	public void generetestAEleccion2() {
		
	}
	
}
