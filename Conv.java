import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.lang.Math;

public class TP extends JFrame{
	JLabel rotulo1,rotulo2, rotulo3, exibir, exibir2;
	JTextField texto1,texto2, texto3;
	JButton calcular;
	public TP(){
		super("Teorema de Pitagoras");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("Celsius: ");
		rotulo2 = new JLabel ("Fahrenheit: ");
		rotulo3 = new JLabel ("Kelvin: ");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		texto3 = new JTextField(5);
		
		exibir = new JLabel("");
	
		calcular = new JButton("Calcular");
		
		rotulo1.setBounds(50,20,100,20); 	
		rotulo2.setBounds(50,60,100,20);
		rotulo3.setBounds(50,100,100,20);
		
		
		texto1.setBounds(120,20,200,20);    
		texto2.setBounds(120,60,200,20);
		texto3.setBounds(120,100,200,20);
		
		exibir.setBounds(120,180,200,20);	
		
		calcular.setBounds(150,140,150,20);
	
calcular.addActionListener(
		new ActionListener(){
		 public void actionPerformed(ActionEvent e){
		 double a,b,c;
		 a = 0;
		 b = 0;
		 c = 0;
			if ( c <= 0) {
			 a = Integer.parseInt(texto1.getText());
			 b = Integer.parseInt(texto2.getText());
			
			 c = a + 273.15 ;
			 
			 exibir.setVisible(true);
			 exibir.setText("Kelvin: " + c);
			 }
			if ( b <= 0) {
			 a = Integer.parseInt(texto1.getText());
			 c = Integer.parseInt(texto3.getText());
			
			 b = (a * 9/5) + 32 ;
			
			 exibir.setVisible(true);
			 exibir.setText("Fahrenheit: " + b);
			 }
			if ( a <= 0) {
			
			 exibir.setVisible(true);
			 exibir.setText("Insira Celsius");
							}
		   }
		  }
		 );
exibir.setVisible(false);		 
		tela.add(rotulo1); 
		tela.add(rotulo2);
		tela.add(rotulo3);
		
		tela.add(texto1);  
		tela.add(texto2);
		tela.add(texto3);
		
		tela.add(exibir);	
		
		tela.add(calcular);
		
		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		TP app = new TP();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}