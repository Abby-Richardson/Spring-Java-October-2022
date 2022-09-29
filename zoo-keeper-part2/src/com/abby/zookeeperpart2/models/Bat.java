package com.abby.zookeeperpart2.models;

public class Bat extends Mammal{
	int batEnergyLevel = setEnergyLevel(300);

	
	public Bat() {
		super();
	}
		
	
//	methods
	public int fly() {
		int currentEnergy = getEnergyLevel() -50;
		setEnergyLevel(currentEnergy);
		System.out.println("**Wings flapping, flying away**");
		return currentEnergy;
		
	}
	
	public int eatHumans() {
		int currentEnergy = getEnergyLevel() +25;
		setEnergyLevel(currentEnergy);
		System.out.println("Yummm");
		return currentEnergy;
	}
	
	public int attackTown() {
		int currentEnergy = getEnergyLevel() -100;
		setEnergyLevel(currentEnergy);
		System.out.println("**Setting the town to flames**");
		return currentEnergy;
	}



}
