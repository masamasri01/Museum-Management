
import java.util.ArrayList;
import java.util.Calendar;

public class museumsystem {
	museumsystem() {
	};

	ArrayList<visitor> v = new ArrayList<visitor>();
	ArrayList<regularVisitor> RV = new ArrayList<regularVisitor>();
	ArrayList<seniorVisitor> SV = new ArrayList<seniorVisitor>();

	public ArrayList<visitor> getVisitors() {
		return v;
	}

	public void setVisitors(ArrayList<visitor> v) {
		this.v = v;
	}
	// ArrayList <museumworkingdays> workdays=new ArrayList <museumworkingdays>();

	public static final ArrayList<museumworkingdays> musemworkday = new ArrayList<museumworkingdays>();

	ArrayList<guide> g = new ArrayList<guide>();

	void printoppeningdays() {
		for (museumworkingdays a : museumworkingdays.values()) {
			System.out.print(a + "\t");
			System.out.print("\n");
			musemworkday.add(a);
		}
	}
int reg_count;

	public int getReg_count() {
	return reg_count;
}

public void setReg_count(int reg_count) {
	this.reg_count = reg_count;
}
int sen_count;

public int getsen_count() {
return sen_count;
}

public void setsen_count(int sen_count) {
this.sen_count = sen_count;
}

	void addoppeningdays() {
		for (museumworkingdays a : museumworkingdays.values()) {
			musemworkday.add(a);
		}
	}

	public ArrayList<guide> getGuides() {
		return g;
	}

	public void setGuides(ArrayList<guide> g) {
		this.g = g;
	}

//.....

	public ArrayList<guide> getavailableguides(java.util.Date d)

	{

		ArrayList<guide> available = new ArrayList<guide>();
		// ,,,,,,
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		Day s = f1(dayOfWeek);
		// ,,,,,,
		for (int i = 0; i < g.size(); i++) {

			for (guide variable : g) {
				for (Day day : variable.getWorkingdays()) {
					if (day == s)
						available.add(variable);
				}
			}

		}
		return available;

	}

	void addvisitor(visitor vi) {
		this.v.add(vi);
	}

	void addguide(guide gu) {
		this.g.add(gu);
	}

	ArrayList<employee> employees = new ArrayList<employee>();

	public ArrayList<employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<employee> employees) {
		this.employees = employees;

	}

	Day f1(int x) {
		switch (x) {
		case 1: {
			return Day.Wednesday;
		}
		case 2: {
			return Day.THURSDAY;
		}
		case 3:
			return Day.Friday;
		case 4:
			return Day.Saturday;
		case 5:
			return Day.Sunday;
		case 6:
			return Day.Monday;
		case 7:
			return Day.Tuesday;
		default:
			return null;
		}

	}
}
