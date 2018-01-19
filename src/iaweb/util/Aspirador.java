package iaweb.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import iaweb.util.Aspirador;
import iaweb.util.FSucessora;

public enum Aspirador implements FSucessora {
	ESS, DSS, ELS, DLS, ESL, DSL, ELL, DLL;

	private Aspirador[] destinos;
	
	private boolean visited = false;

	static {
		ESS.destinos = new Aspirador[] { ELS, DSS, ESS };
		DSS.destinos = new Aspirador[] { DSL, ESS, DSS };
		ELS.destinos = new Aspirador[] { ELS, DLS, ELS };
		DLS.destinos = new Aspirador[] { DLL, ELS, DLS };
		ESL.destinos = new Aspirador[] { ELL, DSL, ESL };
		DSL.destinos = new Aspirador[] { ESL, DSL, DSL };
		ELL.destinos = new Aspirador[] { ELL, DLL, ELL };
		DLL.destinos = new Aspirador[] { DLL, ELL, DLL };
	}

	@Override
	public FSucessora[] getSucessao() {
		// TODO Auto-generated method stub
		List<Aspirador> i = Arrays.asList(destinos);
		Collections.shuffle(i);
		return (FSucessora[]) i.toArray();	
	}
	
	public boolean isVisited() {
		return this.visited;
	}
	public void setVisited() {
		this.visited = true;
	}

}
