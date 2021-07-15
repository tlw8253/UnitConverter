package main;

import java.util.Scanner;  // Import the Scanner class

public class DistanceConverter {
    final static boolean bTrace = ConverterConstants.bTrace;
    final static String sTrace = ConverterConstants.sTrace;
    final static String sClass = "DistanceConverter()";

    Scanner objScanner = new Scanner(System.in);  // Create a Scanner object

   
    public DistanceConverter(){}
    public void closeResources(){
        objScanner.close();  //close the resource
   
    }

    public void controllerDistanceConverter(int iDistanceConversionType){
        String sMethod = " controllerDistanceConverter()";
        //double dConversionAmount = 0.0;
            
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }
    
        switch(iDistanceConversionType)
        {
            case 1:
            convertFeetToMeters();
            break;
            case 2:
              convertMilesToKilometers();
            break;
            case 3:
              //return to main menu
            break;
            default:
              System.out.println("Invalid Distance Conversion Entered: [" + iDistanceConversionType + "]");
            break;
        }
    }
    
    /********************************************************************************************************************
    ** Method: convertFeetToMeters()
    ** Google search:
    **   1 foot = 0.3048 meters
    ********************************************************************************************************************/
    private void convertFeetToMeters(){
        String sMethod = " convertFeetToMeters()";
        double dFeet = 0.0;
        double dMeters = 0.0;
            
            if (bTrace){
               System.out.println(sTrace + sClass + sMethod);
            }
    
            System.out.println("Convert Feet to Meters");
            System.out.println("Please Enter Number of Feet to convert [1,1.25,...2,...]: ");
            dFeet = objScanner.nextDouble();
            dMeters = dFeet * ConverterConstants.dFeetToMeters;
            System.out.println("[" + dFeet + "] number of feet equals: " );        
            System.out.println("[" +  dMeters + "] meters.");              


    }
      
    /********************************************************************************************************************
    ** Method: convertMilesToKilometers()
    ** Google search:
    **   1 mile = 1.60934 kilometers
    ********************************************************************************************************************/
    private void convertMilesToKilometers(){
        String sMethod = " convertMilesToKilometers()";
        double dMiles = 0.0;
        double dKilometers = 0.0;
            
            if (bTrace){
               System.out.println(sTrace + sClass + sMethod);
            }
    
            System.out.println("Convert Miles to Kilometers");
            System.out.println("Please Enter Number of Miles to convert [1,1.25,...2,...]: ");
            dMiles = objScanner.nextDouble();
            dKilometers = dMiles * ConverterConstants.dMileToKilometers;
            System.out.println("[" + dMiles + "] number of miles equals: " );        
            System.out.println("[" +  dKilometers + "] kilometers.");    
        
    }


}
