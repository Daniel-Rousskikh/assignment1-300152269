// Subclass for Design 3: Stores Cartesian coordinates only
public class PointCP3 extends PointCP5 {
  private double x;
  private double y;

  public PointCP3(char coordType, double a, double b) {
    if (coordType == 'C') {
      this.x = a;
      this.y = b;
    } else if (coordType == 'P') {
      this.x = Math.cos(Math.toRadians(b)) * a;
      this.y = Math.sin(Math.toRadians(b)) * a;
    } else {
      throw new IllegalArgumentException("Invalid coordinate type");
    }
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getRho() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

  public double getTheta() {
    return Math.toDegrees(Math.atan2(y, x));
  }
}
