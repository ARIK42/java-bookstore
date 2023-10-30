package book;

public class UseBook {

	public static void main(String[] args) {
		Fiction F1 = new Fiction("Nineteen Eighty-Four");
		Fiction F2 = new Fiction("Brave New World");
		Fiction F3 = new Fiction("Guide to Happiness");
		NonFiction NF1 = new NonFiction("Origin of Species");
		NonFiction NF2 = new NonFiction("The Selfish Gene");
		NonFiction NF3 = new NonFiction("A Brief History of Time");
		System.out.println(F1.getTitle()+" - $"+F1.getPrice());
		System.out.println(F2.getTitle()+" - $"+F2.getPrice());
		System.out.println(F3.getTitle()+" - $"+F3.getPrice());
		System.out.println(NF1.getTitle()+" - $"+NF1.getPrice());
		System.out.println(NF2.getTitle()+" - $"+NF2.getPrice());
		System.out.println(NF3.getTitle()+" - $"+NF3.getPrice());
		
	}
}
