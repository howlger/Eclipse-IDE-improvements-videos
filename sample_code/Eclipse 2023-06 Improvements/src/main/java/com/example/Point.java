package com.example;
public class Point {

	/** The X coordinate */
    public int x;

    /** The Y coordinate */
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the X coordinate
     * @return the X coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the Y coordinate
     * @return the Y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Returns a copy of this point
     * @return a copy of this point
     */
    public Point getLocation() {
        return new Point(x, y);
    }

    public void setLocation(Point p) {
    }

    public void setLocation(int x, int y) {
    }

    public void setLocation(double x, double y) {
    }

    public void move(int x, int y) {
    }

    public void translate(int dx, int dy) {
    }

}
