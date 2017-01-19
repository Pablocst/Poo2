package clinica;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeçãoConsultas {
	private ArrayList<Consulta> consultas = new ArrayList<Consulta> ();
	public void adicionarConsulta(Consulta c)
	{
		consultas.add(c);
	}
	public int qtdConsultasData(Data d)
	{
		int i;
		int cont=0;
		for(i=0;i<consultas.size();i++)
		{
			if(consultas.get(i).data.equals(d))
			{
				cont++;
			}
		}
		return cont;
	}
	public void listagemConsulta()
	{
		int i;
		for(i=0;i<consultas.size();i++)
		{
			System.out.println(consultas.get(i));
		}
	}
	public void qtdConsultasPorMedico()
	{
		int i;
		int cont=0;
		for(i=0;i<consultas.size();i++)
		{
			Scanner in = new Scanner (System.in);
			String nome;
			System.out.printf("DIGITE O NOME DO MÉDICO\n");
			nome=in.nextLine();
			if(consultas.get(i).getMedico().getNome().equals(nome))
			{
				cont++;
			}
			int qtde=cont;
			System.out.printf("NÚMERO DE PACIENTES PARA MÉDICO %s é: %d\n", nome, qtde);
		}
		
	}
	public void listaConsultaPorPacientes(String nom)
	{
		int i;
		for(i=0;i<consultas.size();i++)
		{
			if(consultas.get(i).getPaciente().getNome().equals(nom))
			{
				System.out.println(consultas.get(i));
				System.out.printf("\n");
			}
			
		}
	}
	public ColeçãoConsultas() {
		super();
	}
	

}
