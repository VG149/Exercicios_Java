package exemplodemenu4;
//pega um conjunto de classes relacionadas

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//importa arquivos de um local especifico no pc

public class ExemploDeMenu4 extends JFrame{
	JMenuBar barra;
	JMenu opcoes,fonte,cor,estilo,tamanho;
	JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
	JCheckBoxMenuItem nomeE[]; //cria uma checkbox com item
	ButtonGroup grupoT,grupoE;
	JRadioButtonMenuItem tamanhoF []; //Cria um definição de tamanho para o botão
	String tam[] = {"12","14","16","18"};
	String est [] = {"Normal", "Negrito", "Itálico", "Negrito e Italíco"};
	
	public ExemploDeMenu4(){
		super("Exemplo de Menus com JRadioButtonMenuItem");
		Container tela = getContentPane();
		tela.setLayout(null);
		barra = new JMenuBar ();
		setJMenuBar (barra);
		//define nome e cria um container com barra
		
		opcoes = new JMenu("Opcoes");
		barra.add(opcoes);
		limpar = new JMenuItem("Limpar");
		fonte = new JMenu("Fonte");
		cor = new JMenu("Cor");
		azul = new JMenuItem("Azul");
		verde = new JMenuItem("Verde");
		vermelho = new JMenuItem("Vermelho");
		amarelo = new JMenuItem("Amarelo");
		preto = new JMenuItem("Preto");
		estilo = new JMenu("Estilo");
		grupoE = new ButtonGroup();
		nomeE = new JCheckBoxMenuItem[4];
		//cria items no Menu e define seus nomes
		
			for(int i = 0; i < 4; i++){
				nomeE[i] = new JCheckBoxMenuItem(est[i]);
				estilo.add(nomeE[i]);
				grupoE.add(nomeE[i]);
			}
			tamanho = new JMenu("Tamanho");
			grupoT = new ButtonGroup();
			tamanhoF = new JRadioButtonMenuItem[4];
			//adiciona Checkbox no menu e adiciona tamanho
			
			for(int i = 0; i < 4; i++){
				tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
				tamanho.add(tamanhoF[i]);
				grupoT.add(tamanhoF[i]);
			}
			sair = new JMenuItem("Sair");
			//Adiciona opção de sair
			
			opcoes.setMnemonic(KeyEvent.VK_O);
			limpar.setMnemonic(KeyEvent.VK_L);
			fonte.setMnemonic(KeyEvent.VK_F);
			sair.setMnemonic(KeyEvent.VK_S);
			cor.setMnemonic(KeyEvent.VK_C);
			estilo.setMnemonic(KeyEvent.VK_E);
			tamanho.setMnemonic(KeyEvent.VK_T);
			//Coloca eventos e ações nos botões 
			
				opcoes.add(limpar);
				opcoes.add(fonte);
				opcoes.addSeparator();
				opcoes.add(sair);
				cor.add(azul);
				cor.add(verde);
				cor.add(vermelho);
				cor.add(amarelo);
				cor.add(preto);
				
				fonte.add(cor);
				fonte.add(estilo);
				fonte.add(tamanho);
				// faz com qm as opções apareçam
				
				setSize(500,300);
				setLocationRelativeTo(null);
				setVisible(true);
	}
	//define o tamanho e localização
	
public static void main (String args[]){
	ExemploDeMenu4 app = new ExemploDeMenu4();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
	//faz com que o programa feche 
	

