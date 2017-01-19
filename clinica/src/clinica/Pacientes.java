package clinica;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.lang.Object;;


public class Pacientes {
	String documento;
	String nome;
	String sexo;
	Endereco endereço;
	Data data;
	
	
	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Endereco getEndereço() {
		return endereço;
	}


	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}


	public Data getData() {
		return data;
	}


	public void setData(Data data) {
		this.data = data;
	}


	public Pacientes(String documento, String nome, String sexo, Endereco endereço, Data data) {
		super();
		this.documento = documento;
		this.nome = nome;
		this.sexo = sexo;
		this.endereço = endereço;
		this.data = data;
	}


	@Override
	public String toString() {
		return "Pacientes [documento=" + documento + ", nome=" + nome + ", sexo=" + sexo + ", endereço=" + endereço
				+ ", data=" + data + "]\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Pacientes other = (Pacientes) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}


	
	public Pacientes(String documento, String nome, String sexo, Data data) {
		super();
		this.documento = documento;
		this.nome = nome;
		this.sexo = sexo;
		this.data = data;
	}


	public String Formata(String nome)
	{
		String formatada;
		this.nome=nome;
		String[] parts = nome.split(" ");
		formatada=parts[parts.length]+" "+parts[1]+" "+parts[2];
		return formatada;
		
			
	}
	public int Idade(Pacientes p, String doc)
	{
		GregorianCalendar calendario = new GregorianCalendar();
		int diaA = calendario.get(GregorianCalendar.DAY_OF_MONTH);
		int mesA = calendario.get(GregorianCalendar.MONTH);
		int anoA = calendario.get(GregorianCalendar.YEAR);
		int i;
		int diaP=0;
		int mesP=0;
		int anoP=0;
		ColeçãoPacientes pablo;
		pablo = new ColeçãoPacientes();
		ArrayList <Pacientes> pa = pablo.getPacientes();
		for(i=0;i<pa.size();i++)
		{
			if(pa.get(i).documento.equals(doc))
			{
				diaP=pa.get(i).data.dia;
				mesP=pa.get(i).data.mes;
				anoP=pa.get(i).data.ano;
			}
		}
		int anoT=anoA-anoP;
		return anoT;
	}
}

