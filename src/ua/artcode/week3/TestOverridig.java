package ua.artcode.week3;

/**
 * Created by serhii on 21.02.15.
 */
public class TestOverridig {

    public static void main(String[] args) {

        Employee employee = new Tester("tester", 30);
        employee.work();

        Manager manager = new Manager("man", 45);
        manager.addToTeam(new Coder("yulia", 24));
        manager.addToTeam(new Tester("sss", 33));
        manager.addToTeam(new Manager("aaa", 55));

        manager.startTeamWork();


    }


}


abstract class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println(name + " " + age);
    }

    // without body, only declaration
    // must be overrided by child type
    public abstract void work();


}

class Tester extends Employee {

    public Tester(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println("Tester work");
    }

}

class Coder extends Employee {

    public Coder(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println("Coder work");
    }
}

class Manager extends Employee {

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("manager work");
    }

    private Employee[] team = new Employee[5];
    private int size;

    public void addToTeam(Employee employee){
        team[size++] = employee;
    }

    public void startTeamWork(){
        for (int i = 0; i < size; i++) {
            team[i].work();
        }
    }


}

