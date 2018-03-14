package practicetest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Crashes {
  public static void main(String[] args) {
    countCrashesByWeather();
  }

  public static void countCrashesByWeather() {
    String fileName = "crashes.csv";
    Path crashesFile = Paths.get(fileName);
    int goodWeather = 0;
    int badWeather = 0;
    try {
      List<String> fileContent = Files.readAllLines(crashesFile);

      for (int i = 0; i < fileContent.size(); i++) {
        String line = fileContent.get(i);
        String[] lineIndex = line.split(";");

        if (lineIndex[5].equals("CLOUDY") || lineIndex[5].equals("CLEAR")) {
          goodWeather++;
        } else if (lineIndex[5].equals("RAIN")) {
          badWeather++;
        } else if (lineIndex[5].equals("FREEZING RAIN")) {
          badWeather++;
        } else if (lineIndex[5].equals("SNOW")) {
          badWeather++;
        } else if (lineIndex[5].equals("FOG")) {
          badWeather++;
        } else if (lineIndex[5].equals("SEVERE CROSSWINDS")) {
          badWeather++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("The amount of crashes at good weather conditions: " + goodWeather);
    System.out.println("The amount of crashes at bad weather conditions: " + badWeather);
  }
}
