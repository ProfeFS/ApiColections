package es.edu.cesur.programacion.cppilas;
import java.util.Deque;
import java.util.ArrayDeque;

public class PilaDemo {
    public static void main(String[] args) {
        Deque<Integer> pila = new ArrayDeque<>();

        // Añadiendo elementos (push)
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Mirando el elemento superior sin removerlo (peek)
       // System.out.println("Elemento en el tope: " + pila.peek());

        // Removiendo elementos (pop)
//        while (!pila.isEmpty()) {
//            System.out.println(pila.pop());
//        }
        
        pila.forEach(System.out::println);
    }
}
