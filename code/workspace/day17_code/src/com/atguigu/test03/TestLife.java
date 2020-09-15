package com.atguigu.test03;

/*
 * 线程的生命周期：
 * （1）新建/出生
 * 		new好了一个线程对象，此时它和普通的Java对象并没有区别。
 * 		好比一个美女出生并慢慢长大。
 * （2）就绪
 * 		就绪状态的线程是具备被CPU调用的能力和状态，也只有这个状态的线程才能被CPU调用。
 * 		即线程调用了start()
 * 		好比这个美女被送进了宫。她此时可以被皇帝宠幸。
 * （3）运行
 * 		运行状态就是当前线程正在被CPU调度执行。
 * 		好比这个美女正在被宠幸。
 * 
 * 		运行->就绪  ①时间到②yield()
 * （4）阻塞
 * 		从运行状态到阻塞状态有几种情况：
 * 		①sleep()
 * 		②wait()
 * 		③join()
 * 		④没锁
 * 		⑤suspend()已过时
 * 		从阻塞回到就绪状态
 * 		①sleep()时间到，sleep()被打断interrupt()
 * 		②notify()
 * 		③加塞的线程结束
 * 		④占用锁的线程释放锁
 * 		⑤resume()已过时
 * 
 * （5）死亡	
 * 		从运行到死亡：①run()正常结束②run()遇到异常但是没处理③其他线程把你stop()（已过时）
 */
public class TestLife {

}