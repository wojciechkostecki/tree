package pl.wojciechkostecki.tree;

public enum Seed {
    ANGIOSPERMS("angiosperms"),
    GYMNOSPERMS("gymnosperms");

    private String value;

    Seed(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
