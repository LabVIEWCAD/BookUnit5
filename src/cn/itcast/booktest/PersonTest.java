package cn.itcast.booktest;

import cn.itcast.domain.Employee1;
import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[2];
		
		people[0] = new Employee1("Harry",50000,1989,10,1);
		people[1] = new Student("Marria","computer science");
		
		for (Person p : people) {
			System.out.println(p.getName()+","+p.getDescription());
		}
	}

}
