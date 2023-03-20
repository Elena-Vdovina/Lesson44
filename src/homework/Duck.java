package homework;

// Реализуйте соответствующие интерфейсы из предыдущей задачи в классах "Человек",
// "Утка", "Пингвин" и "Самолёт".
public class Duck implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("Duck fly");
  }

  @Override
  public void run() {
    System.out.println("Duck run");
  }

  @Override
  public void swim() {
    System.out.println("Duck swim");
  }
}
