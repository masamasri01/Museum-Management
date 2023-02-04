import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

public class LabelFrame   extends JFrame {
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;

	public LabelFrame()
	{
		setLayout(new FlowLayout());
		l1=new JLabel ("Mueseum Name :Palestine");
	add(l1);

	l2=new JLabel ("Address :Ramallah");
	add(l2);

	l3=new JLabel("Worrking Days: SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY ");
	
	//l3.setVerticalTextPosition(SwingConstants.SOUTH);
	add(l3);
	}

	
		
	}

