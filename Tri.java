import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.lang.Math;

public class Tri extends JFrame{
	JLabel rotulo1,rotulo2, rotulo3, exibir, exibir2;
	JTextField texto1,texto2, texto3;
	JButton calcular;
	public Tri(){
		super("Tipo triangulo");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("lado 1: ");
		rotulo2 = new JLabel ("lado 2: ");
		rotulo3 = new JLabel ("lado 3: ");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		texto3 = new JTextField(5);
		
		exibir = new JLabel("");
	
		calcular = new JButton("Verificar");
		
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
		a = Integer.parseInt(texto1.getText());
		b = Integer.parseInt(texto2.getText());
		c = Integer.parseInt(texto3.getText());
			 
			if ( c == a && a == b) {
			
			 
			 exibir.setVisible(true);
			 exibir.setText("Tringaulo equilatero");
			 }
			if ( b == a || b == c || b != c || b != a ) {
		
			
			 exibir.setVisible(true);
			 exibir.setText("triangulo Isoceles");
			 }
			if ( a != b && a != c) {
			
			 exibir.setVisible(true);
			 exibir.setText("Triangulo escaleno");
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
		Tri app = new Tri();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}