package packages;

public class InsuredPackage extends Package {
	double cost;
	
	public InsuredPackage(int weight,char method) {
		super(weight,method); 
        this.calculateInsurance();
        if (cost == 0) {
    		System.out.println("Invalid value entered");
    	} else {
    		System.out.println("Insurance cost: $"+cost);
    	} 
	}
	
	public double calculateInsurance() {	
		cost = super.calculateCost(weight,method);
		if (cost > 0 && cost < 1.01) {
			cost += 2.45;
		} else if (cost > 1.00 && cost < 3.01) {
			cost += 3.95;
		} else if (cost > 3.00) {
			cost += 5.55;
		}
		return cost;
	}
}
