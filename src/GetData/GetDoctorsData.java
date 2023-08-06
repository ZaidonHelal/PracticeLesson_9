package GetData;

import Models.DoctorsData;

import java.util.Scanner;

public class GetDoctorsData {
    Scanner input;
    DoctorsData doctorsData;
    public GetDoctorsData() {
        input = new Scanner(System.in);
    }

    public DoctorsData getData() {
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
        System.out.println("Enter your higher Certificate :");
        String higherCertificate = input.nextLine();
        doctorsData = new DoctorsData(name,age,id,nationality,higherCertificate);
        return doctorsData;

    }
    public void viewData(){
        System.out.println("Name : "+doctorsData.getName()+
                "\nAge : "+doctorsData.getAge()+
                "\nID : "+doctorsData.getId()+
                "\nNationality : "+doctorsData.getNationality()+
                "\nHigher Certificate : "+doctorsData.getHigherCertificate());
    }

}
