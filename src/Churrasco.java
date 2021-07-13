import javax.swing.JOptionPane;
import java.awt.*;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Churrasco {
	/**
	 * EndPoints Sugeridos Participar do Churrasco. Canc elar participação do
	 * Churrasco. Cancelar participação do convidado no Churrasco. Total Arrecadado.
	 * Listar Participantes. Listar Convidados. Total Gasto. Total Gasto em Comida.
	 * Total Gasto em Bebida.
	 */
	public String funcionario;
	public boolean funcionarioParticipa;
	public boolean funcionarioBebe;
	public String convidado;
	public boolean convidadoParticipa;
	public boolean convidadoBebe;
	// public boolean cancelarFuncionario;
	// public boolean cancelarConvidado;
	public double totalGasto;
	public double totalGastoComida;
	public double totalGastoBebida;
	public double valorFuncionario;
	public double valorConvidado;
	public String menu;

	/* Construtor */
	public Churrasco() {

		funcionario = JOptionPane.showInputDialog(null, "Olá, digite seu nome");
		convidado = "convidado do:" + " " + funcionario;
		valorFuncionario = 0;
		valorConvidado = 0;
		totalGastoBebida = 150;
		totalGastoComida = 500;
		totalGasto = totalGastoBebida + totalGastoComida; 
		

	}

	public int Menu() {
		menu = JOptionPane.showInputDialog("Olá" + " " + funcionario + "\n" + "Participar do churrasco \n"
				+ "Convidar um amigo\n" + "Cancelar Participação\n" + "Cancelar Participação do amigo\n");
		return 0;

	}

	/** Acesso */
	public String getFuncionario() {
		return funcionario;
	}

	public String getConvidado() {
		return convidado;
	}

	/* Modificador */
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
		valorFuncionario = 0;
	}

	public void setConvidado(String convidado) {
		this.convidado = convidado;
		valorConvidado = 0;
	}

	public ArrayList<String> Lista = new ArrayList();

	public void AdicionarParticipante() {

		if (funcionarioParticipa = true) {
			valorFuncionario += 20;
			Lista.add(funcionario);

		}
		if (funcionarioBebe = true) {
			valorFuncionario += 20;
		} else {
			valorFuncionario = valorFuncionario;
		}
	}

	public void RemoverParticipante() {
		if (funcionarioParticipa = false) {
			Lista.remove(funcionario);
			Lista.remove(convidado);
			getFuncionario();
			getConvidado();
		}
	}

	public void AdicionarConvidado() {
		if (convidadoParticipa = true) {
			valorFuncionario += 20;
			Lista.add(convidado);

		}
		if (convidadoBebe = true) {
			valorFuncionario += 20;
		} else{
			valorFuncionario += valorFuncionario - 20;
		}

	}

	public void RemoverConvidado() {
		if (convidadoParticipa = false)
			Lista.remove(convidado);
		getConvidado();
	}

	public void resultado() {
		System.out.println(Lista);
		System.out.println(valorFuncionario);
		System.out.println("Total Gasto"+ totalGasto);
	}

	public static void main(String[] args) {
		Churrasco chur = new Churrasco();
		/*
		 * chur.AdcionarParticipante(); chur.AdcionarConvidado();
		 * chur.RemoverParticipante(); chur.RemoverConvidado(); chur.resultado();
		 */
		boolean run;
		while (run = true) {

			int menu = chur.Menu();

			switch (menu) {

			case 1:
				chur.AdicionarParticipante();
				break;
			case 2:
				chur.AdicionarConvidado();
				break;
			case 3:
				chur.RemoverParticipante();
				break;
			case 4:
				chur.RemoverConvidado();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Obrigado por participar");
				run = false; 
			}
		}
	}
}
