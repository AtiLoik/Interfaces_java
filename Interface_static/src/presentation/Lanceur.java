/**
 * 
 */
package presentation;

import _interface.Isport;
import metier.Benjamin;

/**
 * @author Loïk
 *
 */
public class Lanceur implements Isport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lanceur obj = new Lanceur();
		obj.triatlon(false);
	}
	
	static void triatlon(boolean str)
	{
		if(!marcher(str))
		{
			System.out.println("Je participe au triatlon");
		}
	}
	
	static boolean marcher(boolean str)
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

	@Override
	public void courir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nager() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pedaler() {
		// TODO Auto-generated method stub
		
	}

}
