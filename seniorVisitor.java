
public class seniorVisitor extends visitor{
private double discountRate= 0.20;

public double getDiscountRate() {
	return discountRate;
}

public void setDiscountRate (double discountRate) {
	this.discountRate = discountRate;
}
public void BookTour() {
}

@Override
public String toString() {
	return "seniorVisitor [   getDiscountRate()="
			+ getDiscountRate() + ", getRecord_id()=" + getRecord_id() + ", getVisits_count()=" + getVisits_count()
			+ ", getRecords()=" + getRecords() + ", getId()=" + getId()  + ", getName()="
			+ getName() + ", getDob()=" + getDob() +
			 "]";
}

public seniorVisitor() {
	super();
};
}
