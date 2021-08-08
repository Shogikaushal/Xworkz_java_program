package com.java.inheritance.HierarchicalInheritance;

public class ExampleOfHierarchle {

	public static void main(String[] args) {
		EducationMinister educationminister = new EducationMinister();
		FoodMinister foodminister= new FoodMinister();
		HomeMinister homeminister= new HomeMinister();
		
		educationminister.responsibility();
		educationminister.work();
		foodminister.responsibility();
		foodminister.work();
		homeminister.responsibility();
		homeminister.work();
		

	}

}
