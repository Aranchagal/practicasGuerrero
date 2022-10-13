package es.indra.curso.entidades;

import es.indra.curso.entidades.interfaces.IArbol;

public abstract class Arbol implements IArbol{

	
	public Arbol() {
		
	}
	
	@Override
	public boolean soyRama() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyTronco() {
		// TODO Auto-generated method stub
		return false;
	}
}
