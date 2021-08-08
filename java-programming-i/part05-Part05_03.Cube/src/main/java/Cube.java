/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric R Smith
 */
public class Cube {

    private int length;
    private int volume;

    public Cube(int edgeLength) {
        this.length = edgeLength;
        this.volume = edgeLength * edgeLength * edgeLength;
    }

    public int volume() {
        return this.volume;
    }

    public String toString() {
        return "The length of the edge is " + this.length + " and the volume " + this.volume;
    }
}
