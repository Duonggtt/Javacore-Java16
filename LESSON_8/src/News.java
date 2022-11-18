public class News implements INews {

        private String title;
        private String author;
        private String pulicDate;
        private double rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPulicDate() {
        return pulicDate;
    }

    public void setPulicDate(String pulicDate) {
        this.pulicDate = pulicDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void display() {
        System.out.println(title);
        System.out.println(author );
        System.out.println(pulicDate );
        System.out.println(rate );
    }
}
