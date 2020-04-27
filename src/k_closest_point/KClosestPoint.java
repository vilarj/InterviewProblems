package k_closest_point;

import java.util.Arrays;

/**
 * Points = [(-2,4), (0, -2), (-1,0), (3,-5),
 * (-2,-3), (3,2)]
 *
 * Problem: Giving these points, how would you find
 * the closest point to the origin?
 *
 * Note: Origin = (0,0)
 *
 * The K Closest Point problem asked by Amazon is
 * one of the problems related to finding the smallest
 * number in a list. By sorting it and selecting the first
 * position of the list, we are able to determine which element
 * is the smallest.
 */
public class KClosestPoint {
    private static double distance;
    private static final Plane2D ORIGIN = new Plane2D(0,0);

    /**
     * We will use the Pythagorean theorem to
     * find the distances of each line
     *
     * @param point
     * @return closest to ORIGIN
     */
    public static double PythagoreanTheorem (Plane2D point) {
        double newX = point.getX() * point.getX();
        double newY = point.getY() * point.getY();

        distance = ( Math.sqrt(newX) + Math.sqrt(newY) );

        return distance;
    }

    public static void main (String[] args) {
        double[] distance = new double[10];
        Plane2D[] point = new Plane2D[10];
        double[] x = new double[10];
        double[] y = new double[10];

        for (int i = 0; i < point.length; i++) {
            point[i] = new Plane2D(Math.round(Math.random() * 10), Math.round(Math.random() * 10));
            x[i] = point[i].getX();
            y[i] = point[i].getY();

            System.out.print(point[i] + "\n");
        }

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println("");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x" + (i+1) + " = " + x[i] + ", y" + (i+1) + " = " + y[i] + "\n");
        }
        System.out.println("");

        for (int i = 0; i < distance.length; i++) {
            distance[i] = Math.round(PythagoreanTheorem(point[i]));
            System.out.print("Point " + (i + 1) + " is: " + distance[i] + "\n");
        }

        Arrays.sort(distance);
        System.out.print("\nThe distance " + distance[0] + " is closest to " + ORIGIN);
    }
}
