/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author Ikhsan
 */
public class Truck {
    public int candence;
    public int gear;
    public int speed;
    
    public Truck (int startCandence, int startSpeed, int startGear)
    {
        gear = startGear;
        candence = startCandence;
        speed = startSpeed;
    }
    
    public void setCandence(int newValue)
    {
        candence = newValue;
    }
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void speedUp (int increment)
    {
        speed = increment;
    }
}
