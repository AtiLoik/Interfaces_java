package _interface;

public interface Imanga {
	default public void lire()
	{
		System.out.println("Je lit");
	}
	
	abstract void regarder();

}
