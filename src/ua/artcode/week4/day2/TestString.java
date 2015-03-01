package ua.artcode.week4.day2;

import ua.artcode.week2.day1.Robot;

/**
 * Created by amakogon on 01.03.15.
 */
public class TestString {
  public static void main(String[] args) {
    String s = "";

    //wrong! Do not use!
//    for (int i = 0; i < 1000000; i++) {
//      s+= i + "";
//    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 10000000; i++) {
      builder.append(i);
    }
    String result = builder.toString();

    Robot robot = new Robot(100, 1515, "robot", null, null);
    System.out.println("Hello! My model is "
                         + robot.getModel() + ", power " + robot.getPower());
    String s1 = String.format("Hello! My model is %s, power %d",
                  robot.getModel(),robot.getPower());
    System.out.println(s1);

  }
}
