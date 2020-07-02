package chap12_9;
import java.util.Map;
import java.util.Set;

import chap12_8.AutoSaveThread;
public class ThreadEx1 {	//Thread Information Print
	public static void main(String[] args) {
		AutoSaveThread autoSave1 = new AutoSaveThread();
		autoSave1.setName("AutoSaveThread");
		autoSave1.setDaemon(true);
		autoSave1.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread trd : threads) {
			System.out.println("Name : "+trd.getName()+", "+(trd.isDaemon())
					+", 소속그룹: "+trd.getThreadGroup().getName());
		}
	}

}
