import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.lang.Math;

public class MUV extends JFrame{
	JLabel rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3, texto4;
	JButton calcular;
	public MUV(){
		super("MUV");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("a: ");
		rotulo2 = new JLabel ("Vo: ");
		rotulo3 = new JLabel ("V: ");
		rotulo4 = new JLabel ("T: ");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		texto3 = new JTextField(5);
		texto4 = new JTextField(5);
		
		exibir = new JLabel("");
	
		calcular = new JButton("Calcular");
		
		rotulo1.setBounds(50,20,100,20); 	
		rotulo2.setBounds(50,60,100,20);
		rotulo3.setBounds(50,100,100,20);
		rotulo4.setBounds(50,140,100,20);
		
		
		texto1.setBounds(120,20,200,20);    
		texto2.setBounds(120,60,200,20);
		texto3.setBounds(120,100,200,20);
		texto4.setBounds(120,140,200,20);
		
		exibir.setBounds(120,220,200,20);	
		
		calcular.setBounds(150,180,150,20);
	
calcular.addActionListener(
		new ActionListener(){
		 public void actionPerformed(ActionEvent e){
		 double a,Vi,V,Vo, S, t;
		 a = 0;
		 Vo = 0;
		 Vi = 0;
		 V = 0;
		 S = 0;
		 t = 0;
			if ( Vi <= 0) {
			 a = Integer.parseInt(texto1.getText());
			 V = Integer.parseInt(texto3.getText());
			 t = Integer.parseInt(texto4.getText());
			
			 Vi = V - a*t;
			 
			 exibir.setVisible(true);
			 exibir.setText("Velocidade incial: " + Vi);
			 }
			if ( a <= 0) {
			 V = Integer.parseInt(texto3.getText());
			 t = Integer.parseInt(texto4.getText());
			 
			 a = V/t;
			
			 exibir.setVisible(true);
			 exibir.setText("a: " + a);
			 }
			if ( V <= 0) {
			 Vo = Integer.parseInt(texto2.getText());
			 a = Integer.parseInt(texto1.getText());
			 t = Integer.parseInt(texto4.getText());
			
			 V = Vo + a * t;
			
			 exibir.setVisible(true);
			 exibir.setText("V: " + V);
							}
		   }
		  }
		 );
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
		
		tela.add(calcular);
		
		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		MUV app = new MUV();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}