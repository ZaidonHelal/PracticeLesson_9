package GetData;

import Models.DoctorsData;
import Models.StudentsData;

import java.util.Scanner;

public class GetStudentsData {
    Scanner input;
    StudentsData studentsData;
    public GetStudentsData() {
        input = new Scanner(System.in);
    }

    public StudentsData  getData() {
        System.out.println("Please, Enter your information : ");
        System.out.println("Enter your name :");
        String name = input.nextLine();
        System.out.println("Enter your age :");
        int age = input.nextInt();
        System.out.println("Enter your ID :");
        int id = input.nextInt();
        System.out.println("Enter your nationality :");
        input= new Scanner(System.in);
        String nationality = input.nextLine();
        System.out.println("Enter your Grade rate :");
        double gradeRate = input.nextDouble();
        studentsData = new StudentsData(name,age,id,nationality,gradeRate);
        return studentsData;

    }
    public void viewData(){
        System.out.println("Name : "+studentsData.getName()+
                "\nAge : "+studentsData.getAge()+
                "\nID : "+studentsData.getId()+
                "\nNationality : "+studentsData.getNationality()+
                "\nGrade rate : "+studentsData.getGradeRate());
    }
}
