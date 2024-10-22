public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    public String[] habits;
    public Pet pet;
    public Human mother;
    public Human father;

    private void eat() {
        System.out.println("I am eating");
    }

    private void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    private void foul() {
        System.out.println("I need to cover it up");
    }

}
