import java.util.Random;
import java.util.Scanner;
public class HelloWorld_Proper{
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args){

        Choice();

    }
    static void RandomNum(){
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        System.out.println("The random number is " + randomNumber);
    }
    static int[] EnterNumber(){
        int numbers[] = new int[2];
        System.out.println("Enter your first number");
        numbers[0] = scan.nextInt();
        System.out.println("Enter your second number");
        numbers[1] = scan.nextInt();
        return numbers;
    }
    static int Add(int[] addNumbers){
        System.out.println("You have selected Addition");
        int addTotal = addNumbers[0] + addNumbers[1];
        return(addTotal);
    }
    static int Subtract(int[] subNumbers){
        System.out.println("You have selected Subtraction");
        int subTotal = subNumbers[0] - subNumbers[1];
        return(subTotal);
    }
    static int Multiply(int[] mulNumbers){
        System.out.println("You have selected Multiplication");
        int mulTotal = mulNumbers[0] * mulNumbers[1];
        return(mulTotal);
    }
    static int Division(int [] divNumbers){
        System.out.println("You have selected Division");
        int divTotal = divNumbers[0] / divNumbers[1];
        return(divTotal);
    }
    static void Calculator(){
        System.out.println("You have chosen to use a calculator \nGood choice");
        System.out.println("Please select a number between 1 and 4");
        int calcChoice = scan.nextInt();

        switch(calcChoice){
            case 1:
            System.out.println(Add(EnterNumber()));
            break;
            case 2:
            System.out.println(Subtract(EnterNumber()));
            break;
            case 3:
            System.out.println(Multiply(EnterNumber()));
            break;
            case 4:
            System.out.println(Division(EnterNumber()));
            break;
        }     
    }
    static void Choice(){
        System.out.println("Would you like to explore this world? Please select y or n");
        String userChoice = scan.nextLine();
        if (userChoice.equals("y")){
            System.out.println("Good Choice");
            System.out.println("Would you like to use the calculator? Please select y or n");
            userChoice = scan.nextLine();
            if(userChoice.equals("y")){
                Calculator();
            }else{
                System.out.println("You can access the random number generator instead");
                RandomNum();
            }
        }else{
            System.out.println("Bad Choice");
        }
    }
}