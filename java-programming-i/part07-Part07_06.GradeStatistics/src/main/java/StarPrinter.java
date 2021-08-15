/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Eric R Smith
 */
public class StarPrinter {

    

    public StarPrinter() {
        
    }

    public void printer(int[] pointsArray) {
        System.out.println("Grade distribution:");
        for (int i = pointsArray.length - 1; i >= 0; i--) {
            
            System.out.print(i + ": ");
            
            int points = pointsArray[i];
            for (int j = 0; j < points; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
            
        }
    }
}
