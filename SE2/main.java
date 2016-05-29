import edu.princeton.cs.algs4.*;
public class main{
/******************* MAIN ********************/
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
      po[i] = new Point(i+1,StdRandom.uniform(-1.0,1.0),StdRandom.uniform(-1.0,1.0));
    }
    //Confirm Circles;
    StdOut.println("Please input m(number of the circles):");
    m = StdIn.readInt();
    StdOut.println("m is "+ m);
    Circle []cir = new Circle[m];
    cir[0] = new Circle(1,0,0,1);
    for(int i = 1;i < m;i ++){
      cir[i] = new Circle(i+1,0,0,0);
      //confirmCir(cir,i);
    }


    for(int i = 0;i < d;i ++){
      po[i].Draw();
    }
    for(int i = 0;i < m;i ++){
      //  cir[i].Draw();
      S += Math.PI*(cir[i].getR()*cir[i].getR());
    }
    per = S/4.0;
    StdOut.println("Total are:"+ S +"\nPercent:"+ per);
    //Circle c = new Circle(z,0,0.5);
    //StdOut.println("sin(30d) is :"+z+" PI: "+ Math.PI);
/******************* confirmCir ********************/
  public static void confirmCir(Circle cir[],Point po[],m){
    

  }



}
