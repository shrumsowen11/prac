package java8.cloning;

public class Dog  implements Cloneable {
	
	private String name;
	private String color;
	
	/*public Dog(){
		System.out.println("###DC Dog DC IS CALLED#####");
	}
	
	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
		System.out.println("###PC Dog CONS IS CALLED#####");
	}*/
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}
}
