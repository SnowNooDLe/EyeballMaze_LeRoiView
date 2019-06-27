package dos0311.ara.ac.nz.eyeball_maze_leroi_view.Model;

import android.graphics.Point;

public class Board {
    public int size;
    public String[][] map;
    private int mazeLevel;
    private Block block;
    Point[] goal = new Point[10];
    private int numberOfGoals;
    public long start;
    public long end;
    private boolean musicStatus;

    //    Constructor
//    No algorithm, so need to hard code
//    Feature 5, generate Maze
    public Board (int size) {
        this.size = size;
        this.numberOfGoals = 0;
        this.musicStatus = true;
        this.map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                block = new Block();
                this.map[row][col] = block.getBlock();
            }
        }
        this.start = System.currentTimeMillis();

    }
    //    constructor for default map size by 6x6
    public Board() {
        this.size = 6;
        this.numberOfGoals = 0;
        this.musicStatus = true;
        this.map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.map[row][col] = "X|X";
            }
        }
        this.start = System.currentTimeMillis();
    }

    //  Feature 17
    public double calculateTimer() {
        return (this.end - this.start )/1000.0;
    }
    //	Feature 1. Sound On / Off done
    public void soundOff() {
        this.musicStatus = false;
    }
    public void soundOn() {
        this.musicStatus = true;
    }

    //	Feature 18, setting certain tile as a goal
    public void setGoal(int row, int col) {
        this.goal[this.numberOfGoals] = new Point(row, col);
        this.numberOfGoals++;
    }

//    added method for android app development
    public int getGoals(){
        return this.numberOfGoals;
    }

    public void setNumOfGoals(int currentNumOfGoals){
        this.numberOfGoals = currentNumOfGoals;
    }

    //    Feature 5-1. Creating Maze
    public void stageOneBoard() {
//    	first row
        block.changeBlock("F", "R");
        map[0][3] = block.getBlock();
//    	second row
        block.changeBlock("C", "B");
        map[1][1] = block.getBlock();
        block.changeBlock("F", "Y");
        map[1][2] = block.getBlock();
        block.changeBlock("D", "Y");
        map[1][3] = block.getBlock();
        block.changeBlock("C", "G");
        map[1][4] = block.getBlock();
//    	Third row
        block.changeBlock("F", "G");
        map[2][1] = block.getBlock();
        block.changeBlock("S", "R");
        map[2][2] = block.getBlock();
        block.changeBlock("S", "G");
        map[2][3] = block.getBlock();
        block.changeBlock("D", "Y");
        map[2][4] = block.getBlock();
//    	Fourth row
        block.changeBlock("F", "R");
        map[3][1] = block.getBlock();
        block.changeBlock("F", "B");
        map[3][2] = block.getBlock();
        block.changeBlock("S", "R");
        map[3][3] = block.getBlock();
        block.changeBlock("F", "G");
        map[3][4] = block.getBlock();
//    	Fifth row
        block.changeBlock("S", "B");
        map[4][1] = block.getBlock();
        block.changeBlock("D", "R");
        map[4][2] = block.getBlock();
        block.changeBlock("F", "B");
        map[4][3] = block.getBlock();
        block.changeBlock("D", "B");
        map[4][4] = block.getBlock();
//    	Sixth row
        block.changeBlock("D", "B");
        map[5][2] = block.getBlock();
    }

    //  Feature 5-2. Creating Maze
    public void stageTwoBoard() {
//  	first row
        block.changeBlock("F", "R");
        map[0][3] = block.getBlock();
//  	second row
        block.changeBlock("C", "B");
        map[1][1] = block.getBlock();
        block.changeBlock("F", "B");
        map[1][2] = block.getBlock();
        block.changeBlock("D", "B");
        map[1][3] = block.getBlock();
        block.changeBlock("C", "G");
        map[1][4] = block.getBlock();
//  	Third row
        block.changeBlock("F", "G");
        map[2][1] = block.getBlock();
        block.changeBlock("S", "R");
        map[2][2] = block.getBlock();
        block.changeBlock("S", "G");
        map[2][3] = block.getBlock();
        block.changeBlock("F", "Y");
        map[2][4] = block.getBlock();
//  	Fourth row
        block.changeBlock("F", "R");
        map[3][1] = block.getBlock();
        block.changeBlock("D", "G");
        map[3][2] = block.getBlock();
        block.changeBlock("S", "R");
        map[3][3] = block.getBlock();
        block.changeBlock("S", "Y");
        map[3][4] = block.getBlock();
//  	Fifth row
        block.changeBlock("C", "G");
        map[4][1] = block.getBlock();
        block.changeBlock("D", "R");
        map[4][2] = block.getBlock();
        block.changeBlock("F", "B");
        map[4][3] = block.getBlock();
        block.changeBlock("D", "G");
        map[4][4] = block.getBlock();
//  	Sixth row
        block.changeBlock("D", "B");
        map[5][2] = block.getBlock();
    }

    //	Feature 3. Choose maze level attribute will come from user click later on.
    public void chooseMazeLevel(int level) {
        this.mazeLevel = level;
    }
}
