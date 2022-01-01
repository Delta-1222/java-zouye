package Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Collection.Student;

import java.util.Scanner;

public class HashSetDemo {

	public static void main(String[] args) {
		// 新建HashSet
		
		Scanner input = new Scanner(System.in);
		Set<Student> students = new HashSet<Student>();
		String name,id;
		int age;
		
		while(true) {
			name = input.next();
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			id = input.next();
			age = input.nextInt();
			students.add(new Student(name, id, age));
		}
		
		File file = new File("Students.txt");
		
		try {
			OutputStreamWriter f = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student temp = (Student) it.next();
				f.append(temp.getId() + " " + temp.getName() + " " + temp.getAge() + "\n");
			}
			f.flush();
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("找不到该文件或文件不存在");
		} catch (IOException e) {
			System.out.println("输入有误");
		}
	}

}
