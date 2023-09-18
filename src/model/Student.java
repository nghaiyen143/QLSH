package model;

public class Student {
    private static int INDEX=0;
    int id,age;
    String name,address,gender;
    double avgPoint;


    public Student() {
    }

    public Student(String name, int age, String gender, String address, double avgPoint ) {
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.avgPoint = avgPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id +
                ", name=" + name +'\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
