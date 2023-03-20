package homework;

// Реализуйте соответствующие интерфейсы из предыдущей задачи в классах "Человек",
// "Утка", "Пингвин" и "Самолёт".
public class Plane implements CanFly, CanRun {

  @Override
  public void fly() {
    System.out.println("Plane fly");
  }

  @Override
  public void run() {
    System.out.println("Plane run");
  }
}
