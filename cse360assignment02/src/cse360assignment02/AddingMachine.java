package cse360assignment02;

/**
 * @author Donglai Lyu
 *
 */
public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) 
  {
	  total = total + value;
	  history += "+"+value;
  }

  public void subtract (int value) 
  {
	  total = total - value;
	  history += "-"+value;
  }

  public String toString () {
    return history;
  }

  public void clear() 
  {
	  history = "0";
  }
}
