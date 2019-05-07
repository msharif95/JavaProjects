package abc.journey.Point;
import java.lang.Math;

public class Point{
   int x,y;
}
  
  public Point( int x, int y)
  
  public Point(int aY, int aX){
    x = aX;
    y = aY;
  }
  
   public double distanceTo(){
    
      int xDistance = this.x - end.x;
      int yDistance = this.y - end.y;
      return (Math.sqrt(xDistance*xDistance + yDistance*yDistance));
  }
   
  public int getX(){return x;}
  public int getY(){return y;}
  
  public String toString(){
  
    
}
}