package com.fenfen.Thread.Synchronized;

//不安全的买票：票会出现-1的情况
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station,"你").start();
        new Thread(station,"我").start();
        new Thread(station,"他").start();

    }
}

class BuyTicket implements Runnable{

    //票
    private int ticketNums = 10;

    //标志位
    boolean flag = true;//外部停止方式
    @Override
    public void run() {
        //买票
      while(flag){
          try {
              buy();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }

    private void buy() throws InterruptedException {
        //判断是否邮票
        if(ticketNums<=0){
            flag = false;
            return;
        }

        //延迟一下
        Thread.sleep(100);


        System.out.println(Thread.currentThread().getName()+"拿到----->"+ticketNums--);
    }

}
