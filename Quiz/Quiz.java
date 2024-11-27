import java.util.Scanner;
public class Quiz {
    public static void main(String args[])
    {
        // int score=0;
        System.out.println("Welcome to Bhuban's Quiz\nFor correct answer score = 5 and for wrong answer score = -1 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.next();
        System.out.println("Hi "+name);
        int Qn=1;
        char answer;
        while(true)
        {
        int score=0;
        System.out.print("Q"+Qn+":");
        System.out.println("What is the Capital of Bangladesh?\n\na)Tangail\nb)Chattogram\nc)Dhaka");
        System.out.println("Enter your answer: ");
        answer=sc.next().charAt(0);
        if(answer=='c')
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Correct!!!");
            score+=5;
        }
        // System.out.println("Your Final Score : "+score);
        else
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Wrong Answer!!!");
            System.out.println("Correct answer is : c) Dhaka");
            score--;
        }
        Qn++;
        System.out.print("Q"+Qn+":");
        System.out.println("When did Bangladesh gain independence?\n\na) 1947\nb) 1971\nc)1981");
        System.out.println("Enter your answer: ");
        answer=sc.next().charAt(0);
        if(answer=='b')
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Correct!!!");

            score+=5;
        }
        // System.out.println("Your Final Score : "+score);
        else
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Wrong Answer!!!");
            System.out.println("Correct answer is : b) 1971");
            score--;
        }
        Qn++;
        System.out.print("Q"+Qn+":");
        System.out.println("What is the national flower of Bangladesh?\n\na) Water Lily\nb) Rose\nc) Sunflower");
        System.out.println("Enter your answer: ");
        answer=sc.next().charAt(0);
        if(answer=='a')
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Correct!!!");

            score+=5;
        }
        
        else
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Wrong Answer!!!");
            System.out.println("Correct answer is : a)Water Lily");
            score--;
        }
        Qn++;
        System.out.print("Q"+Qn+":");
        System.out.println("What is the next number in the sequence?\n\n2, 6, 12, 20, 30, ....\n\na) 36 \nb) 42\nc)50");
        System.out.println("Enter your answer: ");
        answer=sc.next().charAt(0);
        if(answer=='b')
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Correct!!!");

            score+=5;
        }
        // System.out.println("Your Final Score : "+score);
        else
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Wrong Answer!!!");
            System.out.println("Correct answer is : b)42");
            score--;
        }
        Qn++;
        System.out.print("Q"+Qn+":");
        System.out.println("If it takes 5 machines 5 minutes to make 5 widgets, how long would it take 100 machines to make 100 widgets?\n\na) 5 minutes \nb) 10 minutes\nc)100 minutes");
        System.out.println("Enter your answer: ");
        answer=sc.next().charAt(0);
        if(answer=='a')
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Correct!!!");

            score+=5;
        }
        // System.out.println("Your Final Score : "+score);
        else
        {
            System.out.println("Your Answer is : "+answer);
            System.out.println("Wrong Answer!!!");
            System.out.println("Correct answer is : a)5 minutes");
            
            score--;
        }
                
        
        System.out.println("Do you want to play again?(press any key for yes 0 for no)");
        String choice=sc.nextLine();
        if(choice=="0")
        {
            System.out.println(name+" Your Final Score : "+score);
            break;
        }
    } 
 }  
}
