import java.util.*;

/**
 * José Gramajo - 22907
 * The type Random data example.
 */
public class RandomDataExample {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Generate 100 random data
        Random random = new Random();
        int[] dataArray = new int[100];
        for (int i = 0; i < 100; i++) {
            dataArray[i] = random.nextInt(1000);
        }

        // Use HashMap to count the number of occurrences of each piece of data
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            int data = dataArray[i];
            if (hashMap.containsKey(data)) {
                int count = hashMap.get(data);
                hashMap.put(data, count + 1);
            } else {
                hashMap.put(data, 1);
            }
        }

        // Use Queue to show the data in acendent order
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            queue.offer(dataArray[i]);
        }
        System.out.println("Datos en orden de aparición: " + queue);

        // Using an array to display data in ascending order
        int[] sortedArray = Arrays.copyOf(dataArray, dataArray.length);
        Arrays.sort(sortedArray);
        System.out.println("Datos en orden ascendente: " + Arrays.toString(sortedArray));

    }
}
