
public class multitimeticket extends ticket {
	public multitimeticket () {
		if ( multitimeticket.type ==tickettype.daily ) price =200;
		else if ( multitimeticket.type ==tickettype.monthly ) price =250;
		else if ( multitimeticket.type ==tickettype.yearly ) price =350;
	}
	
	static tickettype type ;
	int timeofusage =0;
	static final int  maxtimeofusage=5;

}
