
package jobpostproject;

import java.util.Scanner;

/**
 *
 * @author Nathan Hays
 */
public class Approval {
   Request Request = new Request();
   private  int aChoice=0;
    Scanner in = new Scanner(System.in);
    int jpID;
   
   
   
    // This method handles the menu for the Approval Portal. 
    public  void approvalMenu(){
        
        
        
        do {
        System.out.println("Approval Portal:");
        System.out.println("");
        System.out.println("AP Menu:");
        System.out.println("");
        System.out.println("1. View all Job Postings awaiting approval: ");
        System.out.println("2. View expedited Job Posts awaiting approval: ");
        System.out.println("3. View rejected Job posts: ");
        System.out.println("4. Approve/Reject Job Postings: ");
        System.out.println("5. Return to Main Menu: ");
        System.out.println("");
        System.out.println("Please enter menu choice: ");
        
        aChoice = in.nextInt();
        
        if(aChoice !=1 && aChoice !=2 && aChoice !=3 && aChoice !=4 && aChoice !=5){
             System.out.println("Invalid choice. Please enter a valid option. ");
                in.reset(); 
        }
        switch(aChoice){
            
            case 1 -> {
                System.out.println("View all job Postings");
                Request.view();
                
                 
                }
            case 2 -> {
                System.out.println("View all expedited job Postings");
                Request.viewExpedited();
                
                
               
                }
            case 3 -> {
                System.out.println("View all rejected job Postings");
          
                }
            case 4 -> {
                System.out.println("Approve/Reject");
                Request.remove();
                approve();
            }
            case 5 -> {
                System.out.println("Returning to Main Menu");
                return;
            }
    }
        
    } while (aChoice !=6);
    
}
    
    public void jPView(){
        Request.getList();
        
        //System.out.println("There are currently "+jP1.size+" open Job Postings awaiting approval:");
        System.out.println();

        
        
    }
    public void approve(){
       
        System.out.println("Please enter a Job ID to approve: ");
        jpID = in.nextInt();
        Request.jPostIDCheck(jpID);
        System.out.println();
        
        
       
       
        
    }
    public void remove(){
        Request.remove();
    }
}
        
    
    
  

