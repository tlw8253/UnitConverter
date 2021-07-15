package main;

import java.util.Scanner;  // Import the Scanner class

public class LiquidConverter {

    final static boolean bTrace = ConverterConstants.bTrace;
    final static String sTrace = ConverterConstants.sTrace;
    final static String sClass = "LiquidConverter()";

    Scanner objScanner = new Scanner(System.in);  // Create a Scanner object
   
    public LiquidConverter(){}
    public void closeResources(){
        objScanner.close();  //close the resource
   
    }

    public void controllerLiquidConverter(int iLiquidConversionType){
        String sMethod = " controllerLiquidConverter()";
                    
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }
    
        switch(iLiquidConversionType)
        {
            case 1:
              convertUSGallonsToImperialGallons();
            break;
            case 2:
            convertUSGallonsToLiters();
            break;
            case 3:
              //return to main menu
            break;
            default:
              System.out.println("Invalid Liquid Conversion Entered: [" + iLiquidConversionType + "]");
            break;
        }
    }
    
    /********************************************************************************************************************
    ** Method: convertUSGallonsToImperialGallons()
    ** Google search:
    **   1 US Gallon = 0.832674 Imperial Gallon
    ********************************************************************************************************************/
    private void convertUSGallonsToImperialGallons(){
        String sMethod = " convertUSGallonsToImperialGallons()";
        double dUSGallons = 0.0;
        double dImperialGallons = 0.0;
            
            if (bTrace){
               System.out.println(sTrace + sClass + sMethod);
            }
    
            System.out.println("Convert US Gallons to Imperial Gallons");
            System.out.println("Please Enter Number of US Gallons to convert [1,1.25,...2,...]: ");
            dUSGallons = objScanner.nextDouble();
            dImperialGallons = dUSGallons * ConverterConstants.dUS_GallonsToImperialGallons;
            System.out.println("[" + dUSGallons + "] number of US gallons equals: " );        
            System.out.println("[" +  dImperialGallons + "] Imperial gallons.");
    }
      
    /********************************************************************************************************************
    ** Method: convertUSGallonsToLiters()
    ** Google search:
    **   1 US Gallon = 3.78541 Liter
    ********************************************************************************************************************/
    private void convertUSGallonsToLiters(){
        String sMethod = " convertUSGallonsToLiters()";
        double dUSGallons = 0.0;
        double dLiters = 0.0;
            
            if (bTrace){
               System.out.println(sTrace + sClass + sMethod);
            }
    
            System.out.println("Convert US Gallons to Liters");
            System.out.println("Please Enter Number of US Gallons to convert [1,1.25,...2,...]: ");
            dUSGallons = objScanner.nextDouble();
            dLiters = dUSGallons * ConverterConstants.dUS_GallonsToLiter;
            System.out.println("[" + dUSGallons + "] number of US Gallons equals: " );        
            System.out.println("[" +  dLiters + "] Liters.");    
        
    }
    
}
