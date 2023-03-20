package Superman;

// Напишите интерфейсы
// "Умеет летать" CanFly с методом fly(),
// "Умеет бегать" CanRun с методом run
// "умеет плавать" CanSwim с методом swim
//  реализуйте их в классе "Супермен" Superman.
// Реализуйте соответствующие интерфейсы из предыдущей задачи в классах
// "Человек", "Утка", "Пингвин" и "Самолёт".
public class Superman implements CanFly, CanRun, CanSwim {
  String message;

  public Superman() {
    message = "I can run";
  }

  @Override
  public void fly(String message) {
    System.out.println("I can to fly");

  }

  @Override
  public void run(String message, Integer speed) {
    System.out.println("I can to run " + speed + " Kmh");

  }

  @Override
  public void swim(String message) {
    System.out.println("I can to swim");
  }
}
