import  java.util.*;
import  java.math.*;
class point
{
    private  int x;// means the value of x axis
    private  int y;// means the value of y axis
    public  point(int _x,int _y)
    {
       this.x=_x;
       this.y=_y;
    }
    public  int getX()
    {
        return  this.x;
    }
    public  int getY()
    {
        return  this.y;
    }
}
class  triangle
{
    private  double area;
    private  point A;
    private  point B;
    private  point C;
    public  triangle (point A,point B,point C)
    {
        this.A=A;
        this.B=B;
        this.C=C;
    }
    private  void calculate()
    {
        /*
        S=(x1y2-x1y3+x2y3-x2y1+x3y1-x2y2)
         */
        area=(A.getX()*B.getY()-A.getX()*C.getY()+B.getX()*C.getY()-B.getX()*A.getY()+C.getX()*A.getY()-B.getX()*B.getY())/2.0;
    }
    public  double getArea()
    {
        calculate();
        return  area;
    }


}
/*
    设计Point 类并用此类构建一个三角形类（Triangle），编程求三角形的面积。

    请把程序代码和输出结果的截图提交到答案中。
 */
public class exam1
{
    public  static  void main(String args[])
    {
        point A=new point(0,0);
        point B=new point(1,0);
        point C=new point(0,2);
        triangle test=new triangle(A,B,C);
        System.out.println("this is the area of the triangle");
        System.out.print(test.getArea());
    }
}
