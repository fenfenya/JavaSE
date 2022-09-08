package com.fenfen.Thread.Synchronized;

//死锁：多个线程互相持有用户对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"芬芬");
        Makeup g2 = new Makeup(1,"静静");

        g1.start();
        g2.start();
    }
}
//口红
class LipStick{ }

//镜子
class Mirror{ }

class Makeup extends Thread{

    //static是为了限制只有一份资源
    static LipStick lipStick =  new LipStick();
    static Mirror mirror =  new Mirror();

    //定义选择以及人名
    int choice ;
    String girlName;

    //整一个构造器
    Makeup(int choice,String girlName){
        this.choice = choice;
        this.girlName = girlName;

    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //写一个化妆的方法:互相持有对方的锁，即拿到对方的资源
    private void makeup() throws InterruptedException {
        if(choice==0){
            synchronized (lipStick){//把口红锁住
                System.out.println(this.girlName+"获得口红的锁");

                Thread.sleep(1000);

                synchronized (mirror){//锁中锁，自己没释放，还想去锁拿另一个的资源
                    System.out.println(this.girlName+"获得镜子的锁");
                }
            }
        }else{
            synchronized (mirror){//把镜子锁住
                System.out.println(this.girlName+"获得镜子的锁");

                Thread.sleep(2000);

                synchronized (lipStick){//锁中锁，自己没释放，还想去锁拿另一个的资源
                    System.out.println(this.girlName+"获得口红的锁");
                }
            }
        }
    }
}
