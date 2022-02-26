package baa.aleph.superchess.model;

public abstract class Rule {

    protected Integer priority;

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }

    abstract Legality isLegal(Action action);

    public enum Legality {
        LEGAL,
        NOT_RELATED,
        ILLEGAL
    }
}
