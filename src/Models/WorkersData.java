package Models;

public class WorkersData extends MainData{


    public WorkersData(String name, int age, int id, String nationality) {
        super(name, age, id, nationality);
    }
    private String occupation ;
    public WorkersData(){

    }

    public WorkersData(String name, int age, int id, String nationality, String occupation) {
        super(name, age, id, nationality);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
