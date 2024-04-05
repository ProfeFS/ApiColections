package es.edu.cesur.programacion.cpcolas;
import java.util.Collections;
import java.util.PriorityQueue;

import es.edu.cesur.programacion.domain.Persona;

public class UsoColaPrioridad {
    public static void main(String[] args) {
        PriorityQueue<Persona> colaPrioridad = new PriorityQueue<>(Collections.reverseOrder());
        
    	Persona andres = new Persona("Andrés", "Y1234", 35);
		Persona ivan = new Persona("Iván", "X3423", 25);
		Persona carmen = new Persona("Carmen", "S1234", 23);

        // Añadiendo elementos
        colaPrioridad.offer(andres);
		colaPrioridad.offer(ivan);
		colaPrioridad.offer(carmen);
		
		// Elementos se procesan en orden natural, de menor a mayor		
		while(!colaPrioridad.isEmpty()) {
			System.out.println(colaPrioridad.poll());
		}
		
		if(colaPrioridad.isEmpty()) {
			System.out.println("No hay nadie en la cola");
		}
		
    }
}
