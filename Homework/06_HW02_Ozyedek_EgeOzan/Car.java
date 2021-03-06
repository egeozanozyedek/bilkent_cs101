/*
 Name: Ege Ozan �zyedek
 Date: 06.12.2017
 Program Name: Car
 Program Description: A class that stimulates a car. We can add gas and drive miles and it will update the gas amount
 with the car's efficiency.
 */ 
public class Car {
  
  // properties
  private int gasNow;
  private int miles;
  private int efficiency;
  
  // constructor
  
  /**
   * Constructor of Car class which initializes gasNow to 0 and efficiency to the startEfficiency
   * @param startEfficiency is the efficiency which is declared by the constructor
   */
  public Car( int startEfficiency)  {
    efficiency = startEfficiency;
    gasNow = 0;
  }
  // methods
  
  /**
   * Adds gas to the car and calculates the miles it can drive
   * @param gas which is the amount that will be added to the gasNow
   */
  public void addGas(int gas) {
    gasNow = gasNow + gas;
    miles = gasNow * efficiency;
  }
  
  /**
   * A method to stimulate the car driving for an amount of miles. It calculates gasNow with the updates miles
   * @param drive is the amount of miles the car will drive
   */
  public void drive( int drive) {
    miles = miles - drive;
    gasNow = miles / efficiency;
  }
  
  /**
   * Method to get the gas level of the car
   * @return gasNow which is the gas level of the car
   */
  public int getGasLevel() {
    return gasNow;
  }
  
  
  
  
  
}