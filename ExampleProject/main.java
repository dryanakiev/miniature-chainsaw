import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char choose = new char;
        System.out.println("Choose number between 1 and 3: ")
        choose = sc.newChar();
        
        switch(choose)
        {
            case 1: "This is case 1\n"; break;
            case 2: "This is case 2\n"; break;
            case 3: "This is case 3\n"; break;
            default: "Invalid input.\n"; break;
        }
    }
}