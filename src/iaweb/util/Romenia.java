package iaweb.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import iaweb.util.FSucessora;
import iaweb.util.Romenia;

public enum Romenia implements FSucessora {
	ARAD, ZERIND, ORADEA, SIBIU, FAGARAS, TIMISSOARA, LUGOJ, MEHADIA, DOBRETA, CRAIOVA, RIMNICU_VILCEA, PITESTI, BUCHAREST, GIURGIU, URZICENI, HIRSOVA, EFORIE, VASLUI, IASI, NEAMT;

	private Romenia[] destinos;

	static {
		ARAD.destinos = new Romenia[] { ZERIND, TIMISSOARA, SIBIU };
		ZERIND.destinos = new Romenia[] { ARAD, ORADEA };
		ORADEA.destinos = new Romenia[] { ZERIND, SIBIU };
		TIMISSOARA.destinos = new Romenia[] { ARAD, LUGOJ };
		LUGOJ.destinos = new Romenia[] { TIMISSOARA, MEHADIA };
		MEHADIA.destinos = new Romenia[] { LUGOJ, DOBRETA };
		DOBRETA.destinos = new Romenia[] { MEHADIA, CRAIOVA };
		CRAIOVA.destinos = new Romenia[] { PITESTI, RIMNICU_VILCEA };
		PITESTI.destinos = new Romenia[] { CRAIOVA, RIMNICU_VILCEA, BUCHAREST };
		RIMNICU_VILCEA.destinos = new Romenia[] { SIBIU, PITESTI, CRAIOVA };
		SIBIU.destinos = new Romenia[] { ARAD, ORADEA, RIMNICU_VILCEA, FAGARAS };
		FAGARAS.destinos = new Romenia[] { SIBIU, BUCHAREST };
		BUCHAREST.destinos = new Romenia[] { FAGARAS, PITESTI, GIURGIU, URZICENI };
		GIURGIU.destinos = new Romenia[] { BUCHAREST };
		URZICENI.destinos = new Romenia[] { BUCHAREST, HIRSOVA, VASLUI };
		HIRSOVA.destinos = new Romenia[] { URZICENI, EFORIE };
		EFORIE.destinos = new Romenia[] { HIRSOVA };
		VASLUI.destinos = new Romenia[] { URZICENI, IASI };
		IASI.destinos = new Romenia[] { VASLUI, NEAMT };
		NEAMT.destinos = new Romenia[] { IASI };
	}

	public FSucessora[] getSucessao() {
		List<Romenia> i = Arrays.asList(destinos);
		Collections.shuffle(i);
		return (FSucessora[]) i.toArray();	
	}

}
