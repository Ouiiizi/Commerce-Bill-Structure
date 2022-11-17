package models;
public class Userprofile {
String name;
int age;
String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Userprofile(String name, String lastname, int age){
        this.name = name;
        this.age = age;
        this.lastname = lastname;

    }
}
