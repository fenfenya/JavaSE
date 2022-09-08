package com.fenfen.Thread.Synchronized.Advanced;

//测试生产者消费者问题2：信号灯法，标志位解决
public class TestPC2 {


}


//生产者--->演员
class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i%2 ==0){

            }
            
        }
    }
}

//消费者--->观众
class Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }


}

//产品--->节目
class TV {
    //演员录制，观众等待  true
    //观众观看，演员等待录制  false
    String voice;//表演的节目
    boolean flag = true;

    //录制
    public synchronized void play(String voice){
        if(flag!=true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员录制了:"+voice);
        //通知观众观看
        this.notifyAll();
        this.voice = voice;//更新了voice
        this.flag = !this.flag;//这个是取反的意思


    }

    //观看
    public synchronized void watch(){
        if(flag = true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了："+voice);

        //通知演员表演
        this.notifyAll();
        this.flag = !this.flag;//这个是取反的意思

    }
}
