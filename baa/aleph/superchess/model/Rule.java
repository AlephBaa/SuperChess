package baa.aleph.superchess.model;

public abstract class Rule {

    public static final Integer LEGAL = 1;
    public static final Integer NOT_RELATED = 0;
    public static final Integer ILLEGAL = -1;

    private Integer priority;

    public Integer getPriority() {
        return priority;
    }

    protected void setPriority(Integer priority) {
        this.priority = priority;
    }

    abstract int isLegal(Action action);
}
