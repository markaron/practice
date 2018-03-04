import java.nio.file.Path;

public class Post_It {
  String backGroundColor;
  String text;
  String textColor;

  public Post_It(String backGroundColor, String text, String textColor) {
    this.backGroundColor = backGroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    Post_It myPostIt1 = new Post_It("orange", "Idea_1", "blue");
    Post_It myPostIt2 = new Post_It("pink", "Awesome", "black");
    Post_It myPostIt3 = new Post_It("yellow", "Superb", "green");

  }
}
