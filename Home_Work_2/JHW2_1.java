package Home_Work_2;

// import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
// import org.json.simple.parser.*;
// import org.json.simple.JSONObject;
// import org.json.simple.JSONArray;


public class JHW2_1 {
    public static void main(String[] args) {
            Map<String, String> map = new LinkedHashMap<>();
            map.put("name","Ivanov");
            map.put("country","Russia");
            map.put("city","Moscow");
            map.put("age",null);
            map.put("name1","Ivanov");
            map.put("name2","Ivanov");

            System.out.println(getQuery(map));
//            JsonMethod();

        }

//        public static JSONObject JsonMethod(){
//            Object o = new JSONParser().parse(new FileReader("JSONHW2_1.json"));
//            JSONObject j = (JSONObject) o;
//            String Name = (String) j.get("name");
//            String Country = (String) j.get("country");
//            String City = (String) j.get("city");
//            String Age = (String) j.get("age");
//            if (Age == null) {
//                return null;
//            } else {
//                return j;
//            }
//        }


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
// Нашёл в интернете, не захотел импортироваться org.json.simple