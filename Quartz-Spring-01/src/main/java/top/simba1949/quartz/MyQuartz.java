package top.simba1949.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个执行的任务类，实现 org.quartz.Job 接口，即可可执行任务类
 */
@Component
public class MyQuartz implements Job {
    private Logger logger = LoggerFactory.getLogger(MyQuartz.class);

    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("the project will start");
        logger.info("Welcome to Spring_Quartz World!" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        logger.info("\n \n ");
    }
}
