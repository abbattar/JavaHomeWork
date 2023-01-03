package Home_Work_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class JHW5_2 {

  public static void main(String[] args) {
    Path path = Paths.get("Spisok.txt");
    try {
      Map<Integer, String> map = new HashMap<Integer, String>();
      List<String> ls = Files.readAllLines(path);
      System.out.println(ls);
      String[] staffStrings = new String[2]; // [Фамилия] + [Имя]
      int[] rating = new int[ls.size()];
      Map<String, Integer> reversMap = new HashMap<String, Integer>();

      for (int i = 0; i < ls.size(); i++) {
        staffStrings = ls.get(i).split(" ");
        String nameString = staffStrings[0]; // Нас интересуют только имена
        rating[i] = 1;

        for (int j = 0; j < ls.size(); j++) {
          if (nameString.equals(ls.get(j).split(" ")[0]) && i != j) {
            rating[i]++;
          }
          map.put(i, nameString);
          reversMap.put(nameString, rating[i]);
        }
      }
      Set<Entry<String, Integer>> entries = reversMap.entrySet();
      for (Entry<String, Integer> entry : entries) {

        System.out.println("Имя " + entry.getKey() + " встречается : " + entry.getValue() + " раз");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
