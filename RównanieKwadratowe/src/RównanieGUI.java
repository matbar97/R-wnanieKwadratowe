import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class R�wnanieGUI extends JFrame implements ActionListener
{
	private JLabel lA, lB, lC;
	private JTextField tA, tB, tC, tWynik;
	private JButton bRozwi��, bWyj�cie;
	
	public R�wnanieGUI()
	{
		setSize(600,400);
		setTitle("Rozwi�zywanie r�wnania kwadratowego");
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
		
		bRozwi�� = new JButton("Rozwi��");
		bRozwi��.setBounds(200, 10, 100, 50);
		bRozwi��.addActionListener(this);
		this.add(bRozwi��);
		
		bWyj�cie = new JButton("Zako�cz");
		bWyj�cie.setBounds(200, 60, 100, 50);
		bWyj�cie.addActionListener(this);
		this.add(bWyj�cie);
				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		if (source == bWyj�cie)
		{
			dispose();
		}
		else if (source == bRozwi��)
		{
			double a,b,c;
			a = Double.parseDouble(tA.getText());
			b = Double.parseDouble(tB.getText());
			c = Double.parseDouble(tC.getText());
			R�wnanieKwadratowe r�wnanie = new R�wnanieKwadratowe(a,b,c);
			String rozwi�zanie = r�wnanie.rozwi��();
			tWynik.setText(rozwi�zanie);
		}
	}
	
	public static void main(String[] args)
	{
		R�wnanieGUI r = new R�wnanieGUI();
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setVisible(true);
	}
	
}
