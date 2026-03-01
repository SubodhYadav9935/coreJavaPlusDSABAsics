package Chapter2.video2_13;

public class TestShape {
    public static void main(String[] args) {
        PlayerPiece p = new PlayerPiece();
        TilePiece t = new TilePiece();
        TestShape ts = new TestShape();
        ts.doShapes(t);

    }
    public void doShapes(GameShape gs){ // polymorphism because gameshape is more generic type
        gs.displayShape();
    }
}
class GameShape{
    public void displayShape(){
        System.out.println("Displaying Shape");
    }
}
class PlayerPiece extends GameShape{
    public void movePiece(){
        System.out.println("Moving Piece");
    }

}
class TilePiece extends GameShape{
    public void displayShape(){
        System.out.println("Displaying Shape of tile piece");
    }
    public void getAdjacent(){
        System.out.println("Getting adjacent tile");
    }

}
