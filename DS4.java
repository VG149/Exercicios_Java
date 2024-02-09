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
	JTextArea texto;
	JPanel painel;
	JScrollPane rolagem;
	int estilofonte, tamfonte;
	
    //cria classes
	public ExemploDeMenu4(){
		super("Exemplo de Menus executando ações");
		
		//cria tela 
		Container tela = getContentPane();
		
		//layout fica nulo
		tela.setLayout(null);
		//muda o estilo da fonte para plano
		estilofonte = Font.PLAIN;
		tamfonte = 12;
		barra = new JMenuBar ();
		opcoes = new JMenu
		
		//cria novos itens no menu
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
	
	//cria um botão para mudar estilo
	TratadorE tratestilo = new TratadorE();
		estilo = new JMenu("Estilo");
		grupoE = new ButtonGroup();
		nomeE = new JCheckBoxMenuItem[4];
				for(int i = 0; i < 4; i++){ //aumenta o valor de I enquanto ser menor que 4
				nomeE[i] = new JCheckBoxMenuItem(est[i]);
				estilo.add(nomeE[i]);
				grupoE.add(nomeE[i]);
				nomeE[i].addItemListener(tratestilo); }
			}
			
		//tratador de tamanho
		TratadorT trattamanho = new TratadorT();
			tamanho = new JMenu("Tamanho");
			grupoT = new ButtonGroup();
			tamanhoF = new JRadioButtonMenuItem[4];			
			for(int i = 0; i < 4; i++){
				tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
				tamanho.add(tamanhoF[i]);
				grupoT.add(tamanhoF[i]);
				tamanhoF[i].addItemListener(trattamanho);
			}
			
			//Coloca eventos nas opções
			sair = new JMenuItem("Sair");
			opcoes.setMnemonic(KeyEvent.VK_O);
			limpar.setMnemonic(KeyEvent.VK_L);
			fonte.setMnemonic(KeyEvent.VK_F);
			sair.setMnemonic(KeyEvent.VK_S);
			cor.setMnemonic(KeyEvent.VK_C);
			estilo.setMnemonic(KeyEvent.VK_E);
			tamanho.setMnemonic(KeyEvent.VK_T);
			
				//adiciona as opções
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
				
				//Sistema de rolagem
				texto = new JTextArea(10,20);
				rolagem = new JScrollPane(texto);
				rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				painel = new JPanel();
				painel.add(rolagem);
				painel.setBounds(30,30,250,250);
				tela.add(painel);
				
				//
				limpar.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent(){
					texto.setText("");
				texto.requestFocus();}});
				
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
	

zzxs