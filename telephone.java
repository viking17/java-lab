package telephone;

import java.util.*;

class phone{
	String number = new String();
	String name = new String();
	int key = 0;
	
	public phone(int n , String num, String nam)
	{
		number = num;
		key = n;
		name = nam;
	}
}

class missedPhone{
	String name= new String();
	String number = new String();
	String time = new String();
	
	missedPhone(String nam, String n, String t)
	{
		name = nam;
		number = n;
		time = t;
	}
	
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("number"+number);
		System.out.println("time : "+time);
	}
}

public class telephone {
	public static void main(String[] args)
	{
		int count = 0;
		ArrayList<phone> p = new ArrayList<>();
		ArrayList<missedPhone> m = new ArrayList<>();
		
		p.add(new phone(1,"123","vik3"));
		p.add(new phone(2,"124","vik2"));
		p.add(new phone(3,"125","vik"));
		p.add(new phone(4,"126","private"));
		p.add(new phone(5,"127","private"));
		
		
		Scanner in = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		
		
		while(true)
		{
			System.out.println("enter 1 to add, 2 to log, 3 to delete and 4 to exit.");
			int n = in.nextInt();
			switch(n)
			{
				case 1:
				if(count > 10)
				{
					m.remove(0);
					count--;
				}
				else
				{

					int h = c.get(Calendar.HOUR);
					int min = c.get(Calendar.MINUTE);
					int s = c.get(Calendar.SECOND);
					String time = h+":"+min+":"+s;
					
					Random ran = new Random();
					int num1 = ran.nextInt(5);
					phone ph = p.get(num1);
					
					m.add(new missedPhone(ph.name,ph.number,time));
					count++;
					
				}
				break;
				
				
				case 2 :for(int i = 0; i < m.size(); i++){
					missedPhone m1 = m.get(i);
					System.out.println("name : "+m1.name);
					System.out.println("number"+m1.number);
					System.out.println("time : "+m1.time);
						
						System.out.println("enter 1 to move to next and 2 to delte and move.");
						int ch = in.nextInt();
						switch(ch)
						{
						case 1:continue;
						
						case 2 :m.remove(i);
						count--;
						i--;
						continue;
						
						}
				}
				break;
				
				case 3:System.out.println("enter phone number to delete.");
						String s = in.next();
						
						for(int i = 0 ; i < m.size();i++)
						{
							missedPhone m2 = m.get(i);
							if(m2.number.equals(s))
							{
								m.remove(i);
								count--;
							}
						}
						break;
						
				case 4:System.exit(0);
			}
		}
		
	}
}
