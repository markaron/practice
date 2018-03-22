package exam2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArgumentRunner {
  String pathString = "first.txt";
  Path path1 = Paths.get(pathString);

  public void noArgsPrintUsage(){
    System.out.println("copy [source] [destination]");
  }

  public void oneArgsPrint(){
    System.out.println("No destination provided");
  }

  public void copy(String[] args){
    String source = args[1];
    List<String> content = new ArrayList<>(Arrays.asList(args[1]));
    String destination = args[2];
  }

  private static void readAndWriteFile(){

  }
}
