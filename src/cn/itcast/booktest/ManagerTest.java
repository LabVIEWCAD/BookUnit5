package cn.itcast.booktest;

import cn.itcast.domain.Employee;
import cn.itcast.domain.Manager;

public class ManagerTest {

	public static void main(String[] args) {
		//构造Manager对象
		Manager boss = new Manager("Clerk",80000,1987,12,15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("Harry",50000,1989,10,1);
		staff[2] = new Employee("Tom",40000,1990,3,15);
		
		for (Employee e : staff) {
			System.out.println("name="+e.getName()+",salary="+e.getSalary());
		}
	}

}
