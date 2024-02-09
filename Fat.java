import javax.swing.JOptionPane;

public class Semana {
	public static void main (String args[]){

	int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero")); //variaveis do programa
	int f = x; 

    while (x > 1){ // enquanto x for maior que 1 realiza o que esta abaixo

	  f = f *(x-1); //atualiza o valor de f fazendo f vezes x - 1
	  x--;
	  System.out.println(f);
                    }
        }
	}
