package com.fenfen.base;

//JavaDoc命令是用来生成自己的API文档的      全部的有Java的API帮助文档可以上网看
/**
 * 加在类上，也可以加在方法上
 * @author fenfen  名字
 * @version 1.0   版本
 * @since 1.8     开发java的版本
 */
public class Doc {
    String name;//类变量的属性


    /**
     *
     * @param name     参数
     * @return
     */

    /**
     * 在方法上的doc，可以自动生成
     * @auther fenfen
     * @param name
     * @return
     * @throws Exception    异常
     */
    //整一个方法，然后上面注释是写在文档上的哦
    public String test(String name) throws Exception{
        return name;

    }

    /*
    生成文档：
    ①先右击open in-exploere：
    ②用命令行cmd生成：javadoc -encoding UTF-8 -charset UTF-8 Doc.java
    ③打开index.html就是自己的文档啦啦~
    用idea生成：百度一下就有了
     */

}
