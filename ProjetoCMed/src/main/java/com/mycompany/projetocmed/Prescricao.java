package com.mycompany.projetocmed;

import java.util.ArrayList;

public class Prescricao {
	
	private Consulta consulta;
	private ArrayList<Medicacao> list;
	
	public Prescricao (Consulta consulta)
	{
		this.consulta = consulta;
	}
	
	public void addMedicacao(Medicacao medicacao)
	{
		list.add(medicacao);
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public ArrayList<Medicacao> getList() {
		return list;
	}

	public void setList(ArrayList<Medicacao> list) {
		this.list = list;
	}
	
	
	

}
