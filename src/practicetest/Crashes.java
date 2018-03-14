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
        if (fileContent.get(i).contains(";CLOUDY;") || fileContent.get(i).contains(";CLEAR;")) {
          goodWeather++;
        } else if (fileContent.get(i).contains(";RAIN;")) {
          badWeather++;
        } else if (fileContent.get(i).contains(";FREEZING RAIN;")) {
          badWeather++;
        } else if (fileContent.get(i).contains(";SNOW;")) {
          badWeather++;
        } else if (fileContent.get(i).contains(";FOG;")) {
          badWeather++;
        } else if (fileContent.get(i).contains(";SEVERE CROSSWINDS;")) {
          badWeather++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("The amount of crashes at good weather conditions: " + goodWeather);
    System.out.println("The amount of crashes at bad weather conditions: " + badWeather);
    System.out.println(actual);
  }
}
