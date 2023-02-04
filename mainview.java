	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

	public class mainview extends JFrame implements ActionListener{
		int rs;
		String n;
		int namei;
	int	 ifreg=0;
		int ifsen=0;
		JLabel vlu;
		ArrayList <Day> guidesworkeveryday =new ArrayList <Day>();
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	int dc=0; int mc=0; int yc=0;
	private JPanel jp,jp1,jp2,jp3,jp4,vp1,vp2,vp3,vp4,vp5,vpall;
	JLabel vl1,vl2,vl3;
	private JCheckBox visitorregular;
	private JCheckBox visitorsenior;
	JTextField vt,vt2,vt3;
	JTextArea vt4,mt9;
	JButton vb1, mb1,mb2,mb3;
	JLabel ml1,ml2,ml3,ml4,ml5,ml6,ml7,ml8,ml9,ml10,ml11,language,available;
	JTextField mt1,mt2,mt3,mt4,mt5,mt6,mt7,mt8;
	JRadioButton Daily,Monthly,Yearly,regular,senior,d,m,y;
	JCheckBox mc1,mc2,mc3,mc4,mc5,mc6,mc7,mcu;
	 JComboBox j1,j2;
	JPanel mp1,mp2,mp3,mp4,mp15,mp6,mp7,mp8,mp9,mp11,mp12,mp610,mp13,mp14,mp1115,mpall,mnew,mnew2,mnew3,mnew4,mnew5,mnew6;
	museumsystem ms = new museumsystem();
	regularVisitor r ;
	seniorVisitor s;
    ButtonGroup G1,G2,G3,G4;
    guide Masa, Roya, Noor;
    ArrayList <Day> workingdayss =new ArrayList <Day>();
    ArrayList <languages> guidesspeakall = new ArrayList <languages>();
   guide g;
   java.util.Date dd;
	public mainview()
	{ 
		super ("Museum Management System");
		setLayout (new BorderLayout());
		b1 = new JButton ("Guide information");

	b2 = new JButton ("Visitor informaion");

	b3 = new JButton ("Management");
    l1=new JLabel ("Mueseum Name :Palestine");
	l2=new JLabel ("Address :Ramallah");
	l3=new JLabel("Worrking Days: SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY ");
	
	jp1=new JPanel();
	jp1.setLayout(new GridLayout(1,3));
	jp1.add(b1);
	jp1.add(b2);
	jp1.add(b3);
	
	jp2=new JPanel();
	jp2.add(l1);
	jp3=new JPanel();
	jp3.add(l2);
	jp4=new JPanel();
	jp4.add(l3);
	 jp= new JPanel(new GridLayout(4,1));
	 jp.add(jp1);
	add (jp,BorderLayout.NORTH);
	jp.add(jp2);
	jp.add(jp3);
	jp.add(jp4);
	
	ButtonHandler1 handler1 = new ButtonHandler1();
	b2.addActionListener(handler1);
	b1.addActionListener(handler1);
	b3.addActionListener(handler1);


	vl1= new JLabel ("   Total number of visitors");
	visitorregular = new JCheckBox("Regular Visitor");
	visitorsenior = new JCheckBox ("Senior Visitor");
	vt=new JTextField();
	vt.setEditable(false);
	vp1=new JPanel (new GridLayout(1,3));
	vp1.add(visitorregular);
	vp1.add(visitorsenior);
	vp1.add(vt);

	r = new regularVisitor();
	 s =new seniorVisitor();

	//
	vl2=new JLabel ("Visitors Name");
	vt2 =new JTextField ();
     vb1= new JButton ("Search by NAME");
     vp2= new JPanel (new GridLayout(1,3));
     
     vp2.add(vt2);
     vp2.add(vb1);
     //add (vp2);
     
     //
     vp3=new JPanel(new GridLayout(1,3));
     vp4=new JPanel (new GridLayout(1,3));
     Daily=new JRadioButton ("Daily");
     Monthly=new JRadioButton ("Monthly");
     Yearly=new JRadioButton ("Yearly");
     vlu=new JLabel("Subscription number");
     vp3.add(vlu);
     vp3.add(Daily);
     vp3.add(Monthly);
     vp3.add(Yearly);
     
     vt3=new JTextField ("Total supscription");
     vp4.add(vt3);
     vp4.add(vp3);
     vt4=new JTextArea();
     vt3.setEditable(false);
     vp4.add(vt3);
    // add(vp4);
     JPanel vt44 = new JPanel (new GridLayout(1,1));
     vt44.add(vt4);
     //
     
     vp5=new JPanel();
     
     vt4.setEditable(false);
    // add (vt4);
     
  vpall = new JPanel (new GridLayout(4,1));
  JPanel vpa = new JPanel (new GridLayout(3,1));
	vpa.add(vl1);
    vpa.add(vp1);
    vpa.add(vl2);
     vpa.add(vp2);
     vpa.add(vlu);
     vpa.add(vp4);
     vpall.add(vpa);
     vpall.add(vt44);
     
    //add(vpall,BorderLayout.CENTER);
  // vpall.setVisible(false);
  // Box box=Box.createHorizontalBox();
 //new JScrollPane (vt4);
 vt4.setVisible(true);
     ////////////////////////////////////////////////////////////
Masa =new guide ();
 Masa.setName("Masa");
 ms.g.add(Masa);
 Roya =new guide ();
 Roya.setName("Ro'ya");
 ms.g.add(Roya);
 Noor =new guide ();
 Noor.setName("Noor");
 ms.g.add(Noor);
 guidesworkeveryday.add(Day.Saturday);
 guidesworkeveryday.add(Day.Sunday);
 guidesworkeveryday.add(Day.Wednesday);
 guidesworkeveryday.add(Day.Monday);
 guidesworkeveryday.add(Day.Tuesday);
 guidesworkeveryday.add(Day.THURSDAY);
 Masa.setWorkingdays(guidesworkeveryday);
 Roya.setWorkingdays(guidesworkeveryday);
 Noor.setWorkingdays(guidesworkeveryday);
 guidesspeakall.add(languages.Arabic);
 guidesspeakall.add(languages.English);
		 guidesspeakall.add(languages.French);
				 guidesspeakall.add(languages.Italian);
						 guidesspeakall.add(languages.Turkish);
	Masa.setMylanguage(guidesspeakall);
	Roya.setMylanguage(guidesspeakall);
	Noor.setMylanguage(guidesspeakall);

   mnew =new JPanel(new GridLayout(1,2));
   mnew2 =new JPanel();
   mnew3 =new JPanel(new GridLayout(1,2));
   
   mnew4 =new JPanel(new GridLayout(1,2));
   mnew5 =new JPanel(new GridLayout(1,2));
   mnew6 =new JPanel(new GridLayout(1,4));

     ml1=new JLabel ("Visitor's name");
     ml2=new JLabel ("Visitor's ID");
     ml3=new JLabel ("Visitors DOB (D space M space Y)");
     ml4=new JLabel ("Guide's Name");
     ml5=new JLabel ("Guide's ID");
     ml6=new JLabel ("Guides DateOfBirth(D space M space Y)");
     ml7=new JLabel ("Working Days");
     ml8=new JLabel ("Visitor Number");
     ml9=new JLabel ("Expected Visit Day");
     ml10=new JLabel ("Ticket Type/Subscription");
     ml11=new JLabel ("Book a tour?");
     language=new JLabel ("Language");
     available=new JLabel ("Available guides:");
    mt1=new JTextField ();
    mt2=new JTextField ();
    mt3=new JTextField ();
    mt4=new JTextField ();
    mt5=new JTextField ();
    mt6=new JTextField ();
    mt7=new JTextField ();
    mt8=new JTextField ();
    mt9=new JTextArea ();
    mb1=new JButton("Add Visitor");
    mb2=new JButton("Add Guide");
    mb3=new JButton("Issue Ticket");
    regular =new JRadioButton("Regular Visitor");
    senior =new JRadioButton("Senior Visitor");
    mc1 =new JCheckBox ("Sun");
    mc2 =new JCheckBox ("Mon");
    mc3 =new JCheckBox ("Tue");
    mc4 =new JCheckBox ("Wed");
    mc5 =new JCheckBox ("Thu");
    mc6 =new JCheckBox ("Fri");
    mc7 =new JCheckBox ("Sat");
    mcu =new JCheckBox ("Yes");
    d=new JRadioButton("Daily");
    m=new JRadioButton("Monthly");
    y =new JRadioButton("Yearly");
    j1= new JComboBox (languages.values());
    j2= new JComboBox ();
    String []al = new String [30];
    int i = 0 ;
    for (guide rr :ms.g)
    {
    	//al[i] = rr.getName();
    	j2.addItem(rr.getName());
    	//i++;
    }

 
 
    mp1=new JPanel(new GridLayout(1,2));
    mp1.add(ml1);
    mp1.add(mt1);
    mp2=new JPanel(new GridLayout(1,2));
    mp2.add(ml2);
    mp2.add(mt2);
    mp3=new JPanel(new GridLayout(1,2));
    mp3.add(ml3);
    mp3.add(mt3);
    mp4=new JPanel(new GridLayout(1,2));
    mp4.add(regular);
    mp4.add(senior);
    mp15=new JPanel(new GridLayout(5,1));
    mp15.add(mp1);
    mp15.add(mp2);
    mp15.add(mp3);
    mp15.add(mp4);
    mp15.add(mb1);
    
    mp6=new JPanel(new GridLayout(1,2));
    mp6.add(ml4);
    mp6.add(mt4);
  
    mp7=new JPanel(new GridLayout(1,2));
    mp7.add(ml5);
    mp7.add(mt5);
    mp8=new JPanel(new GridLayout(1,2));
    mp8.add(ml6);
    mp8.add(mt6);
    mp9=new JPanel(new GridLayout(1,8));
    mnew.add(ml7);
    mp9.add(mc1);
    mp9.add(mc2);
    mp9.add(mc3);
    mp9.add(mc4);
    mp9.add(mc5);
    mp9.add(mc6);
    mp9.add(mc7);
    mnew.add(mp9);
    
    mp610=new JPanel(new GridLayout(5,1));
    mp610.add(mp6);
    mp610.add(mp7);
    mp610.add(mp8);
    mp610.add(mnew);
    mp610.add(mb2);
  
    mp11=new JPanel(new GridLayout(1,2));
    mp11.add(ml8);
    mp11.add(mt7);
    mp12=new JPanel(new GridLayout(1,2));
    mp12.add(ml9);
    mp12.add(mt8);
    mp13=new JPanel(new GridLayout(1,4));
    mnew3.add(ml10);
    mp13.add(d);
    mp13.add(m);
    mp13.add(y);
    mnew3.add(mp13);
    mp14=new JPanel(new GridLayout(1,4));
   //mp14.add(ml11);
   mnew4.add(language);
   mnew4.add(j1);
   mnew5.add(available);
   mnew5.add(j2);
   mp14.add(mcu);
   mp14.add(mnew4);
   mp14.add(mnew5);
mnew6.add(ml11);
mnew6.add(mp14);
    mp1115=new JPanel(new GridLayout(5,1));
    mp1115.add(mp11);
    mp1115.add(mp12);
    mp1115.add(mnew3);
    mp1115.add(mnew6);
    mp1115.add(mb3);

    mpall=new JPanel(new GridLayout(4,1));
    mpall.add(mp15);
    mpall.add(mp610);
    mpall.add(mp1115);
    mpall.add(mt9);
//add(mpall,BorderLayout.CENTER);
   	mpall.setVisible(false);
	G1= new ButtonGroup();
	  G1.add(regular);
    G1.add(senior);
    G2= new ButtonGroup();
	  G2.add(visitorregular);
  G2.add(visitorsenior);
  G3= new ButtonGroup();
  G3.add(Daily);
G3.add(Monthly);
G3.add(Yearly);
G4= new ButtonGroup();
G4.add(d);
G4.add(m);
G4.add(y);
mt9.setEditable(false);

	//
	ButtonHandler2 handler2 = new ButtonHandler2();
	mb2.addActionListener(handler2);
	mb1.addActionListener(handler2);
	mb3.addActionListener(handler2);
	vb1.addActionListener(this);

	visitorregular.addActionListener( this );
	visitorsenior.addActionListener(this );
	regular.addActionListener(this);
	senior.addActionListener(this);
	mc1.addActionListener(this);
	mc2.addActionListener(this);
	mc3.addActionListener(this);
	mc4.addActionListener(this);
	mc5.addActionListener(this);
	mc6.addActionListener(this);
	mc7.addActionListener(this);
	d.addActionListener(this);
	m.addActionListener(this);
	y.addActionListener(this);
    Daily.addActionListener(this);
    Monthly.addActionListener(this);
    Yearly.addActionListener(this);
    mcu.addActionListener(this);

	r=new regularVisitor();
	s=new seniorVisitor();
	g= new guide();
	 dd= new java.util.Date();
     
vpall.setVisible(false);
mpall.setVisible(false);
///
j2.addItemListener(
new ItemListener ()
{
	public void itemStateChanged (ItemEvent e)
	{		
			if (j2.getSelectedIndex ()==1)  namei=1;//ro=("Roya");
			if (j2.getSelectedIndex ()==2) namei=2;///=("Noor");
			if (j2.getSelectedIndex ()==0) namei=3;//=("Masa");

		
	}
});
	}
	
	private class ButtonHandler1 implements ActionListener 
	{@Override
		public void actionPerformed(ActionEvent e) {
		
		  if  (e.getSource()== b1) {
				

				}
			if (e.getSource()== b2) {
				
				mpall.setVisible(false);
				add(vpall,BorderLayout.CENTER);
				vpall.setVisible(true);
				

				

				}
			if (e.getSource()==b3)
			{
				add(mpall,BorderLayout.CENTER);
vpall.setVisible(false);
				mpall.setVisible(true); 			
				

			}
		}
	}
	java.util.Date dob,gdob;
	 int x=0; int x2=0;
	 ticket ticket=new ticket();
	 int flag =1;
	 boolean frequent=false;
	private class ButtonHandler2 implements ActionListener 
	{
	@Override
		public void actionPerformed(ActionEvent e) {

		if (e.getSource()==mb1) 
		{	 mt9.setText("visitor is added");
		r=new regularVisitor ();
		if (ifreg==1) {
		r.setName(mt1.getText());
		int ggg=Integer.parseInt(mt2.getText());
		r.setId(ggg);
		mt3.getText().trim();
		String []tokens= mt3.getText().split(" ");

		dob=new java.util.Date();
		dob.setDate(Integer.parseInt(tokens [0])); 
		dob.setMonth(Integer.parseInt(tokens [1])); 
		dob.setYear(Integer.parseInt(tokens [2])); 
		r.setDob(dob);
		//if (flag==1) { 
		ms.RV.add(r);
		//flag=2;}
	//	if (flag==2) {
//			for (regularVisitor v: ms.RV)
//			{
//				if (r.getId() == v.getId());
//				frequent=true;	
//				break;
//			}
		//if (frequent==false) ms.RV.add(r);
		}
	
			 else if (ifsen==1) {
			 s.setName(mt1.getText());
			 s.setId(Integer.parseInt(mt2.getText()));
			 String []tokens= mt3.getText().split(" ");
			 dob=new java.util.Date();
			dob.setDate(Integer.parseInt(tokens [0])); 
			dob.setMonth(Integer.parseInt(tokens [1])); 
			dob.setYear(Integer.parseInt(tokens [2])); 
		    s.setDob(dob);
		    ms.SV.add(s);
		    s=new seniorVisitor();
		    
			 }
		}
		if (e.getSource()==mb2) 
		{
		  g.setName(mt4.getText());
			g.setId(Integer.parseInt(mt5.getText()));
			 String []tokens= mt6.getText().split(" ");
			 gdob=new java.util.Date();
			gdob.setDate(Integer.parseInt(tokens [0])); 
			gdob.setMonth(Integer.parseInt(tokens [1])); 
			gdob.setYear(Integer.parseInt(tokens [2])); 
			g.setDob(gdob);
			ms.g.add(g);
			 mt9.setText("Guide is added");
			
			 g.setWorkingdays(workingdayss);
			  String []al = new String [30];
			  int i=0;
			 for (guide rr :ms.g)
			    {
			    	al[i] = rr.getName();
			    	i++;
			    }
			 
			 workingdayss=new ArrayList<Day>();

			 g= new guide();
			 gdob=new java.util.Date();
			
		}
		if(e.getSource()==mb3)
		{
			 for (regularVisitor e1: ms.RV)
			 {
				 if (Integer.parseInt(mt7.getText())==e1.getId())
				 {
					 if (with==false)
					 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
								+ "%s \n With a Tour ?  %s %s \n Price : %d $",e1.getName(),mt8.getText(),"No","" ,ticket.getPrice()
 								)); 
					 else  if (with==true) {
					if (namei==1)
				 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
							+ "%s \n With a Tour ?  %s ,Guide's name:%s \n Price : %d $",e1.getName(),mt8.getText(),"Yes","Ro'ya" ,ticket.getPrice()+10));
					else if (namei==2)
						 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
									+ "%s \n With a Tour ?  %s ,Guide's name:%s \n Price : %d $",e1.getName(),mt8.getText(),"Yes","Noor" ,ticket.getPrice()+10));
					else if (namei==3)
						 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
									+ "%s \n With a Tour ?  %s ,Guide's name:%s \n Price : %d $",e1.getName(),mt8.getText(),"Yes","Masa" ,ticket.getPrice()+10));
			 } 
			 }}
			 for (seniorVisitor e2 :ms.SV )
			 {

				 if (Integer.parseInt(mt7.getText())==e2.getId()) {
					 if (with==false)
					 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
								+ "%s \n With a Tour ?  %s %s \n Price : %f $",e2.getName(),mt8.getText(),"No","" ,ticket.getPrice()-(ticket.getPrice()* e2.getDiscountRate())
 								)); 
				 if (with==true) {
					if (namei==1)
				 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
							+ "%s \n With a Tour ?  %s ,Guide's name: %s \n Price : %f $",e2.getName(),mt8.getText(),"Yes","Ro'ya" ,((ticket.getPrice()-(ticket.getPrice()* e2.getDiscountRate()))+10.0)));
					else	if (namei==2)
						 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
									+ "%s \n With a Tour ?  %s ,Guide's name: %s \n Price : %f $",e2.getName(),mt8.getText(),"Yes","Noor" ,((ticket.getPrice()-(ticket.getPrice()* e2.getDiscountRate()))+10.0)));
					else if (namei==2)
						 mt9.setText(String.format("Ticket Information : \n Visitors Name : %s \n Visitor's Day : "
									+ "%s \n With a Tour ?  %s ,Guide's name: %s \n Price : %f $",e2.getName(),mt8.getText(),"Yes","Masa" ,((ticket.getPrice()-(ticket.getPrice()* e2.getDiscountRate()))+10.0)));
				 
				 }
				 }
			 }
			 if (o1==1) dc++;
			 if (o2==1) mc++;
			 if (o3==1) yc++;
			 with=false;
			         o1=0;
					 o2=0;
					 o3=0;
		}
	}
	}

	int o1=0,o2=0,o3=0;
	boolean with=false;
	@Override
	      public void actionPerformed(ActionEvent e) {
		if (visitorregular.isSelected()) 
			vt.setText(String.format("%d", ms.RV.size()));
		else if (visitorsenior.isSelected()) 
			vt.setText(String.format("%d", ms.SV.size()));

		if (e.getSource()==vb1)
		{
			for (regularVisitor k: ms.RV)
			if (vt2.getText().equals (new String(k.getName())))
			{
				 vt4.setText(String.format("Information on visitor %s \n Name : %s \n ID : %d \n "
				 		+ "Age %d \n Visit History :NONE ",k.getName() ,k.getName(),k.getId(),(dd.getYear()-k.getDob().getYear())));
			vt4.setVisible(true);
			}
			for (seniorVisitor k: ms.SV)
				if (k.getName()==vt2.getText())
				{
					 vt4.setText(String.format("Information on visitor %s \n Name : %s \n ID : %d \n "
					 		+ "Age %d \n Visit History :none",k.getName(), k.getName(),k.getId(),dd.getYear()-k.getDob().getYear()));
				}
		    }
if (e.getSource()==d) 
	{o1=1; o2=0; o3=0;}

if (e.getSource()==m) 
{o1=0; o2=1; o3=0;}

if (e.getSource()==y) 
{o1=0; o2=0; o3=1;}

{ 
	ifreg=1;
	ifsen=0;

}
if (senior.isSelected())
{    ifsen=1;
     ifreg=0;
	}
if (mc1.isSelected())
{
	workingdayss.add(Day.Sunday);
}
if (mc2.isSelected())
{
	workingdayss.add(Day.Monday);
}if (mc3.isSelected())
{
	workingdayss.add(Day.Tuesday);
}
if (mc4.isSelected())
{
	workingdayss.add(Day.Wednesday);
}
if (mc5.isSelected())
{
	workingdayss.add(Day.THURSDAY);
}if (mc6.isSelected())
{
	mt9.setText("The museum is closed on Friday so we won't add friday into your working days"); 
}
if (mc7.isSelected())
{
	workingdayss.add(Day.Saturday);
}

if (mcu.isSelected())
	with=true;
if (Daily.isSelected()) vt3.setText(String.format("%d", dc));
else if (Monthly.isSelected()) vt3.setText(String.format("%d", mc));
else if (Yearly.isSelected()) vt3.setText(String.format("%d", yc));


	}
	

	}
	
	