import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.awt.event.ActionListener ;
public class P extends JFrame{
	JLabel rotulo0, rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3, exibirA;
	JButton Ok;
	JComboBox box = new JComboBox();
	JRadioButton JB1, JB2, JB3, JB4, JB5;
	ButtonGroup grupo1 = new ButtonGroup();
	
	public P(){
		super("Calculadora");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo0 = new JLabel ("Resultado");
		rotulo1 = new JLabel ("N1");
		rotulo2 = new JLabel ("N2");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		
		JB1 = new JRadioButton("Soma( + )", false);
		JB2 = new JRadioButton("Subtracao( - )", false);
		JB3 = new JRadioButton("Multiplicacao( * )", false);
		JB4 = new JRadioButton("Divisao( / )", false);
		JB5 = new JRadioButton("resto ( % )", false);
		
		exibirA = new JTextField("");
	
		Ok = new JButton("Calcular");
		
     
		rotulo1.setBounds(50,60,100,20); 	
		rotulo2.setBounds(50,100,100,20);
		
		texto2.setBounds(150,100,200,20); 	
		texto1.setBounds(150,60,200,20);    
		
		    
		JB1.setBounds(50,140,100,20);
		JB2.setBounds(50,180,100,20);
		JB3.setBounds(50,220,100,20);
		JB4.setBounds(50,260,100,20);
		JB5.setBounds(50,300,100,20);
		
		rotulo0.setBounds(160,300,100,20);	
		exibirA.setBounds(220,300,100,20);	
		
		Ok.setBounds(200,140,100,20);
	
Ok.addActionListener((ActionEvent e) -> {
    double a,b,c,x1,y1;
 
    a = 0;
    b = 0;
    c = 0;
    x1 = 0;
	
    a = Integer.parseInt(texto1.getText());
	b = Integer.parseInt(texto2.getText());
	
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
    exibirA.setVisible(true);
    exibirA.setText("" + x1);
                });
exibirA.setVisible(false);	
        tela.add(rotulo0);
		tela.add(rotulo1); 
		tela.add(rotulo2);
		
		
		tela.add(texto1); 
		tela.add(texto2); 
		
		tela.add(exibirA);
		
		tela.add(JB1);
		tela.add(JB2);
		tela.add(JB3);
		tela.add(JB4);
		tela.add(JB5);
		
		tela.add(box);
		
		tela.add(Ok);
		
		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		P app = new P();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}