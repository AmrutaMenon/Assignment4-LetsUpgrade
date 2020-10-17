package com.quiz;
import java.util.Scanner;

public class Player {

    Scanner sc=new Scanner(System.in);
    String playerName;
    int playerScore=0;

    public void getDetails(){

        System.out.println("Enter the name: ");
        playerName=sc.next();
    }
}
