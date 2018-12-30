package cn.itcast.booktest;

import cn.itcast.domain.Employee;
import cn.itcast.domain.Manager;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee alice1 = new Employee("Alice",75000,1987,12,15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice",75000,1987,12,15);
		Employee Bob = new Employee("Bob",50000,1989,10,1);
		
		System.out.println("alice1==alice2:"+(alice1==alice2));
		System.out.println("alice1==alice3:"+(alice1==alice3));
		System.out.println("alice1.equals(alice3):"+(alice1.equals(alice3)));
		System.out.println("alice1.equals(Bob):"+(alice1.equals(Bob)));
		System.out.println("Bob.toString()"+Bob);
		
		Manager Carl = new Manager("Carl",80000,1987,12,15);
		Manager boss = new Manager("Carl",80000,1987,12,15);
		boss.setBonus(5000);
		System.out.println("boss.toString():"+boss);
		System.out.println("Carl.equals(boss):"+Carl.equals(boss));
		System.out.println("alice1.hashCode():"+alice1.hashCode());
		System.out.println("alice3.hashCode():"+alice3.hashCode());
		System.out.println("Bob.hashCode():"+Bob.hashCode());
		System.out.println("Carl.hashCode():"+Carl.hashCode());
	}

}
