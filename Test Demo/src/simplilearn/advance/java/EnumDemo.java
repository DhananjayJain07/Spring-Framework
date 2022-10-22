package simplilearn.advance.java;

public class EnumDemo {

	public static void main(String[] args) {
		Color c1 = Color.RED;
		
		System.out.println("Red Enum name: "+c1.name());
		System.out.println("Red Enum name: "+c1.gerValue());
		
		for (Color color : Color.values()) {
			System.out.println("Enum value: "+color.gerValue());
		}

	}

}
