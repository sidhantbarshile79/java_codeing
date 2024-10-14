package com.yash.oops;

// Int class
public class Int {
    private int sum;

    // Default constructor, initializes sum to 0
    public Int() {
        sum = 0;
    }

    // Constructor to initialize sum to a specific value
    public Int(int value) {
        sum = value;
    }

    // Getter for sum field
    public int getSum() {
        return sum;
    }

    // Method to add two int values and store the result in sum
    public void addNumber(int i, int j) {
        sum = i + j;
    }

    // Method to display the value of sum
    public void display() {
        System.out.println(sum);
    }

}

// CheckInt class
