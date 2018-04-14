//Juan Ariza
//COP 2006 SP 2018
//This class will sort and process the values implemented from the 
//CommonTriangleValues interface, with information from the MissingInfo
//superclass, into six different possibilities:
   /*AAA - no solution
   * AAS - find missing angle by subtracting, then use law of sines to find 
   *    missing side
   * ASA - find missing angle by subtracting, then use law of sines to find
   *    missing side
   * SAS - use law of cosines to find side, law of sines to find angle, then 
   *    find missing angle by subtracting
   * SSA - use law of sines to find angle, find missing angle by subtracting, 
   *    then use law of sines to find the missing side
   * SSS - use law of cosines to find angle, once more for another angle, then 
   *    find missing angle by subtracting
   * */
