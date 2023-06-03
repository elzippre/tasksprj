package gameOfLife;

import java.util.Random;

public class Zelle {
	
	boolean zustand; // True lebt, false tot
	Random random= new Random();
	
	public Zelle() {
		zustand=random.nextBoolean();
	}
	
	public Zelle(boolean z) {
		zustand=z;
		
	}
	
	public boolean getZustand() {
		return zustand;
	}
	
	public void printZustand() {
		
		if(zustand) {
			System.out.print("A ");
		}
		else {
			System.out.print("O ");
		}
	}
	
	public boolean isAlive() {
		return zustand;
	}
	public boolean isDead() {
		return !zustand;
	}
	public void setZustand(boolean z)
	{
		zustand=z;
	}
	public void setDead()
	{
		zustand=false;
	}
	public void setAlive()
	{
		zustand=true;
	}
}
