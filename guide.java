import java.util.*;

public class guide extends employee {
 static final int maxworkingdays=5;
static final int maxtoursperday=3;


ArrayList <visitor > myvisitors;

ArrayList <Day > workingdays;
public void setMylanguage(ArrayList<languages> mylanguage) {
	this.mylanguage = mylanguage;
}


public void setToursperday(int toursperday) {
	this.toursperday = toursperday;
}


int toursperday=0;
public guide(String name ,int employeeid, Date hiredate) {
	super(employeeid, hiredate);
	 mylanguage=new ArrayList <languages>();
	 toursperday=0;
	
}

public int getToursperday() {
	return toursperday;
}

public ArrayList<languages> getMylanguage() {
	return mylanguage;
}


ArrayList <languages> mylanguage ;



public guide() {
	super();
}

public ArrayList <Day > getWorkingdays() {
	return workingdays;
}

public void setWorkingdays(ArrayList<Day> workingdays) {
	if (workingdays.size()> maxworkingdays);
	else this.workingdays = workingdays;
}




@Override
public String toString() {
	return "guide [toursperday=" + toursperday + ", mylanguage=" + getMylanguage() + ", Days of work="+ getWorkingdays() +"name :" +getName() +"]";
}


}
