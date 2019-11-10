package exercises;

public class JavaPractice {
    public static void main(String[] args){
        int[] arrayNums = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < arrayNums.length; i++){
            System.out.println(arrayNums[i]);
        } for (int i = 0; i< arrayNums.length; i++){
            if (arrayNums[i] % 2 != 0) {
                System.out.println(arrayNums[i]);
            }
        }
    }
}
