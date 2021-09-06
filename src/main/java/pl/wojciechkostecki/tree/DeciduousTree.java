package pl.wojciechkostecki.tree;

public class DeciduousTree extends Tree {
    private final Leaf typeLeaf = Leaf.BLADE;
    private final Seed typeSeed = Seed.ANGIOSPERMS;
    private final boolean isDropLeaves = true;

    @Override
    public String toString() {
        return "Deciduous Tree -> " +
                "leaf type - " + typeLeaf.getValue() +
                ", seed type - " + typeSeed.getValue() +
                ", is drop leaves? - " + isDropLeaves +
                super.toString();
    }
}
