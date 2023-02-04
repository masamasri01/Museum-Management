
public class ticket {
	java.util.Date issueDate;
visitor v  ;

public java.util.Date getIssueDate() {
	return issueDate;
}
public void setIssueDate(java.util.Date issueDate) {
	this.issueDate = issueDate;
}
int  price=50;


@Override
public String toString() {
	return "ticket [issueDate=" + issueDate + ", v=" + v + ", price=" + price + "]";
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public ticket() {};

public visitor getVisitor() {
	return v;
}
//public void setVisitor(visitor vi) {
//	setVisitor(vi);
//}


}
