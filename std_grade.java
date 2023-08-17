import java.util.Scanner;
//Assumed Subjects are Accounts, Economics, Maths, BST,IP
public class std_grade {
    static void grade(float a){
        if(a>90.0){
            System.out.println("A Grade");
        }
        if(a<=90.0 && a>=80.0){
            System.out.println("B Grade");
        }
        if(a<80.0 && a>=70.0){
            System.out.println("C Grade");
        }
        if(a<70.0){
            System.out.println("D Grade");
        }
    }
    public static void main(String arg[]){
        int acc,eco,math,bst,ip,roll,total;
        float avg;
        String name;
        System.out.println("Student Grade Calculator");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Student Name");
        name=s.nextLine();
        System.out.println("Enter the Student Roll No.");
        roll=s.nextInt();
        System.out.println("Enter the Accounts Marks of "+name);
        acc=s.nextInt();
        System.out.println("Enter the Economics Marks of "+name);
        eco=s.nextInt();
        System.out.println("Enter the Maths Marks of "+name);
        math=s.nextInt();
        System.out.println("Enter the BST Marks of "+name);
        bst=s.nextInt();
        System.out.println("Enter the IP Marks of "+name);
        ip=s.nextInt();
        total=acc+eco+math+bst+ip;
        System.out.println("The Total Marks of "+name+" is "+total);
        avg=total/5;
        System.out.println("The Average Marks of "+name+" is "+avg);
        System.out.print("Grade allot to "+name+" is ");
        grade(avg);
    }
}
