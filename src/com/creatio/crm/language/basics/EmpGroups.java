package com.creatio.crm.language.basics;

public class EmpGroups {

	public static void main(String[] args) {
		//Main method
		
		String[] Empnames= new String[3];
		//storing emp names
		
		int[] EmpData2=new int[3];
		//storing emp ids
		
		Employees obj=new Employees();
		//Obj to Retrieve the data from the Employees class
		
		Empnames[0]=obj.employeeName1;
		Empnames[1]=obj.employeeName2;
		Empnames[2]=obj.employeeName3;
		//Emp names fetched through obj from Employees class
		
	   EmpData2[0]=obj.emp1Id;
	   EmpData2[1]=obj.emp2Id;
	   EmpData2[2]=obj.emp3Id;
	 //Emp ids fetched through obj from Employees class
	   
	   System.out.println("emp name:"+Empnames[0]+","+"emp id:"+EmpData2[0]);
	   System.out.println("emp name:"+Empnames[1]+","+"emp id:"+EmpData2[1]);
	   System.out.println("emp name:"+Empnames[2]+","+"emp id:"+EmpData2[2]);
	   //Prints emp names with emp ids

	}

}
