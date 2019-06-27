package dos0311.ara.ac.nz.eyeball_maze_leroi_view.Model;

public class Block {
    private String shape;
    private String color;
    //	Constructor for Block
    public Block(String newShape, String newColor) {
        this.shape = newShape;
        this.color = newColor;
    }
    //	if attributes aren't given, default will be X which means it doesn't have any shape neither color hence can't go
    public Block() {
        this.shape = "X";
        this.color = "X";
    }
    //	Feature 7, generate tile with certain shape
    public void setShape(String certainShape) {
        this.shape = certainShape.toUpperCase();
    }

    //	Feature 8, coloring that shape.
    public void setColor(String certainColour) {
        this.color = certainColour.toUpperCase();
    }
    //	if you want to change both shape and color
    public void changeBlock(String newShape, String newColor) {
        this.setShape(newShape);
        this.setColor(newColor);
    }


    //	will be used to define into each cells in Board, also for setting up for goal.
    public String getBlock() {
        String newBlock = this.shape + "|" + this.color;
        return newBlock;
    }
}
