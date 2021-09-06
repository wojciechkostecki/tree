package pl.wojciechkostecki.tree;

public enum Leaf {
    NEEDLE_SHAPED("NEEDLE"),
    BLADE("BLADE");

    private String value;

    Leaf(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
