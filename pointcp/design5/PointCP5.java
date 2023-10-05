// Abstract superclass
public abstract class PointCP5 {
  public abstract double getX();
  public abstract double getY();
  public abstract double getRho();
  public abstract double getTheta();

  public double getDistance(PointCP5 pointB) {
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  public PointCP5 rotatePoint(double rotation) {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
    return new PointCP2(
      'P',
      Math.sqrt((Math.pow(X, 2) + Math.pow(Y, 2))),
      Math.toDegrees(Math.atan2(Y, X)) + rotation
    );
  }

  public String toString() {
    return "Stored as Cartesian  (" + getX() + "," + getY() + ")\nStored as Polar [" + getRho() + "," + getTheta() + "]\n";
  }
}
