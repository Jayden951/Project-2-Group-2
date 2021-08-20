/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput;

/**
 *
 * @author Velenkosini Prince Jeza 218191669
 */
public class JobAvailable {
        
    private String jobTitle;
    private String Province;
    private String Company;
    

    
    // Constructor
    public JobAvailable(String title, String province, String company) {
        this.jobTitle = title;
        this.Province = province;
        this.Company = company;
        
    }
    
    //Getters
    public String getJobTitle() {
        return jobTitle;
    }

    public String getProvince() {
        return Province;
    }

    public String getCompany() {
        return Company;
    }

    
    //Setters
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    @Override
    public String toString() {
        return "JobAvailable{" + "jobTitle=" + jobTitle + ", Province=" + Province + ", Company=" + Company + '}';
    }

    
}
