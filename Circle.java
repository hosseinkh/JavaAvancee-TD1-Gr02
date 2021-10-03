/**
 * Circle
 */
//import java.util.*;

public class Circle { /* Fait attention la class point est mutable, On a besoin de ecrire le code en manière immutable. pour cela, d'abord changer les attribus de 
la class point d'etre final private, 2. changer la definition de method translate par rapport etape 1, et 3. utiliser le technique de copie défensive pour eviter des changement,
*/
    private Point p;
    private int radius;

    public Circle(){}

    public Circle(Point p,int r){
        this.p = p;
        this.radius = r;
    }
    public int getRadius(){
        return this.radius;
    }
    public Point getP(){
        return p;
    }

    public String toString(){
        String s;
        s = "Le centre du cercle est le point "+ this.p.toString() + "et a un rayon de "+ this.radius;
        return s;
    }

    public void translate(int dx, int dy){
        this.p.translate(dx, dy);
    }
    public boolean contains(Point pt){
        int a = this.p.getX(); // a et b = coordonnée du centre
        int b = this.p.getY();
        double expr1 = (pt.getX() - a)*(pt.getX() - a);
        double expr2 = (pt.getY() - b)*(pt.getY() - b);
        double expr3 = this.radius * this.radius;
        if( (expr1 + expr2) < expr3  ) {  //   (x - a)² + (y - b)² < R²
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Point p = new Point(3,5);
        Circle c = new Circle(p,7);
        c.translate(5, 2);
        System.out.println(c.toString());
    }
}



