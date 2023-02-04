import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;




public class receptionist extends employee {
	Scanner in=new Scanner (System.in);
	ArrayList <visitor> dv = new ArrayList <visitor>();
public receptionist(  ) {super();};
void registersubs (visitor v) {

	dv.add(v); //all visitor information are collected and scanned in main
};
void issueticket (ticket c) {
	ArrayList <ticket> t= new ArrayList <ticket> ();
	t.add(c);//all visitor information are collected and scanned in main
};
void deletesubs( visitor v,museumsystem m) {
	m.v.remove(v);
	System.out.print("visitor removed");
};

void editsubs(int y,visitor v,museumsystem m ) {
	System.out.println("enter visitor's new name");
	String ss = in.next();
	v.setName(ss);
	System.out.println("enter visitor's edidted date of birth ,Day Month Year sequantially in numbers ");
	Date d1 = new Date();
	d1.setDate(in.nextInt());
	d1.setMonth(in.nextInt() - 1);
	d1.setYear(in.nextInt() - 1900);//because it adds 1900 by default
	v.setDob(d1);
	System.out.println("enter visitor's new id");

	int var = in.nextInt();

	v.setId(var);


	System.out.print("new edited information >>>   " +v);

	
	
};
} 
