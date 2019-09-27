package com.pluralsight.optionals;

import java.util.Optional;

class Skeleton{
	String name;
	int id;
	@Override
	public String toString() {
		return "Skeleton [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class OptionalWithCustomObj {
	public static void main(String[] args) {
		Skeleton skeleton = new Skeleton();
		skeleton.setId(1);
		Skeleton skeleton2 = new Skeleton();
		skeleton2.setId(2);
		skeleton2.setName("Debasish");
		
		Optional<Skeleton> sOptional = Optional.ofNullable(skeleton);
		Optional<Skeleton> sOptional2 = Optional.ofNullable(skeleton2);
		
		System.out.println("*****Skeleton1*****");
		sOptional.ifPresent(System.out::print);
		
		//System.out.println(sOptional.get().getName().toUpperCase());
		
		
	}
}
