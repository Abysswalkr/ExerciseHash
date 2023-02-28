import java.util.*;

public class RandomDataExample {

    public static void main(String[] args) {
    // Generate 100 random data
        Random random = new Random();
        int[] dataArray = new int[100];
        for (int i = 0; i < 100; i++) {
            dataArray[i] = random.nextInt(1000);
        }
    }
}
