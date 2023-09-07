package week5.day2;

public class LearnThis {
  String name="Ann"; 
  int id;
  
  public LearnThis() {
	  this(10,"Testleaf");
	  System.out.println("Default Constructor");//3rd
  }
  
  public LearnThis(String name) {
	  System.out.println("one parameter Constructor");//1st
  }
  
  public LearnThis(int id,String name) {
	  this("Ann");
	  System.out.println("Two parameter Constructor");//2nd
 
  }
  
  
  public ConstructorChaining studentName( String name) {
	this.name=name;
	  System.out.println(name);
	  return new ConstructorChaining ();
	
}
  public void studentId(int id) {
	this.id=id;
	
}
	public void studentDetail() {
		this.studentName(name);
		this.studentId(id);
	}
	

	public static void main(String[] args) {
		LearnThis obj=new LearnThis();
		obj.studentName("Dan");

	}	

}
