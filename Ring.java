public class Ring extends Circle{
    private int outerRadius;

    public Ring(){}

    public Ring(Point p, int r, int or){
        super(p,r);
        if (r < or){
            this.outerRadius = or;
        }
        else{
            System.out.println("Impossible"); 
        }
        
    }
    public int getOuterRadius(){
        return this.outerRadius;
    }
  // @Override
    public boolean equals(Ring ring){
        if (this.getP().isSameAs(ring.getP()) && this.getRadius() == ring.getRadius() && this.getOuterRadius() == ring.getOuterRadius()){
            return true;
        }
        return false;
    }
    public String toString(){
        String s;
        s= super.toString() + " et la valeur du rayon externe est " + this.outerRadius;
        return s;
    }
    public boolean contains(Point p){
        return super.contains(p);
    }
    
    public static void main(String[] args) {
        Point p = new Point(1,9);
        Ring r = new Ring(p,2,5);
        System.out.println(r);
        
    }
}
