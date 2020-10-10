package spring.shapes.model;

public class Rectangler implements Shape {
    private int width;
    private int height;
    private char symbol;

    private String rectangleString;

    public Rectangler(int width, int height, char symbol) {
        this.width = width;
        this.height = height;
        this.symbol = symbol;

        rectangleString = initStringRectangle(width, height);
    }

    private String initStringRectangle(int width, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                builder.append(symbol);
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public void draw() {
        System.out.print(rectangleString);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Rectangler{" +
                "width=" + width +
                ", height=" + height +
                ", symbol=" + symbol +
                '}';
    }
}