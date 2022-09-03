package com.project.project;

import com.project.project.controller.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ProjectApplicationTests {
	Logger logger = LoggerFactory.getLogger(Student.class);
	@Test
	void contextLoads() {
		logger.info("test logger");
		logger.info("test logger 2");
		logger.error("error but no error1");
		logger.error("error but no error1");
		logger.error("error but no error1");
		logger.error("error but no error1");
	}

}
