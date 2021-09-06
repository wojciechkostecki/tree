package pl.wojciechkostecki.tree;

public abstract class Tree {
    private Trunk trunk;

    private double breadthBranches;

    private Leaf typeLeaves;

    private int age;

    private Seed typeSeed;

    private boolean isDropLeaves;

    public abstract void grow();
}
