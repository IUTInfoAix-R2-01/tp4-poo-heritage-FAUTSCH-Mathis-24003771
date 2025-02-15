package tp3exosyaip6.ex6dot5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
