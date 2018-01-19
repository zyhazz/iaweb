package iaweb.agencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import iaweb.agencia.Agente;
import iaweb.util.FSucessora;
import iaweb.util.Node;
import iaweb.util.Romenia;

public class AgenteBidirecional extends Agente {
	
	protected List<ArrayList<Node>> fringe = new ArrayList<ArrayList<Node>>();//bidimensional para inicio e fim
	protected ArrayList<Node> head = new ArrayList<Node>();//bidimensional para inicio e fim
	protected ArrayList<Node> tail = new ArrayList<Node>();//bidimensional para inicio e fim
	
	public AgenteBidirecional(FSucessora origem, FSucessora[] objetivo) {
		super(origem, objetivo);
		
		fringe.add(head);
		fringe.add(tail);
		head.add(new Node(origem));
		
		for(FSucessora i: objetivo) {
			tail.add(new Node(i));
		}
		
		System.out.println(fringe.toString());
		// TODO Auto-generated constructor stub
	}
	
	public boolean searchJob(Node node, ArrayList<Node> localFringe) {
		this.node = node;//marca nó atual
		
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
				localFringe.add(new Node(i, node) );
			}
			System.out.println();
			
			Node t = null;
			
			if(localFringe.size() > 0) {//ainda tem o que visitar
				t = localFringe.remove(0);
				System.out.println("Removendo " + t.getEstado().toString());
			}
			
			return search(t);
		}
	}

	@Override
	public boolean search(Node node) {
		// TODO Auto-generated method stub
		return false;
	};
	
	@Override
	public boolean run() {
		
		while(!head.isEmpty() && !tail.isEmpty()) {
			if(!head.isEmpty()) {
				node = head.remove(0);
				for(FSucessora i: node.getEstado().getSucessao()) {
					if(i.isVisited()) {
						System.out.println("encontramos um visitado");
						return true;
					}else {
						head.add(new Node(i, node));
						i.setVisited();
						System.out.println("head:" + i.toString());
					}
				}
			}
			if(!tail.isEmpty()) {
				node = tail.remove(0);
				for(FSucessora i: node.getEstado().getSucessao()) {
					if(i.isVisited()) {
						System.out.println("encontramos um visitado");
						return true;
					}else {
						tail.add(new Node(i, node));
						i.setVisited();
						System.out.println("tail:" + i.toString());
					}
				}
			}
		}
		
		return false;
	}

}
