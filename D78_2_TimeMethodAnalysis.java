import java.util.Date;
import java.text.SimpleDateFormat;
​
public class D78_2_TimeMethodAnalysis{
  public static void main(String[] args) throws Exception{
    //之所以要抛出异常，是因为String转换为Date的时候容易报错
    //获取自1970年1月1日 00时00分00秒000毫秒到当前的毫秒数
    //1000毫秒等于一秒
    long now = System.currentTimeMillis();
    System.out.println(now);//1245839589
    //获取系统当前时间
    Date nowTime = new Date();
    System.out.println(nowTime);//Tue Jan 30 23:21:23 CST 2020
    //以上程序说明java.util.Date;已经重写了Object中的toString方法
    //只不过重写的结果对于中国人来讲不是很容易理解
    //java.util.Date;-->String
    /*
    *日期格式：
    *y  年  M  月  d  日  H  小时  m  分  s  秒  S  毫秒
    */
    //创建日期格式化对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss SSS");
    //开始格式化(Date-->String)
    String strTime = sdf.format(nowTime)//2020年01月30日  23：29：12 567
    /*
    *获取特定的日期
    */
    String strTime2 = "2008年08月8日 08：08：08 888";
    //将String日期转换为类型Date
    //String-->Date
    //1.创建日期格式化对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
    //不能随意指定格式，应该和要解析的字符串的类型格式相对应
    Date t1 = sdf.parse(strTime);
    System.out.println(t1);​
  }
}​
