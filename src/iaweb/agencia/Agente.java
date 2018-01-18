package iaweb.agencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import iaweb.util.FSucessora;
import iaweb.util.Node;

public abstract class Agente {
	protected ArrayList<Node> seq = new ArrayList<Node>();
	protected ArrayList<Node> fringe = new ArrayList<Node>();//inicia vazia
	protected Node node;
	protected ArrayList<FSucessora> objetivo = new ArrayList<FSucessora>();
	
	public Agente(FSucessora origem, FSucessora[] objetivo) {
		this.fringe.add(new Node(origem));
		this.objetivo.addAll(Arrays.asList(objetivo));
		
	}
	
	public boolean run() {
		// TODO Auto-generated method stub
		return this.search(fringe.get(0));
	}

	public abstract boolean search(Node node);

	public ArrayList<Node> getResult() {
		// TODO Auto-generated method stub
		Node i = seq.get(seq.size() - 1).getPai();
		while(i != null) {
			seq.add(i);
			i = i.getPai();
		}
		Collections.reverse(seq);
		return seq;
		//return null;
	}


}
