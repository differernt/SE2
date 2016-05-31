import edu.princeton.cs.algs4.*;
public class main{
  /******************* MAIN ************************************************/
  public static void main(String[] args) {
    int m , d;
    double S = 0.0;//面积
    double per;//占正方形的百分比
    //Input the Points;
    StdOut.println("Please input d(number of the points):");
    d = StdIn.readInt();
    StdOut.println("The number of the points d is "+ d);
    Point []po = new Point[d];
    //po[0] = new Point(1,0,0);
    for(int i = 0;i < d;i ++){
      // po[0] = new Point(1,0,0);
      // po[1] = new Point(2,0,0.5);
      // po[2] = new Point(3,0.5,0.5);
      //po[i] = new Point(i+1,(i-4)/10.0,(i-4)*(i-4)/100.0);
      po[i] = new Point(i+1,StdRandom.uniform(-1.0,1.0),StdRandom.uniform(-1.0,1.0));
    }

    //Confirm Circles;
    StdOut.println("Please input m(number of the circles):");
    m = StdIn.readInt();
    StdOut.println("m is "+ m);
    Circle []cir = new Circle[m];
    //cir[0] = new Circle(1,0,0,1);
    for(int i = 0;i < m;i ++){
      cir[i] = new Circle(i+1,0,0,0);
      confirmCir(cir,po,i,d);
    }


    for(int i = 0;i < m;i ++){
      cir[i].Draw();
      S += Math.PI*(cir[i].getR()*cir[i].getR());
    }
    for(int i = 0;i < d;i ++){
      po[i].Draw();
    }
    per = S/4.0;
    StdOut.println("Total are:"+ S +"\nPercent:"+ per);
  }
  /******************* Set Value *******************************************/
  public static void setCircle(Circle cir[],int m,double X,double Y,double R){
    cir[m].setX(X);
    cir[m].setY(Y);
    cir[m].setR(R);
  }
  /******************* JUDGE if OK *****************************************/
  public static boolean judge(Circle cir[],Point po[],int m,int d){
    final double DELTA = 0.0000000001;
    //StdOut.println("DELTA: " +DELTA);
    for(int i = 0; i < m; i ++){
      if(cir[m].Distance(cir[i]) - cir[m].getR() - cir[i].getR()  < -DELTA){
        //StdOut.println("one circle: " +cir[m].Distance(po[i]));
        return false;
      }
    }
    for(int i = 0;i < d; i ++){
      if( cir[m].Distance(po[i]) - cir[m].getR() < -DELTA ) {
        //StdOut.println("one point: " +cir[m].Distance(po[i]));
        return false;
      }
    }

    if(cir[m].getX() + cir[m].getR() > 1||cir[m].getX() - cir[m].getR() < -1
     ||cir[m].getY() + cir[m].getR() > 1||cir[m].getY() - cir[m].getR() < -1
    ) {
      return false;
    }
    return true;
  }
  /******************* confirmCir ******************************************/
  public static void confirmCir(Circle cir[],Point po[],int m,int d){
    //THE LARGEST VALUE
    double X = 0.0, Y = 0.0, R = 0.0;
    //The last value
    double x, y, r;
/* PART 1 (Three points)****************/
    double a1,b1,c1,a2,b2,c2,x1,x2,x3,y1,y2,y3;
    for(int i = 0;i < d;i ++){
      for(int j = 0;j < d;j ++){
        for(int k = 0;k < d;k ++){
          if(i == j || i == k || j == k) continue;
          x1 = po[i].getX();x2 = po[j].getX();x3 = po[k].getX();
          y1 = po[i].getY();y2 = po[j].getY();y3 = po[k].getY();
          a1 = 2*(x2 - x1);
          b1 = 2*(y2 - y1);
          c1 = x2*x2 + y2*y2 - x1*x1 - y1*y1;
          a2 = 2*(x3 - x2);
          b2 = 2*(y3 - y2);
          c2 = x3*x3 + y3*y3 - x2*x2 - y2*y2;
          x = ((c1*b2) - (c2*b1)) / ((a1*b2) - (a2*b1));
          y = ((a1*c2) - (a2*c1)) / ((a1*b2) - (a2*b1));
          r = Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1));
          setCircle(cir,m,x,y,r);
          if(judge(cir,po,m,d) && r > R){//flag == true
            X = x;
            Y = y;
            R = r;
          }
        }
      }
    }
/* PART 2 (Two points and One line)*****/
    for(int i = 0;i < d;i ++){
      for(int j = 0;j < d;j ++){
        x1 = po[i].getX();x2 = po[j].getX();
        y1 = po[i].getY();y2 = po[j].getY();
      }
    }

    //Change Value
    setCircle(cir, m, X, Y, R);
  }
}
