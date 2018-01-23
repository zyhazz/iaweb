package iaweb.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	
	private List<Route> map = new ArrayList<Route>();
	
	private void addRoute(Route route) {
		map.add(route);
	}
	
	public void addRouteBetweenCities(FSucessora from, FSucessora to, int distance) {
		this.addRoute(new Route(from, to, distance));
		this.addRoute(new Route(to, from, distance));
	}

	public List<FSucessora> getLocations() {
		List<FSucessora> lista = map.stream()
			     .map(p -> p.getTo())
			     .collect(Collectors.toList());
		return lista;
	}

	public List<FSucessora> getNextLocations(FSucessora location) {
		
		List<FSucessora> filtro = map.stream()
			     .filter(item -> item.getFrom().equals(location))
			     .map(p -> p.getTo())
			     .collect(Collectors.toList());
			     
		return filtro;
	}

	public int getDistance(FSucessora fSucessora, FSucessora i) {
		
		List<Integer> filtro = map.stream()
			     .filter(item -> item.getFrom().equals(fSucessora) && item.getTo().equals(i))
			     .map(p -> p.getDistance())
			     .collect(Collectors.toList());
		
		return filtro.get(0);
	}

}
