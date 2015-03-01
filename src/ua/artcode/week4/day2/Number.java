package ua.artcode.week4.day2;

/**
 * Created by amakogon on 01.03.15.
 */
public final class Number {
  private final int value;

  public Number(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public Number add(Number number) {
    return new Number(value + number.getValue());
  }

  public String toString() {
    return String.format("%d", value);
  }

  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o == null) {
      return false;
    }

    if (!(o instanceof Number)) {
      return false;
    }

    Number other = (Number) o;

    return value == other.getValue();
  }

}
