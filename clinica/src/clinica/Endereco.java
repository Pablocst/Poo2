package clinica;

public class Endereco {
	String CEP;
	String rua;
	String bairro;
	String complemento;
	
	
	
	public Endereco(String cEP, String rua, String bairro, String complemento) {
		super();
		CEP = cEP;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}



	public String getCEP() {
		return CEP;
	}



	public void setCEP(String cEP) {
		CEP = cEP;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getComplemento() {
		return complemento;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public Endereco(String cEP, String bairro, String complemento) {
		super();
		CEP = cEP;
		this.bairro = bairro;
		this.complemento = complemento;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CEP == null) ? 0 : CEP.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (CEP == null) {
			if (other.CEP != null)
				return false;
		} else if (!CEP.equals(other.CEP))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Endereco [CEP=" + CEP + ", rua=" + rua + ", bairro=" + bairro + ", complemento=" + complemento + "]";
	}
}
