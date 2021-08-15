/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Eric R Smith
 */
public class Grades {

    private int passing;
    private int all;
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
        this.passing = 0;
        this.all = 0;
    }

    public String averageAll() {
        int sum = 0;
        int count = 0;
        for (Integer grade : this.grades) {
            sum += grade;
            count++;
            this.all++;
        }
        if (count == 0) {
            return "-";
        }
        return "" + 1.0 * sum / count;
    }

    public String averagePassing() {
        int sum = 0;
        int count = 0;
        for (Integer grade : this.grades) {
            if (grade > 49) {
                sum += grade;
                count++;
                this.passing++;
            }
        }
        if (count == 0) {
            return "-";
        }
        return "" + 1.0 * sum / count;
    }

    public String passPercentage() {
        if (this.all == 0) {
            return "-";
        }
        double percentage = ((1.0 * this.passing) / this.all) * 100;
        return "" + percentage;
    }

    public void add(int points) {
        this.grades.add(points);
    }

    public int[] gradeDist() {
        int[] pointsArray = new int[] {0, 0, 0, 0, 0, 0};
      
        for (Integer grade : grades) {
            if (grade >= 90) {
                pointsArray[5]++;
            }
            if (grade < 90 && grade >= 80) {
                pointsArray[4]++;
            }
            if (grade < 80 && grade >= 70) {
                pointsArray[3]++;
            }
            if (grade < 70 && grade >= 60) {
                pointsArray[2]++;
            }
            if (grade < 60 && grade >= 50) {
                pointsArray[1]++;
            }
            if (grade < 50) {
                pointsArray[0]++;
            }
        }
        return pointsArray;

    }
}
