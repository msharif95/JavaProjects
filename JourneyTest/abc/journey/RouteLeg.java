//package abc.journey.RouteLeg;
//import abc.geometry.Point;
//import java.util.Point;
public class RouteLeg{
   
   
   Point start;
   Point end;
   String terrain;
   int time = 60;
   int speed;
   
   public RouteLeg(Point start,Point end){
      
      this.terrain = mainRoad;

   }
   
   public RouteLeg(Point start,Point end,String terraintype){
   //if statement to calculate speed [mainRoad 1.3x than bRoad, bRoad 0.2x than offRoad]
      
      if(terrain.equals("offRoad")){
         return 0;
         
      } else if (terrain.equals("bRoad")){
         
         return 0.2;
         
      }else {
         
         return 1.3;
      }
   }
   
  
   public double getDistance(){
      
      return x.distanceTo.(y);
   }
   
}