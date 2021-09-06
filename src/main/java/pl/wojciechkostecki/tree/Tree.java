package pl.wojciechkostecki.tree;

public abstract class Tree {
    private Trunk trunk;

    private double breadthBranches;

    private int age;

    public void grow(Tree tree, double width, double height, double breadth,int age){
        tree.trunk.setWidthTrunk(width);
        tree.trunk.setHeightTrunk(height);
        tree.setBreadthBranches(breadth);
        tree.setAge(age);
    };

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public double getBreadthBranches() {
        return breadthBranches;
    }

    public void setBreadthBranches(double breadthBranches) {
        this.breadthBranches = breadthBranches;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return trunk +
                ", breadthBranches: " + breadthBranches + "cm" +
                ", age: " + age + " years";
    }
}
