package solid.lsp.after;

/**
 * @author hwang-yunho on 2020. 4. 10.
 * @project solid
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
