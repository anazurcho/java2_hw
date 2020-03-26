package ge.edu.btu.ana.zurabashvili.regform.model;

public class Pet {
    private String name;
    private String variety;
    private String gender;
    private int age;

    public Pet(){

    }
    public Pet(String name, String variety, String gender, int age) {
        this.name = name;
        this.variety = variety;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
