package example4;

import java.util.Scanner;
class Employee1{
	protected int code;
	protected String name;
	
	public Employee1() {
	}
	
	public Employee1(int code,String name) {
 		this.code = code;
		this.name = name;
	}
	
	public int getCode(){
		return code;
	}
	
	public void setCode(int code){
		this.code = code;
	}
		
	public String getName(){
 		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public void acceptData(){
		Scanner a = new Scanner (System.in);
		System.out.println("enter employee code:");
		code = a.nextInt();
		System.out.println("enter employee name");
		name = a. nextLine();
	}
	
	public void showData(){
		System.out.println("employee code:"+code);
		System.out.println("employee name:"+name);
		}
	}