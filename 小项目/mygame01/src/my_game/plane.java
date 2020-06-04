package my_game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class plane extends GameObject
{
    boolean live=true;
    boolean left,up,right,down;
    @Override
    public void drawself(Graphics g)
    {
        if(live)
        {
            super.drawself(g);
            if(left)
            {
                x-=speed;
            }
            if(right)
            {
                x+=speed;
            }
            if(up)
            {
                y-=speed;
            }
            if(down)
            {
                y+=speed;
            }
        }
        else
        {
            /*
            nothing the plane is dead
             */
        }

    }

    public plane(Image image, double x, double y)
    {
        super(image, x, y);
        this.speed=3;
        this.width=image.getWidth(null);
        this.height=image.getHeight(null);
    }
    // 按下某个键，增加相应的方向
    public void addDirection(KeyEvent e)
    {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> left = true;
            case KeyEvent.VK_RIGHT -> right = true;
            case KeyEvent.VK_UP -> up = true;
            case KeyEvent.VK_DOWN -> down = true;
        }
    }
    // 松开某个键，取消相应的方向
    public void minusDirection(KeyEvent e)
    {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> left = false;
            case KeyEvent.VK_RIGHT -> right = false;
            case KeyEvent.VK_UP -> up = false;
            case KeyEvent.VK_DOWN -> down = false;
        }
    }
}
