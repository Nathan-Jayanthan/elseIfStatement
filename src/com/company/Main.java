package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 55;

        if(age> 60){
            System.out.println("old");
        }
        else if (age >= 50){
            System.out.println("in your 50s");
        }
        else if (age >= 40){
            System.out.println("in your 40s");
        }
        else{
            System.out.println("young");
        }
    }
}
