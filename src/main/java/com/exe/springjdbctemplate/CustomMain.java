package com.exe.springjdbctemplate;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.exe.springjdbctemplate.CustomDAO2;

public class CustomMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");

		CustomDAO2 dao2 = (CustomDAO2) context.getBean("customDAO2");

		CustomDTO dto;

//		// insert
//		dto = new CustomDTO();
//		dto.setId(222);
//		dto.setName("�����");
//		dto.setAge(25);
//
//		dao2.insertData(dto);
//
//		System.out.println("insert ������");
		
//		// insert (named)
		dto = new CustomDTO();
		dto.setId(333);
		dto.setName("������");
		dto.setAge(9);

		dao2.insertData(dto);

		System.out.println("insert ������");

		// List ���
		
		 List<CustomDTO> lists = dao2.getLists();
		 
		 for(CustomDTO dto1 : lists) { System.out.printf("%d %s %d\n",
		 dto1.getId(),dto1.getName(),dto1.getAge()); }
		 System.out.println("select �Ϸ� !");
		 

		// �ϳ��� ���
		
//		  dto =dao2.getReadData(111); if(dto != null) { System.out.printf("%d %s %d\n",
//		  dto.getId(),dto.getName(),dto.getAge());
//		  
//		  }
		 

		// ������Ʈ
		
//		  dto = new CustomDTO(); dto.setId(111); dto.setName("�ڼ���"); dto.setAge(26);
//		  
//		  dao2.update(dto);
//		  
//		  System.out.println("������Ʈ �Ϸ� !! ");
//		  
//		  List<CustomDTO> lists = dao2.getLists();
//		  
//		  for (CustomDTO dto1 : lists) { System.out.printf("%d %s %d\n", dto1.getId(),
//		  dto1.getName(), dto1.getAge()); } System.out.println("select �Ϸ� !");
		 

		// ����
		
//		  dao2.deleteData(111); System.out.println("�����Ϸ� ! "); System.out.println();
//		  List<CustomDTO> lists = dao2.getLists();
//		  
//		  for (CustomDTO dto1 : lists) { System.out.printf("%d %s %d\n", dto1.getId(),
//		  dto1.getName(), dto1.getAge()); } System.out.println("select �Ϸ� !");
		 

	}

}
