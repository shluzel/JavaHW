import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("seminar02/marks.json"))) {
            String marks;
            while ((marks = br.readLine()) != null) {
                sb.append(marks);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map <String, String> map = new HashMap<>();

        String[] keys = sb.toString().replace("{", "").
                replace("[", "").
                replace("]", "").
                replace("\"", "").
                replaceAll("\\s", "").
                split("},");

        for (String marks : keys) {
            String[] person = marks.split(",");
            for (String keyValues : person) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                map.put(key, value);
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
                    map.get("оценка"), map.get("предмет"));
        }
    }
}