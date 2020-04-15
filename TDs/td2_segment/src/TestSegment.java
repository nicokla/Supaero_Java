
class TestSegment {
    public static void main (String[] args) {
	Point p1;
	Point p2;
	p1 = new Point(0,1);
	p2 = new Point(1,2);
	
        Segment s1;              
        s1 = new Segment(p1, p2); 
        
        s1.afficher();
        s1.translate(5,0);
        s1.afficher();

       double d = s1.length();
	System.out.println(d);

	System.out.println(s1.describe());

    } // end of main ()
}
