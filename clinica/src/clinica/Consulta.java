package clinica;

public class Consulta {
	Pacientes paciente;
	Medicos medico;	
	Data data;
	Hora hora;
	public Consulta(Pacientes paciente, Medicos medico, Data data, Hora hora) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
	}


	public Pacientes getPaciente() {
		return paciente;
	}


	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}


	public Data getData() {
		return data;
	}


	public void setData(Data data) {
		this.data = data;
	}


	public Hora getHora() {
		return hora;
	}


	public void setHora(Hora hora) {
		this.hora = hora;
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		return true;
	}
	public Medicos getMedico() {
		return medico;
	}
	public void setMedico(Medicos medico) {
		this.medico = medico;
	}	

@Override
	public String toString() {
		return "Consulta [paciente=" + paciente + ", medico=" + medico + ", data=" + data + ", hora=" + hora + "]";
	}
}