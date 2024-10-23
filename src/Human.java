public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;

    String[][] schedule;


    public String greetPet(String nickname) {
        return nickname;

    }

    public void describePet(){
        String slyLVL = pet.trickLevel > 50 ? "very sly":"almost not sly";
        System.out.println("I have a " + pet.species + ", he is "+ pet.age +"years old, he is " + slyLVL);
    }
}
