package ua.artcode.week3;

/**
 * Created by serhii on 21.02.15.
 */
public class TestInterfaces {


    public static void main(String[] args) {

        SuperPerson superPerson = new SuperPerson();

        Company company = new Company();
        company.checkWorker(superPerson);

        University university = new University();
        university.checkStudent(superPerson);
    }
}

//can not create, full abstract, all methods public abstract
interface IWorker {
    public abstract void work();
}

interface IStudent {
    void study();
}

class University {
    public void checkStudent(IStudent student){
        student.study();
    }
}

class Company {
    public void checkWorker(IWorker worker){
        worker.work();
    }
}

class SuperPerson implements IStudent, IWorker{

    @Override
    public void study() {
        System.out.println("superperson study");
    }

    @Override
    public void work() {
        System.out.println("superperson work");
    }
}




