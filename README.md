# Difference-Objects-Classes
In Java, classes and objects are foundational to object-oriented programming (OOP). Essentially, a class is a blueprint or template that specifies an object's properties (fields) and actions (methods). For example, a class called Animal may contain methods like makeSound() and fields like name and age. Nevertheless, the class describes the behavior expected of objects of its type; it is not an actual entity in and of itself. 
In contrast, an object is a specific instance of a class. Real entities made with the class blueprint are called objects. Memory is set aside when an object is created to hold its unique properties (e.g., name, age). Dogs and cats, for instance, are examples of objects in the Animal class that have distinct values for age and name. Objects are actual entities that are represented in memory, while the class defines the general structure.

Key Differences:
1.	A class is a template, while objects are actual instances of that class.
2.	Classes do not occupy memory until an object is created. Objects use memory to store the values of the fields defined by the class.
3.	Classes define behaviors (methods) that objects can perform, but each object will have its own state (field values).
To demonstrate, the Animal class could define the method makeSound(), which every object (like dog and cat) can call. However, the output would vary based on the data in each object (e.g., the sound a dog makes versus the sound a cat makes).

References
Oracle. (2023). Classes and objects in Java. Retrieved from https://docs.oracle.com/javase/tutorial/java/concepts/index.html

# Code Explanation
Class: Animal
The Animal class defines:

Fields name and age to store the animal's name and age.
A constructor to initialize the fields when an object is created.
Two methods:
makeSound(): Prints the sound the animal is making based on its name.
age(): Displays the animal's age.
Main Class: Main
In the Main class:

Two objects, dog and cat, are created using the Animal class.
The methods makeSound() and age() are called for both objects to demonstrate their behaviors.

# Output
Dog is making a sound.
Its age is 10.

Cat is making a sound.
Its age is 5.

# How to Run the Program 
1.Ensure that you have Java installed on your system.
2.Save the code in a file named Main.java.
3.Open the terminal and navigate to the directory containing Main.java.
4.Compile the program using the command:
javac Main.java
5.Run the program using:
java Main

# Conclusion
This project illustrates how classes and objects work in Java by defining a class Animal and creating two objects (dog and cat). Each object has its own unique set of attributes and can invoke the methods defined in the class to perform actions.




