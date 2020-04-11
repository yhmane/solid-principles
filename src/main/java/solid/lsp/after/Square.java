package solid.lsp.after;

/**
 * @author hwang-yunho on 2020. 4. 10.
 * @project solid
 */
public class Square extends Shape{

    private int width;
    private int height;

    public Square(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public int getArea() {
        return width * width;
    }
}
