import java.lang.Math;
public class Circle {
    private double radius;
    private double originX;
    private double originY;

    Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }
    Circle(double radius){
        this.radius = radius;
        this.originX = 0;
        this.originY = 0;
    }
    Circle(){
        this.radius = 1;
        this.originX = 0;
        this.originY = 0;
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if (radius >= 0) {
            this.radius = radius;
        }
    }
    public double getOriginX(){
        return this.originX;
    }

    public void setOriginX(double originX){
        this.originX = originX;
    }

    public double getOriginY(){
        return this.originY;
    }

    public void setOriginY(double originY){
        this.originY = originY;
    }

    public double getArea(){
        return 3.14159 * this.radius * this.radius;
    }

    public double getCircumference(){
        return 2 * 3.14159 * this.radius;
    }
    public void move(double dx, double dy){
        this.originX += dx;
        this.originY += dy;
    }
    public String toString(){
        return "Rectangle[x="+originX+",y="+originY+",r="+radius+"]";
    }
    public void scale(double scale){
        this.radius *= scale;
    }
    private double getDistanceFrom(Circle c){
        return Math.sqrt((this.originX - c.originX) * (this.originX - c.originX) + (this.originY - c.originY) * (this.originY - c.originY));
    }

    public boolean isOverlappedWith(Circle c){
        return this.getDistanceFrom(c) < this.radius + c.radius;
    }
    public boolean isEnclosedBy(Circle c){
        return this.getDistanceFrom(c) + this.radius <= c.radius;
    }
}
