package GetData;

import Models.DoctorsData;
import Models.WorkersData;

import java.util.Scanner;

public class GetWorkersData {
    Scanner input;
    WorkersData workersData;
    public GetWorkersData() {
        input = new Scanner(System.in);
    }

    public WorkersData getData() {
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
        System.out.println("Enter your occupation :");
        String occupation = input.nextLine();
        workersData = new WorkersData(name,age,id,nationality,occupation);
        return workersData;

    }
    public void viewData(){
        System.out.println("Name : "+ workersData.getName()+
                "\nAge : "+ workersData.getAge()+
                "\nID : "+ workersData.getId()+
                "\nNationality : "+ workersData.getNationality()+
                "\nOccupation : "+ workersData.getOccupation());
    }
}
