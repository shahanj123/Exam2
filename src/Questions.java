import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Questions {
	public static void main(String[] args) throws IOException{
		String filename ="Questions.txt";
		
		FileWriter writer = new FileWriter(filename);
		BufferedWriter bufferedwriter = new BufferedWriter(writer);
		
		bufferedwriter.write("8. A class is a blueprint in java where an object is created and an object in java is something that has is own property and behavior.\n"
				+ "9. A constructor is created in order to initialize the object and the two types of contructors are Default and Parametrized.\n"
				+ "10. class Office{ \n Office()\n}\n"
				+ "11. The implements keyword allows you to access multiple interface classes and the keyword is similar to extends\n"
				+ "12. The three places you use the keyword final is final variable, final method and final class\n"
				+ "13. The four concepts of object-oriented programming is Inheritance, Abstraction, Encapsulation and Polymorphism\n"
				+ "14. The first thing that happens when a class is instantiated is that it will create an object that creates an instance for the class\n"
				+ "15. When a method is overloaded it happens within the same class and it cannot have the same parameters\n"
				+ "16. Abstract classes can contain both abstract methods and concrete methods. Interface classes can only contain abstract methods.\n"
				+ "17. The void keyword means that a method should not have a return value and is used to specify an expression that has to be evalutated.\n"
				+ "18. Overloading means that a method with the same name can be called upon multiple times, but must have different parameters\n"
				+ "19. You cannot override a static method.\n"
				+ "21. Access modifiers are used to specifiy different levels of access for classes, variable methods, and constructor.\n There are four different access modifiers Default, Public, Private, Protected.\n "
				+ "Local Variables are declared within a method, constructor, or a block and destoryed once it exits."
				+ "Instance Variables are declared within a class, but outside a method and can be referenced by multiple methods.\n"
				+ "22. A constructor has to be the same name as the class, but a method does not. A method has a return type and a constructor does not. You can call a method multiple times and a constructor is called when an object is created.\n"
				+ "this() is used to call the current class constructor and super() is used to call the base or parent class constructor.\n"
				+ "23. Method overloading is when you use the same name for a method multiple times, but with different parameters. Example:\n"
				+ "add(int, int)\n"
				+ "add(int, int, int)\n"
				+ "Method overriding is when you create method in a child class which is already present in the parent class. However the child class changes the method to its own application.\n"
				+ "Example\n"
				+ "class person{ \n"
				+ "public void sleep(){\n"
				+ "System.out.println(Person is sleeping)}}\n"
				+ "class steve extends person{\n"
				+ "public void sleep(){\n"
				+ "System.out.println(Steve is sleeping)}\n"
				+ " public static void main( String args[]){\n"
				+ "steve s= new steve()\n"
				+ "s.sleep}}\n"
				+ "");
		bufferedwriter.close();
		
	}

}
