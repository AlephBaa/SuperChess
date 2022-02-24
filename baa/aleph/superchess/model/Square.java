package baa.aleph.superchess.model;

public abstract class Square {
    private int x;
    private int y;
    private Peice peice;

    public Square(int x, int y, Peice peice) {
        this.x = x;
        this.y = y;
        this.peice = peice;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Peice getPeice() {
        return peice;
    }

    public void setPeice(Peice peice) {
        this.peice = peice;
    }
}
