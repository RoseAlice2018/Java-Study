import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {

    public Sum(){
        int a=0,b=0;
        Scanner reader=new Scanner(System.in);
        do{
            try{
                b=reader.nextInt();
            }catch(InputMismatchException e){
                reader.next();
                b=0;
            }
            a+=b;
        }while(b!=999);

        a-=999;   // 999不作为一个数字，应该减去
        System.out.println("输入整数的和为："+a);
        reader.close();
    }
    public static void main(String[] args) {
        new Sum();
    }
}