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
public class MountainTruck extends Truck{
    public int seatHeight;
    public MountainTruck (int startHeight, int startCandence, int startSpeed, int startGear)
    {
        super(startCandence, startSpeed,startGear);
        seatHeight =startHeight;
    }
    public void setHeight (int newValue)
    {
        seatHeight = newValue;
    }
    public static void main (String [] args)
    {
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear ="+MB.gear);
        System.out.println("speed ="+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear="+MB.gear);
        System.out.println("speed ="+MB.speed);
        MB.speedUp(2);
        System.out.println("gear="+MB.gear);
        System.out.println("speed ="+MB.speed);
    }
}
