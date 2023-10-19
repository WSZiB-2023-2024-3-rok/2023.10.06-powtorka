package pl.edu.wszib.powtorka.enkapulscja;

public class Square {
    private int side;
    private int circuit;
    private int field;

    public Square(int side) {
        this.side = side;
        this.circuit = side * 4;
        this.field = side * side;
    }

    public int getSide() {
        return this.side;
    }

    public int getCircuit() {
        return this.circuit;
    }

    public int getField() {
        return this.field;
    }

    public void setSide(int side) {
        System.out.println("Naprawione !!");
        this.side = side;
        this.circuit = side * 4;
        this.field = side * side;
    }
}
