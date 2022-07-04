import java.util.Scanner;

public class Student {

    static int rollNumber;
   static String studentName;
   static int marks;
    Student(){
        System.out.println("Student Roll Number: "+rollNumber);
        System.out.println("Student  Name: "+studentName);
        System.out.println("Student mark: "+marks);
    }
    Student(int rn,String name,int m){
        rn=this.rollNumber;
        name=this.studentName;
        m=this.marks;
        System.out.println("Student Roll Number: "+rn);
        System.out.println("Student  Name: "+name);
        System.out.println("Student mark: "+m);
    }

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Number of Students you want to enter");
        int num=s1.nextInt();
        int[] roll=new int[num];
        String[] name=new String[num];
        int[] mark=new int[num];
//        System.out.println(num);
        for(int i=0;i<num;i++){
            System.out.println("Enter the roll no");
           roll[i]=s1.nextInt();
            System.out.println("Enter the name");
            name[i]=s1.next();
            System.out.println("Enter the marks");
            mark[i]=s1.nextInt();
            System.out.println("Student Detail "+(i+1));
            rollNumber=roll[i];
            studentName=name[i];
            marks=mark[i];
            new Student(rollNumber,studentName,marks);
            System.out.println("==============");




        }

    }
}
