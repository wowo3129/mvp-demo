# mvp-demo
# 接口的回调 
 
###### 定义:
     在Java中，就是类A调用类B中的某个方法b，然后类B又在某个时候反过来调用类A中的某个方法a，对于A来说，这个a方法便叫做回调方法,b反过头来调用a的方法(回调方法)的这个行为叫作回调。

###### 补充:
      1 回调我觉得是先有方法的调用者，再有方法的实现者。其意义在于比较灵活，
      就是说方法的实现给你去做，你想怎么写这个方法 ,你说了算。这个方法只是先声明出来，这是必不可少的一步。
      你实现出来以后，后台由框架或者接口调用者来调用这个方法，得出一个直接的结果。
      2 MVP的目的主要是进行解耦，减少模块之间的直接调用。Presenter和View之间， view可以完全调用presenter，
        而presenter调用View是通过接口调用的，这就基于View经常改变（各种产品需求改动）而presenter改动比较少的情况设计的

###### //接口
pubilc interface CallBack{      
    public void callbackMethod();              
} 

###### //被回调者
public class A implements CallBack{  // A实现接口CallBack   
       
       B b = new B();   
       public void do(){   
          b.doSomething(this); // A运行时调用B中doSomething方法,以自身传入参数，B已取得A，可以随时回调A所实现的CallBack接口中的方法   
       }                      

       public void callbackMethod(){  // 对A来说，该方法就是回调方法     
           System.out.println("callbackMethod is executing!");                  
       }              

}  

###### //回调者
public class B{     

     public void doSomething(CallBack cb){  // B拥有一个参数为CallBack接口类型的方法   
       System.out.println("我在处理我的事情");   
       System.out.println("then, I need invoke callbackMethod ");   
       cb.callbackMethod(); //回调  
     }      
  
}


## 参考案例： 
##### 1 详解Android接口Interface的使用和意义 ： http://blog.csdn.net/qq_29623203/article/details/51195537
##### 2 浅谈 MVP in Android(用到了匿名回调，普通接口回调): http://blog.csdn.net/lmj623565791/article/details/46596109 //通过一个回调接口来通知登录的状态
##### 3 github 自己参考洋神写的mvp 登陆 案例：https://github.com/wowo3129/mvp-demo.git
