package ua.artcode.week8.day1.clone_p;

import java.util.Date;

public class Dog implements Cloneable {

    private int age;
    private Date birthday;
    private String name;

    public Dog() {
    }

    public Dog(int age, Date birthday, String name) {
        this.age = age;
        this.birthday = birthday;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Dog clone()  {
        Dog cloned = null; // new object with copy of primitives
        try {
            cloned = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            cloned = new Dog(age,null,null);
        }
        cloned.name = new String(name);
        cloned.birthday = (Date) birthday.clone();
        return cloned;
    }
}
