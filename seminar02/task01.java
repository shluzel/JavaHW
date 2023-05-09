import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task01 {
    public static void main(String[] args) {
                String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
                String filename = "seminar02/marks.json";
                String fileinfo = "seminar02/info.txt";
                save(jsonString, filename, false);
                StringBuilder sbJson = loadFile(filename);

                String[] marks = sbJson.toString().split("},\\{");

                for (String student : marks) {
                    student = student.replace("\"", "");
                    if (student.contains("[")) {
                        student = student.replace("[", "");
                    }
                    if (student.contains("]")) {
                        student = student.replace("]", "");
                    }
                    if (student.contains("{")) {
                        student = student.replace("{", "");
                    }
                    if (student.contains("}")) {
                        student = student.replace("}", "");
                    }

                    String[] text = student.split(",");
                    StringBuilder note = gettext(text);
                    System.out.println(note);
                    note.append("\n");
                    save(note.toString(), fileinfo, true);
        
                }
            }
        
            public static StringBuilder gettext(String[] text) {
                StringBuilder note = new StringBuilder();
                for (String record : text) {
                    String[] element = record.split(":");
                    switch (element[0]) {
                        case "фамилия" -> {
                            note.append("Студент ");
                            note.append(element[1]);
                        }
                        case "оценка" -> {
                            note.append(" получил ");
                            note.append(element[1]);
                        }
                        case "предмет" -> {
                            note.append(" по предмету ");
                            note.append(element[1]);
                            note.append(".");
                        }
                    }
                }
                return note;
            }
        
            public static void save(String text, String filename, boolean add) {
                try (FileWriter fw = new FileWriter(filename, add)) {
                    fw.write(text);
                    fw.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
    
            public static StringBuilder loadFile(String filename) {
                StringBuilder text = new StringBuilder();
                try (FileReader fr = new FileReader(filename)) {
                    int symb;
                    while ((symb = fr.read()) != -1) {
                        text.append((char) symb);
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                return text;
            }
}