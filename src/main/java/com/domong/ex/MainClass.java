package com.domong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {


		public static void main(String[] args) {
			String configLocation = "classpath:applicationCTX.xml"; //�ҷ�����
			AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); //�����ϰ�
			
			// ������ DI������� �ҷ�����(�ܺ��� ���� ���)
			StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
			studentInfo.getStudentInfo(); 
			System.out.println("============================================");
			
			// Setter DI������� �ҷ�����(�ܺ��� ���� ���)
			Student student2 = ctx.getBean("student2",Student.class);
			studentInfo.setStudent(student2);
			studentInfo.getStudentInfo();
			
			ctx.close();

	}

}
