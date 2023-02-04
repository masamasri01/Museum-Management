import java.util.Date;

public class visitorRecord {
	Date enteringDate;
	Date enteringTime;
	@Override
	public String toString() {
		return "visitorRecord [enteringDate=" + enteringDate + ", enteringTime=" + enteringTime + "]";
	}
	public Date getEnteringDate() {
		return enteringDate;
	}
	public void setEnteringDate(int day , int month , int year) {
		Date enteringdate =new Date ();
		enteringdate.setDate(day);
		enteringdate.setMonth(month);
		enteringdate.setDate(year);
		this.enteringDate = enteringdate;
	}
	public void setEnteringTime(int min, int hour) {
		Date enteringtime = new Date ();
		enteringtime.setHours(hour);
		enteringtime.setMinutes(min);
		this.enteringTime = enteringtime;
		
	}
	public Date getEnteringTime() {
		return enteringTime;
	}
	
	public visitorRecord() {};

}
