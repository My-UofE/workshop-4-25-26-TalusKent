// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }
  // second constructor:
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // 3nd constructor:
  public Rectangle() {
    this(1, 1, 0, 0);
  }

  public double getWidth(){
    return this.width;
  }

  public double getHeight(){
    return this.height;
  }

  public double getOriginX(){
    return this.originX;
  }

  public double getOriginY(){
    return this.originY;
  }

  public void setWidth(double width){
    if (width >= 0) {
      this.width = width;
    }
  }

  public void setHeight(double height){
    if (height >= 0) {
      this.height = height;
    }
  }

  public void setOriginX(double originX){
    this.originX = originX;
  }

  public void setOriginY(double originY){
    this.originY = originY;
  }


  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  public void scale(double scaleX, double scaleY){
    this.width *= scaleX;
    this.height *= scaleY;
  }
  public void scale(double scale){
    this.scale(scale, scale);
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }


  public boolean isOverlappedWith(Rectangle r) {
  return ((this.originX < r.originX && r.originX < this.originX + this.width) ||
          (r.originX < this.originX && this.originX < r.originX + r.width)) &&
          ((this.originY < r.originY && r.originY < this.originY + this.height) ||
                  (r.originY < this.originY && this.originY < r.originY + r.height));
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    return r1.isOverlappedWith(r2);
  }

  public double calcRatio(){
    return this.width / this.height;
  }

  public boolean isSquare(){
    double eps = 0.001;
    double ratio = this.calcRatio();
    return 1 - eps < ratio && 1 + eps > ratio;


  }

}

