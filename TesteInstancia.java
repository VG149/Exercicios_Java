package testeinstancia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteInstancia {
	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		byte n = 0;
		double nota, soma = 0;
		double media;
		System.out.print("Nota do aluno, -1 termina: ") ;
		nota = entrada.nextInt ();
		while (nota != -1) {
			soma = soma + nota;
			n = (byte) (n + 1);
			System.out.print("Nota do aluno, -1 termina: ");
			nota = entrada.nectInt();
		}
		DecimalFormat df = new DecimalFormat("0.00");
		if (n != 0) { 
			media = soma / n;
			System.out.println("Media igual a " + df.format(media));
		}
		else
		  System.out.println("Nenhuma nota foi digitada");
		  }
		 }