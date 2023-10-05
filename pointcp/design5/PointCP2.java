// Subclass for Design 2: Stores polar coordinates only
public class PointCP2 extends PointCP5 {
  private double rho;
  private double theta;

  public PointCP2(char coordType, double a, double b) {
    if (coordType == 'P') {
      this.rho = a;
      this.theta = b;
    } else if (coordType == 'C') {
      this.rho = Math.sqrt(a * a + b * b);
      this.theta = Math.toDegrees(Math.atan2(b, a));
    } else {
      throw new IllegalArgumentException("Invalid coordinate type");
    }
  }

  public double getX() {
    return Math.cos(Math.toRadians(theta)) * rho;
  }

  public double getY() {
    return Math.sin(Math.toRadians(theta)) * rho;
  }

  public double getRho() {
    return rho;
  }

  public double getTheta() {
    return theta;
  }
}
