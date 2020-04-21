package code_class_file;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;  //这是一个抽象类

public class D111_1_Timer {
	public static void main(String[] args) throws Exception {
		//创建定时器
		Timer t = new Timer();
		
		
		//指定定时任务
		t.schedule(new LogTimerTask(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-04-21 23:51:00 000"), 10*1000);
	}
}
//指定任务
class LogTimerTask extends TimerTask{
	public void run() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}
