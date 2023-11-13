
package jobpostproject;

/**
 *
 * @author Nathan Hays
 */
public class jobPosting {
    // jID will be generated by random number generator and is a job posting number
    private int jID;
    // jType is the job type the post is. Example is this an internal job or an external job.
    private String jType;
    // jexType will be only filled in if the job is a contractor job. Example leased worker, 3rd party.
    private String jexType;
    // jPosistion is the job posistion title. Example AT,ET,janitor.
    private String jPosistion;
    // jStatus is the job post status. Is it awaiting approval, approved, rejected.
    private String jStatus;
    // jDescription is the job description, explains the job in more detail.
    private String jDescription;
    // jDescription is the job description, explains the job in more detail.
    private String jLocation;
    // jSchedule is the work schedule. 5/40 or 9/80 or 7 on/off or part-time.
    private String jSchedule;
    
    public jobPosting(int jID, String jType, String jexType, String jPosistion, String jDescription,String jLocation, String jSchedule, String jStatus){
        //super();
        this.jID = jID;
        this.jType = jType;
        this.jexType = jexType;
        this.jPosistion = jPosistion;
        this.jDescription = jDescription;
        this.jLocation = jLocation;
        this.jSchedule = jSchedule;
        this.jStatus = jStatus;
    }
   
    public String toString(){
        return "Job Post ID: "+jID+
                "\nJob Type: "+jType +
                "\nJob External Type: " +jexType+
                "\nJob Posistion Title: "+jPosistion+
                "\nJob Description: \n"+jDescription+
                "\nJob Location: "+jLocation+
                "\nJob Work Schedule: "+jSchedule+
                "\nJob Post Status: "+jStatus;
                
    }
    
    public int getjID(){
        return jID;
    }
    public String getjStatus(){
    return jStatus;
}
    public void setjStatus(String jStatus){
        jStatus = this.jStatus;
    }
   
    
}