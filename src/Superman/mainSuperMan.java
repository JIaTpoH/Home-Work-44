package Superman;

import static Superman.CanRun.SPEED;

public class mainSuperMan {
  public static void main(String[] args) {
    Superman testSuperman = new Superman();
    testSuperman.run(null, SPEED);
    testSuperman.fly(null);
    testSuperman.swim(null);
  }
}
