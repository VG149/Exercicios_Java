import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.awt.event.ActionListener ;
public class P extends JFrame{
	JLabel rotulo0, rotulo1,rotulo2, rotulo3, rotulo4, exibir, exibir2;
	JTextField texto1,texto2, texto3, texto4;
	JButton Ok, Cancelar;
	JCheckBox CB1,CB2,CB3,CB4,CB5,CB6,CB7;
	ImageIcon I1, I2, I3, I4, I5, I6, I7;
	public P(){
		Container tela = getContentPane();
		setLayout(null);
		
		CB1 = new JCheckBox("Acao");
		CB2 = new JCheckBox("Comedia");
		CB3 = new JCheckBox("Comedia Romantica");
		CB4 = new JCheckBox("Ficcao");
		CB5 = new JCheckBox("Romance");
		CB6 = new JCheckBox("Suspense");
		CB7 = new JCheckBox("Terror");
		
		Icon I1 = new ImageIcon("img/VF.jpg");
		Icon I2 = new ImageIcon("img/MP.jpg");
		Icon I3 = new ImageIcon("img/KS.jpg");
		Icon I4 = new ImageIcon("img/VFr.jpg");
		Icon I5 = new ImageIcon("img/NE.jpg");
		Icon I6 = new ImageIcon("img/JM.jpg");
		Icon I7 = new ImageIcon("img/T.jpg");
		
		exibir = new JLabel("");
	
		Ok = new JButton("Ok");
		Cancelar = new JButton("Cancelar");
     
		CB1.setBounds(50,60,100,20); 	
		CB2.setBounds(50,100,100,20);
		CB3.setBounds(50,140,100,20);
		CB4.setBounds(50,180,100,20);
		CB5.setBounds(50,220,100,20);   
		CB6.setBounds(50,260,100,20);  
		CB7.setBounds(50,300,100,20);  
		
		
		exibir.setBounds(150,50,250,280);	
		
		Ok.setBounds(100,340,100,20);
		Cancelar.setBounds(250,340,100,20);

Ok.addActionListener((ActionEvent e) -> {
    
	if (CB1.isSelected()) {
		JOptionPane.showMessageDialog (null, I1);
		}
	if (CB2.isSelected()) {
		JOptionPane.showMessageDialog (null, I2);
	}
	if (CB3.isSelected()) {
		JOptionPane.showMessageDialog (null, I3);
	}
	if (CB4.isSelected()) {
		JOptionPane.showMessageDialog (null, I4);
	}
	if (CB5.isSelected()) {
		JOptionPane.showMessageDialog (null, I5);
	}
	if (CB6.isSelected()) {
		JOptionPane.showMessageDialog (null, I6);
	}
	if (CB7.isSelected()) {
		JOptionPane.showMessageDialog (null, I7);
	}
                });

exibir.setVisible(false);	
        
		tela.add(CB1); 
		tela.add(CB2);
		tela.add(CB3);
		tela.add(CB4);
		tela.add(CB5);
		tela.add(CB6);
		tela.add(CB7); 
		
		tela.add(exibir);
		
		tela.add(Ok);
		tela.add(Cancelar);
		
		setSize(500, 500);
		setVisible(true);

	}
	public static void main(String args[]){
		P app = new P();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}