package designpatterns.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        LetterComposer letterComposer = new InformalLetterComposer();
        String letter = letterComposer.compose("Jan Kowalski", "Adam Nowak", "Niestety, nie jesteśmy w stanie naprawić Pańskiego samochodu w rozsądnym czasie.");
        System.out.println(letter);
    }
}
