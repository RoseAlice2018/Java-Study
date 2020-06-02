/*
为某研究所编写一个通用程序，用来计算每一种交通工具行驶1000公里所需的时间。
已知每种交通工具的参数都是3个整数A、B、C的表达式，
现有两种工具Car007和Plane，
其中Car007的速度计算公式为A*B/C，
Plane的速度计算公式为A+B+C。
需要编写三个类程序ComputeTime.java、
Plane.java、
Car007.java和一个接口程序Common.java，
要求在未来如果增加第三种交通工具的时候，
不必修改以前的任何程序，只需要编写新的交通工具的程序。
其运行过程如下，从命令行输入ComputeTime的四个参数，
第一个是交通工具的类型，第二、三、四个参数分别是整数A、B、C，
例如，计算Plane的时间“java ComputeTime Plane 20 30 40”，
计算Car007的时间“java ComputeTime Car007 23 34 45”，
如果第三种交通工具为Ship，则只需要编写Ship.java，运行时输入“java ComputeTime Ship 22 33 44”。
提示：充分利用接口的概念，接口对象作为参数。实例化一个对象的另外一种办法是“Class.forName(str).newInstance()”，
例如需要实例化一个Plane对象的话，则只需调用Class.forName(“Plane”).newInstance()。

请把程序代码和输出结果的截图提交到答案中。
 */
public class exam2
{
    public static  void main(String args[])
    {

    }
}
