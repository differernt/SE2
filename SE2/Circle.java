import edu.princeton.cs.algs4.*;
public class Circle
{
  private int num;
  private double r;
  private double mux;
  private double muy;
  public Circle(int num,double mux, double muy, double r)
  {
    this.num = num;
    this.r = r;
    this.mux = mux;
    this.muy = muy;
  }
  //Draw() 画出圆的图形
  public void Draw()
  {
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    StdDraw.setPenRadius(.005);
    //
    StdDraw.setPenColor(StdDraw.GREEN);
    StdDraw.filledCircle(this.mux,this.muy,this.r);

    //StdDraw.clear();
  }


  //getters
  public double getX()
  {
    return this.mux;
  }
  public double getY()
  {
    return this.muy;
  }
  public double getR()
  {
    return this.r;
    }
  public int getNum()
  {
    return this.num;
  }
  //setters*********************
  public void setX(double x)
  {
    this.mux = x;
  }
  public void setY(double y)
  {
    this.muy = y;
  }
  public void setR(double R)
  {
    this.r = R;
  }
  public void setNum(int N)
  {
    this.num = N;
  }
  //public void Choose();


}
