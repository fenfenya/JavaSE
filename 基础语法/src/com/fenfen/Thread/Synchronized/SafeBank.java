package com.fenfen.Thread.Synchronized;

public class SafeBank {
    public static void main(String[] args) {
        Account1 account1 = new Account1(500,"积蓄");

        Drawing1 you = new Drawing1(account1,50,"你" );
        Drawing1 boyfriend = new Drawing1(account1,100,"boyfriend" );

        you.start();
        boyfriend.start();
    }
}

//账户
class Account1{
    int money;//余额
    String name;//卡名

    public Account1(int money, String name) {
        this.money = money;
        this.name = name;
    }
}


//银行:模拟取款
class Drawing1 extends Thread{

    Account1 account1;//账户
    //要去多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    //构造器
    public Drawing1(Account1 account1,int drawingMoney,String name){
        super(name);//调用父类的有参构造，是线程的名字
        this.account1 = account1;
        this.drawingMoney = drawingMoney;

    }

    //重写方法
    @Override
    public void run() {
        synchronized (account1) {//锁这个对象，是根据代码中针对哪一些进行了增删改查
            //判断下有没有钱呢
            if (account1.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够你取了");
                return;
            }

            //延迟下呀,放大线程不安全的发生性
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //余额=上次余额-取的钱
            account1.money = account1.money - drawingMoney;
            //你手里的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account1.name + "余额为：" + account1.money);
            //Thread.currentThread().getName() = this.getName()原因是：继承了Thread的全部方法，因此可以调用this
            System.out.println(this.getName() + "手里钱为：" + nowMoney);
        }
    }
}