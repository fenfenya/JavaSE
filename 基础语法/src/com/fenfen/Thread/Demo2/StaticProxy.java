package com.fenfen.Thread.Demo2;

//两个类都改写接口的方法
//将真实对象通过参数传进去(构造器)，代理对象从而代理真实角色
public class StaticProxy {
    public static void main(String[] args) {

        You you = new You();

        //这边用lamda表达式表示：Thread代理一个真实的Runnable接口，并且调用了start方法
        new Thread(()-> System.out.println("我爱你")).start();


        //或者精简成new WeddingCompany(new You()).HappyMarry();
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.HappyMarry();
    }
}
interface Marry{
    void HappyMarry();

}
//真实角色
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("要结婚啦");
    }
}

//代理角色，帮助
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这就是真实对象
        after();

    }

    private void after() {
        System.out.println("结婚之后，收尾款");
    }

    private void before() {
        System.out.println("结婚之前，布置现场");
    }
}
