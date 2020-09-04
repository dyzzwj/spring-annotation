package com.dyzwj.bean;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName DeadLock.java
 * @Description TODO
 * @createTime 2020年07月28日 10:19:00
 */
public class DeadLock implements Runnable{

    public static ZhangSan zs=new ZhangSan();
    public static LiSi liSi=new LiSi();
    public boolean flag=false;

    @Override
    public void run() {
        if(flag){
            synchronized (zs){
                zs.say();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (liSi){
                    zs.get();
                }
            }
        }else{
            synchronized (liSi){
                liSi.say();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zs){
                    liSi.get();
                }
            }
        }
    }

}
