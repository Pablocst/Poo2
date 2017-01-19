package clinica;
import java.util.ArrayList;
import java.util.Iterator;
public class ColeçãoMédicos {
	
	private ArrayList<Medicos> medicos = new ArrayList<Medicos> ();
	
	public void adicionaMédico(Medicos m)
	{
		medicos.add(m);
	}
	public String pesquisaPeloCRM(String crm)
	{
		String retorno;
		String falha="Não encontrado\n";
		Iterator it = medicos.iterator();
		int i=0;
		while(it.hasNext())
		{
			it.next();
			if(medicos.get(i).CRM.equals(crm))
			{
				System.out.printf("%s",medicos.get(i).toString());
			}
			i++;
			
		}
		return falha;	
	}
	public Medicos pesquisaMédicoPorParteDoNome(String parte)
	{
		int i, j;
		for(i=0;i<medicos.size();i++)
		{
			String[] parts = medicos.get(i).nome.split(" ");
			for(j=0;j<parts.length;j++)
			{
				if(parts[j].equals(parte))
				{
					return medicos.get(i);
				}
			}
		}
		
		return null;
	}
	public ArrayList<Medicos> getMedicos() {
		return medicos;
	}
	public void setMedicos(ArrayList<Medicos> medicos) {
		this.medicos = medicos;
	}

}
