package packages;

public class Package {
    double cost;
    int weight;
    char method;
    
    public Package(int weight2,char method2) { 
    	this.weight = weight2;
    	this.method = method2;
    }
    
    public double calculateCost(int weight,char method) {
        switch (method) {
            case 'A':
                if (weight > 0 && weight < 9) {
                    cost = 2.00;
                } else if (weight > 8 && weight <= 16) {
                    cost = 3.00;
                } else if (weight > 16) {
                    cost = 4.50;
                }
                break;
            case 'T':
                if (weight > 0 && weight < 9) {
                    cost = 1.50;
                } else if (weight > 8 && weight <= 16) {
                    cost = 2.35;
                } else if (weight > 16) {
                    cost = 3.25;
                }
                break;
            case 'M':
                if (weight > 0 && weight < 9) {
                    cost = 0.50;
                } else if (weight > 8 && weight <= 16) {
                    cost = 1.50;
                } else if (weight > 16) {
                    cost = 2.15;
                }
                break;
            default:
                System.out.println("Invalid shipping method");
                return 0;
        }
        return cost;
    }
    
    public void getCost() {
    	cost = calculateCost(weight,method);
    	if (cost == 0) {
    		System.out.println("Invalid value entered");
    	} else {
    		System.out.println("Shipping cost: $"+cost); 
    	}
    }
    
    public void display() {
        System.out.println("Weight (oz.)\t"+"Air ($)\t"+"Truck (S)\t"+"Mail ($)");
        System.out.println("1-8\t\t"+"2.00\t"+"1.50\t\t"+"0.50");
        System.out.println("9-16\t\t"+"3.00\t"+"2.35\t\t"+"1.50");
        System.out.println("17 and over\t"+"4.50\t"+"3.25\t\t"+"2.15");
    } 
}




