public class Animal {

    private String petName;
    private boolean Dog;

    //Start of overloaded constructors
    public Animal () {
        this.petName = "";
        this.Dog = false;
    }

    public Animal (String petName) {
        this.petName = petName;
        this.Dog = false;
    }

    public Animal (boolean Dog) {
        this.petName = "";
        this.Dog = Dog;
    }

    // End of overloaded constructors
    public Animal (String petName, boolean Dog) {
        this.petName = petName;
        this.Dog = Dog;
    }

    public String getPetName() {
        return petName;
    }

    public boolean ifIsDog() {
        return Dog;
    }

    @Override
    public String toString() {
        return getPetName() + " is a dog = " + ifIsDog();
    }
}