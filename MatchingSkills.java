/**
 *
 * @author Craig Jarvis
 */

package matchingskills;

import java.io.*;
import java.util.*;

public class MatchingSkills {
    
    private static Set<String> FindCommonSkill(ArrayList<String> arr1,ArrayList<String> arr2) {
        Set<String> set = new HashSet<>(); //inialize "set"
        
        //loop through 2 ArrayLists
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                //comparing strings of arr1 and arr2 without case sensitivity
                if (arr1.get(i).equalsIgnoreCase(arr2.get(j))) {
                    //adding the common elements to the array "set"
                    set.add(arr1.get(i));
                    break;
                }
            }
        }
        return set;
    }
    
    public static void main(String[] args) {
        //initializing arrays
        ArrayList<String> required_skills = new ArrayList<String>(); //skills required to get the job
        required_skills.add("java");
        required_skills.add("html");
        required_skills.add("problem solving");
        required_skills.add("Communication");
        
        ArrayList<String> aquired_skills = new ArrayList<String>(); //skills required to get the job
        aquired_skills.add("java");
        aquired_skills.add("communication");
        aquired_skills.add("HTML");
        aquired_skills.add("Communication");
         
        
        // Printing common elements
        System.out.println(FindCommonSkill(required_skills, aquired_skills));
    }
}




/**
 *
 * @author Craig Jarvis
 */

/*
package matchingskills;

import java.io.*;
import java.util.*;

public class MatchingSkills {

*/
    
    /*private static Set<String> FindCommonSkill(ArrayList<String> arr1,ArrayList<String> arr2) {
        Set<String> set = new HashSet<>(); //inialize "set"
        
        //loop through 2 ArrayLists
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                //comparing strings of arr1 and arr2 without case sensitivity
                if (arr1.get(i).equalsIgnoreCase(arr2.get(j))) {
                    //adding the common elements to the array "set"
                    set.add(arr1.get(i));
                    break;
                }
            }
        }
        return set;
    }*/
    
    /*
    public static void main(String[] args) {
        //initializing arrays
        ArrayList<String> required_skills = new ArrayList<String>(); //skills required to get the job
        required_skills.add("java");
        required_skills.add("html");
        required_skills.add("problem solving");
        required_skills.add("Communication");
        
        ArrayList<String> aquired_skills = new ArrayList<String>(); //skills required to get the job
        aquired_skills.add("java");
        aquired_skills.add("communication");
        aquired_skills.add("HTML");
        aquired_skills.add("Communication");
        
        Collections.sort(required_skills); 
        Collections.sort(aquired_skills); 
        
        required_skills.retainAll(aquired_skills);
        System.out.println(required_skills);
        
        // Printing common elements
        //System.out.println(FindCommonSkill(required_skills, aquired_skills));
    }
}


if (arr1[i].equalsIgnoreCase(arr2[j]))


public static void main(String[] args) {
        //initializing arrays
        String[] required_skills = {"java", "html", "problem solving", "Communication"}; //skills required to get the job
        String[] aquired_skills = {"java", "communication", "HTML"}; //skills job applicant has selected   
        
        // Printing common elements
        FindCommonSkill(required_skills, aquired_skills);


for (String i : set) {
            System.out.println(i);
        }
*/