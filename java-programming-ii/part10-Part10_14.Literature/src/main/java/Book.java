/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric R Smith
 */
public class Book {

    private String title;
    private int ageRec;

    public Book(String title, int ageRec) {
        this.title = title;
        this.ageRec = ageRec;
    }

    public String getTitle() {
        return this.title;
    }

    public int getAgeRec() {
        return this.ageRec;
    }
    
    @Override
    public String toString() {
        return this.title + " (recommended for " + this.ageRec + " year-olds or older)";
    }

}
