package Home_Work_2;

import java.util.logging.Logger;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
//import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.logging.Level;

// import java.io.File;
// import java.io.FileWriter;

public class JHW2_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i]);
        }

        int[] sortedArray = Bubble(array);
        for (int item : sortedArray) {
            System.out.printf("%d ", item);
        }
    }

    public static int[] Bubble(int[] array) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(JHW2_2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        int currentPosition;
        int maxPosition;
        int temp;
        int switchCount = 0;
        int compareCount = 0;
        long time = System.nanoTime();

        for (maxPosition=array.length - 1; maxPosition >= 0;maxPosition--)	{
            for (currentPosition = 0; currentPosition < maxPosition; currentPosition++) {
                compareCount++;
                if (array[currentPosition] > array[currentPosition+1]) {
                    temp = array[currentPosition];
                    array[currentPosition] = array[currentPosition+1];
                    array[currentPosition+1] = temp;
                    switchCount++;
                    logger.addHandler(fh);
                }
            }
        }
    time = System.nanoTime() - time;
    return array;
}
    public static boolean validate(int[] array, int[] sortedArray) {
        if (Arrays.equals(array, sortedArray)) {
            return false;
        }
        return true;
    }
}