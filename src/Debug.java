import java.util.Scanner;

public class Debug {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Input your name: ");
        String name=input.nextLine();
        System.out.print("Enter your age: ");
        short Age=input.nextShort();
        System.out.print("Enter your DOB year: ");
        int dob=input.nextInt();
        System.out.println("Summary:"+"\n"+"your name is: "+name+"\n"+"Your age is: "+
                Age+"\n"+"Your birth year is: "+dob);
    }
}
