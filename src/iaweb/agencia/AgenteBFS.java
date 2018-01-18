package iaweb.agencia;

import java.util.Arrays;
import java.util.List;

import iaweb.agencia.Agente;
import iaweb.util.FSucessora;
import iaweb.util.Node;

public class AgenteBFS extends Agente {
	
	
	public AgenteBFS(FSucessora origem, FSucessora[] objetivo) {
		super(origem, objetivo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean search(Node node) {
		this.node = node;//marca n� atual
		
		if(node == null) {
			return false;
		}
		
		System.out.print("Em " + node.getEstado().toString());
		
		//this.seq.add(node);
		System.out.println(" queremos " + this.objetivo.toString());
		if(this.objetivo.contains(this.node.getEstado())) {//se o n� for o objetivo...true
			this.seq.add(node);//adiciona o ultimo n� pra voltar
			System.out.println("Chegamos.");
			return true;
		}else {
			System.out.print("vizinhos:");
			List<FSucessora> destinos = Arrays.asList(this.node.getEstado().getSucessao());
			for(FSucessora i: destinos) {
				System.out.print(i.toString() + " ");
				fringe.add(new Node(i, node));
			}
			System.out.println();
			return search(fringe.remove(0));
		}
	};

}
