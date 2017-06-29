package core.gui;

/*
Lolita's Revenge
June 29 2017

Adds extra functionality to the mouse listener.
 */

import java.awt.event.MouseListener;

public abstract class XMouseListener implements MouseListener {

    //variables
    private String IDValue;
    private int Xv;
    private int Yv;
    private int identifier;

    //constructors
    public  XMouseListener() { //blank constructor
    }

    public XMouseListener(String designatedID) { //constructor that takes in an ID number
        this.setIDValue(designatedID);
    }

    public XMouseListener(int x, int y) { //constructor that takes in an x and y coordinate (for say, referencing a 2D array)
        this.Xv = x;
        this.Yv = y;
    }

    public XMouseListener(int id) { //for setting up a listener with an ID
        this.identifier = id;
    }

    //setters
    public void setIDValue(String ID) { this.IDValue = ID; }

    public void setXY(int x, int y) {
        this.Xv = x;
        this.Xv = y;
    }

    //getters
    public String getIDValue() { return this.IDValue; }
    public int getIdentifier() { return this.identifier; }
    public int getValueX() {
        return this.Xv;
    }
    public int getValueY() {
        return this.Yv;
    }

}
