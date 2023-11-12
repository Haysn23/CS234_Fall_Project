import java.util.List;

public class JobPosting {

    private String jobTitle;
    private String description;
    private String jobType;
    private String jobLocation;
    private String jobSchedule;
    private boolean canSubmit;
    private int jobId;

    public JobPosting(String jobTitle, String description, String jobType, String jobLocation, String jobSchedule, boolean canSubmit, int jobId) {
        this.jobTitle = jobTitle;
        this.description = description;
        this.jobType = jobType;
        this.jobLocation = jobLocation;
        this.jobSchedule = jobSchedule;
        this.canSubmit = canSubmit;
        this.jobId = jobId;
    }

    // Getters and setters for all fields

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(String jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    public boolean isCanSubmit() {
        return canSubmit;
    }

    public void setCanSubmit(boolean canSubmit) {
        this.canSubmit = canSubmit;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    // Additional CRUD operations for job postings

    public static void createJobPosting(List<JobPosting> jobPostings, String jobTitle, String description,
                                        String jobType, String jobLocation, String jobSchedule, boolean canSubmit, int jobId) {
        jobPostings.add(new JobPosting(jobTitle, description, jobType, jobLocation, jobSchedule, canSubmit, jobId));
    }

    public void displayJobPostingDetails() {
        System.out.println("[Job ID: " + getJobId());
        System.out.println("Job Title: " + getJobTitle());
        System.out.println("Description: " + getDescription());
        System.out.println("Job Type: " + getJobType());
        System.out.println("Job Location: " + getJobLocation());
        System.out.println("Job Schedule: " + getJobSchedule());
        System.out.println("Can Submit: " + (isCanSubmit() ? "Yes" : "No") + "]");
    }

    public static void updateJobPosting(List<JobPosting> jobPostings, int index, String newJobTitle, String newDescription,
                                        String newJobType, String newJobLocation, String newJobSchedule, boolean newCanSubmit) {
        if (index >= 0 && index < jobPostings.size()) {
            JobPosting jobPosting = jobPostings.get(index);
            jobPosting.setJobTitle(newJobTitle);
            jobPosting.setDescription(newDescription);
            jobPosting.setJobType(newJobType);
            jobPosting.setJobLocation(newJobLocation);
            jobPosting.setJobSchedule(newJobSchedule);
            jobPosting.setCanSubmit(newCanSubmit);
        }
    }

    public static void deleteJobPosting(List<JobPosting> jobPostings, int index) {
        if (index >= 0 && index < jobPostings.size()) {
            jobPostings.remove(index);
        }
    }

    public void approveJobPosting() {
        if (!canSubmit) {
            canSubmit = true;
            System.out.println("Job posting approved successfully!");
        } else {
            System.out.println("Job posting is already approved.");
        }
    }

    public void disapproveJobPosting() {
        if (canSubmit) {
            canSubmit = false;
            System.out.println("Job posting disapproved successfully!");
        } else {
            System.out.println("Job posting is already disapproved.");
        }
    }
}