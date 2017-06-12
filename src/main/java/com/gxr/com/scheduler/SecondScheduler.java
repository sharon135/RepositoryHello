package com.gxr.com.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("second")
public class SecondScheduler {

	/*@Scheduled(cron="0/5 * * * * ?")
	@RequestMapping("task")
	public void bTask(){
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		System.out.println("**5s***********bTask："+sdf.format(new Date())+"");
	}*/
}
