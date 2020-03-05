package _interface;

public interface Isport {
	void courir();
	void nager();
	void pedaler();
	
	default void triatlon(boolean str)
	{
		if(!marcher(str))
		{
			System.out.println("Je participe au triatlon");
		}
	}
	
	default boolean marcher(boolean str)
	{
		if(str == true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
