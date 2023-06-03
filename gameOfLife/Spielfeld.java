package gameOfLife;

import java.util.Random;

public class Spielfeld {
	int zeilen=32, spalten=32;
	Random random= new Random();
	Zelle [] [] feld = new Zelle [zeilen] [spalten]; // Zeilen x Spalten groﬂes Spielfeld
	Zelle [] [] nfeld = new Zelle [zeilen] [spalten];
	
	public Spielfeld() {
		feld = new Zelle [zeilen] [spalten]; 
		nfeld = new Zelle [zeilen] [spalten]; 
	}
	
	public Spielfeld(int z, int s)
	{
		zeilen=z;
		spalten=s;
		feld = new Zelle [zeilen] [spalten]; 
		nfeld = new Zelle [zeilen] [spalten];
	}
	
	public boolean isAlive(int z, int s) {
		return feld[z][s].isAlive();
	}
	public boolean isDead(int z, int s) {
		return feld[z][s].isDead();
	}
	
	public void randomZustand() {
		for(int i=0;i<zeilen;i++) {
			for(int j=0;j<spalten;j++) {
				feld[i][j]= new Zelle();
				nfeld[i][j]=new Zelle(false);
			}
		}
	}
	
	public void printZustand() {
		for(int i=0;i<zeilen;i++) {
			for(int j=0;j<spalten;j++) {
				feld[i][j].printZustand();
			}
			System.out.println("");
		}
	}

	public void check() {
		
		for(int i=0;i<zeilen;i++) {
			
			for(int j=0;j<spalten;j++) {
				
				if(feld[i][j].isAlive()) {
					int a=0;
					
					if(i>0&&feld[i-1][j].isAlive()&&feld[i-1][j]!=null) {
						   a++;}
					if(i<(zeilen-1)&&feld[i+1][j].isAlive()&&feld[i+1][j]!=null) {
						   a++;}
					if(j>0&&feld[i][j-1].isAlive()&&feld[i][j-1]!=null) {
						   a++;}
					if(j<(spalten-1)&&feld[i][j+1].isAlive()&&feld[i][j+1]!=null) {
						   a++;}
					if(j>0&&i>0&&feld[i-1][j-1].isAlive()&&feld[i-1][j-1]!=null) {
						   a++;}
					if(i<(zeilen-1)&&j>0&&feld[i+1][j-1].isAlive()&&feld[i+1][j-1]!=null) {
						   a++;}
					if(j<(spalten-1)&&i>0&&feld[i-1][j+1].isAlive()&&feld[i-1][j+1]!=null) {
						   a++;}
					if(j<(spalten-1)&&i<(zeilen-1)&&feld[i+1][j+1].isAlive()&&feld[i+1][j+1]!=null) {
						   a++;}
					
					if(a<2 || a>3) {	//Zuviele oder zuwenige Nachbarn
						nfeld[i][j].setDead();
					}
					else {
						nfeld[i][j].setAlive();
					}
				}	
				if(feld[i][j].isDead()) {
					int a=0;
					
					if(i>0&&feld[i-1][j].isAlive()&&feld[i-1][j]!=null) {
						   a++;}
					if(i<(zeilen-1)&&feld[i+1][j].isAlive()&&feld[i+1][j]!=null) {
						   a++;}
					if(j>0&&feld[i][j-1].isAlive()&&feld[i][j-1]!=null) {
						   a++;}
					if(j<(spalten-1)&&feld[i][j+1].isAlive()&&feld[i][j+1]!=null) {
						   a++;}
					if(i>0&&j>0&&feld[i-1][j-1].isAlive()&&feld[i-1][j-1]!=null) {
						   a++;}
					if(i<(zeilen-1)&&j>0&&feld[i+1][j-1].isAlive()&&feld[i+1][j-1]!=null) {
						   a++;}
					if(j<(spalten-1)&&i>0&&feld[i-1][j+1].isAlive()&&feld[i-1][j+1]!=null) {
						   a++;}
					if(j<(spalten-1)&&i<(zeilen-1)&&feld[i+1][j+1].isAlive()&&feld[i+1][j+1]!=null) {
						   a++;}
					
					if(a==3) {
						nfeld[i][j].setAlive();
					}
					else {
						nfeld[i][j].setDead();
					}
					
				}
			}
		}
		feld=nfeld;
		
	}
}
