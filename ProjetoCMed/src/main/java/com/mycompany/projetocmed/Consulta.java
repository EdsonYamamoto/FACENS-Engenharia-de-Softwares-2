package com.mycompany.projetocmed;

import java.util.Date;

public class Consulta {
	
	private Medico medico;
	private Paciente paciente;
	private Date data;
	
	
	public Consulta(Medico medico, Paciente paciente, Date data) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
