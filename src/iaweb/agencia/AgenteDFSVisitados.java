package iaweb.agencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import iaweb.agencia.Agente;
import iaweb.util.*;

public class AgenteDFSVisitados extends Agente {
	private ArrayList<FSucessora> visitados = new ArrayList<FSucessora>();
	
	public AgenteDFSVisitados(FSucessora origem, FSucessora[] objetivo) {
		super(origem, objetivo);
		// TODO Auto-generated constructor stub
	}

	public boolean search(Node node) {
		this.node = node;// marca n� atual

		if (this.node == null) {
			return false;
		}
		
		System.out.print("Em " + node.getEstado().toString());
		visitados.add(node.getEstado());
		
		System.out.println(" queremos " + this.objetivo.toString());
		if (this.objetivo.contains(this.node.getEstado())) {// se o n� for o objetivo...true
			this.seq.add(node);
			System.out.println("Chegamos.");
			return true;
		} else {
			System.out.print("vizinhos:");
			List<FSucessora> destinos = Arrays.asList(this.node.getEstado().getSucessao());
			for (FSucessora i : destinos) {
				if (visitados.contains(i)) {
					System.out.print("!" + i.toString() + " ");
				} else {
					System.out.print(i.toString() + " ");
					fringe.add(0, new Node(i, node));
				}
			}
			System.out.println();

			Node t = null;

			if (fringe.size() > 0) {// ainda tem o que visitar
				t = fringe.remove(0);
				System.out.println("Removendo " + t.getEstado().toString());
			}

			return search(t);

		}
	};

}
