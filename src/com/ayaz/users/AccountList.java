package com.ayaz.users;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
	private static List<AccountDetails> AccountDB = new ArrayList<AccountDetails>();

	public static List<AccountDetails> getAccountDB() {
		return AccountDB;
	}
}
