import java.util.Scanner;

class student {
    String name;
    double[] scores = new double[3];
    public student(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println(name+ " scores:");
        System.out.println("Assigment: "+scores[0]);
        System.out.println("Midterm: "+ scores[1]);
        System.out.println("Final: "+ scores[2]);
    }

    public void checkpass() {
        double average = (scores[0] + scores[1] +scores[2])/scores.length; //Changed the math from 'divided by 3' to 'divided by scores.length'
        if (average >= 60){
            System.out.println( name+ " passed.");
        } else{System.out.println( name+ " failed.");}
    }
}

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("How many students? ");
int numstudents = scanner.nextInt();
scanner.nextLine();

int count = 1;

while (count<= numstudents){
    System.out.print("\nEnter name for student " +count + ": ");
    String name = scanner.nextLine();

    student s1 = new student(name);
    System.out.println("Enter assignment score: ");
    s1.scores[0] = scanner.nextDouble();
    System.out.println("Enter midterm score: ");
    s1.scores[1] = scanner.nextDouble();
    System.out.println("Enter Final score: ");
    s1.scores[2] = scanner.nextDouble();

    scanner.nextLine();
    s1.printInfo();
    s1.checkpass();
    count++;
}
scanner.close();
    } //deleted an empty line
}
