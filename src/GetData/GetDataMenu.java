package GetData;

import Models.DoctorsData;

import java.util.Scanner;

public class GetDataMenu {
    Scanner input;
    public GetDataMenu(){
        input =new Scanner(System.in);
    }
    public void inputDataMenu1(){
        System.out.println("Please select your title : "+
                "\n1 - Doctor"+
                "\n2 - Student"+
                "\n3 - Worker");

        int option = input.nextInt();
        switch (option){
            case 1:
               GetDoctorsData getDoctorsData = new GetDoctorsData();
               getDoctorsData.getData();
               getDoctorsData.viewData();

                break;
            case 2:
                GetStudentsData getStudentsData = new GetStudentsData();
                getStudentsData.getData();
                getStudentsData.viewData();
                break;
            case 3:
                GetWorkersData getWorkersData = new GetWorkersData();
                getWorkersData.getData();
                getWorkersData.viewData();
                break;
            default:
                System.out.println("Wrong option, Choose again..");
                inputDataMenu1();
        }
    }
}
