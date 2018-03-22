package exam2;
import java.util.Scanner;

public class ArgumentHandler {
  String[] args;

  public ArgumentHandler(String[]args){
    this.args = args;
  }

  public boolean noArgs(){
    return args.length == 0;
  }

  public boolean oneArgs(){
    return args.length == 1;
  }

  public boolean isCopy() {
    return args[0].equals("copy") || args[0].equals("cp");
  }

}
