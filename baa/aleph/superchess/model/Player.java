package baa.aleph.superchess.model;

public abstract class Player {
    private String color;
    private String name;
    private boolean playing;
    private boolean myTurn;

    public Player(String color, String name, boolean playing, boolean myTurn) {
        this.color = color;
        this.name = name;
        this.playing = playing;
        this.myTurn = myTurn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isMyTurn() {
        return myTurn;
    }

    public void setMyTurn(boolean myTurn) {
        this.myTurn = myTurn;
    }
}
