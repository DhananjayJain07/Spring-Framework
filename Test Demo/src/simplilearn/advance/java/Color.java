package simplilearn.advance.java;

public enum Color {
	RED("red"), GREEN("green"), BlUE("blue");
	
	private String value;
	
	Color(String value) {
		this.value = value;
	}
	public String gerValue() {
		return value;
	}

}
