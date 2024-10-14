package com.yash.oops;


// CheckInt.java
public class classInt {
    public static class Int {
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

    public static void main(String[] args) {
        // Create one uninitialized Int value
        Int uninitialized = new Int();

        // Create two initialized Int values
        Int initialized1 = new Int(5);
        Int initialized2 = new Int(10);

        // Add the two initialized values and store the result in the uninitialized value
        uninitialized.addNumber(initialized1.getSum(), initialized2.getSum());

        // Display the result
        System.out.print("Result: ");
        uninitialized.display();
    }
}
