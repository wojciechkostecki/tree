package pl.wojciechkostecki.tree;

public class ConiferousTree extends Tree{
    private final Leaf typeLeaf = Leaf.NEEDLE_SHAPED;
    private final Seed typeSeed = Seed.GYMNOSPERMS;
    private final boolean isDropLeaves = false;

    @Override
    public String toString() {
        return "Coniferous Tree -> " +
                "leaf type - " + typeLeaf.getValue() +
                ", seed type - " + typeSeed.getValue() +
                ", is drop leaves? - " + isDropLeaves +
                super.toString();
    }
}
