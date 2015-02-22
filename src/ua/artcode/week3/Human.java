package ua.artcode.week3;

import java.util.Date;

/**
 * Created by serhii on 22.02.15.
 */
public class Human {

    private String name;
    private int age;
    private double weight;
    private Date birthday;

    public Human() {
    }

    public Human(String name, int age, double weight,
                 Date birthday) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.birthday = birthday;
    }

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }


    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Human)){
            return false;
        }

        Human other = (Human) obj;
        if(this.age == other.age &&
                (this.name != null && this.name.equals(other.name)) &&
                (this.name != null && this.birthday.equals(other.birthday)) &&
                this.weight == other.weight){
            return true;
        }

        return false;

    }


}
