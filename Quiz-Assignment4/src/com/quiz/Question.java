package com.quiz;
import java.util.Scanner;

public class Question {

    Scanner sc=new Scanner(System.in);
    String quest,optn1,optn2,optn3,optn4;
    int userAns,correctAns;

    public boolean askQuest(){

        System.out.println(quest);
        System.out.println("1) "+optn1);
        System.out.println("2) "+optn2);
        System.out.println("3) "+optn3);
        System.out.println("4) "+optn4);
        System.out.println("Please select an option");
        userAns=sc.nextInt();

        if(userAns==correctAns){
            return true;
        }
        return false;

    }
}
