package String;
//represent any object to String,we can return value of object instead of hash code
public class ToString {
int Rollno;
String name,address;
ToString(int rollno,String name,String address){
	this.Rollno=rollno;
	this.name=name;
	this.address=address;
}
public String toString() {//return object into String, if we comment  the toString method it will give the hash code value
	return Rollno+" "+name+" "+address;
}
public static void main(String...args) {
	ToString s=new ToString(123,"pesi","shillong");
	ToString s1=new ToString(123,"asif","shillong");
System.out.println(s);
System.out.println(s1);

}
}
