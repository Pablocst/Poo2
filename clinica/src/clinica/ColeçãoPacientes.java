package clinica;
import java.util.*;

public class ColeçãoPacientes {
	private ArrayList<Pacientes> pacientes = new ArrayList<Pacientes> ();
	public void adicionarPaciente()
	{
	Pacientes p;
	Scanner in = new Scanner (System.in);
	System.out.printf("DIGITE SEU CPF OU RG\n");
	System.out.printf("SEU CPF OU RG: ");
	String doc=in.nextLine();
	System.out.printf("DIGITE SEU NOME\n");
	System.out.printf("NOME: ");
	String name=in.nextLine();
	System.out.printf("DIGITE SEU SEXO\n");
	System.out.printf("SEXO: ");
	String sex=in.nextLine();
	while(!(sex.equals("M") || sex.equals("F")) )
	{
		System.out.printf("DIGITE O SEXO COM M OU F MAIUSCULO\n");
		System.out.printf("SEXO: ");
		sex=in.nextLine();
		
	}
	Endereco end;
	System.out.printf("DIGITE SEU CEP\n");
	System.out.printf("CEP: ");
	String CEP=in.nextLine();
	System.out.printf("DIGITE SUA RUA\n");
	System.out.printf("RUA: ");
	String rua=in.nextLine();
	System.out.printf("DIGITE SEU BAIRRO\n");
	System.out.printf("BAIRRO: ");
	String bairro=in.nextLine();
	System.out.printf("DIGITE SEU COMPLEMENTO\n");
	System.out.printf("COMPLEMENTO: ");
	String complemento=in.nextLine();
	end = new Endereco(CEP, rua, bairro, complemento);
	Data data;
	System.out.printf("DIGITE A DATA DO SEU NASCIMENTO\n");
	System.out.printf("DIA: ");
	int dia;
	while(!in.hasNextInt())
	{
		System.out.printf("DIGITE O DIA COM UM NUMERO INTEIRO\n");
		System.out.printf("DIA: ");
		dia= in.nextInt();
	}
	dia= in.nextInt();
	System.out.printf("\n");
	System.out.printf("MES: ");
	int mes;
	while(!in.hasNextInt())
	{
		System.out.printf("DIGITE O MES COM UM NUMERO INTEIRO\n");
		System.out.printf("MES: ");
		mes= in.nextInt();
	}
	mes= in.nextInt();
	System.out.printf("\n");
	System.out.printf("ANO: ");
	int ano;
	while(!in.hasNextInt())
	{
		System.out.printf("DIGITE O ANO COM UM NUMERO INTEIRO\n");
		System.out.printf("ANO: ");
		ano= in.nextInt();
	}
	ano= in.nextInt();
	data = new Data(dia,mes,ano);
	p = new Pacientes(doc, name, sex, end, data);
	pacientes.add(p);
	}
	public ArrayList<Pacientes> getPacientes() {
		return pacientes;
	}
	public void setPacientes(ArrayList<Pacientes> pacientes) {
		this.pacientes = pacientes;
	}
	public String pesqquisaPeloDocumento (String documento)
	{
		String retorno;
		String falha="Não encontrado\n";
		Iterator it = pacientes.iterator();
		int i=0;
		while(it.hasNext())
		{
			it.next();
			if(pacientes.get(i).documento.equals(documento))
			{
				retorno=pacientes.get(i).nome;
				return retorno;
			}
			i++;
			
		}
		return falha;	
	}
	public void removePeloDocumento (String documento)
	{
		Iterator it = pacientes.iterator();
		int i=0;
		Pacientes p;
		p = pacientes.get(i);
		for(i=0;i<pacientes.size();i++)
		{
			p = pacientes.get(i);
			if(p.documento.equals(documento))
			{
				pacientes.remove(i);
			}
			
		}
		
	}
	public void qtdPacientesPorSexo()
	{
		Iterator it = pacientes.iterator();
		int i=0;
		int h=0;
		int m=0;
		for(i=0;i<pacientes.size();i++)
		{
			it.next();
			if(pacientes.get(i).getSexo().equals("M"))
			{
				h++;
			}
			if(pacientes.get(i).getSexo().equals("F"))
			{
				m++;
			}
			i++;
		}	
		System.out.printf("A quantidade de pacientes homens é : %d\n", h);
		System.out.printf("A quantidade de pacientes mulheres é: %d\n", m);
	}
	public void listagemPecientesComEndereço()
	{
		int i;
		for(i=0;i<pacientes.size();i++)
		{
			if(!pacientes.get(i).endereço.equals(null))
			{
			System.out.println(pacientes.get(i));
			}
		}
		
	}
	public ColeçãoPacientes() {
		super();
	}
	public void listagemDePacientesMaioresDe60anos()
	{
		int i;
		for(i=0;i<pacientes.size();i++)
		{
			
		}
	}
	public Pacientes pesqquisaPeloNome (String name)
	{
		Iterator it = pacientes.iterator();
		int i=0;
		while(it.hasNext())
		{
			it.next();
			if(pacientes.get(i).nome.equals(name))
			{
				return pacientes.get(i);
			}
			i++;
			
		}
		return null;	
	}
	public void listagemDePacientes()
	{
		int i;
		for(i=0;i<pacientes.size();i++)
		{
			System.out.printf("%s",pacientes.get(i).toString());
		}
	}
}

