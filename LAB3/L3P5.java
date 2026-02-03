import java.lang.*;
class Animal{
	void makeSound(){
		System.out.println("Animal make a sound");
	}
}

class Cat extends Animal {
    @Override
    void makeSound() {
	 System.out.println("meow");
    }
}

class Dog extends Cat{
	@Override
	void makeSound(){
		System.out.println("bark");
	}
}
	
class L3P5{
 	public static void main(String...args){
		Cat c = new Cat();
		c.makeSound();
		Dog d = new Dog();
		d.makeSound();
	}
}