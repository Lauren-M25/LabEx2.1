
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/********************************************************************
 * Programmer: Lauren
 * 
 * Class:  CS30S
 *
 * Assignment: ProgramInfo
 *
 * Description: Class will print the banner and closing message for assignments,
 * exercises, and examples.
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
        
        private String[] info = new String [2];  // information about the program for the banner
                                                 // index 0 is course index 1 is assignment
        private String nl = System.lineSeparator();        // universal new line character
        
        PrintWriter fout; 
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    /*****************************************
    * Description: default constructor: create an array for information
    * 
    * ****************************************/
        
        public ProgramInfo() throws IOException{
            this.fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
            this.info[0] = "";
            this.info[1] = "";
        } // end of default constructor
        
    /*****************************************
    * Description: initialized constructor: create an array with the info in it
    * 
    * Interface:
    * 
    * @param        info: String[], array with program information
    * ****************************************/
        
        public ProgramInfo(String[] info) throws IOException{
            this.fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
            this.info[0] = info[0];
            this.info[1] = info[1];
        } // end initialized constructor
        
    //*** Getters ***
        
    /*****************************************
    * Description: printBanner: prints banner
    * 
    * Interface:
    * 
    * ****************************************/
        
        public void printBanner(){
            
            System.out.println("*******************************************");
            System.out.println("Name: Lauren");
            System.out.println("Class: ");
            System.out.println("Assignment: ");
            System.out.println("*******************************************");
            
            String bannerOut = ("****************************" + nl);
            bannerOut += ("Name: Lauren" + nl);
            bannerOut += ("Class: CS30S" + info[0]+ nl);
            bannerOut += ("Assignment: " + info[1] + nl);
            bannerOut += ("****************************" + nl + nl);
        
        fout.print(bannerOut);
        fout.close();    
        } // end printBanner
        
    /*****************************************
    * Description: printClosing: prints closing message
    * 
    * Interface:
    *
    * ****************************************/
        
        public void printClosing(){
            
            System.out.println("end of processing :o");
            fout.print("end of processing :o");
            fout.close();  
            
        } // end printBanner    
        
    //*** Setters ***
    
        
    
} // end of public class
