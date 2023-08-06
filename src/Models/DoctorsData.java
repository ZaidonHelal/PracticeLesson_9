package Models;

public class DoctorsData extends MainData {


    public DoctorsData(String name, int age, int id, String nationality) {
        super(name, age, id, nationality);
    }

    private String higherCertificate;

    public DoctorsData(){

    }
    public DoctorsData(String name, int age, int id, String nationality, String higherCertificate) {
        super(name, age, id, nationality);
        this.higherCertificate = higherCertificate;
    }


    public String getHigherCertificate() {
        return higherCertificate;
    }

    public void setHigherCertificate(String higherCertificate) {
        this.higherCertificate = higherCertificate;
    }
}
