package ua.artcode.week4.day2.homework;

import ua.artcode.week4.day2.homework.behavior.IDirectorBehavior;

/**
 * Created by amakogon on 01.03.15.
 */
public final class Director extends Employee implements IDirectorBehavior {


  @Override
  public void work() {
    System.out.println("I am boss");
  }

  @Override
  public void hireEmployee(Employee employee) {

  }
}
