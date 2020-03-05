package service;

import _interface.Itriatlon;

public class Sport{
	
	public static void participerTriatlon(Itriatlon T)
	{
		T.courir();
		T.nager();
		T.pedaler();
	}

}
