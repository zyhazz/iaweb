package iaweb.util;

import iaweb.util.FSucessora;

public interface FSucessora {
	
	public FSucessora[] getSucessao();
	
	public boolean isVisited(); 
	public void setVisited();
	public int getCusto();

}
