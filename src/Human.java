public class Human {

    String name;
    String surname;
    int birthYear;
    int iq;
    public Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Human(String name, String surname, int birthYear, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int birthYear, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);

    }

    public void describePet() {
        String slyLVL = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is " + slyLVL);
    }

    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + birthYear + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "unknown") +
                ", father=" + (father != null ? father.name + " " + father.surname : "unknown") +
                ", pet=" + (pet != null ? pet.toString() : "no pet") + "}";
    }
}

