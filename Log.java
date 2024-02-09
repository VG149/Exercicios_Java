import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.awt.event.ActionListener ;
public class P extends JFrame{
	JLabel rotulo0, rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3, texto4;
	JButton Ok;
	JComboBox box = new JComboBox();
	JRadioButton JB1, JB2, JB3, JB4, JB5;
	ButtonGroup grupo1 = new ButtonGroup();
	
	public P(){
		
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("CEP: ");
		rotulo2 = new JLabel ("Telefone: ");
		rotulo3 = new JLabel ("CPF: ");
		rotulo4 = new JLabel ("Data: ");
		
		texto1 = new JTextField("____-__",5);
		texto2 = new JTextField("(__)___-___",5);
		texto3 = new JTextField("______-___",5);
		texto4 = new JTextField("__/__/____",5);
		
		exibir = new JLabel("");
	
		Ok = new JButton("Calcular");
		
     
		rotulo1.setBounds(50,60,100,20); 	
		rotulo2.setBounds(50,100,100,20);
		rotulo3.setBounds(50,140,100,20);
		rotulo4.setBounds(50,180,100,20);
		
		texto2.setBounds(150,100,200,20); 	
		texto1.setBounds(150,60,200,20);    
		texto3.setBounds(150,140,200,20);    
		texto4.setBounds(150,180,200,20);    
		
		exibir.setBounds(200,300,100,20);	
		
		Ok.setBounds(200,140,100,20);
	
Ok.addActionListener((ActionEvent e) -> {
    double a,b,c,x1,y1;
 
    a = 0;
    b = 0;
    c = 0;
    x1 = 0;
	
    a = Integer.parseInt(texto1.getText());
	b = Integer.parseInt(texto1.getText());
	
	if (JB1.isSelected()) {
	x1 = a + b;
	}
	if (JB2.isSelected()) {
	x1 = a - b;
	}
	if (JB3.isSelected()) {
	x1 = a * b;
	}
	if (JB4.isSelected()) {
	x1 = a / b;
	}
	if (JB5.isSelected()) {
	x1 = a % b;
	}
    exibir.setVisible(true);
    exibir.setText("Valor: " + x1);
                });
exibir.setVisible(false);	
        
		tela.add(rotulo1); 
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		
		tela.add(texto1); 
		tela.add(texto2); 
		tela.add(texto3); 
		tela.add(texto4); 
		
		tela.add(exibir);
		
		tela.add(Ok);
		
		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		P app = new P();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}