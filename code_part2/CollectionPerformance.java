import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class CollectionPerformance {
    public static void main(String[] args) {
        int size = 100000000;
        Random rand = new Random();

        // Experiment (a) - Construction Time
        long start, end;

        // ArrayList
        start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(rand.nextInt(10));
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList construction time: " + (end - start) + " ms");

        // Vector
        start = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<>(size);
        for (int i = 0; i < size; i++) {
            vector.add(rand.nextInt(10));
        }
        end = System.currentTimeMillis();
        System.out.println("Vector construction time: " + (end - start) + " ms");

        // Array
        start = System.currentTimeMillis();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10);
        }
        end = System.currentTimeMillis();
        System.out.println("Array construction time: " + (end - start) + " ms");


        // Experiment (b) - Iteration Time
        int sum;

        // ArrayList
        start = System.currentTimeMillis();
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        sum = 0;
        while (arrayListIterator.hasNext()) {
            sum += arrayListIterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList iteration time: " + (end - start) + " ms");

        // Vector
        start = System.currentTimeMillis();
        Iterator<Integer> vectorIterator = vector.iterator();
        sum = 0;
        while (vectorIterator.hasNext()) {
            sum += vectorIterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("Vector iteration time: " + (end - start) + " ms");

        // Array
        start = System.currentTimeMillis();
        sum = 0;
        for (int i : array) {
            sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Array iteration time: " + (end - start) + " ms");
    }
}

