import java.awt.Color;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(139, 69, 19);

    Tree(double heightFt, double trunkDiameterInches,
         TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

static void announceTree(){
        System.out.println("Look at this "+Tree.TRUNK_COLOR+" tree!");
    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " +
                    this.treeType + " tree!");
        }
    }
}
