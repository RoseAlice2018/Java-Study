import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	//variable
	double x=100;//小球横坐标
	double y=100;//小球纵坐标
	double degree=3.14/3;// 弧度
	//窗口加载
	void launchFrame()
	{
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		//重画窗口 40ms everytime;
		while(true)
		{
			repaint();
			try
			{
			Thread.sleep(40);//40 ms
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
	}
	//图片加载
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image table=Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	//窗口绘制
	public void paint(Graphics gt)
	{
		gt.drawImage(table,0,0,null);
		System.out.println("窗口进行了一次绘画");
		gt.drawImage(ball,(int)x,(int)y,null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>500-40-30)
		{
			degree=-degree;
		}
		if(y<80)
		{
			degree*=-1;
		}
		//左右边界
		if(x<40||x>856-40-30)
		{
			degree=3.14-degree;
		}
		
	}
	public static void main(String[] args)
	{
		BallGame game=new BallGame();
		game.launchFrame();
		
	}
}
