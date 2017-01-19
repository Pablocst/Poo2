package clinica;

import java.util.ArrayList;

public class Medicos {
	String nome;
	String CRM;
	String especialidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CRM == null) ? 0 : CRM.hashCode());
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Medicos [nome=" + nome + ", CRM=" + CRM + ", especialidade="
				+ especialidade + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicos other = (Medicos) obj;
		if (CRM == null) {
			if (other.CRM != null)
				return false;
		} else if (!CRM.equals(other.CRM))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public Medicos(String nome, String cRM, String especialidade) {
		super();
		this.nome = nome;
		CRM = cRM;
		this.especialidade = especialidade;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
