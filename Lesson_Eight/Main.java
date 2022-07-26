package Java_HW.Lesson_Eight;

public class Main {
    public static void main(String[] args) {
        
        Dog poochki = new Dog("Poochki", 3, "black", "Street Dog");
        Cat moorchka = new Cat("Moorchka", 4, "white", "Street Cat");
        Turtle rufus = new Turtle("Rufus", 26, "white", "Ocean Turtle", "Red");
        Hamster debi = new Hamster("Debi", 1, "brown with white dots", "Shop Hamster");

        Pet[] pets = {poochki,moorchka,rufus,debi};
        System.out.println(pets[0].getName() + " said");
        System.out.println(poochki.makeSound());
        System.out.println(pets[1].getName() + " said");
        System.out.println(moorchka.makeSound());
        System.out.println(pets[2].getName() + " said");
        System.out.println(rufus.makeSound());
        System.out.println(pets[3].getName() + " said");
        System.out.println(debi.makeSound());
    }
}
