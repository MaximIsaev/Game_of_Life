package gameoflife;

public class Cell {

    public static final int CELL_SIZE = 8;
    private Location loc;
    private boolean alive;

    public Cell(Location loc, boolean alive) {
        this.loc = loc;
        this.alive = alive;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void update() {
        int x = loc.getX();
        int y = loc.getY();
        int nCells = 0;
        Cell c1 = null;
        Cell c2 = null;
        Cell c3 = null;
        Cell c4 = null;
        Cell c5 = null;
        Cell c6 = null;
        Cell c7 = null;
        Cell c8 = null;
        try {
            c1 = Game.getCellAt(x - 1, y + 1);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c2 = Game.getCellAt(x, y + 1);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c3 = Game.getCellAt(x + 1, y + 1);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c4 = Game.getCellAt(x - 1, y);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c5 = Game.getCellAt(x - 1, y - 1);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c6 = Game.getCellAt(x, y - 1);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c7 = Game.getCellAt(x + 1, y - 1);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            c8 = Game.getCellAt(x + 1, y);
        } catch (ArrayIndexOutOfBoundsException e) {

        }

//        for (int i = 0; i < 8; i++) {
        if (c1 != null) {
            nCells++;
        }
        if (c2 != null) {
            nCells++;
        }
        if (c3 != null) {
            nCells++;
        }
        if (c4 != null) {
            nCells++;
        }
        if (c5 != null) {
            nCells++;
        }
        if (c6 != null) {
            nCells++;
        }
        if (c7 != null) {
            nCells++;
        }
        if (c8 != null) {
            nCells++;
        }
//        }
        if (alive) {
            if (nCells < 2 || nCells > 3) {
                alive = false;
            }
        } else {
            if (nCells == 3) {
                alive = true;
            }

        }
    }

    public void render() {
        if (alive) {
            Game.getGraphics().fillRect(loc.getX() * CELL_SIZE, loc.getY() * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }
    }

}
