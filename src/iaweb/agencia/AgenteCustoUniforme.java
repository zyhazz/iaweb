package iaweb.agencia;

import java.util.Collections;
import java.util.List;

import iaweb.agencia.Agente;
import iaweb.util.FSucessora;
import iaweb.util.Map;
import iaweb.util.Node;
import iaweb.util.Romeniav2;

public class AgenteCustoUniforme extends Agente {
	
	Map romeniav2 = new Romeniav2().getMap();
	
	public AgenteCustoUniforme(FSucessora origem, FSucessora[] objetivo) {
		super(origem, objetivo);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean search(Node node) {
		this.node = node;
		
		if(this.node == null) {
			return false;//acabou a borda e não encontrou, pare
		}
		
		System.out.print("Em " + node.getEstado().toString());
		
		//this.seq.add(node);
		System.out.println(" queremos " + this.objetivo.toString());
		if(this.objetivo.contains(this.node.getEstado())) {//se o nó for o objetivo...true
			this.seq.add(node);
			System.out.println("Chegamos.");
			return true;
		}else {
			System.out.print("vizinhos:");
			List<FSucessora> destinos = this.romeniav2.getNextLocations(node.getEstado());
			for(FSucessora i: destinos) {
				int custo = romeniav2.getDistance(node.getEstado(), i);
				System.out.print(i.toString() + "("+ custo +"," + node.getCusto() + ") ");
				Node n = new Node(i, node);
				n.addCusto(node.getCusto()); //adiciona o custo do pai
				n.addCusto(custo); //adiciona o custo da ultima viagem
				fringe.add(n);
			}
			System.out.println();

			Collections.sort(fringe);
			
			Node t = null;
			
			if(fringe.size() > 0) {//ainda tem o que visitar
				t = fringe.remove(0);
				System.out.println("Removendo " + t.getEstado().toString());
			}
			
			return search(t);
		}
	};
}
