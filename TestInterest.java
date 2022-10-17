import java.util.*;
class TestInterest {
	public static void main(String[] args){
		Interest i;
		SimpleInterest s = new SimpleInterest();
		CompoundInterest c = new CompoundInterest();
		System.out.println("Simple Interest is " + s.getInterest(20000, 5.0, 5.0));
		System.out.println("Compound Interest is " + c.getInterest(20000, 5.0, 5.0));
	}
}