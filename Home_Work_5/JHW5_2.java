package Home_Work_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JHW5_2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Path path = Paths.get("Spisok.txt");
        try {
            List<String> ls = Files.readAllLines(path);
            String[] staffString = new String[2];
            System.out.println(ls);
            for (String line : ls) {
                staffString = line.split(" ");
                String keyString = staffString[1];
                String valueString = staffString[0];
                map.put(keyString, valueString);
            }
            for (int i = 0; i < ls.size(); i++) {
               for (int j = 0; j < ls.size(); j++) {
                if (map.)
               }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
