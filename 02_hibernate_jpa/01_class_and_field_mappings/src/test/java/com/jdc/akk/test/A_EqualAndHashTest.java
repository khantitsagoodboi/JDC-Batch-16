package com.jdc.akk.test;

import java.util.Objects;

import org.junit.jupiter.api.Test;

public class A_EqualAndHashTest {
	
	class Human {
		private String name;
		private int age;
		Human (String name, int age) {
			this.name = name;
			this.age = age;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(age, name);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Human other = (Human) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return age == other.age && Objects.equals(name, other.name);
		}
		private A_EqualAndHashTest getEnclosingInstance() {
			return A_EqualAndHashTest.this;
		}
		
		
	}
	
	//@Test
	void test() {
		var h1 = new Human("Andrew",20);
		var h2 = new Human("Andrew",20);
		
		System.out.println(h1.equals(h2));
		System.out.println(h1 == h2);
	}
	
	
}
