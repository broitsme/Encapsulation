package OopsConcepts.Encapsulation;

import java.util.Date;

public class Person {
    public String name;
    final private Date dob;
    private String address;
    private String education[];
    final private long empId;
    private int age;

    Person(String name, String address, String[] education, int empId, Date dob) {
        this.name = name;
        this.dob = dob;
        this.empId = empId;
        this.age = calAge();
    }
    
    public String getAddress(){
	System.out.println(address);
    }
	
    public boolean setAddress(String address){
	this.address = address;
	return true;	
    }

    public boolean addEdu(String newEdu){
	String eduArr[] = new String[education.length+1];
	for(int i = 0; i < this.education.length; i++){
		eduArr[i] = this.education[i];
	}
	eduArr[eduArr.length-1] = newEdu;
	this.education = eduArr;
	return true;  
    }

    public String getEdu(){
	for(String edu : education){
		System.out.println(edu);
	}
    }

    public int calAge() {
        //calculalation process, age = currentDate - dob; 
	return age;
    }

    public void wakeUp() {
        System.out.println("int 5 minutes. *clicks snooze*.\n *clicks snooze*.\n getting out of bed.");
    }

    public void workOut() {
        System.out.println("putting Sport's shoes on.");
    }

    public void Sleep() {
        System.out.println("setting up alarm.\n sleeping...");
    }

    public void gotoWork() {
        System.out.println("get ready! and book a cab for office.");
    }
}
