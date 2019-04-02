import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RównanieGUI extends JFrame implements ActionListener
{
	private JLabel lA, lB, lC;
	private JTextField tA, tB, tC, tWynik;
	private JButton bRozwi¹¿, bWyjœcie;
	
	public RównanieGUI()
	{
		setSize(600,400);
		setTitle("Rozwi¹zywanie równania kwadratowego");
		setLocationRelativeTo(null);
		setLayout(null);
		
		lA = new JLabel("a = ");
		lA.setBounds(10, 10, 100, 20);
		this.add(lA);
		
		lB = new JLabel("b = ");
		lB.setBounds(10, 50, 100, 20);
		this.add(lB);
		
		lC = new JLabel("c = ");
		lC.setBounds(10, 90, 100, 20);
		this.add(lC);
		
		tA = new JTextField();
		tA.setBounds(40, 10, 100, 20);
		this.add(tA);
		
		tB = new JTextField();
		tB.setBounds(40, 50, 100, 20);
		this.add(tB);
		
		tC = new JTextField();
		tC.setBounds(40, 90, 100, 20);
		this.add(tC);
		
		tWynik = new JTextField();
		tWynik.setBounds(40, 130, 500, 20);
		this.add(tWynik);
		
		bRozwi¹¿ = new JButton("Rozwi¹¿");
		bRozwi¹¿.setBounds(200, 10, 100, 50);
		bRozwi¹¿.addActionListener(this);
		this.add(bRozwi¹¿);
		
		bWyjœcie = new JButton("Zakoñcz");
		bWyjœcie.setBounds(200, 60, 100, 50);
		bWyjœcie.addActionListener(this);
		this.add(bWyjœcie);
				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		if (source == bWyjœcie)
		{
			dispose();
		}
		else if (source == bRozwi¹¿)
		{
			double a,b,c;
			a = Double.parseDouble(tA.getText());
			b = Double.parseDouble(tB.getText());
			c = Double.parseDouble(tC.getText());
			RównanieKwadratowe równanie = new RównanieKwadratowe(a,b,c);
			String rozwi¹zanie = równanie.rozwi¹¿();
			tWynik.setText(rozwi¹zanie);
		}
	}
	
	public static void main(String[] args)
	{
		RównanieGUI r = new RównanieGUI();
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setVisible(true);
	}
	
}
