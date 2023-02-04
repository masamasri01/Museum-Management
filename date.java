
public class date {
	int month;
	
	int day;
	int year;
	int hour,min,sec;
	private  static final int [ ] dayspermonth= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public date(int month , int day, int year)
	{
		if (month<=0|| month >12) this.month=1;
		else this.month=month;
		if (day<=0 || day>dayspermonth[month] && !(month==2 && day==29)) this.day=1;
		else this.day=day;
		this.year=year;
		
	}
	@Override
	public String toString() {
		return String.format("%d/%d/%d", month,day,year);
	}
}//end
