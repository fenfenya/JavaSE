package com.fenfen.Thread.Synchronized;

public class DeadLock1 {
    public static void main(String[] args) {
        Makeup1 g1 = new Makeup1(0,"芬芬");
        Makeup1 g2 = new Makeup1(1,"静静");

        g1.start();
        g2.start();
    }
}
//口红
class LipStick1{ }

//镜子
class Mirror1{ }

class Makeup1 extends Thread{

    //staticaz是为了限制只有一份资源
    static LipStick1 lipStick1 =  new LipStick1();
    static Mirror1 mirror1 =  new Mirror1();

    //定义选择以及人名
    int choice ;
    String girlName;

    //整一个构造器
    Makeup1(int choice,String girlName){
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

            synchronized (lipStick1){//把口红锁住
                System.out.println(this.girlName+"获得口红的锁");
                Thread.sleep(1000);
                }
            synchronized (mirror1){//放到外面来就可以了
                System.out.println(this.girlName+"获得镜子的锁");
            }

        }else{

            synchronized (mirror1){//把镜子锁住
                System.out.println(this.girlName+"获得镜子的锁");

                Thread.sleep(2000);
                }
            synchronized (lipStick1){//放到外面来就可以了
                System.out.println(this.girlName+"获得口红的锁");

            }
        }
    }
}

