package com.mycompany.projetocmed;

import java.util.ArrayList;

public class Historico {
	
	private ArrayList<Diagnostico> List;
	
	

	public ArrayList<Diagnostico> getList() {
		return List;
	}

	public void addDiagnostico(Diagnostico d)
	{
		List.add(d);
	}
	
	
}
