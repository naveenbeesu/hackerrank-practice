package com.java.practice;

interface Policy{
	void details();
}
class HealthInsurance implements Policy {
	@Override
	public void details() {
		System.out.println("HealthInsurance");
	}
}
class TermInsurance implements Policy {

	@Override
	public void details() {
		System.out.println("TermInsurance");
	}
}

//Factory Design Pattern
class PolicyFactory{
	Policy getPolicyInstance(String policyType) {
		if(policyType == null) {
			return null;
		} if (policyType == "HealthInsurance") {
			return new HealthInsurance();
		} if(policyType == "TermInsurance") {
			return new TermInsurance();
		}
		return null;
	}
}
	public class FactoryDesignPattern {

	public static void main(String[] args) {
		PolicyFactory pf = new PolicyFactory();
		Policy p = pf.getPolicyInstance("HealthInsurance");
		p.details();

	}

}
