import javax.swing. *;
import java.awt. *;
public class ExemploJTextField extends JFrame{
	JLabel rotulo0,rotulo1,rotulo2,rotulo3,rotulo4, rotulo5, rotulo6, rotulo7, rotulo8, rotulo9, rotulo10, rotulo11;
	JTextField texto0,texto1,texto2,texto3,texto4,texto6, texto7,texto8, texto9, texto10;
	JRadioButton Radio1, Radio2;
	JComboBox Box1;
	JButton Bot1, Bot2, Bot3, Bot4, Bot5;
	
	public ExemploJTextField(){
		super("Cadastro de cliente");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo0 = new JLabel ("Codigo do cliente");
		rotulo1 = new JLabel ("Nome Completo");
		rotulo2 = new JLabel ("Endereco");
		rotulo3 = new JLabel ("Bairro");
		rotulo4 = new JLabel ("Cidade");
		rotulo5 = new JLabel ("Estado");
		rotulo6 = new JLabel ("C.E.P");
		rotulo7 = new JLabel ("Sexo");
		rotulo8 = new JLabel ("Celular");
		rotulo9 = new JLabel ("Telefone");
		rotulo10 = new JLabel ("Data do aniversario");
		rotulo11 = new JLabel ("Data de cadastro");
		
		String[] estadoStings = { "Acre", "Alagoas", "Bahia", "Sao Paulo", "Rio de Janeiro", "Mato Grosso" };
		Box1 = new JComboBox(estadoStings);
		
		Radio1 = new JRadioButton ("Feminino");
		Radio2 = new JRadioButton ("Masculino");
		
		texto0 = new JTextField(60);
		texto1 = new JTextField(60);
		texto2 = new JTextField(60);
		texto3 = new JTextField(60);
		texto4 = new JTextField(60);
		
		texto6 = new JTextField(60);
		texto7 = new JTextField(60);
		texto8 = new JTextField(60);
		texto9 = new JTextField(60);
		texto10 = new JTextField(60);		
		
		Bot1 = new JButton("Incluir");
		Bot2 = new JButton("Limpar");
		Bot3 = new JButton("Sair");
		Bot4 = new JButton("Consultar");
		Bot5 = new JButton("Consultar Todos");
		
		rotulo0.setBounds(50,20,120,20);
		rotulo1.setBounds(50,60,120,20);
		rotulo2.setBounds(50,100,80,20);
		rotulo3.setBounds(50,140,80,20);
		rotulo4.setBounds(50,180,80,20);
		rotulo5.setBounds(50,220,80,20);
		rotulo6.setBounds(50,260,80,20);
		rotulo7.setBounds(50,300,80,20);
		rotulo8.setBounds(50,340,80,20);
		rotulo9.setBounds(50,380,80,20);
		rotulo10.setBounds(50,420,130,20);
		rotulo11.setBounds(50,460,130,20);
		
		texto0.setBounds(210,20,200,20);
		texto1.setBounds(210,60,200,20);
		texto2.setBounds(210,100,200,20);
		texto3.setBounds(210,140,200,20);
		texto4.setBounds(210,180,200,20);
		Box1.setBounds(210,220,200,20);
		texto6.setBounds(210,260,200,20);
		
		
		Radio1.setBounds(210,300,100,20);
		Radio2.setBounds(310,300,100,20);
		
		texto7.setBounds(210,340,200,20);
		texto8.setBounds(210,380,200,20);
		texto9.setBounds(210,420,200,20);
		texto10.setBounds(210,460,200,20);
		
		Bot1.setBounds(50,500,100,20);
		Bot2.setBounds(160,500,100,20);
		Bot3.setBounds(270,500,100,20);
		Bot4.setBounds(50,530,100,20);
		Bot5.setBounds(160,530,100,20);
		
		tela.add(rotulo0);
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(rotulo6);
		tela.add(rotulo7);
		tela.add(rotulo8);
		tela.add(rotulo9);
		tela.add(rotulo10);
		tela.add(rotulo11);
		
		tela.add(texto0);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(texto3);
		tela.add(texto4);
		
		tela.add(texto6);
		tela.add(texto7);
		tela.add(texto8);
		tela.add(texto9);
		tela.add(texto10);
		
		
		
		tela.add(Radio1);
		tela.add(Radio2);
		
		tela.add(Box1);
		
		tela.add(Bot1);
		tela.add(Bot2);
		tela.add(Bot3);
		tela.add(Bot4);
		tela.add(Bot5);
		
		setSize(500, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		texto1.requestFocus();
		
	}
	public static void main(String args[]){
		ExemploJTextField app = new ExemploJTextField();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}