package pl.wojciechkostecki.tree;

public enum Seed {
    ANGIOSPERMS("ANGIOSPERMS"),
    GYMNOSPERMS("GYMNOSPERMS");

    private String value;

    Seed(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
