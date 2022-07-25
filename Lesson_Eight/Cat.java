package Java_HW.Lesson_Eight;

public class Cat extends Pet {

    public Cat(String name, int age, String color, String breed) {
        super(name, age, color, breed);
        
    }

    public String makeSound(){
        return "meow";
    }
    
}
