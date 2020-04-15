/**
 * <code>Point</code> fait des calculs sur des points
 * 
 *
 * 
 */
class Point {

    private double coeffX;
    private double coeffY;


    /** Creer une nouvelle instance du point de 
     *  coordonnees
     *  @param coeffX_ abscisse du point
     *  @param coeffY_ ordonnee du point
     */
    public Point(double coeffX_, double coeffY_) {
        this.coeffX = coeffX_;
        this.coeffY = coeffY_;

    }


    /** Afficher les coordonnees du point
     */
    public void afficher() {
        System.out.println(this.coeffX + " ; " + this.coeffY);
    }

    /** Initialiser un Point
     *  @param coeffX_ abscisse du point
     *  @param coeffY_ ordonnee du point
     */
    public void set(double coeffX_, double coeffY_) {
        this.coeffX = coeffX_;
        this.coeffY = coeffY_;

    }

    /** La valeur de coeffX
     * @return la valeur de coeffX sous forme d'un <code>double</code>
     */
    public double getCoeffX() {
        return this.coeffX;
    }

    /** Modifier la valeur de coeffX.
     * @param coeffX_ la nouvelle valeur de coeffX
     */
    public void setCoeffX(double coeffX_) {
        this.coeffX = coeffX_;

    }

    /** La valeur de coeffY
     * @return la valeur de coeffY sous forme d'un <code>double</code>
     */
    public double getCoeffY() {
        return this.coeffY;
    }

    /** Modifier la valeur de coeffY. 
     * @param coeffY_ la nouvelle valeur de coeffY
     */
    public void setCoeffY(double coeffY_) {
        this.coeffY = coeffY_;

    }

    /** Translate le point 
     */
    public void translate(double dx, double dy) {
        this.coeffY =this.coeffY + dy;
	this.coeffX =this.coeffX  + dx;
    }

    public double distance (Point p2 ) {
    	return Math.sqrt( (this.coeffX - p2.coeffX) * (this.coeffX  - p2.coeffX) +
                           (this.coeffY - p2.coeffY) * (this.coeffY  - p2.coeffY)  );
    }


}
