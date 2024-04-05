package es.edu.cesur.programacion.cpcolas;

import java.util.LinkedList;
import java.util.Queue;

import es.edu.cesur.programacion.domain.Persona;

public class UsoCola {

	public static void main(String[] args) {
		Queue<Persona> colaVentanilla1 = new LinkedList<>(); // (FIFO)

		Persona andres = new Persona("Andrés", "Y1234", 35);
		Persona ivan = new Persona("Iván", "X3423", 25);
		Persona carmen = new Persona("Carmen", "S1234", 23);

		colaVentanilla1.offer(andres);
		colaVentanilla1.offer(ivan);
		colaVentanilla1.offer(carmen);
		
		while(!colaVentanilla1.isEmpty()) {
			System.out.println(colaVentanilla1.poll());
		}
		
		if(colaVentanilla1.isEmpty()) {
			System.out.println("No hay nadie en la cola");
		}
		
		

	}

}
