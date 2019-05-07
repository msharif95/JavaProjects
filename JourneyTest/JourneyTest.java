import abc.geometry.Point;
import abc.journey.Route;
import abc.journey.RouteLeg;

public class JourneyTest {

  public static void main(String[] args){
    
    RouteLeg legA = new RouteLeg(new Point(0,0), new Point(0,30));
    RouteLeg legB = new RouteLeg(new Point(0,30), new Point(0,60));
    RouteLeg legC = new RouteLeg(new Point(0,0), new Point(0,30), "offRoad");
    RouteLeg legD = new RouteLeg(new Point(0,30), new Point(30, 30), "offRoad");
    RouteLeg legE = new RouteLeg(new Point(30,30), new Point(5,5), "bRoad");
    RouteLeg legF = new RouteLeg(new Point(5,5), new Point(9,100), "bRoad");
    
    Route route = new Route();
    route.add(legA); 
    route.add(legB); 
    System.out.print(route);
    printTime(route, 60);
    
    System.out.println();
    Route route2 = new Route();
    route2.add(legC);
    route2.add(legD);
    route2.add(legE);
    route2.add(legF);
    System.out.print(route2);
    printTime(route2, 60); 
    
    System.out.println();
    Route route3 = new Route();
    route3.add(legA);
    route3.add(legE);
    System.out.print(route3);
    printTime(route3, 100); 
    
  }
  
  private static void printTime(Route route, int speed){
    System.out.println("the journey will take "+route.timeTaken(speed)+" hours with a standardised speed of "+speed+"mph");
  }

}