/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.ArrayList;

public abstract class Bag
{
    /*
     * Done: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;

    // numberOfContents shouldn't be needed,
    // It would be more consistent to just return contents.size()
    // See https://piazza.com/class/l5v1b8gfz6b60m/post/97
    //private int numberOfContents;

    private int capacity;

    private ArrayList<String> contents;

    /*
     * Done: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String color, int capacity)
    {
        this.color = color;
        this.capacity = capacity;

        this.contents = new ArrayList<>();
    }

    /*
     * Done: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    public String getColor()
    {
        return color;
    }

    public int getNumberOfContents()
    {
        return contents.size();
    }

    public int getCapacity()
    {
        return capacity;
    }

    /*
     * Done: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /*
     * Done: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    public boolean addItem(String item)
    {
        if (contents.size() >= capacity) return false;

        contents.add(item);
        return true;
    }


    /**
     * Done: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return
     */
    public String popItem()
    {
        if (contents.size() == 0) return null;

        return contents.remove(contents.size() - 1);
    }


    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n)
    {
        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString()
    {
        return this.color + " Bag (" + this.getNumberOfContents() + " / " + this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
