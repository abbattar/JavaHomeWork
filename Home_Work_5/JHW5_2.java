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
    Path path = Paths.get("Spisok.txt");
    try {
      Map<String, String> map = new HashMap<String, String>();
      List<String> ls = Files.readAllLines(path);
      System.out.println(ls);
      String[] staffStrings = new String[2];    // [Фамилия] + [Имя]
      int[] rating = new int[ls.size()];

      for (int i = 0; i < ls.size(); i++) {
        staffStrings = ls.get(i).split(" ");
        String keyString =
            staffStrings[1]; // фамилии можно взять как уникальные ключи
        String valueString = staffStrings[0];
        map.put(keyString, valueString);
        rating[i] = 1;

        for (int j = 0; j < ls.size(); j++) {
          if (valueString.equals(ls.get(j).split(" ")[0]) && i != j) {
            rating[i]++;
          }
        }
      }
      for (int i = 0; i < ls.size(); i++) {
        for (int j = 0; j < ls.size(); j++) {
          if (i != j && map.get(ls.get(i).split(" ")[0])
                           != map.get(ls.get(j).split(" ")[0])) {
            System.out.printf("Имя %s встречается %d раз\n",
                              ls.get(i).split(" ")[0], rating[i]);
          }
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
