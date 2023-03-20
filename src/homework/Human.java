package homework;

// Реализуйте соответствующие интерфейсы из предыдущей задачи в классах "Человек",
// "Утка", "Пингвин" и "Самолёт".
public class Human implements CanRun, CanSwim {

  @Override
  public void run() {
    System.out.println("Human run");
  }

  @Override
  public void swim() {
    System.out.println("Human swim");
  }

}
