package ru.mirea.task4.Solution_2;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball=new Ball();
        ball.move(10,-1);
        System.out.println(ball);
        ball.setXY(0,15);
        System.out.println(ball);
        ball.setX(0);
        ball.setY(0);
        System.out.println(ball);
    }
}
