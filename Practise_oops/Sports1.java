package Practise_oops;

import java.util.Scanner;

interface Sports{
	int CalculateAvg(int [] age);
	void retirePlayer(int id);
	void transferfee(int fee,int id);
	
	
	
}
class Football implements Sports{
	int [] playerid=new int[11];
	int [] age= new int[11];

Football(int [] playerid,int [] age){
			this.playerid=playerid;
			this.age=age;
		
		System.out.println("a new football team is formed");
	}

public int CalculateAvg(int[] age) {
	int sum=0;int avg=1;
		for(int i=0;i<11;i++) {		
		sum=sum+age[i];
		}
		avg=sum/11;
		return avg;
		
	}

	public void retirePlayer(int id) {
		for(int i=0;i<11;i++) {
			if(playerid[i]==id) {
				playerid[i]=-1;
				System.out.println("player with id"+ id+"has retired.");
			}
		}
		
		
		
	}
		@Override
	public void transferfee(int fee,int id) {
		for(int i=0;i<11;i++) {
			if(playerid[i]==id) {
				if(playerid[i]==-1) {
					System.out.println("player already retired");
				}
				
			}
			else {
				System.out.println("playee with id" +id+" has been trasferred with a fees"+ fee);
			}
		}
			
	}
		
	
	@Override
	public String toString(){
		return  "the average football of the team is "+CalculateAvg(age);
		
		
	}
	
	
}

class Cricket implements Sports{
	int [] playerid=new int[11];
	int[] age= new int[11];
	
	
	Cricket(int [] playerid,int [] age){
			this.playerid=playerid;
			this.age=age;
		
		System.out.println("a new cricket team is formed");
	}
	
	public int CalculateAvg(int[] age) {
	int sum=0;int avg=1;
		for(int i=0;i<11;i++) {		
		sum=sum+age[i];
		}
		avg=sum/11;
		return avg;
		
	}
	public void retirePlayer(int id) {
		boolean found=false;
		for(int i=0;i<11;i++) {
			if(playerid[i]==id) {
				found=true;
				playerid[i]=-1;
				System.out.println("player with id"+ id+"has retired.");
			}
		}
        if (!found) {
            System.out.println("Player not found.");
        }

		
		
	}
	@Override
	public String toString(){
		return  "the average of the team is "+CalculateAvg(age);
				
		
		
	}

	@Override
	public void transferfee(int fee, int id) {
		// TODO Auto-generated method stub
		
	}	
}
 
public class Sports1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] footballids=new int[11];
		for(int i=0;i<11;i++) {
			footballids[i]=sc.nextInt();
			
		}
		int [] footballages=new int[11];
		for(int i=0;i<11;i++) {
			footballages[i]=sc.nextInt();
			
		}
	
	
	int [] cricketids=new int[11];
	for(int i=0;i<11;i++) {
		cricketids[i]=sc.nextInt();
		
	}
	int [] cricketages=new int[11];
	for(int i=0;i<11;i++) {
		cricketages[i]=sc.nextInt();
		
	}


		Football f= new Football(footballids,footballages);
		Cricket c=new Cricket(cricketids,cricketages);
		System.out.println(f);
		System.out.println(c);
		f.retirePlayer(45);
		c.transferfee(10000, 11);
	}

}
