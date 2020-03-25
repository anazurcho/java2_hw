package ge.edu.btu.ana.zurabashvili.regform.model;

public class Pet {
    private String name;
    private String variety;
    private String gender;
    private Integer age;


    public Pet(String name, String variety, String gender, Integer age) {
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

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
