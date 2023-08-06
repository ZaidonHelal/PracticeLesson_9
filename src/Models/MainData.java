package Models;

public class MainData {
    private String name;

    private int age;
    private int id;
    private String nationality;

    public MainData(String name, int age, int id, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.id = id;
    }

    public MainData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
