package iaweb.runner;

import iaweb.agencia.*;
import iaweb.agencia.AgenteBFS;
import iaweb.agencia.AgenteDFS;
import iaweb.agencia.AgenteDFSIterativo;
import iaweb.agencia.AgenteDFSLimitado;
import iaweb.agencia.AgenteDFSVisitados;
import iaweb.util.Aspirador;
import iaweb.util.FSucessora;
import iaweb.util.Node;
import iaweb.util.Romenia;

public class Main {
	
	private static void finish(Agente a) {
		if(a.run()) {
			System.out.println("----- Rota -------");
			for(Node i : a.getResult()) {
				System.out.println(i.getEstado().toString());
			}
			System.out.println("----- Fim da rota -------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FSucessora origem = Romenia.ARAD;
		
		FSucessora[] destino = {Romenia.BUCHAREST};
		
		FSucessora origemAspirador = Aspirador.ESS;
		
		FSucessora[] destinoAspirador = {Aspirador.DLL, Aspirador.ELL};
		
		Agente agentedfs = new AgenteDFS(origemAspirador, destinoAspirador);
		//Agente agentedfs = new AgenteDFS(origem, destino);
		
		Agente agentebfs = new AgenteBFS(origem, destino);
		//Agente agentebfs = new AgenteBFS(origemAspirador, destinoAspirador);
		
		//Agente agentedfsvisitados = new AgenteDFSVisitados(origem, destino);
		Agente agentedfsvisitados = new AgenteDFSVisitados(origemAspirador, destinoAspirador);
		
		//Agente agentedfslimitado = new AgenteDFSLimitado(origem, destino, 4);
		Agente agentedfslimitado = new AgenteDFSLimitado(origemAspirador, destinoAspirador, 4);
		
		//Agente agentedfsiterativo = new AgenteDFSIterativo(origem, destino);
		Agente agentedfsiterativo = new AgenteDFSIterativo(origemAspirador, destinoAspirador);
		/*
		System.out.println("----- iniciando agente DFS -------");
		finish(agentedfs);
		System.out.println("----- finalizando agente DFS -----");
		
		System.out.println();
		
		System.out.println("----- iniciando agente BFS -------");
		finish(agentebfs);
		System.out.println("----- finalizando agente BFS -------");
		
		System.out.println();
		
		System.out.println("----- iniciando agente DFSv -------");
		finish(agentedfsvisitados);
		System.out.println("----- finalizando agente DFSv -------");
		
		System.out.println();
		
		System.out.println("----- iniciando agente DFSh -------");
		finish(agentedfslimitado);
		System.out.println("----- finalizando agente DFSh -------");
		
		System.out.println("----- iniciando agente DFSi -------");
		finish(agentedfsiterativo);
		System.out.println("----- finalizando agente DFSi -------");
		*/
	}

}
