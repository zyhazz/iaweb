package iaweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iaweb.agencia.Agente;
import iaweb.agencia.AgenteBFS;
import iaweb.agencia.AgenteDFS;
import iaweb.agencia.AgenteDFSIterativo;
import iaweb.agencia.AgenteDFSLimitado;
import iaweb.agencia.AgenteDFSVisitados;
import iaweb.util.Aspirador;
import iaweb.util.FSucessora;
import iaweb.util.Node;
import iaweb.util.Romenia;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/aspirador":
				// showNewForm(request, response)
				aspirador(request, response);;
				break;
			case "/aspirador_start":
				// showNewForm(request, response)
				aspirador_start(request, response);;
				break;
			case "/romenia":
				romenia(request, response);
				break;
			case "/romenia_start":
				romenia_start(request, response);
				break;
			case "/":
				main(request, response);
				break;
			default:
				//DefaultResponse(request, response);
				break;
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}
	private void main(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("activePage", "lista_problemas");
		RequestDispatcher dispatcher = request.getRequestDispatcher("app/page.jsp");
		dispatcher.forward(request, response);
	}
	private void romenia_start(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("activePage", "romenia_start");
		request.setAttribute("cidades", Romenia.values());
		RequestDispatcher dispatcher = request.getRequestDispatcher("app/page.jsp");
		dispatcher.forward(request, response);
	}
	private void aspirador_start(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("activePage", "aspirador_start");
		request.setAttribute("estados", Aspirador.values());
		RequestDispatcher dispatcher = request.getRequestDispatcher("app/page.jsp");
		dispatcher.forward(request, response);
	}

	private void romenia(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String origemstr = request.getParameter("origem");
		String destinostr = request.getParameter("destino");
		int tipo = Integer.parseInt(request.getParameter("tipo"));
		int limite = Integer.parseInt(request.getParameter("limite"));
		FSucessora origem = Romenia.valueOf(origemstr);
		FSucessora destino[] = { Romenia.valueOf(destinostr) };
		Agente agente;
		String agenteTipo;
		switch (tipo) {
		case 1:
			agente = new AgenteDFS(origem, destino);
			agenteTipo = "Agente DFS";
			break;
		case 2:
			agente = new AgenteBFS(origem, destino);
			agenteTipo = "Agente BFS";
			break;
		case 3:
			agente = new AgenteDFSVisitados(origem, destino);
			agenteTipo = "Agente DFSVisitados";
			break;
		case 4:
			agente = new AgenteDFSLimitado(origem, destino, limite);
			agenteTipo = "Agente DFSLimitado";
			break;
		case 5:
			agente = new AgenteDFSIterativo(origem, destino);
			agenteTipo = "Agente DFSIterativo";
			break;

		default:
			agente = new AgenteDFS(origem, destino);
			agenteTipo = "Agente DFS";
			break;
		}

		Boolean sucesso = agente.run();
		ArrayList<Node> rota = null;
		if(sucesso) {
			 rota = agente.getResult();
		}
		request.setAttribute("rota", rota);
		request.setAttribute("activePage", "romenia_run");
		request.setAttribute("sucesso", sucesso);
		request.setAttribute("origem", origemstr);
		request.setAttribute("destino", destinostr);
		request.setAttribute("agenteTipo", agenteTipo);
		request.setAttribute("tipo", tipo);
		request.setAttribute("limite", limite);
		RequestDispatcher dispatcher = request.getRequestDispatcher("app/page.jsp");
		dispatcher.forward(request, response);
	}
	private void aspirador(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String origemstr = request.getParameter("origem");
		int tipo = Integer.parseInt(request.getParameter("tipo"));
		int limite = Integer.parseInt(request.getParameter("limite"));
		FSucessora origem = Aspirador.valueOf(origemstr);
		FSucessora destino[] = { Aspirador.ELL, Aspirador.DLL };
		Agente agente;
		String agenteTipo;
		switch (tipo) {
		case 1:
			agente = new AgenteDFS(origem, destino);
			agenteTipo = "Agente DFS";
			break;
		case 2:
			agente = new AgenteBFS(origem, destino);
			agenteTipo = "Agente BFS";
			break;
		case 3:
			agente = new AgenteDFSVisitados(origem, destino);
			agenteTipo = "Agente DFSVisitados";
			break;
		case 4:
			agente = new AgenteDFSLimitado(origem, destino, limite);
			agenteTipo = "Agente DFSLimitado";
			break;
		case 5:
			agente = new AgenteDFSIterativo(origem, destino);
			agenteTipo = "Agente DFSIterativo";
			break;

		default:
			agente = new AgenteDFS(origem, destino);
			agenteTipo = "Agente DFS";
			break;
		}

		Boolean sucesso = agente.run();
		ArrayList<Node> rota = null;
		if(sucesso) {
			 rota = agente.getResult();
		}
		request.setAttribute("rota", rota);
		request.setAttribute("activePage", "aspirador_run");
		request.setAttribute("sucesso", sucesso);
		request.setAttribute("origem", origemstr);
		request.setAttribute("agenteTipo", agenteTipo);
		request.setAttribute("tipo", tipo);
		request.setAttribute("limite", limite);
		RequestDispatcher dispatcher = request.getRequestDispatcher("app/page.jsp");
		dispatcher.forward(request, response);
	}

}
