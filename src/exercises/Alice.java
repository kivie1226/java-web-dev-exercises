package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence;
        String term;
        int termIndex;
        int termLength;
        Scanner input;
        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to" +
                " do: once or twice she had peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        input = new Scanner(System.in);
        System.out.println("Term: ");
        term = input.next();
        input.close();

        termIndex = sentence.indexOf(term);
        termLength = term.length();

        //determines if sentence will contain the term the user inputs
        if (sentence.toLowerCase().contains(term)) {
            System.out.println("Term is at index " + (termIndex) + " and term is " + (termLength) + " characters long.");
        } else {
            System.out.println("False");
        }
    }
}
