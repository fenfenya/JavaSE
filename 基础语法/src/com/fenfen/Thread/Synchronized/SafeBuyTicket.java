package com.fenfen.Thread.Synchronized;

public class SafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket1 station = new BuyTicket1();

        new Thread(station,"你").start();
        new Thread(station,"我").start();
        new Thread(station,"他").start();

    }
}

class BuyTicket1 implements Runnable{

    //票
    private int ticketNums = 10;

    //标志位
    boolean flag = true;//外部停止方式
    @Override
    public void run() {
        //买票
        while(flag){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            buy();

            }

    }

    //
    private synchronized void buy(){
        //判断是否邮票
        if(ticketNums<=0){
            flag = false;
            return;
        }

        //延迟一下
        //Thread.sleep(1000);//注意这边，sleep不会释放锁，一个线程拿到锁就会一直执行，于是把sleep放在run方法里


        System.out.println(Thread.currentThread().getName()+"拿到----->"+ticketNums--);
    }

}
