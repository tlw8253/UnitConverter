package main;

import java.util.Scanner;  // Import the Scanner class


public class ConverterMenu {
   //Trace variables
    final static boolean bTrace = ConverterConstants.bTrace;
    final static String sTrace = ConverterConstants.sTrace;
    final static String sClass = "ConverterMenu()";
    //Menu variables
    //final static int iiVolumeConversion = ConverterConstants.iVolumeConversion;

    Scanner objScanner = new Scanner(System.in);  // Create a Scanner object

    int iMenuSelection=0;
    //int i2ndConversionType=0;


    public ConverterMenu(){}
    public void closeResources(){
        objScanner.close();  //close the resource
   
    }

    /********************************************************************************************************************
    ** Method: getConversionType()
    ********************************************************************************************************************/
    public int getConversionType(){
        String sMethod = " getConversionType()";
        //Scanner objScanner = new Scanner(System.in);  // Create a Scanner object  ** cause an exception if defined locally once inside do while loop??
    
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }         
  
        dispalyConversionTypeMenu();
        iMenuSelection = objScanner.nextInt();
        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod + " iMenuSelection: " + iMenuSelection);
        }
  
        return(iMenuSelection);
     }
  
     /********************************************************************************************************************
      ** Method: dispalyConversionTypeMenu()
      ********************************************************************************************************************/
  
      private void dispalyConversionTypeMenu() {
        String sMethod = " dispalyConversionTypeMenu()";
        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }
        
        System.out.println("******************************************");
        System.out.println("** 1. Volume conversions                **");
        System.out.println("** 2. Distance conversions              **");
        System.out.println("** 3. Liquid conversions                **");
        System.out.println("** 4. Quit                              **");
        System.out.println("******************************************");
        System.out.println("Enter a value 1-4 from the menu above: ");
        
     }
  
   /********************************************************************************************************************
    ** Method: getVolumeConversionType()
    ********************************************************************************************************************/
    public int getVolumeConversionType(){
        String sMethod = " getVolumeConversionType()";
    
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }         
  
        dispalyVolumeConversionTypeMenu();
        iMenuSelection = objScanner.nextInt();
        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod + " iMenuSelection: " + iMenuSelection);
        }
  
        return(iMenuSelection);
     }
  
     /********************************************************************************************************************
      ** Method: dispalyVolumeConversionTypeMenu()
      ********************************************************************************************************************/
      private void dispalyVolumeConversionTypeMenu() {
        String sMethod = " dispalyVolumeConversionTypeMenu()";
        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }
        
        System.out.println("******************************************");
        System.out.println("** 1. Teaspoons to Tablespoons          **");
        System.out.println("** 2. Teaspoons to Cups                 **");
        System.out.println("** 3. Main Menu                         **");
        System.out.println("******************************************");
        System.out.println("Enter a value 1-3 from the menu above: ");
        
     }

   /********************************************************************************************************************
    ** Method: getDistanceConversionType()
    ********************************************************************************************************************/
    public int getDistanceConversionType(){
        String sMethod = " getDistanceConversionType()";
    
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }         
  
        dispalyDistanceConversionTypeMenu();
        iMenuSelection = objScanner.nextInt();
        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod + " iMenuSelection: " + iMenuSelection);
        }
  
        return(iMenuSelection);
     }
  
     /********************************************************************************************************************
      ** Method: dispalyDistanceConversionTypeMenu()
      ********************************************************************************************************************/
      private void dispalyDistanceConversionTypeMenu() {
        String sMethod = " dispalyVolumeConversionTypeMenu()";
        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }
        
        System.out.println("******************************************");
        System.out.println("** 1. Feet to Meters                    **");
        System.out.println("** 2. Miles to Kilometers               **");
        System.out.println("** 3. Main Menu                         **");
        System.out.println("******************************************");
        System.out.println("Enter a value 1-3 from the menu above: ");
        
     }

/********************************************************************************************************************
    ** Method: getLiquidConversionType()
    ********************************************************************************************************************/
    public int getLiquidConversionType(){
      String sMethod = " getLiquidConversionType()";
  
      if (bTrace){
         System.out.println(sTrace + sClass + sMethod);
      }         

      dispalyLiquidConversionTypeMenu();
      iMenuSelection = objScanner.nextInt();
      
      if (bTrace){
         System.out.println(sTrace + sClass + sMethod + " iMenuSelection: " + iMenuSelection);
      }

      return(iMenuSelection);
   }

   /********************************************************************************************************************
    ** Method: dispalyLiquidConversionTypeMenu()
    ********************************************************************************************************************/
    private void dispalyLiquidConversionTypeMenu() {
      String sMethod = " dispalyLiquidConversionTypeMenu()";
      
      if (bTrace){
         System.out.println(sTrace + sClass + sMethod);
      }
      
      System.out.println("******************************************");
      System.out.println("** 1. US Gallons to Imperial Gallons    **");
      System.out.println("** 2. US Gallons to Liters              **");
      System.out.println("** 3. Main Menu                         **");
      System.out.println("******************************************");
      System.out.println("Enter a value 1-3 from the menu above: ");
      
   }

}
