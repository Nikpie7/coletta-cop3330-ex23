/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "Is the car silent when you turn the key? " );
        String choice = scan.nextLine();

        if( choice.toLowerCase().equals("y") ) {
            System.out.print( "Are the battery terminals corroded? " );
            choice = scan.nextLine();

            if( choice.toLowerCase().equals("y") ) {
                System.out.println("Clean the terminals and try starting again.");
            }
            else
                System.out.println("Replace cables and try again.");
        }
        else {
            System.out.print( "Does the car make a slicking noise? " );
            choice = scan.nextLine();

            if( choice.toLowerCase().equals("y") )
                System.out.println( "Replace the battery. " );
            else {
                System.out.print( "Does the car crank up but fail to start? " );
                choice = scan.nextLine();

                if( choice.toLowerCase().equals("y") )
                    System.out.println( "Check spark plug connections. " );
                else {
                    System.out.print( "Does the engine start and then die? " );
                    choice = scan.nextLine();

                    if( choice.toLowerCase().equals("y") ) {
                        System.out.print( "Does you car have fuel injection? " );
                        choice = scan.nextLine();

                        if( choice.toLowerCase().equals("y") )
                            System.out.println( "Get it in for service. " );
                        else
                            System.out.println( "Check to ensure the choke is opening and closing. " );
                    }
                    else
                        System.out.println( "This should not be possible. " );
                }
            }
        }
    }
}
