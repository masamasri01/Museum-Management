import java.util.Date;

public class employee extends person{
	int employeeid;
	Date hiredate;
	public employee(int employeeid, Date hiredate) {
		super();
		this.employeeid = employeeid;
		this.hiredate = hiredate;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public employee ( ) { }
	@Override
	public String toString() {
		return "employee [employeeid=" + employeeid + ", hiredate=" + hiredate + "]";
	};
	

}
