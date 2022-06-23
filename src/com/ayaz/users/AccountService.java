package com.ayaz.users;

import java.util.List;

public class AccountService {
	public static void generateAccountList()
	{
		List<AccountDetails> list=null;
		list=AccountList.getAccountDB();
		list.add(new AccountDetails("ABC123","Ayaz Sarwar",100000,"#Zaya4567&"));
		list.add(new AccountDetails("yhC523","Ankit Gupta",300000,"#ANkit4567&"));
		list.add(new AccountDetails("A56323","Nitin Aggarwal",176000,"#Nitinadr&"));
		list.add(new AccountDetails("hfC543","Neeraj Patel",100600,"#pAtelrajfg&"));
		list.add(new AccountDetails("6hfh45","Nayan Kumar",707888,"#nAyan447*"));
	}
	public static boolean withdrawl(String accNo,String password,int value)
	{
		List<AccountDetails> list = AccountList.getAccountDB();
		AccountDetails account = null;
		for(AccountDetails x:list)
		{
			if(x.getAccName().equals(accNo) && x.getPassword().equals(password))
			{
				account=x;
				break;
			}
		}
		if(account==null)
		{
			System.out.println("Account not found");
			return false;
		}
		else
		{
			if(account.getAmount()>=value)
			{
				int newAmount = account.getAmount()-value;
				account.setAmount(newAmount);
				System.out.println(value+" Deducted from the account "+accNo);
				return true;
			}
			else
			{
				System.out.println("Insufficient Balance in Bank Account");
				return false;
			}
		}
	}
}
