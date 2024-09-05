// Class: Animal defines a template for creating Animal objects
class Animal {
    // Fields: These are attributes of an Animal object
    String name;
    int age;
    
    // Constructor: This initializes the fields when an object is created
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method of makeSound, defining the behavior 
    void makeSound() {
        System.out.println(name + " is making a sound.");
    }
    // Method of age, defining the behavior
    void age() {
        System.out.println("its age is " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects (instances) of the Animal class
        Animal dog = new Animal("Dog", 10); // 'dog' is an object of class Animal
        Animal cat = new Animal("Cat", 5); // 'cat' is another object of class Animal

        // Calling methods using object dog 
        dog.makeSound(); 
        dog.age();
    
        System.out.println();

        // Calling methods using object cat
        cat.makeSound(); 
        cat.age();
    }
}
