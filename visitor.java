import java.util.ArrayList;
public abstract class visitor extends person {
guide g;
private int record_id;
@Override
public String toString() {
	return "visitor [record_id=" + record_id + ", visits_count=" + visits_count + ", records=" + records + "]";
}
private int visits_count=0;
public visitor () { super();}
public int getRecord_id() {
	return record_id;
}
public void setRecord_id(int record_id) {
	this.record_id = record_id;
}
public int getVisits_count() {
	return visits_count;
}
public void setVisits_count(int visits_count) {
	this.visits_count = visits_count;
} 
private ArrayList  <visitorRecord> records ;
public ArrayList<visitorRecord> getRecords() {
	return records;
}
public void setRecords(ArrayList<visitorRecord> records) {
	this.records = records;
}
public int getvid ()
{
	return this.getId();
	
}
public void setvid(int id)
{ this.setId(id);
}
public abstract void BookTour() ;

}
