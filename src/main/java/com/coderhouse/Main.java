package com.coderhouse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public Main() {
		
	}
	public static void main(String[] args) {
		Personas p1 = new Personas("Horacio", "Quiroga");
		Personas p2 = new Personas("Edgardo", "Poe");
		Personas p3 = new Personas("Isabel", "Allende");
		Personas p4 = new Personas("Miguel", "Cervantes");
		Personas p5 = new Personas("Oscar", "Wilde");
		
		List <String> nombres = new ArrayList<String>();
		nombres.add(p1.getNombre());
		nombres.add(p2.getNombre());
		nombres.add(p3.getNombre());
		nombres.add(p4.getNombre());
		nombres.add(p5.getNombre());
		
		Collections.sort(nombres);
		System.out.println(nombres);
		
		List <String> apellidos = new ArrayList<String>();
		apellidos.add(p1.getApellido());
		apellidos.add(p2.getApellido());
		apellidos.add(p3.getApellido());
		apellidos.add(p4.getApellido());
		apellidos.add(p5.getApellido());
		
		Collections.sort(apellidos);
		System.out.println(apellidos);
		
		List <String> apellidos_alreves = new ArrayList<String>();
		apellidos_alreves.add(p1.getApellido());
		apellidos_alreves.add(p2.getApellido());
		apellidos_alreves.add(p3.getApellido());
		apellidos_alreves.add(p4.getApellido());
		apellidos_alreves.add(p5.getApellido());
		
		Collections.sort(apellidos_alreves, Collections.reverseOrder());
		System.out.println(apellidos_alreves);
				
	}

}
