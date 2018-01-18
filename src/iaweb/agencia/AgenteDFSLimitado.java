package iaweb.agencia;

import java.util.Arrays;
import java.util.List;

import iaweb.agencia.Agente;
import iaweb.util.*;

public class AgenteDFSLimitado extends Agente {

	private int limite;

	public AgenteDFSLimitado(FSucessora origem, FSucessora[] objetivo, int limite) {
		super(origem, objetivo);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}
	
	public Node checkH() {
		if(fringe.size() > 0) {//ainda tem o que visitar
			Node t = fringe.remove(0);
			System.out.println("Removendo " + t.getEstado().toString());
			if(t.getAltura() <= limite) {
				return t;
			}else {
				System.out.println("Limite passa " + t.getEstado().toString() + " descartado");
				return checkH();
			}
		}else {
			System.out.println("n�o existe caminho. pare.");
			return null;//nao h� o que remover
		}
	}
	
	public boolean search(Node node) {
		this.node = node;//marca n� atual
		
		if(this.node == null) {
			return false;
		}
		
		System.out.print("Em " + node.getEstado().toString());
		
		//this.seq.add(node);
		System.out.println(" queremos " + this.objetivo.toString());
		if(this.objetivo.contains(this.node.getEstado())) {//se o n� for o objetivo...true
			this.seq.add(node);
			System.out.println("Chegamos.");
			return true;
		}else {
			System.out.print("vizinhos:");
			List<FSucessora> destinos = Arrays.asList(this.node.getEstado().getSucessao());
			for(FSucessora i: destinos) {
				System.out.print(i.toString() + " ");
				fringe.add(0, new Node(i, node, node.getAltura() + 1) );
			}
			System.out.println();
			
			Node t = checkH();
			
			return search(t);
			
			
		}
	};
	
	

}
