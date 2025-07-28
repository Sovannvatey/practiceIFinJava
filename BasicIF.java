import java.util.Scanner;

public class BasicIF {
    public static void main(String[] args){
        int avg;
        String grade;
        double s;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter average score >>");
        avg = scanner.nextInt();

        if (avg >= 96){
            grade="A";
            s=100;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>=89){
            grade="B";
            s=80;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>=81){
            grade="C";
            s=70;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>=89){
            grade="B";
            s=80;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>=81){
            grade="C";
            s=70;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>=71){
            grade="D";
            s=50;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>=51){
            grade="E";
            s=30;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg<=50){
            grade="F";
            s=20;
            System.out.println("You got grade: " + grade);
            System.out.println("You got scholarship: " + s + "%");
        }
        else if(avg>100){
            System.out.println("Number is bigger than 100");
        }
        else{
            System.out.println("Number is Negetive");
        }

    }
}
