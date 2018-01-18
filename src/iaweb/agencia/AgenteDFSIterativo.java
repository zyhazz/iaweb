package iaweb.agencia;

import java.util.ArrayList;
import iaweb.agencia.Agente;
import iaweb.util.*;

public class AgenteDFSIterativo extends Agente{

	private int limite = 0;
	private Agente agenteLimitado;
	private FSucessora origem;
	private FSucessora[] objetivo;
	
	public AgenteDFSIterativo(FSucessora origem, FSucessora[] objetivo) {
		super(origem, objetivo);
		this.origem = origem;
		this.objetivo = objetivo;
		// TODO Auto-generated constructor stub
	}
	
	public boolean search(Node node) {
		agenteLimitado = new AgenteDFSLimitado(origem, objetivo, limite);
		System.out.println("\n------ tentando com limite:" + limite);
		while (!agenteLimitado.run()) {
			limite++;
			agenteLimitado = new AgenteDFSLimitado(origem, objetivo, limite);
			System.out.println("\n------ tentando com limite:" + limite);
		}
		return true;
	};
	
	public ArrayList<Node> getResult() {
		return agenteLimitado.getResult();
	}
	
	

}
