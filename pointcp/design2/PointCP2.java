public class PointCP2
{
  //Instance variables ************************************************

  /**
   * Contains the current value of RHO.
   */
  private double rho;

  /**
   * Contains the current value of THETA.
   */
  private double theta;

  //Constructors ******************************************************

  /**
   * Constructs a coordinate object in Polar format.
   */
  public PointCP2(double rho, double theta)
  {
    this.rho = rho;
    this.theta = theta;
  }

  /**
   * Constructs a coordinate object, converting to Polar if necessary.
   */
  public PointCP2(char coordType, double a, double b)
  {
    if (coordType == 'C') {
      this.rho = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      this.theta = Math.toDegrees(Math.atan2(b, a));
    } else if (coordType == 'P') {
      this.rho = a;
      this.theta = b;
    } else {
      throw new IllegalArgumentException("Invalid coordinate type");
    }
  }


  //Instance methods **************************************************

  public double getX()
  {
    return (Math.cos(Math.toRadians(theta)) * rho);
  }

  public double getY()
  {
    return (Math.sin(Math.toRadians(theta)) * rho);
  }

  public double getRho()
  {
    return rho;
  }

  public double getTheta()
  {
    return theta;
  }

  /**
  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();

    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();

    // Convert rotated Cartesian back to Polar for new PointCP2
    double newRho = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    double newTheta = Math.toDegrees(Math.atan2(Y, X));

    return new PointCP2(newRho, newTheta + rotation);
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar [" + getRho() + "," + getTheta() + "]\n";
  }
}
