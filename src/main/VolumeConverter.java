package main;

import java.util.Scanner;  // Import the Scanner class

public class VolumeConverter {
    final static boolean bTrace = ConverterConstants.bTrace;
    final static String sTrace = ConverterConstants.sTrace;
    final static String sClass = "VolumeConverter()";

    Scanner objScanner = new Scanner(System.in);  // Create a Scanner object


public VolumeConverter() {}
public void closeResources(){
    objScanner.close();  //close the resource

}

public void controllerVolumeConverter(int iVolumeConversionType){
    String sMethod = " controllerVolumeConverter()";
            
    if (bTrace){
       System.out.println(sTrace + sClass + sMethod);
    }

    switch(iVolumeConversionType)
    {
        case 1:
          convertTeaspoonsToTablespoons();
        break;
        case 2:
          convertTeaspoonsToCups();
        break;
        case 3:
          //return to main menu
        break;
        default:
          System.out.println("Invalid Volume Conversion Entered: [" + iVolumeConversionType + "]");
        break;
    }
}

/********************************************************************************************************************
** Method: convertTeaspoonsToTablespoons()
** Google search:
**   1 US Teaspoon = 0.333333 US Tablespoon
********************************************************************************************************************/
private void convertTeaspoonsToTablespoons(){
    String sMethod = " convertTeaspoonsToTablespoons()";
    double dTeaspoons = 0.0;
    double dTablespoons = 0.0;

        
    if (bTrace){
       System.out.println(sTrace + sClass + sMethod);
    }

        System.out.println("Convert Teaspoons to Tablespoons");
        System.out.println("Please Enter Number of Teaspoons to convert [1,1.25,...2,...]: ");
        dTeaspoons = objScanner.nextDouble();
        dTablespoons = dTeaspoons * ConverterConstants.dUS_TspToTbls;
        System.out.println("[" + dTeaspoons + "] number of teaspons equals: " );        
        System.out.println("[" +  dTablespoons + "] tablespoons.");       

}
  
/********************************************************************************************************************
** Method: convertTeaspoonsToCups()
** Google search:
**   1 US Teaspoon = 0.0208333 US Tablespoon
********************************************************************************************************************/
private void convertTeaspoonsToCups(){
    String sMethod = " convertTeaspoonsToCups()";
    double dTeaspoons = 0.0;
    double dCups = 0.0;

        
        if (bTrace){
           System.out.println(sTrace + sClass + sMethod);
        }

        System.out.println("Convert Teaspoons to Cups");
        System.out.println("Please Enter Number of Teaspoons to convert [1,1.25,...2,...]: ");
        dTeaspoons = objScanner.nextDouble();
        dCups = dTeaspoons * ConverterConstants.dUS_TspToCups;
        System.out.println("[" + dTeaspoons + "] number of teaspons equals: " );        
        System.out.println("[" +  dCups + "] cups.");  
    
}
    
}
