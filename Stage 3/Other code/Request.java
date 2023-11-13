
package jobpostproject;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Nathan Hays
 */
public class Request{
    //private static jobPosting newJobPost;
    private static LinkedList<jobPosting> jP1 = new LinkedList<>();
    private static jobPosting test;
   int jID;
   String jType;
   String jexType;
   String jPosistion;
   String jDescription;
   String jLocation;
   String jSchedule;
   String jStatus;
   String reviewAns;
   String approveAns;
    Scanner in = new Scanner(System.in); 
    Random rand = new Random();
     int upperbound = 9999;
    // int jID = rand.nextInt(upperbound);
    
    //rand.nextInt(upperbound);
    
    /**
     * This method asks the user to enter information about the job posting.
     */
    public  void getjInfo(){
        
        jID = 1+jID;
        
        // User questions and data collection begins for Job Post Data
        
        System.out.println("Please enter the Job Type: (Internal or External) ");
            jType = in.nextLine();
            
            // If the the answer to job type is external or External then the question for External Job type is asked and data saved.
            
            if("external".equals(jType)||("External".equals(jType) )){
        System.out.println("Please enter the  External Job Type: (Leased Worker or 3rd Party) ");
            jexType = in.nextLine();
        
            }
            else{
            jexType = "N/A";
            }
            
            
        System.out.println("Please enter the Job Posistion: (Example AT,ET,Janitor) ");
            jPosistion = in.nextLine();
        System.out.println("Please enter the Job Description: (Explain the basic Job Duties:) ");
            jDescription = in.nextLine();
        System.out.println("Please enter the Job Location: (List city/town Job resides in:) ");
            jLocation = in.nextLine();
        System.out.println("Please enter the Job Schedule: (options 5/40,9/80,7 on/off, part-time:) ");
            jSchedule = in.nextLine();  
       
    } 
    
    public void reviewjPost(){
        jStatus = "Creation";
        System.out.println("Would you like to review Job Post before submitting for approval? (yes or no)");
            reviewAns = in.nextLine();
        if("yes".equals(reviewAns)||("Yes".equals(reviewAns) )){
        System.out.println("Job ID: " + jID);
        System.out.println("Job Type: "+jType);
        if("external".equals(jType)||("External".equals(jType) )){
        System.out.println("External Job Type:" + jexType);
        }
        System.out.println("Job Posistion: " + jPosistion);
        System.out.println("Job Description: " + jDescription);
        System.out.println("Job Location: "+jLocation+" Work Schedule: "+jSchedule);
        System.out.println("Job Post Status: "+jStatus);
        }else{
            
        }
    }  
    
    
    public void sendtoApproval(){
        jID = jID ++;
        System.out.println("Would you like to send Job Posting for Approval? (Yes/No)");
        approveAns = in.nextLine();
        if("yes".equals(approveAns)|| ("Yes".equals(approveAns) )){
        jStatus = "Awaiting Approval";
        jobPosting test = new jobPosting(jID,jType,jexType,jPosistion,jDescription,jLocation,jSchedule,jStatus);
        jobPosting test1 = new jobPosting(05,"internal","n/a","AT","Whatever I want to","mars","5/40","Awaiting Approval");
        //jobPosting test2 = new jobPosting(08,"internal","n/a","ET","I dont know","Jupiter","5/40","Awaiting Approval");
        jP1.add(test);
        jP1.add(test1);
        //jP1.add(test2);
        System.out.println("Job Post submitted for Approval");
        System.out.println("");
        
       
    }else{
         
        System.out.println("Job Post not submitted for Approval");
    }
      
    }
    
    public LinkedList<jobPosting> getList(){
       return jP1; 
    }
    // This method allows the viewing of all open approved job postings
    
    public void view(){
        System.out.println("Viewing all Open Job Postings: ");
        System.out.println("");
        System.out.println("There are "+jP1.size()+" approved Job Posts available to view:");
        
        for(int i =0;i<jP1.size();i++){
            System.out.println(jP1.get(i));
            System.out.println("-----------------------------------------------");
        }
       //System.out.println(jP1);     
    }
    public void viewExpedited(){
        if(jP1.size() <= 5){
            for(int i =0;i<jP1.size();i++){
                System.out.println(jP1.get(i));
                System.out.println("-----------------------------------------------");
            }
        }
        else
        {
              for(int i =0; i<5;i++){
            System.out.println(jP1.get(i));
            System.out.println("-----------------------------------------------");  
                }
        
        }       
    }
   
    
    
    public void jPostIDCheck(int jpID){
        System.out.println("Please enter a Job ID to approve. ");
        //jpID = jpID -1;
        //jStatus = "Approved";
        //System.out.println(jP1.get(jpID));
        //test.setjStatus("Approved");
        System.out.println(jP1.get(0).getjStatus());
        //jP1.get(0).setjStatus("Approved");
            
       }
            
    
        
   
   public void jPostadd(jobPosting jPostName){
       
       System.out.println("Do you want to add another Job Post? ");
       //jPostName = in.
       
   } 
   public void remove(){
       jP1.remove(0);
       
   }

}            
        
      
        
    
    
 