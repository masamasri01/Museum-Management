import java.util.Date;

public class person {
	public person(String name, int id, Date dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}
	private String name;
	private int id;
    public  person() {
    	name =null;
    	id=0;
    	dob=null;
	}
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}
	private Date dob;
	@Override
	public String toString() {
		return "person [name=" + name + ", id=" + id + ", dob=" + dob + "]";
	}
    

}
