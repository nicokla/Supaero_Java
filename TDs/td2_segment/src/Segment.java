
class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1_, Point p2_) {
        this.p1 = p1_;
        this.p2 = p2_;
    }


    public void afficher() {
	System.out.println("p1 : ");
	p1.afficher();
	System.out.println("p2 : ");
	p2.afficher();
    }

    public String describe() {
	return (  "p1 : " + p1.getCoeffX() + " ; " + p1.getCoeffY() + "\n"
	        + "p2 : " + p2.getCoeffX() + " ; " + p2.getCoeffY()
                ) ;
    }


    public void set(Point p1_, Point p2_) {
        this.p1 = p1_; 
        this.p2 = p2_;
    }

    public Point get1() {
        return this.p1;
    }

    public void set1(Point p1_) {
        this.p1 = p1_;
    }


    public Point get2() {
        return this.p2;
    }

    public void set2(Point p2_) {
        this.p2 = p2_;
    }

    public void translate(double dx, double dy) {
	p1.translate(dx,dy);
	p2.translate(dx,dy);
    }

    public double length () {
    	return p1.distance(p2);
    }

    
}
