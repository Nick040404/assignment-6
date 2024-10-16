public class Animal {
    public int age;
    public String gender;

    // Method to check if the animal is a mammal
    public boolean isMammal() {
        System.out.println("This is the isMammal method from Animal class.");
        return true; // You can customize the return value based on more details.
    }

    // Method for mating
    public void mate() {
        System.out.println("This is the mate method from Animal class.");
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal();
        myAnimal.age = 5;
        myAnimal.gender = "Male";

        // Create a Fish object
        Fish myFish = new Fish();
        
        // Create a Zebra object
        Zebra myZebra = new Zebra();
        myZebra.is_wild = true;

        // Call public methods from Animal class
        myAnimal.isMammal();
        myAnimal.mate();

        // Call public methods from Zebra class
        myZebra.run();

        // Call public methods from Fish class (if any)
        // Since there are no public methods specific to Fish, we won't call any from here.
    }
}
