package my_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import my_game.GameUtil;
import my_game.constant;


public class mygameframe extends JFrame
{
    Image bg=GameUtil.getImage("images/background.png");
    Image planes=GameUtil.getImage("images/plane3_.png");
    plane planee=new plane(planes,200,380);
    bomb shell=new bomb();
    bomb[] shells=new bomb[1];
    Explode bo;
    Date startTime=new Date();
    Date endTime;
    int period;
    @Override
    public void  paint(Graphics g)
    {
        g.drawImage(bg,0,0,null);
        planee.drawself(g);// 画飞机
        for (int i=0;i<shells.length;i++)
        {
            shells[i].draw(g);
            boolean collide=shells[i].getRect().intersects(planee.getRect());
            if(collide)
            {

                if(bo==null&& planee.live)
                {
                        planee.live=false;
                        bo = new Explode(planee.x, planee.y);
                        endTime=new Date();
                        period=(int)((endTime.getTime()-startTime.getTime())/1000);
                        bo.draw(g);
                }
              if(!planee.live)
              {
                  Font f=new Font("宋体",Font.BOLD,50);
                  g.setFont(f);
                  g.drawString("时间"+period+"秒",(int)planee.x,(int)planee.y);
              }
            }
        }

    }
    class PaintThread extends Thread
    {
        @Override
        public void run()
        {
            while(true)
            {
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 定义键盘监听的内部类
     */
    class KeyMonitor extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            planee.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            planee.minusDirection(e);
        }
    }
    /**
     * 初始化窗口
     */
    public void launchFrame()
    {
        this.setTitle("憨批作品");
        this.setVisible(true);
        this.setSize(constant.GAME_WIDTH,constant.GAME_HEIGHT);
        this.setLocation(300,300);
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        new PaintThread().start();// 启动重画窗口的线程
        addKeyListener(new KeyMonitor());//增减键盘的监听

        //初始化50个炮弹
        for(int i=0;i<shells.length;i++)
        {
            shells[i]=new bomb();
        }

    }
    public static void main(String []args)
    {
        mygameframe T=new mygameframe();
        T.launchFrame();
    }
}
