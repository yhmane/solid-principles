package solid.lsp.before;

/**
 * @author hwang-yunho on 2020. 4. 10.
 * @project solid
 */
public class BeforeSquare extends BeforeRectangle {
    @Override
    public int getArea() {
        return width * width;
    }
}
