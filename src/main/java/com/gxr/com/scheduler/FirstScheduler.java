package com.gxr.com.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("first")
public class FirstScheduler {

	/*@Scheduled(cron="0/10 * * * * ?")
	@RequestMapping("task")
	public void aTask(){
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		System.out.println("20s-----------aTask："+sdf.format(new Date())+"");
	}*/
}
