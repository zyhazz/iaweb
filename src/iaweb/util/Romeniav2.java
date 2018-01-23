package iaweb.util;


public class Romeniav2{
	
	private Map gmap = new Map();
	public Romeniav2(){
		gmap.addRouteBetweenCities(Romenia.ARAD, Romenia.ZERIND, 75);
		gmap.addRouteBetweenCities(Romenia.ARAD, Romenia.SIBIU, 140);
		gmap.addRouteBetweenCities(Romenia.ARAD, Romenia.TIMISSOARA, 118);
		
		gmap.addRouteBetweenCities(Romenia.SIBIU, Romenia.ORADEA, 151);
		gmap.addRouteBetweenCities(Romenia.SIBIU, Romenia.FAGARAS, 99);
		gmap.addRouteBetweenCities(Romenia.SIBIU, Romenia.RIMNICU_VILCEA, 80);
		
		gmap.addRouteBetweenCities(Romenia.ORADEA, Romenia.ZERIND, 71);
		
		gmap.addRouteBetweenCities(Romenia.TIMISSOARA, Romenia.LUGOJ, 111);
		
		gmap.addRouteBetweenCities(Romenia.LUGOJ, Romenia.MEHADIA, 70);
		
		gmap.addRouteBetweenCities(Romenia.MEHADIA, Romenia.DOBRETA, 75);
		
		gmap.addRouteBetweenCities(Romenia.DOBRETA, Romenia.CRAIOVA, 120);
		
		gmap.addRouteBetweenCities(Romenia.CRAIOVA, Romenia.RIMNICU_VILCEA, 146);
		gmap.addRouteBetweenCities(Romenia.CRAIOVA, Romenia.PITESTI, 138);
		
		gmap.addRouteBetweenCities(Romenia.PITESTI, Romenia.RIMNICU_VILCEA, 97);
		
		gmap.addRouteBetweenCities(Romenia.FAGARAS, Romenia.BUCHAREST, 211);
		gmap.addRouteBetweenCities(Romenia.PITESTI, Romenia.BUCHAREST, 101);
		gmap.addRouteBetweenCities(Romenia.BUCHAREST, Romenia.GIURGIU, 90);
		gmap.addRouteBetweenCities(Romenia.BUCHAREST, Romenia.URZICENI, 85);
		
		gmap.addRouteBetweenCities(Romenia.URZICENI, Romenia.HIRSOVA, 98);
		gmap.addRouteBetweenCities(Romenia.HIRSOVA, Romenia.EFORIE, 86);
		gmap.addRouteBetweenCities(Romenia.URZICENI, Romenia.VASLUI, 142);
		gmap.addRouteBetweenCities(Romenia.VASLUI, Romenia.IASI, 92);
		gmap.addRouteBetweenCities(Romenia.IASI, Romenia.NEAMT, 87);
		
	}
	
	public Map getMap() {
		return gmap;
	}
	

}
