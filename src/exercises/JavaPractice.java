package exercises;

public class JavaPractice {
    public static void main(String[] args){
        int[] arrayNumbs = {1, 1, 2, 3, 5, 8}; //making my array
        String saying = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in" +
                " a house. I will not eat them with a mouse.";

        for (int i = 0; i < arrayNumbs.length; i++){ //this loop will print off all integers in arrayNumbs
            System.out.println(arrayNumbs[i]);
        }
        System.out.println("\n");
        for (int i = 0; i< arrayNumbs.length; i++){ //this loop prints off only odd integers in arrayNumbs
            if (arrayNumbs[i] % 2 != 0) {
                System.out.println(arrayNumbs[i]);
            }
        }
        System.out.println("\n");
        String[] arrOfSaying = saying.split(" "); //Splitting our saying at each space
        for (String a: arrOfSaying){
            System.out.println(a);
        }
        System.out.println("\n");
        String[] arrOfSayingSentences = saying.split("\\. "); //Splitting our saying at each sentence
        for (String b: arrOfSayingSentences){
            System.out.println(b);
        }
    }
}
