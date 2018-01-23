package iaweb.util;

import iaweb.util.FSucessora;
import iaweb.util.Node;

public class Node implements Comparable<Node> {
	private FSucessora estado;
	private Node pai;
	private int altura = 0;
	private int custo = 0;
	private Map heuristic = null;
	
	
	public Node(FSucessora estado) {
		// TODO Auto-generated constructor stub
		this.estado = estado;
	}
	public Node(FSucessora estado, Node nodePai) {
		// TODO Auto-generated constructor stub
		this.estado = estado;
		this.pai = nodePai;
	}
	public Node(FSucessora estado, Node nodePai, int altura) {
		// TODO Auto-generated constructor stub
		this.estado = estado;
		this.pai = nodePai;
		this.altura = altura;
	}
	
	public FSucessora getEstado() {
		return estado;
	}
	public void setEstado(FSucessora estado) {
		this.estado = estado;
	}
	public Node getPai() {
		return pai;
	}
	public void setPai(Node pai) {
		this.pai = pai;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public void addCusto(int custo) {
		this.custo += custo;
	}
	public void setHeuristic(Map map) {
		this.heuristic = map;
	}
	@Override
	public int compareTo(Node o) {
		if(this.heuristic != null) {
		// TODO Auto-generated method stub
			return (custo + heuristic.getHeuristic(Romenia.BUCHAREST, this.getEstado())) - (o.getCusto() + heuristic.getHeuristic(Romenia.BUCHAREST, o.getEstado()));
		}else {
			return (this.custo - o.custo);
		}
	}
}
