/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


/**
 *
 * @author Eric R Smith
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {
                System.out.print("Word: ");
                String originalWord = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.simpleDictionary.add(originalWord, translation);

            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();

                if (this.simpleDictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");

                } else {
                    System.out.println("Translation: " + this.simpleDictionary.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
