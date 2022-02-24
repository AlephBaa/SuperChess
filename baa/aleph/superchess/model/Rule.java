package baa.aleph.superchess.model;

public abstract class Rule {
    public static final int LEGAL = 1;
    public static final int NOT_RELATED = 0;
    public static final int ILLEGAL = -1;
    private GameState game;

    public Rule(GameState game) {
        this.game = game;
    }

    abstract int isLegal(Action action);
}
