import javax.swing. *;
import java.awt. *;
import java.awt.event. *;

public class Registro extends JFrame{
	JLabel rotulo1,rotulo2, rotulo3, rotulo4;
	JTextField texto1,texto2, texto3, texto4;
	JButton inserir, consulta, fechar;
	public Registro(){
		super("Cadastro de Cliente");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("Nome ");
		rotulo2 = new JLabel ("Endereço ");
		rotulo3 = new JLabel ("Cidade ");
		rotulo4 = new JLabel ("Estado ");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		texto3 = new JTextField(5);
		texto4 = new JTextField(5);
	
		fechar = new JButton("Sair");
		
		rotulo1.setBounds(50,20,100,20); 	
		rotulo2.setBounds(50,60,100,20);
		rotulo3.setBounds(50,100,100,20);
		
		
		texto1.setBounds(120,20,200,20);    
		texto2.setBounds(120,60,200,20);
		texto3.setBounds(120,100,200,20);
		
		
		fechar.setBounds(100,140,150,20);
	
fechar.addActionListener(
	new ActionListener(){
	public void actionPerformed(ActionEvent e){
		System.exit(0);
		}
	}
	);
		
		tela.add(rotulo1); 
		tela.add(rotulo2);
		tela.add(rotulo3);
		
		tela.add(texto1);  
		tela.add(texto2);
		tela.add(texto3);	
		
		tela.add(fechar);
		
		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		Registro app = new Registro();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}