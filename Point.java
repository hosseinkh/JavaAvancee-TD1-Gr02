public class Point{
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point (){} // constructeur par défaut

    public Point(Point p2){ // constructeur par copie
        this.x = p2.x;
        this.y = p2.y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public boolean isSameAs(Point p){
        if (this.x==p.x && this.y == p.y){
            return true;
        }
        return false;
    }

    public void translate(int dx, int dy){
        this.x = dx;
        this.y = dy;
    }
    public String toString(){
        String s;
        s = "("+this.x +" , "+ this.y+" )";
        return s;
    } 

    public static void main(String[] args){

    Point p=new Point();
    System.out.println(p.x+" "+p.y); 

    // Exo 3 Q1 
    Point p1=new Point(1,2); 
    Point p2=p1;
    Point p3=new Point(1,2);

    System.out.println(p1==p2);
    System.out.println(p1==p3); 
    } 
 
}
