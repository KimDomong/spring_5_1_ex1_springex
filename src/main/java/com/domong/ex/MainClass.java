package com.domong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {


		public static void main(String[] args) {
			String configLocation = "classpath:applicationCTX.xml"; //불러오고
			AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); //설정하고
			
			// 생성자 DI방식으로 불러오기(외부의 의존 방식)
			StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
			studentInfo.getStudentInfo(); 
			System.out.println("============================================");
			
			// Setter DI방식으로 불러오기(외부의 의존 방식)
			Student student2 = ctx.getBean("student2",Student.class);
			studentInfo.setStudent(student2);
			studentInfo.getStudentInfo();
			
			ctx.close();

	}

}
