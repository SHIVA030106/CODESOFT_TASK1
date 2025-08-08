import java.util.*;
class number_game
{
    public static void Number_game(int num)
    {
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            int number=in.nextInt();
            if(number<num)
            {
                System.out.println("TOO LOW");
                System.out.println("No of attempts left :"+(10-i));
                if(i==10)
                {
                    System.out.println("");
                    System.out.println("User lost ");
                    System.out.println("Correct number: "+num);
                }
                
            }
            else if(number>num)
            {
                System.out.println("TOO HIGH");
                System.out.println("No of attempts left :"+(10-i));
                if(i==10)
                {
                    System.out.println("");
                    System.out.println("User lost ");
                    System.out.println("Correct number: "+num);
                }
            }
            else
            {
                System.out.println("");
                System.out.println("USER WINS :");
                System.out.println("CORRECT NUMBER "+number);
                System.out.println("USER SCORE:"+i+" attempts");
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("------------TASK 1----------------");
        System.out.println("------------NUMBER GAME----------------\n");
        int choice=1;
        while(choice==1)
        {
            
             int num=(int)(Math.random()*100);
            //System.out.println(num);
            System.out.println("Ramdom number generated between 0 and 100");
            System.out.println("Guess correct number");
            System.out.println("No of attempts : 10");
            Number_game(num);
            System.out.println("");
            System.out.println("Enter 1 for another round");
            System.out.println("Enter 0 to end the game ");
            choice=in.nextInt();    
        }
        System.out.println("");
        System.out.println("THE END ");
        System.out.println("THANK YOU");
    }
}