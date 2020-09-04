package com.dyzwj.ext;

import com.dyzwj.bean.DeadLock;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName DeadLockMain.java
 * @Description TODO
 * @createTime 2020年07月28日 10:21:00
 */
public class DeadLockMain {
    public static void main(String[] args) {
        DeadLock deadLock= new DeadLock();
        DeadLock deadLock1 = new DeadLock();
        deadLock.flag=true;
        deadLock1.flag=false;
        Thread t1=new Thread(deadLock);
        Thread t2=new Thread(deadLock1);
        t1.start();
        t2.start();
    }

}
