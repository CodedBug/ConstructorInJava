package example4;

import java.util.Scanner;
class PerEmp extends Employee1 {
 	protected String depart;
	protected String post;
	protected float bsal;
	
	public PerEmp() {
	}
	
	public PerEmp(String depart,String post,float bsal){
	
	this.depart = depart;
	this.post = post;
	this.bsal = bsal;
	}
	public String getDepartment(){
		return depart;
	}
	
	public void setDesignation(String post){
		this.post=post;
	}
	
	public float getBsal(){
		return bsal;	
	}
	
	public void setBsal(float bsal){
		this.bsal=bsal;
	}
		
	public void acceptData(){
	Scanner a = new Scanner (System.in);
	System.out.println("enter employee department:");	
	depart = a.nextLine();
	System.out.println("enter employee designation:");	
	post = a.nextLine();
	System.out.println("enter employee basic salary:");
	bsal= a.nextFloat();
	}

	public void showData() {
		super.showData();
		System.out.println("Department "+depart);
		System.out.println("Designation "+post);
		System.out.println("basic salary "+bsal);
	}
	
	public static void main(String args[]) {
		PerEmp p1=new PerEmp();
		p1.acceptData();
		p1.showData();
	}
}