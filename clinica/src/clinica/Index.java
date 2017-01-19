package clinica;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Character;



public class Index {
	
	public static void main(String[] args) throws IOException // minha função main a qual declaro as coleções e chamo meu menu
	{
		ColeçãoPacientes col;
		ColeçãoMédicos colm;
		ColeçãoConsultas colc;
		col = new ColeçãoPacientes();
		colm = new ColeçãoMédicos();
		colc = new ColeçãoConsultas();
		menu(col, colm, colc);
		
		
	}
	public static void menu(ColeçãoPacientes col, ColeçãoMédicos colm, ColeçãoConsultas colc) //meu menu principal o qual chamo os outros menus
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("1-MENU PACIENTES\n");
		System.out.printf("2-MENU MÉDICOS\n");
		System.out.printf("3-MENU CONSULTAS\n");
		System.out.printf("0-SAIR\n");
		System.out.printf("ESCOLHA: ");
		String escolha=in.nextLine();
		while(!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3") && !escolha.equals("0"))// garantia que um número seja digitado
		{
			escolha=in.nextLine();
		}
		switch (escolha)
		{
			case "1":
				String escolha2=menup(); //menup retorna uma escolha referente ao segundo menu
							
				switch (escolha2)
				{
					case "1": 
						menup1(col); //a coleção pacientes é atualizada com o retorno do menu que adiciona os pacientes
						menu(col, colm, colc); //uso de recursividade para voltar pro menu original
					break;
					case "2":
						menup2(col);
						menu(col, colm, colc); //o número correponde a opção referente ao menu
					break;
					case "3":
						menup3(col);
						menu(col, colm, colc);
					break;
					case "4":
						menup4(col);
						menu(col, colm, colc);
					break;
					case "5":
						menup5(col);
						menu(col, colm, colc);
					break;
					case "6":
						menup6(col);
						menu(col, colm, colc);
					case "7":
						menup7(col);
						menu(col, colm, colc);
				}
			break;
			case "2":
				String escolha3=menuM();
				switch (escolha3)
				{
					case "1":
						menuM1(colm);
						menu(col, colm, colc);
					break;
					case "2":
						menuM2(colm);
						menu(col, colm, colc);
					break;
					case "3":
						menuM3(colm);
						menu(col, colm, colc);
				}
			break;
			case "3":
				String escolha4=menuC();
				switch (escolha4)
				{	
					case "1":
						menuC1(colc, col, colm);
						menu(col, colm, colc);
					break;
					case "2":
						menuC2(colc);
						menu(col, colm,colc);
					break;
					case "3":
						menuC3(colc);
						menu(col, colm, colc);
					break;
					case "4":
						menuC4(colc);
						menu(col, colm, colc);
					break;
					case "5":
						menuC5(colc);
						menu(col, colm, colc);
					
				}
		}
	}
	/*
	 * menup retorna uma escolha referente ao segundo menu
	 */
	public static String menup()
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("1-ADICIONAR PACIENTES\n");
		System.out.printf("2-PESQUISAR PACIENTE PELO DOCUMENTO\n");
		System.out.printf("3-REMOVER PELO DOCUMENTO\n");
		System.out.printf("4-QUANTIDADE DE PACIENTES POR SEXO\n");
		System.out.printf("5-LISTAR PACIENTES POR ENDEREÇO\n");
		System.out.printf("6-LISTAR PACIENTES MAIORES DE 60 ANOS\n");
		System.out.printf("7-LISTAR PACIENTES \n");
		System.out.printf("0-VOLTAR PARA O MENU PRINCIPAL \n");
		String escolha2=in.nextLine();
		while(!escolha2.equals("1") && !escolha2.equals("2") && !escolha2.equals("3") && !escolha2.equals("4")
			 && !escolha2.equals("5") && !escolha2.equals("6") && !escolha2.equals("7") && !escolha2.equals("0"))
		{
			escolha2=in.nextLine();
		}
	return escolha2;
		
	}
	public static void menup1(ColeçãoPacientes col) /* Adiciona paciente a coleçãopacientes
													*
													*/
	{
		col.adicionarPaciente();
	}
	public static void menup2(ColeçãoPacientes c) /*
												  * Faz a pesquisa pelo documento na coleção pacientes
												  */
	{
		Scanner in = new Scanner (System.in);
		String doc;
		System.out.printf("DIGITE O SEU RG OU CPF\n");
		System.out.printf("RG OU CPF: ");
		doc=in.nextLine();
		System.out.printf("Paciente: ");
		System.out.println(c.pesqquisaPeloDocumento(doc));
	}
	public static void menup3(ColeçãoPacientes c) /*
												  *	Remove na coleçãopacientes através 
												  */
	{
		Scanner in = new Scanner (System.in);
		String doc;
		System.out.printf("DIGITE O SEU RG OU CPF\n");
		System.out.printf("RG OU CPF: ");
		doc=in.nextLine();
		c.removePeloDocumento(doc);
	}
	public static void menup4(ColeçãoPacientes c)
	{
		
		c.qtdPacientesPorSexo();
	}
	public static void menup5(ColeçãoPacientes c)
	{
		c.listagemPecientesComEndereço();
	}
	public static void menup6(ColeçãoPacientes c)
	{
		c.listagemDePacientesMaioresDe60anos();
	}
	public static void menup7(ColeçãoPacientes c)
	{
		c.listagemDePacientes();
	}
	public static String menuM()
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("1-ADICIONAR MEDICO\n");
		System.out.printf("2-PESQUISAR PACIENTE PELO CRM\n");
		System.out.printf("3-PESQUISA MEDICO POR PARTE DO NOME\n");
		String escolha2=in.nextLine();
		while(!escolha2.equals("1") && !escolha2.equals("2") && !escolha2.equals("3") && !escolha2.equals("4")
			 && !escolha2.equals("5") && !escolha2.equals("6") && !escolha2.equals("7") && !escolha2.equals("0"))
		{
			escolha2=in.nextLine();
		}
	return escolha2;
		
	}
	public static void menuM1(ColeçãoMédicos c)
	{
		Scanner in = new Scanner (System.in);
		Medicos m;
		System.out.printf("DIGITE SEU NOME\n");
		String name=in.nextLine();
		System.out.printf("DIGITE SEU CRM\n");
		String crm=in.nextLine();
		System.out.printf("DIGITE SUA ESPECIALIDADE\n");
		String especialidade=in.nextLine();
		m = new Medicos(name, crm, especialidade);
		c.adicionaMédico(m);
	}
	public static void menuM2(ColeçãoMédicos c)
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("DIGITE SEU CRM\n");
		String crm=in.nextLine();
		c.pesquisaPeloCRM(crm);
	}
	public static void menuM3(ColeçãoMédicos c)
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("DIGITE UMA PARTE DO NOME\n");
		String pnome=in.nextLine();
		c.pesquisaMédicoPorParteDoNome(pnome);
	}
	public static String menuC()
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("1-ADICIONAR CONSULTA\n");
		System.out.printf("2-QUANTIDADE DE CONSULTAS POR DATA\n");
		System.out.printf("3-LISTAGEM DE CONSULTAS\n");
		System.out.printf("4-QUANTIDADE DE CONSULTAS POR MÉDICO\n");
		System.out.printf("5-LISTAGEM DE CONSULTAS POR PACIENTE\n");
		String escolha2=in.nextLine();
		while(!escolha2.equals("1") && !escolha2.equals("2") && !escolha2.equals("3") && !escolha2.equals("4")
			 && !escolha2.equals("5") && !escolha2.equals("6") && !escolha2.equals("7") && !escolha2.equals("0"))
		{
			escolha2=in.nextLine();
		}
	return escolha2;	
	}
	public static void menuC1(ColeçãoConsultas c, ColeçãoPacientes p, ColeçãoMédicos m)
	{
		
		int i, j, l;
		Pacientes pa;
		Medicos me;
		Scanner in = new Scanner (System.in);
		String name;
		System.out.printf("DIGITE O NOME DO PACITENTE\n");
		System.out.printf("PACITENTE: ");
		name=in.nextLine();
		pa=p.pesqquisaPeloNome(name);
		if(p.pesqquisaPeloNome(name)==null)
		{
			menup1(p);
		}
		else
		{
			pa=p.pesqquisaPeloNome(name);
		}
		String name1;
		System.out.printf("DIGITE O NOME DO MEDICO\n");
		System.out.printf("MEDICO: ");
		name1=in.nextLine();
		String test2;
		me=m.pesquisaMédicoPorParteDoNome(name1);
		if(m.pesquisaMédicoPorParteDoNome(name1)==null)
		{
			 menuM1(m);
		}
		else
		{
			me=m.pesquisaMédicoPorParteDoNome(name1);
		}
		int dia;
		System.out.printf("DIGITE O DIA\n");
		System.out.printf("DIA: ");
		dia=in.nextInt();
		int mes;
		System.out.printf("DIGITE O MES\n");
		System.out.printf("MES: ");
		mes=in.nextInt();
		int ano;
		System.out.printf("DIGITE O ANO\n");
		System.out.printf("ANO: ");
		ano=in.nextInt();
		Hora horario;
		int hora;
		int min;
		System.out.printf("DIGITE  HORA\n");
		System.out.printf("HORA: ");
		hora=in.nextInt();
		System.out.printf("DIGITE OS MINUTOS\n");
		min=in.nextInt();
		horario = new Hora(hora, min);
		Data data;
		data = new Data(dia,mes,ano);
		Consulta consulta;
		consulta = new Consulta(pa, me, data, horario);
		c.adicionarConsulta(consulta);
		
	}
	public static void menuC2(ColeçãoConsultas c)
	{
		Scanner in = new Scanner (System.in);
		Data d;
		System.out.printf("DIGITE O DIA\n");
		int dia= in.nextInt();
	    System.out.printf("DIGITE O MÊS\n");
	    int mes= in.nextInt();
	    System.out.printf("DIGITE O ANO\n");
	    int ano= in.nextInt();
	    d = new Data(dia, mes, ano);
		int qtd=c.qtdConsultasData(d);
		System.out.printf("NÚMERO DE CONSULTAS NO DIA: %d\n", qtd);
	}
	public static void menuC3(ColeçãoConsultas c)
	{
		c.listagemConsulta();
	}
	public static void menuC4(ColeçãoConsultas c)
	{
		c.qtdConsultasPorMedico();
	}
	public static void menuC5(ColeçãoConsultas c)
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("DIGITE O NOME DO PACIENTE\n");
		String nome=in.nextLine();
		c.listaConsultaPorPacientes(nome);
	}
}

