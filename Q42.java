package assignment4;

/*Q42 ::
 * Create a class Tile to store the edge length of a square tile, 
 * and create another class Floor to store length and width of a 
 * rectangular floor. Add method totalTiles(Tile t) in Floor class 
 * with Tile as argument to calculate the whole number of tiles 
 * needed to cover the floor completely.
 */

class Tile {
    private float edgeLength;
    
    Tile(){}
    
    Tile(float edgeLength){
        this.edgeLength=edgeLength;
    }
    
    public float getLength(){
        return edgeLength;
    }
}

class Floor extends Tile{
    private float length;
    private float width;

    Floor(){}
     Floor(float length,float width){
        this.length=length;
        this.width=width;
    }

    public void totalTiles(Tile t){
         float areaTile = t.getLength() * t.getLength();
     //   int areaTile = super.edgeLength; // Error
        float areaFloor = length*width;
         float total = areaFloor/areaTile;
        System.out.println(total);
    }
}


public class Q42{
    public static void main(String args[]){
    	// TODO Auto-generated method stub
        Floor f =new Floor(6f,4f);
        Tile t =new Tile(4f);
        f.totalTiles(t);
    }
}
