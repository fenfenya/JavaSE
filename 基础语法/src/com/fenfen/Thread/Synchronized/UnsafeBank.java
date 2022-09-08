package com.fenfen.Thread.Synchronized;

//不安全的取钱
//两个人去银行取钱，账户
public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"积蓄");

        Drawing you = new Drawing(account,50,"你" );
        Drawing boyfriend = new Drawing(account,100,"boyfriend" );

        you.start();
        boyfriend.start();
    }
}

//账户
class Account{
    int money;//余额
    String name;//卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}


//银行:模拟取款
class Drawing extends Thread{

    Account account;//账户
    //要去多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    //构造器
    public Drawing(Account account,int drawingMoney,String name){
        super(name);//调用父类的有参构造，是线程的名字
        this.account = account;
        this.drawingMoney = drawingMoney;

    }

    //重写方法
    @Override
    public void run() {
        //判断下有没有钱呢
        if(account.money-drawingMoney<0){
            System.out.println(Thread.currentThread().getName()+"钱不够你取了");
            return;
        }

        //延迟下呀,放大线程不安全的发生性
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //余额=上次余额-取的钱
        account.money = account.money-drawingMoney;
        //你手里的钱
        nowMoney = nowMoney +drawingMoney;

        System.out.println(account.name+"余额为："+account.money);
        //Thread.currentThread().getName() = this.getName()原因是：继承了Thread的全部方法，因此可以调用this
        System.out.println(this.getName()+"手里钱为："+nowMoney);
    }
}
