import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	//variable
	double x=100;//С�������
	double y=100;//С��������
	double degree=3.14/3;// ����
	//���ڼ���
	void launchFrame()
	{
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		//�ػ����� 40ms everytime;
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
	//ͼƬ����
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image table=Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	//���ڻ���
	public void paint(Graphics gt)
	{
		gt.drawImage(table,0,0,null);
		System.out.println("���ڽ�����һ�λ滭");
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
		//���ұ߽�
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
