package Task_2;

public class Content {

    String content = "";

    public String getContent() {
        return content;
    }

    public boolean setContent(String content) {
        if (Author.isAlphabetic(content)) {
            this.content = content;
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println( "Content: " +
                content) ;
    }
}
