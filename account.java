/* Create a class called account with the data members(Accno – integer, name String,
Phone_No: integer, balance_amt:float), and following methods :
a. getinput() to get input from the user
b. Deposit() method which takes the amount to be deposited in to his/her account
and do the calculation.
c. Withdraw() method which gets the amount to be withdrawn from his/her account.
Print the appropriate results. */




import java.util.*;

class acc {
	int acc_no = 0;
	String name = "";
	String phone = "";
	float bal = 0;

	public void getinput()
	{
		Scanner in = new Scanner(System.in);
		acc_no = in.nextInt();
		name = in.next();
		phone = in.next();
		bal = in.nextFloat();
	}

	public void deposit(int amount)
	{
		bal += amount;
	}

	public void withdraw(int amount)
	{
		bal -= amount;
	}

	public void display()
	{
		System.out.println("acc_no : "+acc_no);
		System.out.println("name : "+name);
		System.out.println("phone : "+phone);
		System.out.println("balance : "+bal);

	}

}

public class account{
	public static void main(String[] args)
	{
		HashMap<Integer, acc> hmap = new HashMap<>();

		System.out.println("enter 1 for new account, 2 for deposit, 3 for withdrawn, 4 to display and 5 to exit.");
		int n ;

		Scanner x = new Scanner(System.in);
		

		boolean next = true;

		while(next == true)
		{
			n = x.nextInt();
			int num = 0;
			float amount = 0;
			switch(n)
			{
				case 1 :acc a = new acc();
						a.getinput();
						hmap.put(a.acc_no, a);
						break;

				case 2 :System.out.println("enter acc_no.");
						num= x.nextInt();
						System.out.println("enter amount to deposit.");
						amount = x.nextFloat();
						acc a1 = hmap.get(num);
						a1.bal = a1.bal + amount;
						hmap.put(num,a1);
						a1.display();
						break;

				case 3 :System.out.println("enter acc_no.");
						num= x.nextInt();
						System.out.println("enter amount to withdraw.");
						amount = x.nextFloat();
						acc a2 = hmap.get(num);
						a2.bal = a2.bal - amount;
						hmap.put(num,a2);
						a2.display();
						break;

				case 4 :System.out.println("enter acc_no.");
						num= x.nextInt();
						acc a3 = hmap.get(num);
						a3.display();
						break;

				case 5 :next = false;



			}
		}
	}
}