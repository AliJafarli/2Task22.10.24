import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Pet cat = new Pet("cat", "Bobby", 3, 59, new String[] {"eat", "drink", "sleep"});

        Human mother = new Human("Jale", "Aliyeva", 1950);
        Human father = new Human("Babek", "Aliyev", 1945);

        Human child = new Human("Solomon", "Raster", 2010, 57, cat, father, mother,
                new String[][] {
                        {"Monday", "Go to school"},
                        {"Tuesday", "Do homework"},
                        {"Wednesday", "Play football"},
                });


        System.out.println(cat);
        child.greetPet();
        child.describePet();





    }
}