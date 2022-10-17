import java.util.*;
class SimpleInterest implements Interest {
	public double getInterest(double p, double r, double n) {
		double interest = ( p * r * n ) / 100;
		return interest;
	}
}
	