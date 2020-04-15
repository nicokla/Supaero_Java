import java.util.*;

class Polygone {

    private ArrayList<Point> listePoints;
    
    //@ requires size(this.listePoints)>2 
   
    public Polygone( ArrayList<Point> listePoints_) {
        this.listePoints = listePoints_ ;
    }


    public String toString() {
	String s = new String("");
        for( Point p : this.listePoints ) {
		s = s + p.getCoeffX() +";"+ p.getCoeffY() + "\n";
	}
	return (s) ;
    }

    public void afficher() {
	System.out.println(this.toString());
    }


	//@ requires i<=n && i>=0
    public void add (int i, Point p) {
	this.listePoints.add(i, p);
    }

	//@ requires i<=n-1 && i>=0
    public void del (int i) {
	this.listePoints.remove(i);
    }

    public void translate(double dx, double dy) {
	for( Point p : this.listePoints ) {
		p.translate(dx,dy);
	}
    }

    //@ ensures d>=0 
    public double perimetre () {
	double d = 0.;
	int n = this.listePoints.size();
	for(int i=0 ; i < n - 1 ; i++) {
		d = d + this.listePoints.get(i).distance( this.listePoints.get(i+1) );
	}
	d = d + this.listePoints.get(0).distance( this.listePoints.get(n-1) );
    	return d;
    }

    
    public int nbPoints () {
    	return ( this.listePoints.size() );
    }


    //@ ensure  aire()>=0
    public double aire () {
	int n = this.listePoints.size();
	double a = 0. ;
	double aireTriangle = 0. ;
	double vx , vy , wx , wy;

	vx = this.listePoints.get(1).getCoeffX()  - this.listePoints.get(0).getCoeffX();
	vy = this.listePoints.get(1).getCoeffX()  - this.listePoints.get(0).getCoeffX();
	wx = this.listePoints.get(2).getCoeffX()  - this.listePoints.get(0).getCoeffX();
	wy = this.listePoints.get(2).getCoeffY()  - this.listePoints.get(0).getCoeffY();

    	for(int i = 1; i < n - 1; i ++ ) {
		aireTriangle = 1/2 * ( vx*wy - vy*wx );

		a = a + aireTriangle;

		vx = wx;
		vy = wy;
		wx = this.listePoints.get(i+2).getCoeffX()  - this.listePoints.get(0).getCoeffX();
		wy = this.listePoints.get(i+2).getCoeffY()  - this.listePoints.get(0).getCoeffY();
	}
	
	return java.lang.Math.abs(a);
    }
}






