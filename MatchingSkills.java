/**
 *
 * @author Craig Jarvis
 */

package matchingskills;

import java.io.*;
import java.util.*;

public class MatchingSkills {
    
    private static void FindCommonSkill(String[] arr1,String[] arr2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                //comparing strings of arr1 and arr2 without case sensitivity
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    // adding the common elements to the array "set"
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        //initializing arrays
        String[] required_skills = {"java", "html", "problem solving", "Communication"}; //skills required to get the job
        String[] aquired_skills = {"java", "communication", "HTML"}; //skills job applicant has selected   
        
        // Printing common elements
        FindCommonSkill(required_skills, aquired_skills);
    }   
}
