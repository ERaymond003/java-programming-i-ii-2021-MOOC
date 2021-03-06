/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric R Smith
 */
public class Games {

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public Games(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String winner() {
        String winner = "";
        if (this.homeScore > this.awayScore) {
            winner = this.homeTeam;
        } else {
            winner = this.awayTeam;
        }
        return winner;
    }
    
    @Override
    public String toString() {
        return this.homeTeam + ", " + this.awayTeam + ", " + this.homeScore + ", " + this.awayScore;
    }

}
