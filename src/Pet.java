import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    public String[] habits;

    //    public Pet pet;
//    public Human mother;
//    public Human father;
    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    private void eat() {
        System.out.println("I am eating");
    }

    private void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    private void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }

}
