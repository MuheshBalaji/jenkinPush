package com.comcast.GenricUtilty;

import java.util.Random;

public class webDriuverUtility {
	public int randomnum(int limit) {
		Random r=new Random();
		int ran = r.nextInt(limit);
		return ran;
	}

}
