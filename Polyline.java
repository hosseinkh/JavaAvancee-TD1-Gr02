//import java.util.*;

public class Polyline {
    Point[] tableau ;
    private int nbPointMax;

    public Polyline(int nb){
        this.nbPointMax = nb;
        tableau = new Point[nbPointMax];
    }

    public void add(Point p)throws Exception{
        int i = 0;
        boolean ajout = false;
        while (i < this.tableau.length || ajout){
            if (this.tableau[i]==null){
                this.tableau[i]= p;
            }
        }
        throw new Exception("Le nombre de point maximal est atteint pour cet objet");
    }
    public int pointCapacity(){ //return the maximum capacity of the polyline 
        return this.nbPointMax;
    }
    public int nbPoints(){ //  the number points currently in the polyline.
        int nbPoint = 0;
        int i=0;
        while (i < this.tableau.length || this.tableau[i] instanceof Point){
            nbPoint += 1;
        }
        return nbPoint;
    }  
    
    public boolean contains(Point p){ 
        for (Point point : tableau) {
            if(point.equals(p)){
                return true;
            }
        }   
        return false;     

    }
    
  
    public static void main(String[] args) {
     //   Polyline p1 = new Polyline(4);
  
    }


}
