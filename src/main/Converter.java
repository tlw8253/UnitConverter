package main;

//
public class Converter {
   final static boolean bTrace = ConverterConstants.bTrace;
   final static String sTrace = ConverterConstants.sTrace;
   final static String sClass = "Converter()";

  static ConverterMenu objConverterMenu = new ConverterMenu();
  static VolumeConverter objVolumeConverter = new VolumeConverter();
  static DistanceConverter objDistanceConverter = new DistanceConverter();
  static LiquidConverter objLiquidConverter = new LiquidConverter();


   //
   public static void main(String[] args) {       
      String sMethod = " main()";
      int iConversionType=0;
      int i2ndConversionType=0;

      if (bTrace) {
        System.out.println(sTrace + sClass + sMethod); 
      }
      
        
      do
      {
                  
         System.out.println("");
         System.out.println("");

        iConversionType = objConverterMenu.getConversionType();

        if (bTrace) {
           System.out.println(sTrace + sClass + sMethod + " iConversionType: " + iConversionType);
        } 
       
        switch (iConversionType) {
           case 1:
           {
             if (bTrace) System.out.println("iConversionType: case 1");
             i2ndConversionType = objConverterMenu.getVolumeConversionType();
             if (bTrace) System.out.println("i2ndConversionType: " + i2ndConversionType);      
             objVolumeConverter.controllerVolumeConverter(i2ndConversionType);       
             break;
           }
           case 2:
           {
              if (bTrace) System.out.println("iConversionType: case 2");
              i2ndConversionType = objConverterMenu.getDistanceConversionType();
              if (bTrace) System.out.println("i2ndConversionType: " + i2ndConversionType);
              objDistanceConverter.controllerDistanceConverter(i2ndConversionType);              
              break;
           }
           case 3:
           {
            if (bTrace) System.out.println("iConversionType: case 3");
            i2ndConversionType = objConverterMenu.getLiquidConversionType();
            if (bTrace) System.out.println("i2ndConversionType: " + i2ndConversionType);
            objLiquidConverter.controllerLiquidConverter(i2ndConversionType);              
            break;
           }
           case 4:
           {
            if (bTrace) System.out.println("iConversionType: case 4");             
             break;  
           }
           default:
           {
             System.out.println("Invalid Selection.\nPlease select from menu items.");
             break;
           }
        }
        
        System.out.println("");
        System.out.println("");

      } while (iConversionType != 4);

      objConverterMenu.closeResources();
      objVolumeConverter.closeResources();
      objDistanceConverter.closeResources();
      objLiquidConverter.closeResources();


      System.exit(0);
   }




}