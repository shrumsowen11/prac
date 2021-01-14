package java8.cloning;

public class DogClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dog dog=new Dog();

		//Dog dog=new Dog("Tommy","white");
		System.out.println(dog);
		System.out.println(dog.hashCode());
		System.out.println("Constructor call nahi hoga!");
		Dog secondDog=(Dog)dog.clone();
		System.out.println(secondDog);
		System.out.println(secondDog.hashCode());
		
		Dog dog2=(Dog)dog.clone();
		System.out.println(dog2);
		System.out.println(dog2.hashCode());
		
		
		Dog dog3=(Dog)dog.clone();
		System.out.println(dog3);
		System.out.println(dog3.hashCode());
		
		
		Dog dog4=(Dog)dog.clone();
		System.out.println(dog4);
		System.out.println(dog4.hashCode());
		
		Dog dog5=(Dog)dog.clone();
		System.out.println(dog5);
		System.out.println(dog5.hashCode());
	}
}
