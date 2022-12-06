package week_8_hw_2;

import java.util.Calendar;
import java.util.Random;

public class Process_2 {
	public void Run() throws InterruptedException{
		Calendar calendar = Calendar.getInstance();
		
		for(int i=0; true; i++) {
			calendar = Calendar.getInstance();
			
			if(calendar.get(Calendar.MINUTE)==0&&calendar.get(Calendar.SECOND)==0&&new Random().nextInt(100) >= 50) {
				System.out.println(calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH)+" "+calendar.get(Calendar.HOUR_OF_DAY)+"시 정각입니다!");
			}
			else if(i%10==0) {
				System.out.println(calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH)+" "+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)+":"+calendar.get(Calendar.MILLISECOND));
			}
			
			Thread.sleep(1000);
		}
	}
	
}
