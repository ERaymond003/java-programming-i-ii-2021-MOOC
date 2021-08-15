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
public class UserInterface {
    private Scanner scanner;
    private Grades grades;
    private StarPrinter printer;
    
    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
        this.printer = new StarPrinter();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int point = Integer.valueOf(this.scanner.nextLine());
            
            if (point == -1) {
                break;
            } else if (point >= 0 && point <= 100) {
                this.grades.add(point);
            }
        }
        
        System.out.println("Point average (all): " + this.grades.averageAll());
        System.out.println("Point average (passing): " + this.grades.averagePassing());
        System.out.println("Pass percentage: " + this.grades.passPercentage());
        this.printer.printer(this.grades.gradeDist());
    }
}
