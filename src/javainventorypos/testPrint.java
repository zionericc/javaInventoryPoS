/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainventorypos;

import java.net.InetAddress;

/**
 *
 * @author USER
 */

public class testPrint {
            
        /* GET COMPUTER NAME and CONNECT PRINTER
        String computerName = getCompName();
        
        private String getCompName(){
        try{
            computerName = InetAddress.getLocalHost().getHostName();
            System.out.println(computerName);
        }
        catch(Exception e){
            System.out.println("COULDN'T GET HOST NAME" + e);
        }
        return computerName;
    }
        
        ESCPrinter escp = new ESCPrinter("\\\\"+computerName+"\\LX-310", false); //create ESCPrinter on network location \\computer\sharename, 9pin printer
        */
    
    public static void main(String[] args) {

//        if (escp.initialize()){
//            System.out.println("nice");
//        }
//        else{
//            System.out.println("not nice");
//        }
        
////        ESCPrinter escp = new ESCPrinter("\\\\"+computerName+"\\LX-310", false); //create ESCPrinter on network location \\computer\sharename, 9pin printer
//        if (escp.initialize()) {
//            escp.setCharacterSet(ESCPrinter.USA);
//            escp.select15CPI(); //15 characters per inch printing
//            escp.setMargins(5, 5);
//            
////            escp.advanceVertical(3);
//            escp.setAbsoluteHorizontalPosition(0);
            
            /*HORIZONTAL LINE
            escp.print("-------------------------------------------------------------------------------------------------------------------");
            */
            
            /*SIGNATURE LINE
            escp.advanceVertical((float).5);
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(8);
            escp.bold(true);
            escp.print("___________________________");
            */
            
            /*TABS
            escp.setAbsoluteHorizontalPosition(5);
            escp.print("5");
            escp.horizontalTab(1);
            escp.print("1");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(2);
            escp.print("2");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(3);
            escp.print("3");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(4);
            escp.print("4");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(5);
            escp.print("5");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(6);
            escp.print("6");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(7);
            escp.print("7");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(8);
            escp.print("8");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(9);
            escp.print("9");
            escp.setAbsoluteHorizontalPosition(5);
            escp.horizontalTab(10);
            escp.print("10");
            */        
            
            /*
            WORKING ABSOLUTE HORIZ POSITION
            escp.setAbsoluteHorizontalPosition(0);
            escp.print("0");
            escp.setAbsoluteHorizontalPosition(1);
            escp.print("1");
            escp.setAbsoluteHorizontalPosition(2);
            escp.print("2");
            escp.setAbsoluteHorizontalPosition(3);
            escp.print("3");
            escp.setAbsoluteHorizontalPosition(4);
            escp.print("4");
            escp.setAbsoluteHorizontalPosition(5);
            escp.print("5");
            escp.setAbsoluteHorizontalPosition(11);
            escp.print("11");
            escp.setAbsoluteHorizontalPosition(12);
            escp.print("12");
            escp.setAbsoluteHorizontalPosition(13);
            escp.print("13");
            
            DIS BROKEN
            escp.setAbsoluteHorizontalPosition(6);
            escp.print("6");
            escp.setAbsoluteHorizontalPosition(7);
            escp.print("7");
            escp.setAbsoluteHorizontalPosition(8);
            escp.print("8");
            escp.setAbsoluteHorizontalPosition(9);
            escp.print("9");
            escp.setAbsoluteHorizontalPosition(10);
            escp.print("10");
            */
            
            
//            //NAME
//            escp.centerText();
//            escp.bold(true);
//            escp.doubleHeightOn();
//            escp.doubleWidthOn();
//            escp.print("TOFOMI ENTERPRISES");
//            escp.leftJustify();
//            escp.doubleHeightOff();
//            escp.doubleWidthOff();
//            escp.setAbsoluteHorizontalPosition(0);
//            escp.bold(false);
//            escp.centerText();
//            escp.print("ADDRESS something something something ADDRESS");
//            escp.leftJustify();

//            END PRINTING
//            escp.formFeed(); //eject paper
//            escp.close(); //close stream
//        }
//        else 
//            System.out.println("Couldn't open stream to printer");
    }
}