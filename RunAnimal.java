import java.util.Scanner;

public class RunAnimal {
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Choose an animal. Press B for Bird, C for Cat or D for Dog: ");
    	String input1 = sc.nextLine();
    	
    	if(input1.equalsIgnoreCase("B")){
    		Bird b = new Bird();
    		b.eat();
    		b.sleep();
    		b.makesound();
    		
    	}
    	else if(input1.equalsIgnoreCase("C")){
    		Cat c = new Cat();
    		c.eat();
    		c.sleep();
    		c.makesound();
    		
    	}
    	else if(input1.equalsIgnoreCase("D")){
    		Dog d = new Dog();
    		d.eat();
    		d.sleep();
    		d.makesound();
    	}
    	sc.close();
    }
}