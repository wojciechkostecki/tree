package pl.wojciechkostecki.tree;

public class Main {

    public static void main(String[] args) {

        Trunk trunk = new Trunk();
        trunk.setHeightTrunk(440);
        trunk.setWidthTrunk(104.5);

        ConiferousTree tree = new ConiferousTree();
        tree.setAge(15);
        tree.setBreadthBranches(234);
        tree.setTrunk(trunk);

        System.out.println(tree);

        tree.grow(tree,108,450,254, 18);

        System.out.println(tree);

        DeciduousTree deciduousTree = new DeciduousTree();
        deciduousTree.setAge(12);
        deciduousTree.setBreadthBranches(331);
        deciduousTree.setTrunk(trunk);

        System.out.println(deciduousTree);

        deciduousTree.grow(deciduousTree,110,447,387,21);

        System.out.println(deciduousTree);
    }
}
