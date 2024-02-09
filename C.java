import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.awt.event.ActionListener ;
public class P extends JFrame{
	JLabel rotulo0, rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3;
	JButton Ok;
	JComboBox box = new JComboBox();
	
	public P(){
		super("Converter");
		Container tela = getContentPane();
		setLayout(null);
		
        rotulo0 = new JLabel ("Converter");
		rotulo1 = new JLabel ("Valor em reais: ");
		rotulo2 = new JLabel ("Converter para: ");
		
		
		box.addItem("--Escolha um Item--");
		box.addItem("Dolar");
		box.addItem("Euro");
		box.addItem("Yen");
		
		
		texto1 = new JTextField(5);
		
		exibir = new JLabel("");
	
		Ok = new JButton("Ok");
		
        rotulo0.setBounds(200,20,100,20); 
        rotulo0.setForeground(Color.GREEN);
        rotulo0.setFont(new Font("Serif", Font.PLAIN, 20));
		rotulo1.setBounds(50,60,100,20); 	
		rotulo2.setBounds(50,100,100,20);
		
		
		box.setBounds(150,100,140,20);
		
		texto1.setBounds(150,60,140,20);    
		
		
		exibir.setBounds(120,180,70,20);	
		
		Ok.setBounds(200,220,50,20);
	
Ok.addActionListener((ActionEvent e) -> {
    double a,b,c,x1,y1;
    // a = juros b = anos c = deposito mensal x1 = total y1 = num de pagamentos
    a = 0;
    b = 0;
    c = 0;
    x1 = 0;
	
    a = Integer.parseInt(texto1.getText());
	
	String Cv = (String)box.getSelectedItem();
	
	if (Cv == "Dolar") {
	a = a / 5.5; 
	};
	if (Cv == "Euro") {
	a = a / 6.4; 
	};
	if (Cv == "Yen") {
		a = a * 20.2;
	};

    exibir.setVisible(true);
    exibir.setText("Valor: " + a);
                });
exibir.setVisible(false);	
                tela.add(rotulo0);
		tela.add(rotulo1); 
		tela.add(rotulo2);
		
		
		tela.add(texto1);  
		
		tela.add(exibir);

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