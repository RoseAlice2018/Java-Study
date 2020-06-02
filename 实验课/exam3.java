/*
输入若干整数，并求和，直到结束标志999为止。在输入过程中，自动忽略掉输入的非整数。
提示：用Scanner的nextInt()方法转换输入信息到整数，如果输入信息为非整数，
方法将抛出名为InputMismatchException的异常，该异常封装在java.util包中。
请把程序代码和输出结果的截图提交到答案中。
 */
import  java.util.InputMismatchException;
import  java.util.Scanner;
public class exam3
{
    public static void sum()
    {
        int a=0,b=0;
        Scanner reader=new Scanner(System.in);
        do {
            try
            {
                b=reader.nextInt();
            }
            catch (InputMismatchException e)
            {
                reader.next();
                b=0;
            }
            a+=b;
        }while (b!=999);
        a-=999;// b==999 时 ，不应该记入内
        System.out.println("所输入的整数和为: "+a);
    }
    public  static  void main(String []args)
    {
         sum();
    }
}
