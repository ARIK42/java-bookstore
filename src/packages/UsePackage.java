package packages;

public class UsePackage {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
    	Package pk1 = new Package(2,'A');
    	pk1.display();
    	pk1.getCost();
    	
    	Package pk2 = new Package(17,'T');
    	pk2.getCost();
    	
    	Package pk3 = new Package(0,'M');
    	pk3.getCost();
    	
		InsuredPackage ins1 = new InsuredPackage(20,'A');
    	InsuredPackage ins2 = new InsuredPackage(1,'T');
    	InsuredPackage ins3 = new InsuredPackage(100,'y');	
    	
    }
}
