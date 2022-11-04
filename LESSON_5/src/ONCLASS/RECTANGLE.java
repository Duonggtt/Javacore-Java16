package ONCLASS;

public class RECTANGLE {
    int width;
    int longs;

    public void construc(int width, int longs) {
        this.width = width;
        this.longs = longs;
    }


    public int rectanglePerimeter(int width, int longs) {
        return (width + longs) * 2 ;
    }

    public int rectangleArea(int width, int longs) {
        return width * longs;
    }
}
