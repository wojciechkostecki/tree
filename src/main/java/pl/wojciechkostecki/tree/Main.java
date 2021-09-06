package pl.wojciechkostecki.tree;

public class Main {

    public static void main(String[] args) {

        Trunk trunk = new Trunk();
        trunk.setHeightTrunk(440);
        trunk.setWidthTrunk(104.5);

        ConiferousTree tree = new ConiferousTree();
        tree.setAge(15);
        tree.setBreadthBranches(340);
        tree.setTrunk(trunk);

        System.out.println(tree);

        tree.grow(tree,108,450,354, 18);

        System.out.println(tree);
    }
}
