package clinica;

public class Hora {
	int hora;
	int min;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hora;
		result = prime * result + min;
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
		Hora other = (Hora) obj;
		if (hora != other.hora)
			return false;
		if (min != other.min)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", min=" + min + "]";
	}
	public int getHora() {
		return hora;
	}
	public Hora(int hora, int min) {
		super();
		this.hora = hora;
		this.min = min;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
}
