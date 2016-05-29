import edu.princeton.cs.algs4.*;
public class Point
{
  private int num;
  private double r;
  private double mux;
  private double muy;
  public Point(int num,double mux, double muy)
  {
    this.num = num;
    this.mux = mux;
    this.muy = muy;
  }
  //Draw() 画出点的图形
  public void Draw()
  {
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    StdDraw.setPenRadius(.005);
    //
    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.point(this.mux,this.muy);

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
  public void setNum(int N)
  {
    this.num = N;
  }
  //public void Choose();


}
