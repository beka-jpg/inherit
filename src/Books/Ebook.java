package Books;

public class Ebook extends Book{
    private byte fileSize;

    public Ebook(String title, String author, int pages,byte fileSize) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }

    public String download () {
        return "downloading " +  super.getTitle();
    }
}
