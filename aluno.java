import javax.swing. *;
import java.awt. *;
import static java.awt.SystemColor.window;
import java.awt.event. *;
import java.awt.event.ActionListener ;
public class P extends JFrame{
	JLabel rotulo0, rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3;
	JButton Ok;
	JComboBox box = new JComboBox();
	ImageIcon I1, I2, I3;
	
	public P(){
		super("Aluno");
		Container tela = getContentPane();
		setLayout(null);
	
        rotulo4 = new JLabel ("emprestimo");        
        rotulo0 = new JLabel ("Aluno: ");
		rotulo1 = new JLabel ("Nome: ");
		rotulo2 = new JLabel ("Classe: ");
		
		
		box.addItem("- Escolha o Item -");
		box.addItem("Item1");
		box.addItem("Item2");
		box.addItem("Item3");
		
		Icon I1 = new ImageIcon("img/Livro1.jpg");
		Icon I2 = new ImageIcon("img/Livro2.jpg");
		Icon I3 = new ImageIcon("img/Livro3.jpg");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
                
		exibir = new JLabel("");
	
		Ok = new JButton("Emprestar");
	
        rotulo4.setBounds(200,20,100,20); 
        rotulo4.setForeground(Color.RED);
        rotulo4.setFont(new Font("Serif", Font.PLAIN, 20));        
        rotulo0.setBounds(50,60,100,20); 
        rotulo0.setForeground(Color.BLACK);
        rotulo0.setFont(new Font("Serif", Font.PLAIN, 20));
		rotulo1.setBounds(50,100,100,20); 	
		rotulo2.setBounds(50,140,100,20);
		
		
		box.setBounds(400,60,100,20);
		
		texto1.setBounds(100,100,200,20);    
		texto2.setBounds(100,140,200,20);
		
		exibir.setBounds(110,60,140,20);	
		
		Ok.setBounds(200,220,100,20);
	
Ok.addActionListener((ActionEvent e) -> {
    String a,b,c,x1,y1;
    
	
    a = texto1.getText();
    b = texto2.getText();
	String Cv = (String)box.getSelectedItem();
	
	if (Cv == "Item1") {		
    JOptionPane.showMessageDialog(null, "Nome: " + a + "\n Classe: " + b);
	JOptionPane.showMessageDialog(null, I1);
	}
	if (Cv == "Item2") {		
    JOptionPane.showMessageDialog(null, "Nome: " + a + "\n Classe: " + b);
	JOptionPane.showMessageDialog(null, I2);
	}
	if (Cv == "Item3") {
	JOptionPane.showMessageDialog(null, "Nome: " + a + "\n Classe: " + b);
    JOptionPane.showMessageDialog(null, I3);
	}

    exibir.setVisible(true);
    exibir.setText(a);
                });
exibir.setVisible(false);	
        tela.add(rotulo0);
		tela.add(rotulo1); 
		tela.add(rotulo2);
		tela.add(rotulo4);
		
		tela.add(texto1);  
		tela.add(texto2);
                
		tela.add(exibir);

		tela.add(box);
		
		tela.add(Ok);
		
		setSize(600, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		P app = new P();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}