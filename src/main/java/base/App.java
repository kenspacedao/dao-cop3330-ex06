package base;
import java.util.*;
import java.lang.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner cur = new Scanner(System.in);
        int cur_year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        Scanner scan_age = new Scanner(System.in);
        String age = scan_age.next();

        System.out.print("At what age would you like to retire? ");
        Scanner scan_ret = new Scanner(System.in);
        String ret_age = scan_ret.next();

        int age_conv = Integer.parseInt(age);
        int ret_age_conv = Integer.parseInt(ret_age);

        int years_ret = ret_age_conv - age_conv;
        System.out.println("You have " + years_ret + " years left until you can retire.");
        int ret_year = cur_year + years_ret;
        System.out.println("It's " + cur_year +", so you can retire in " + ret_year + ".");

    }

}
