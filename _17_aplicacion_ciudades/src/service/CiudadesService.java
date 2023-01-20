package service;
import java.util.ArrayList;
import java.util.List;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	
	public boolean agregarCiudad(Ciudad ciudad) {
		if(
			ciudades.stream()
			.noneMatch(c->c.getNombre().equals(ciudad.getNombre())&&c.getPais().equals(ciudad.getPais()))
				) { //si no hay ninguna ciudad con ese nombre y pais, agregamos
			ciudades.add(ciudad);
			return true;
		}
		return false;
	}
	
	public int totalCiudadesPais(String pais) {
		return (int)ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Ciudad>
				.count();
	}
	
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
		.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes()) //Optional<Ciudad>
		.orElse(null);
	}
	
	public Ciudad buscarCiudad(String nombre, String pais) {
		return ciudades.stream()
				.filter(c->c.getNombre().equals(nombre)&&c.getPais().equals(pais))//Stream<Ciudad>
				.findFirst() //Optional<Ciudad>
				.orElse(null);
	}
	
	public Ciudad ciudadMasFria() {
		return ciudades.stream()
				.min((c1,c2)->Double.compare(c1.getTemperaturaMedia(), c2.getTemperaturaMedia()))
				.orElse(null);
	}
	
	//método que devuelva el total de paises registrados
	/*public int totalPaises() {
		return (int)ciudades.stream() //Stream<Ciudad>
				.map(c->c.getPais()) //Stream<String> Transforma cada objeto del Stream en otro objeto (cadena de caracteres)
				.distinct() //Stream<String>
				.count();*/
				
		//temperatura de las ciudades cuyo país se recibe como parámetro
		
		public double temperaturaMediaCiudadesPais (String pais) {
			return ciudades.stream()
					.filter(c->c.getPais().equals(pais)) //(Stream<Ciudad>
					.mapToDouble(c->c.getTemperaturaMedia())//DoubleStream
					.average() //OptionalFouble
					.orElse(0);
		}
		
	}
}

