public class BlogPost {
  private String authorname;
  private String title;
  private String text;
  private String publicationDate;

  public static void main(String[] args) {
    BlogPost blogPost01 = new BlogPost();
    blogPost01.authorname = "Jhon Doe";
    blogPost01.title = "Lorem Ipsum";
    blogPost01.text ="Lorem ipsum dolor sit amet.";
    blogPost01.publicationDate="2000.05.04.";

    BlogPost blogPost02 = new BlogPost();
    blogPost02.authorname="Tim Urban";
    blogPost02.title="Wait but why";
    blogPost02.text ="A popular long-form, stick-figure-illustrated blog about almost everything.";
    blogPost02.publicationDate="2010.10.10.";
  }


}
