package ExtraFunctions;

public abstract class PolygonShape {
    protected int[] xPoints;
    protected int[] yPoints;
    protected int nPoints;

    public PolygonShape(int n) {
        this.nPoints = n;
        xPoints = new int[n];
        yPoints = new int[n];
    }

    public abstract void calculateProperties();
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getAngle(int i);
    public abstract double getLength(int i);

    public int getNumPoints() { return nPoints; }
    public int getX(int i) { return xPoints[i]; }
    public int getY(int i) { return yPoints[i]; }
    public int[] getXs() { return xPoints; }
    public int[] getYs() { return yPoints; }

    public void setVertex(int i, int x, int y) {
        xPoints[i] = x;
        yPoints[i] = y;
        calculateProperties(); 
    }

    public void setCoordinates(int[] x, int[] y) {
        this.xPoints = x;
        this.yPoints = y;
        calculateProperties();
    }
    
    public int getMidX(int i) { return (xPoints[i] + xPoints[(i + 1) % nPoints]) / 2; }
    public int getMidY(int i) { return (yPoints[i] + yPoints[(i + 1) % nPoints]) / 2; }
}