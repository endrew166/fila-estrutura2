package iftm.estruturadedados;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {

		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();

		Paciente c1 = new Paciente("Maria", "12/03/99", "Dor de cabeça", "Verde");
		Paciente c2 = new Paciente("Jose", "12/03/95", "Perna quebrada", "Amarelo");
		Paciente c3 = new Paciente("Mike", "3/04/92", "Infarto", "Vermelho");
		Paciente c4 = new Paciente("Micão", "16/09/99", "Bicho de pé", "Verde");

		fila.enfileirar(c1);
		fila.enfileirar(c2);
		fila.enfileirar(c3);
		fila.enfileirar(c4);

		System.out.println();
		System.out.println(fila.desenfileira());
		System.out.println();
		System.out.println(fila.toString());

		 Queue<Paciente> queue = new PriorityQueue<Paciente>(
		            new Comparator<Paciente>(){
		                @Override
		                public int compare(Paciente c1, Paciente c2) {
		                    return c1.getPrioridade().compareTo(c2.getPrioridade());
		                }
		            }
		        );
	
	      	queue.offer(c1);        
	        queue.offer(c2);        
	        queue.offer(c3);              
	        queue.offer(c4);  
	        System.out.println(queue.toString());
	}

}