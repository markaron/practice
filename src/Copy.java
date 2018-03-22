import exam2.ArgumentHandler;
import exam2.ArgumentRunner;

public class Copy {
  public static void main(String[] args) {
    ArgumentHandler argumentHandler = new ArgumentHandler(args);
    ArgumentRunner argumentRunner = new ArgumentRunner();

    if(argumentHandler.noArgs()){
      argumentRunner.noArgsPrintUsage();
    } else if (argumentHandler.oneArgs()){
      argumentRunner.oneArgsPrint();
    }
  }
}
