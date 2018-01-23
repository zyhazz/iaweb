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
	
	private List<ArrayList<Node>> fringe = new ArrayList<ArrayList<Node>>();//bidimensional para inicio e fim
	private ArrayList<Node> head = new ArrayList<Node>();
	private ArrayList<Node> tail = new ArrayList<Node>();
	private ArrayList<FSucessora> tailInt = new ArrayList<FSucessora>();
	private ArrayList<FSucessora> headInt = new ArrayList<FSucessora>();
	
	private Node headLink;
	private Node tailLink;
	
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

	@Override
	public boolean search(Node node) {
		// TODO Auto-generated method stub
		return false;
	};
	
	public ArrayList<Node> getResult(){
		ArrayList<Node> resultado = new ArrayList<Node>();
		
		ArrayList<Node> tmp = getHeadPath();
		if(tmp != null) {
			resultado.addAll(tmp);
		}
		
		resultado.add(new Node(null));//separador é um node nulo
		
		tmp = getTailPath();
		if(tmp != null) {
		resultado.addAll(tmp);
		}
		
		return resultado;
	}
	
	public ArrayList<Node> getResult(Node n) {
		ArrayList<Node> sequencia = new ArrayList<Node>();
		Node i;
		if(n != null) {
			sequencia.add(n);
			i = n.getPai();	
		}else {
			return null;
		}
		while(i != null) {
			sequencia.add(i);
			i = i.getPai();
		}
		Collections.reverse(sequencia);
		return sequencia;
	}
	
	public ArrayList<Node> getHeadPath() {
		return getResult(headLink);
	}
	
	public ArrayList<Node> getTailPath() {
		return getResult(tailLink);
	}
	
	
	public Node findLink(ArrayList<Node> haystack, FSucessora needle) {
		for(Node i:haystack) {
			if(i.getEstado() == needle) {
				return i;
			}
		}
		return null;
	}
	
	@Override
	public boolean run() {
		
		while(!head.isEmpty() && !tail.isEmpty()) {
			if(!head.isEmpty()) {
				node = head.remove(0);
				System.out.println("head:" + node.getEstado().toString());
				
				if(tailInt.contains(node.getEstado())) {
					System.out.println("encontramos um visitado na cabeca");
					headLink = new Node(node.getEstado(), node);
					tailLink = findLink(tail, node.getEstado());
					return true;
				}else {
					for(FSucessora i:node.getEstado().getSucessao()) {
						head.add(new Node(i, node));
					}
					headInt.add(node.getEstado());
				}
			}
			if(!tail.isEmpty()) {
				node = tail.remove(0);
				System.out.println("tail:\t\t" + node.getEstado().toString());
					if(headInt.contains(node.getEstado())) {
						System.out.println("encontramos um visitado na cauda");
						headLink = findLink(head, node.getEstado());
						tailLink = new Node(node.getEstado(), node);
						return true;
					}else {
						for(FSucessora i:node.getEstado().getSucessao()) {
							tail.add(new Node(i, node));
						}
						tailInt.add(node.getEstado());
					
				}
			}
		}
		
		return false;
	}

}
