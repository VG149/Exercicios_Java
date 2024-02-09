import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.awt.event.ActionListener ;
public class P extends JFrame{
	JLabel rotulo0, rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3;
	JButton Ok;
	public P(){
		super("Poupança");
		Container tela = getContentPane();
		setLayout(null);
		
        rotulo0 = new JLabel ("Poupanca");
		rotulo1 = new JLabel ("Juros ao mês %: ");
		rotulo2 = new JLabel ("números Anos: ");
		rotulo3 = new JLabel ("Déposito mensal R$: ");
		rotulo4 = new JLabel ("Total poupado R$: ");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		texto3 = new JTextField(5);
		
		exibir = new JLabel("");
	
		Ok = new JButton("Ok");
		
        rotulo0.setBounds(200,20,100,20); 
        rotulo0.setForeground(Color.GREEN);
        rotulo0.setFont(new Font("Serif", Font.PLAIN, 20));
		rotulo1.setBounds(50,60,100,20); 	
		rotulo2.setBounds(50,100,100,20);
		rotulo3.setBounds(50,140,100,20);
		rotulo4.setBounds(50,180,100,20);
		
		texto1.setBounds(150,60,200,20);    
		texto2.setBounds(150,100,200,20);
		texto3.setBounds(150,140,200,20);
		
		exibir.setBounds(120,180,130,20);	
		
		Ok.setBounds(200,220,50,20);
	
Ok.addActionListener((ActionEvent e) -> {
    double a,b,c,x1,y1;
    // a = juros b = anos c = deposito mensal x1 = total y1 = num de pagamentos
    a = 0;
    b = 0;
    c = 0;
    x1 = 0;
    a = Integer.parseInt(texto1.getText());
    b = Integer.parseInt(texto2.getText());
    c = Integer.parseInt(texto3.getText());
    y1 = b*12;
    for (int i = 0; i < y1; i++) {
        x1 = x1 + c;
        x1 = x1 + x1 * a;
    }
    exibir.setVisible(true);
    exibir.setText("Total poupado R$" + x1);
                });
exibir.setVisible(false);	
                tela.add(rotulo0);
		tela.add(rotulo1); 
		tela.add(rotulo2);
		tela.add(rotulo3);
		
		tela.add(texto1);  
		tela.add(texto2);
		tela.add(texto3);
		
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