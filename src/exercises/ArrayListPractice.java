package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main (String[] args){

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(9);
        randomNumbers.add(2);
        randomNumbers.add(89);
        randomNumbers.add(17);
        randomNumbers.add(44);
        randomNumbers.add(12);
        randomNumbers.add(15);
        randomNumbers.add(67);
        randomNumbers.add(9);
        randomNumbers.add(80);
        System.out.println(randomNumbers);

        for (int i=0; i<randomNumbers.size(); i++){ {
                System.out.println(randomNumbers.get(i));
            }
        }
    }
}
