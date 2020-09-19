package lesson9;

public class Board {
    private final  String color;
    private final int square;

    public Board(String color, int square) {
        this.color = color;
        this.square = square;
    }

    @Override
    public String toString() {
        return "Board{" +
                "color='" + color + '\'' +
                ", square=" + square +
                '}';
    }
}
