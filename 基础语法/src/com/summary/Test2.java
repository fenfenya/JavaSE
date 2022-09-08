package com.summary;

public class Test2 {

}

class BuyTicket implements Runnable{

    private int ticketNums = 10;

    boolean flag = true;

    @Override
    public void run() {
        while (flag){
            buy();
        }

    }


    private void buy(){
        if(ticketNums<=0){
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+ticketNums--);
    }
}

