package Home_Work_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class JHW2_3 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("фамилия","Иванов");
        map.put("оценка","5");
        map.put("предмет","математика");

        System.out.println(getQuery(map));

        map.put("фамилия","Петрова");
        map.put("оценка","4");
        map.put("предмет","информатика");

        System.out.println(getQuery(map));

        map.put("фамилия","Краснов");
        map.put("оценка","5");
        map.put("предмет","физика");

        System.out.println(getQuery(map));
}
        public static String getQuery(Map<String, String> params) {
            StringBuilder result = new StringBuilder();
            if (params == null || params.isEmpty())
                return result.toString();

            for (Map.Entry<String, String> pair : params.entrySet()) {
                if (pair.getKey() == null || pair.getValue() == null)
                    continue;
                result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
            }

            if (result.length() > 5)
                result.delete(result.length() - 5, result.length());

            return result.toString();
        }
}

