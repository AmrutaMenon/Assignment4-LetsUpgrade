package com.quiz;

public class Game {

    Question[] questions=new Question[5];
    Player player=new Player();

    String[] questionDetails={"Which state is known as the God's own country?","Which is India's largest state?","Which is india's smallest State?","Which of these is not a union territory?","Which is the highest spoken language in India?"};
    String[] optn1={"Punjab","Goa","Goa","Puducherry","Hindi"};
    String[] optn2={"Jammu & Kashmir","Sikkim","Karnataka","Lakshadweep","Telugu"};
    String[] optn3={"Kerala","Rajasthan","Haryana","Mahi","Malayalam"};
    String[] optn4={"West Bengal","Gujarat","Andhra Pradesh","Kochi","Tamil"};
    int[] answers={3,3,1,4,1};

    public void initGame(){

        //creating objects for the array

        for(int i=0;i<5;i++){

            questions[i]=new Question();
        }
        for(int i=0;i<5;i++){
            questions[i].quest=questionDetails[i];
            questions[i].optn1=optn1[i];
            questions[i].optn2=optn2[i];
            questions[i].optn3=optn3[i];
            questions[i].optn4=optn4[i];
            questions[i].correctAns=answers[i];

        }
    }

    public void play(){

        player.getDetails();
        for(int i=0;i<5;i++){

            boolean status=questions[i].askQuest();
            if(status==true){
                System.out.println("Well played!!!");
                player.playerScore=player.playerScore+2;

            }
            else{
                System.out.println("Sorry, Wrong Answer!!!");
                player.playerScore=player.playerScore-2;

            }

        }
        System.out.println(player.playerName +" Your score is "+player.playerScore);
    }

}
