package com.mycompany.projetocmed;

import java.util.Date;

public class Medico {
	
	private String CPF;
	private String CRM;
	private int Nome;
	
	public Consulta marcarConsulta(Paciente paciente, Date data)
	{
		return new Consulta(this, paciente, data);
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public int getNome() {
		return Nome;
	}

	public void setNome(int nome) {
		Nome = nome;
	}

	public Medico(String cPF, String cRM, int nome) {
		super();
		CPF = cPF;
		CRM = cRM;
		Nome = nome;
	}
	
	

	
}
