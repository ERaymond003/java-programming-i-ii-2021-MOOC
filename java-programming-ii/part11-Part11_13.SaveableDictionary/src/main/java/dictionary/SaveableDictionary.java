package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }

        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word, this.dictionary.get(word));
        }

        if (this.dictionary.containsValue(word)) {
            String keyToRemove = null;

            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keyToRemove = key;
                }
            }

            this.dictionary.remove(keyToRemove, word);
        }
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String[] lineParts = scanner.nextLine().split(":");
                this.add(lineParts[0], lineParts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try ( PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
