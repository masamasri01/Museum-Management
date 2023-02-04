import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;



public class VisitorInformation  implements ItemListener{
	private JLabel l1;
	private JLabel l2;
	private JLabel l3,l11,l22,l33;
private JCheckBox Regular;
private JCheckBox Senior;
private JTextField txt;
 JFrame f;
JPanel p ;
public VisitorInformation ()
{
//super ("Visitor Information");

//	setLayout(new GridLayout(7,1));
	p = new JPanel();
		l1=new JLabel ("Mueseum Name :Palestine");
       f.add(l1);

	l2=new JLabel ("Address :Ramallah");
   f.add(l2);

l3=new JLabel("Worrking Days: SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY ");
	f.add(l3);
	l11=new JLabel ("Total no. visitors");
	p.add(l11);
Regular = new JCheckBox("Regular Visitor");
	Senior = new JCheckBox ("SeniorVisitor");
	p.add(Regular);
	
Senior.addItemListener(this );
Regular.addItemListener( this );

	p.add(Senior);
	
	f.add(p);
	txt=new JTextField ("",40);

	f.add(txt);
	txt.setEditable(false);
	
}
museumsystem ms;

@Override
public void itemStateChanged(ItemEvent e) {

	if (Regular.isSelected())
		txt.setText(String.format("no of regular is %d", ms.getReg_count()));
	if (Senior.isSelected())
		txt.setText(String.format("no of senior is %d", ms.getsen_count()));
	else 
		 txt.setText(String.format("no of both is %d", ms.getReg_count()+ms.getsen_count()));
}
}

