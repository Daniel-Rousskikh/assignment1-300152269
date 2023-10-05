import java.io.*;

public class PointCPTest {
    public static void main(String[] args) {
        System.out.println("Cartesian-Polar Coordinates Conversion Test Program");

        long testStartTime, testEndTime, startTime, endTime;
        int n = 10000000;  // Number of iterations for each method

        /*try {
          Class.forName("PointCP");
          System.out.println("\nTesting for PointCP (Design 1)...");

          // Measure time for creating random instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            if (Math.random() > 0.5) {
              new PointCP('C', Math.random(), Math.random());
            } else {
              new PointCP('P', Math.random(), Math.random());
            }
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating random instances: " + (endTime - startTime) + " ms");

          // Cartesian coordinates instance
          PointCP pointCartesian = new PointCP('C', 1.0, 1.0);
          // Polar coordinates instance
          PointCP pointPolar = new PointCP('P', 1.0, 1.0);

          // Measure time for creating Cartesian instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian = new PointCP('C', Math.random(), Math.random());
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating Cartesian instances: " + (endTime - startTime) + " ms");

          // Measure time for creating Polar instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar = new PointCP('P', Math.random(), Math.random());
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating Polar instances: " + (endTime - startTime) + " ms");

          // Cartesian Coordinates Testing
          System.out.println("\nTesting with Cartesian Coordinates:");

          // getX
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getX();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getX method: " + (endTime - startTime) + " ms");

          // getY
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getY();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getY method: " + (endTime - startTime) + " ms");

          // getRho
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getRho();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getRho method: " + (endTime - startTime) + " ms");

          // getTheta
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getTheta();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getTheta method: " + (endTime - startTime) + " ms");

          // getDistance
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getDistance(pointPolar);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getDistance method: " + (endTime - startTime) + " ms");

          // rotatePoint
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.rotatePoint(45);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for rotatePoint method: " + (endTime - startTime) + " ms");

          // Polar Coordinates Testing
          System.out.println("\nTesting with Polar Coordinates:");

          // getX
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getX();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getX method: " + (endTime - startTime) + " ms");

          // getY
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getY();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getY method: " + (endTime - startTime) + " ms");

          // getRho
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getRho();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getRho method: " + (endTime - startTime) + " ms");

          // getTheta
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getTheta();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getTheta method: " + (endTime - startTime) + " ms");

          // getDistance
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getDistance(pointCartesian);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getDistance method: " + (endTime - startTime) + " ms");

          // rotatePoint
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.rotatePoint(45);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for rotatePoint method: " + (endTime - startTime) + " ms");

        } catch (ClassNotFoundException e) {
          System.out.println("PointCP (Design 1) class is not available.");
        }*/

        // Test for PointCP2 design (Design 2)
        try {
          Class.forName("PointCP2");
          System.out.println("\nTesting for PointCP2 (Design 2)...");
          testStartTime = System.currentTimeMillis();

          // Measure time for creating random instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            if (Math.random() > 0.5) {
              new PointCP2('C', Math.random(), Math.random());
            } else {
              new PointCP2('P', Math.random(), Math.random());
            }
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating random instances: " + (endTime - startTime) + " ms");

          // Cartesian coordinates instance
          PointCP2 pointCartesian = new PointCP2('C', 1.0, 1.0);
          // Polar coordinates instance
          PointCP2 pointPolar = new PointCP2('P', 1.0, 1.0);

          // Measure time for creating Cartesian instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian = new PointCP2('C', Math.random(), Math.random());
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating Cartesian instances: " + (endTime - startTime) + " ms");

          // Measure time for creating Polar instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar = new PointCP2('P', Math.random(), Math.random());
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating Polar instances: " + (endTime - startTime) + " ms");

          // Cartesian Coordinates Testing
          System.out.println("\nTesting with Cartesian Coordinates:");

          // getX
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getX();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getX method: " + (endTime - startTime) + " ms");

          // getY
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getY();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getY method: " + (endTime - startTime) + " ms");

          // getRho
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getRho();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getRho method: " + (endTime - startTime) + " ms");

          // getTheta
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getTheta();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getTheta method: " + (endTime - startTime) + " ms");

          // getDistance
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getDistance(pointPolar);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getDistance method: " + (endTime - startTime) + " ms");

          // rotatePoint
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.rotatePoint(45);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for rotatePoint method: " + (endTime - startTime) + " ms");

          // Polar Coordinates Testing
          System.out.println("\nTesting with Polar Coordinates:");

          // getX
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getX();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getX method: " + (endTime - startTime) + " ms");

          // getY
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getY();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getY method: " + (endTime - startTime) + " ms");

          // getRho
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getRho();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getRho method: " + (endTime - startTime) + " ms");

          // getTheta
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getTheta();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getTheta method: " + (endTime - startTime) + " ms");

          // getDistance
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getDistance(pointCartesian);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getDistance method: " + (endTime - startTime) + " ms");

          // rotatePoint
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.rotatePoint(45);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for rotatePoint method: " + (endTime - startTime) + " ms");

          testEndTime = System.currentTimeMillis();

          System.out.println("\n\nTime for test to complete: " + (testEndTime - testStartTime) + " ms\n\n");

        } catch (ClassNotFoundException e) {
          System.out.println("PointCP2 (Design 2) class is not available.");
        }

        // Test for PointCP3 design (Design 3)
        try {
          Class.forName("PointCP3");
          System.out.println("\nTesting for PointCP3 (Design 3)...");

          testStartTime = System.currentTimeMillis();

          // Measure time for creating random instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            if (Math.random() > 0.5) {
              new PointCP3('C', Math.random(), Math.random());
            } else {
              new PointCP3('P', Math.random(), Math.random());
            }
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating random instances: " + (endTime - startTime) + " ms");

          // Cartesian coordinates instance
          PointCP3 pointCartesian = new PointCP3('C', 1.0, 1.0);
          // Polar coordinates instance
          PointCP3 pointPolar = new PointCP3('P', 1.0, 1.0);

          // Measure time for creating Cartesian instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian = new PointCP3('C', Math.random(), Math.random());
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating Cartesian instances: " + (endTime - startTime) + " ms");

          // Measure time for creating Polar instances
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar = new PointCP3('P', Math.random(), Math.random());
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for creating Polar instances: " + (endTime - startTime) + " ms");

          // Cartesian Coordinates Testing
          System.out.println("\nTesting with Cartesian Coordinates:");

          // getX
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getX();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getX method: " + (endTime - startTime) + " ms");

          // getY
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getY();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getY method: " + (endTime - startTime) + " ms");

          // getRho
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getRho();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getRho method: " + (endTime - startTime) + " ms");

          // getTheta
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getTheta();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getTheta method: " + (endTime - startTime) + " ms");

          // getDistance
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.getDistance(pointPolar);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getDistance method: " + (endTime - startTime) + " ms");

          // rotatePoint
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointCartesian.rotatePoint(45);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for rotatePoint method: " + (endTime - startTime) + " ms");

          // Polar Coordinates Testing
          System.out.println("\nTesting with Polar Coordinates:");

          // getX
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getX();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getX method: " + (endTime - startTime) + " ms");

          // getY
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getY();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getY method: " + (endTime - startTime) + " ms");

          // getRho
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getRho();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getRho method: " + (endTime - startTime) + " ms");

          // getTheta
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getTheta();
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getTheta method: " + (endTime - startTime) + " ms");

          // getDistance
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.getDistance(pointCartesian);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for getDistance method: " + (endTime - startTime) + " ms");

          // rotatePoint
          startTime = System.currentTimeMillis();
          for (int i = 0; i < n; i++) {
            pointPolar.rotatePoint(45);
          }
          endTime = System.currentTimeMillis();
          System.out.println("Time for rotatePoint method: " + (endTime - startTime) + " ms");


          testEndTime = System.currentTimeMillis();

          System.out.println("\n\nTime for test to complete: " + (testEndTime - testStartTime) + " ms\n\n");

        } catch (ClassNotFoundException e) {
          System.out.println("PointCP3 (Design 3) class is not available.");
        }
    }
}
