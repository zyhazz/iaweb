package iaweb.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import iaweb.util.FSucessora;
import iaweb.util.Romenia;

public enum Romenia implements FSucessora {
	ARAD, ZERIND, ORADEA, SIBIU, FAGARAS, TIMISSOARA, LUGOJ, MEHADIA, DOBRETA, CRAIOVA, RIMNICU_VILCEA, PITESTI, BUCHAREST, GIURGIU, URZICENI, HIRSOVA, EFORIE, VASLUI, IASI, NEAMT;

	private Romenia[] destinos;

	private boolean visited = false;
	
	private static int distancia = 0;
	
	static {
		ARAD.destinos = new Romenia[] { ZERIND(75), TIMISSOARA(118), SIBIU(140) };
		ZERIND.destinos = new Romenia[] { ARAD(75), ORADEA(71) };
		ORADEA.destinos = new Romenia[] { ZERIND(71), SIBIU(151) };
		TIMISSOARA.destinos = new Romenia[] { ARAD(118), LUGOJ(111) };
		LUGOJ.destinos = new Romenia[] { TIMISSOARA(111), MEHADIA(70) };
		MEHADIA.destinos = new Romenia[] { LUGOJ(70), DOBRETA(75) };
		DOBRETA.destinos = new Romenia[] { MEHADIA(75), CRAIOVA(120) };
		CRAIOVA.destinos = new Romenia[] { DOBRETA(120),PITESTI(138), RIMNICU_VILCEA(146) };
		PITESTI.destinos = new Romenia[] { CRAIOVA(138), RIMNICU_VILCEA(97), BUCHAREST(101) };
		RIMNICU_VILCEA.destinos = new Romenia[] { SIBIU(80), PITESTI(97), CRAIOVA(146) };
		SIBIU.destinos = new Romenia[] { ARAD(140), ORADEA(151), RIMNICU_VILCEA(80), FAGARAS(99) };
		FAGARAS.destinos = new Romenia[] { SIBIU(99), BUCHAREST(211) };
		BUCHAREST.destinos = new Romenia[] { FAGARAS(211), PITESTI(101), GIURGIU(90), URZICENI(85) };
		GIURGIU.destinos = new Romenia[] { BUCHAREST(90) };
		URZICENI.destinos = new Romenia[] { BUCHAREST(85), HIRSOVA(98), VASLUI(142) };
		HIRSOVA.destinos = new Romenia[] { URZICENI(98), EFORIE(86) };
		EFORIE.destinos = new Romenia[] { HIRSOVA(86) };
		VASLUI.destinos = new Romenia[] { URZICENI(142), IASI(92) };
		IASI.destinos = new Romenia[] { VASLUI(92), NEAMT(87) };
		NEAMT.destinos = new Romenia[] { IASI(87) };
	}

	public FSucessora[] getSucessao() {
		List<Romenia> i = Arrays.asList(destinos);
		Collections.shuffle(i);
		return (FSucessora[]) i.toArray();	
	}
	
	public int getDistance() {
		return distancia;
	}

	public boolean isVisited() {
		return this.visited;
	}
	public void setVisited() {
		this.visited = true;
	}
	
	private static Romenia ARAD(int i) {
		distancia = i;
		return ARAD;
	}
	
	private static Romenia ZERIND(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return ZERIND;
	}
	
	private static Romenia ORADEA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return ORADEA;
	}
	
	private static Romenia TIMISSOARA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return TIMISSOARA;
	}
	
	private static Romenia LUGOJ(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return LUGOJ;
	}
	
	private static Romenia MEHADIA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return MEHADIA;
	}
	
	private static Romenia DOBRETA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return DOBRETA;
	}
	
	private static Romenia CRAIOVA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return CRAIOVA;
	}
	
	private static Romenia PITESTI(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return PITESTI;
	}
	
	private static Romenia RIMNICU_VILCEA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return RIMNICU_VILCEA;
	}
	private static Romenia SIBIU(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return SIBIU;
	}
	private static Romenia FAGARAS(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return FAGARAS;
	}
	private static Romenia BUCHAREST(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return BUCHAREST;
	}
	private static Romenia IASI(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return IASI;
	}
	private static Romenia VASLUI(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return VASLUI;
	}
	private static Romenia HIRSOVA(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return HIRSOVA;
	}
	private static Romenia URZICENI(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return URZICENI;
	}
	private static Romenia NEAMT(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return NEAMT;
	}
	private static Romenia EFORIE(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return EFORIE;
	}
	private static Romenia GIURGIU(int i) {
		// TODO Auto-generated method stub
		distancia = i;
		return NEAMT;
	}

	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return distancia;
	}

}
