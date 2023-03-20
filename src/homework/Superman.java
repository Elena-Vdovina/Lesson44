package homework;

// Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать" CanRun
// с методом run и "умеет плавать" CanSwim с методом swim и реализуйте их
// в классе "Супермен" Superman.
public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("Supermen fly");
  }

  @Override
  public void run() {
    System.out.println("Superman run");
  }
}
