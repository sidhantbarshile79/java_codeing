package com.yash.oops;

public class Patient {
    String PatientName;
    double height;
    double weight;

    public double computeBMI(double weight,double height){
            return weight/(height*height);
    }
    public static void main(String[] args) {
        Patient obj=new Patient();
        double BMI=obj.computeBMI(50.0,1.5);
        System.out.println("The BMI is: "+BMI);

    }
}
