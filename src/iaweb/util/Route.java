package iaweb.util;

public class Route {
	private FSucessora from;
	private FSucessora to;
	private int distance;
	
	Route(FSucessora from2,FSucessora to2,int distance2){
		this.from = from2;
		this.to= to2;
		this.distance = distance2;
	}
	
	public FSucessora getFrom() {
		return from;
	}
	public void setFrom(FSucessora from) {
		this.from = from;
	}
	public FSucessora getTo() {
		return to;
	}
	public void setTo(FSucessora to) {
		this.to = to;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

}
