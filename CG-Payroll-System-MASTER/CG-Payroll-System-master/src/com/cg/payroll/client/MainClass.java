package com.cg.payroll.client;
import java.util.Scanner;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {
	public static void main(String[] args) throws AssociateDetailsNotFoundException {
		Scanner sc=new Scanner(System.in);
		PayrollServices services=new PayrollServicesImpl();
		int associateId=services.acceptAssociateDetails("Vrinda","Munjal","Analyst","Staff","ABT21JJ7", "vmunjal1@gmail.com", 150000, 125468965,"Hdfc","fttg",50000,2000,5000);
		System.out.println("Associate Id: "+associateId);
		int associateId1=services.acceptAssociateDetails("Ram","Ahuja","Analyst","Staff","HGF12GH3","ram@gmail.com",160000, 245146655,"Hdfc","fttg",40000,2000,4000);
		System.out.println("Associate Id: "+associateId1);
		
	System.out.println("enter the employee Id you want to search");
	int num=sc.nextInt();
	System.out.println(services.getAssociateDetails(num));
	System.out.println(services.getAllAssociateDetails());
	double  netSalary=services.calculateNetSalary(num);	
	System.out.println("the netsalary is ="+netSalary);
	double grossSalary=services.calculateAnnualGrossSalary(num);
	System.out.println("the gross salary is= "+grossSalary);
	
	}
}