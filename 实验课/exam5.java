/*
用HashMap模拟一个网上购物车。要求：从键盘输入5本书的名称、单价、购买数量，
将这些信息存入一个HashMap，然后将该HashMap作为参数调用方法getSum(HashMap books)，该方法用于计算书的总价并返回。
 */
import  java.util.*;

class books
{
    String name;  // name of the book
    double price;  // the price of the book
    int    number;  // number of the book you buy
}
public class exam5
{
    static  double getSum(HashMap<Integer,books> books)
    {
        books b=new books();
        double Sum=0;
        for(int i=0;i<books.size();i++)
        {
            b=(books)books.get(i);
            Sum+=(b.price*b.number);
        }
        return  Sum;
    }
    public static void main(String []args)
    {
        HashMap<Integer,books> m= new HashMap<Integer, books>();
        Scanner t=new Scanner(System.in);
        System.out.println("Input the books' number");
        int n=t.nextInt();
        for(int i=0;i<n;i++)
        {
            books books=new books();
            books.name=t.next();
            books.price=t.nextDouble();
            books.number=t.nextInt();
            m.put(i,books);
        }
        double s=getSum(m);
        System.out.println("The total price of the book is"+s);
    }
}
