import  java.util.Scanner;
public class Number_Game
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int chances = 10;
        int finals = 0;
        boolean playAgain=true;
        System.out.println("welcome Dear!");
        System.out.println("Hey Dear you have about  "+ chances +" chances to win the game");
        while (playAgain){
            int rand =getrandN(1,100);
            boolean guess = false;
            for (int i=0;i<chances;i++){
                System.out.println("chances"  + (i+1) +  "enter your guess:");
                int user = sc.nextInt();
                if(user==rand){
                    guess = true;
                    finals+=1;
                    System.out.println("you won it.");
                    break;
                }
                else if (user>rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("To Low ");
                }
            }
            if (guess==false){
                System.out.println("sorry Dear .You lost the chances.The number is "+rand);
            }
            System.out.println("Do you want to play Again(Yes / NO )");
            String pA=sc.next();
            playAgain= pA.equalsIgnoreCase("Yes");

        }
        System.err.println("That's it Dear , Hope you enjoyed it");
        System.err.println("Here is your score :"+finals);
    
    }
    public static int getrandN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);

    }
}