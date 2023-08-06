package Models;

public class StudentsData extends MainData {


    public StudentsData(String name, int age, int id, String nationality) {
        super(name, age, id, nationality);
    }

    private double gradeRate;

    public StudentsData(){

    }

    public StudentsData(String name, int age, int id, String nationality, double gradeRate) {
        super(name, age, id, nationality);
        this.gradeRate = gradeRate;
    }


    public double getGradeRate() {
        return gradeRate;
    }

    public void setGradeRate(double gradeRate) {
        this.gradeRate = gradeRate;
    }
}
