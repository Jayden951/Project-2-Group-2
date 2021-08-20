/**
 * Project 2
 * @author Jayden Johnson 219086796
 * 2021
 */
package za.ac.cput.projectmerg1;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import javax.swing.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class HardSkillsGUI extends JFrame implements ActionListener  {
    
    private JFrame mainFrame;
    private JPanel panelNorth;
    private JPanel panelCenter;
    private JPanel panelSouth;
    
    private JLabel lblHead;
    
    private JCheckBox chkApplicationDevelopment; 
    private JCheckBox chkArchitecture; 
    private JCheckBox chkArtificialIntelligence; 
    private JCheckBox chkCloudComputing; 
    private JCheckBox chkHTML; 
    private JCheckBox chkC; 
    private JCheckBox chkCLanguage; 
    private JCheckBox chkPHP; 
    private JCheckBox chkUXDesign; 
    private JCheckBox chkPython; 
    private JCheckBox chkJavaScript; 
    private JCheckBox chkJava;  
    
    private JButton btnSave;
    private JButton btnBack;
    private JButton btnNext;
    
    ArrayList<String> HardSkillsList = new ArrayList<String>();
    String ListOutput;

    public HardSkillsGUI(){   
        
    HardSkillsList.add("Application Development");
    HardSkillsList.add("Architecture");
    HardSkillsList.add("Artificial Intelligence");
    HardSkillsList.add("Cloud Computing");
    HardSkillsList.add("HTML");
    HardSkillsList.add("C++");
    HardSkillsList.add("C Language");
    HardSkillsList.add("PHP");
    HardSkillsList.add("UX Design");
    HardSkillsList.add("Python");        
    HardSkillsList.add("JavaScript");
    HardSkillsList.add("Java");
    
    mainFrame = new JFrame("List of Hard Skills");
    panelNorth = new JPanel();
    panelNorth.setBackground(new Color(249, 123, 203));
    panelCenter = new JPanel();
    
    panelSouth = new JPanel();
    panelCenter.setBackground(new Color(0, 225, 239));
   
    
    lblHead = new JLabel("Check the hard skills you have");
    lblHead.setFont(new Font("Verdana", Font.BOLD, 24));
    lblHead.setForeground(Color.white);

    chkApplicationDevelopment = new JCheckBox("Application Development");
    chkApplicationDevelopment.setBackground(Color.white);
    chkApplicationDevelopment.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkArchitecture = new JCheckBox("Architecture");
    chkArchitecture.setBackground(Color.white);
    chkArchitecture.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkArtificialIntelligence = new JCheckBox("Artificial Intelligence");
    chkArtificialIntelligence.setBackground(Color.white);
    chkArtificialIntelligence.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkCloudComputing = new JCheckBox("Cloud Computing");
    chkCloudComputing.setBackground(Color.white);
    chkCloudComputing.setFont(new Font("Arial", Font.BOLD, 16)); 
    
    chkHTML = new JCheckBox("HTML");
    chkHTML.setBackground(Color.white);
    chkHTML.setFont(new Font("Arial", Font.BOLD, 16)); 
    
    chkC = new JCheckBox("C++");
    chkC.setBackground(Color.white);
    chkC.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkCLanguage = new JCheckBox("C Language");
    chkCLanguage.setBackground(Color.white);
    chkCLanguage.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkPHP = new JCheckBox("PHP");
    chkPHP.setBackground(Color.white);
    chkPHP.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkUXDesign = new JCheckBox("UX Design");
    chkUXDesign.setBackground(Color.white);
    chkUXDesign.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkPython = new JCheckBox("Python");
    chkPython.setBackground(Color.white);
    chkPython.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkJavaScript = new JCheckBox("JavaScript");
    chkJavaScript.setBackground(Color.white);
    chkJavaScript.setFont(new Font("Arial", Font.BOLD, 16));
    
    chkJava = new JCheckBox("Java");
    chkJava.setBackground(Color.white);
    chkJava.setFont(new Font("Arial", Font.BOLD, 16));
    
    btnSave = new JButton ("Save");
    btnBack = new JButton ("Back");
    btnNext = new JButton ("Next");
    
    }
    
    public void setGUI() {
        
        panelNorth.add(lblHead);
        
        panelCenter.setLayout(new GridLayout(6, 2));
        panelSouth.setLayout(new GridLayout(1, 3));
        
        panelCenter.add(chkApplicationDevelopment);
        panelCenter.add(chkArchitecture);
        panelCenter.add(chkArtificialIntelligence);
        panelCenter.add(chkCloudComputing);
        panelCenter.add(chkHTML);
        panelCenter.add(chkC);
        panelCenter.add(chkCLanguage);
        panelCenter.add(chkPHP);
        panelCenter.add(chkUXDesign);
        panelCenter.add(chkPython);
        panelCenter.add(chkJavaScript);
        panelCenter.add(chkJava);
        
        panelSouth.add(btnBack);
        panelSouth.add(btnSave);
        panelSouth.add(btnNext);
        
        btnSave.addActionListener(this);
        btnBack.addActionListener(this);
        btnNext.addActionListener(this);
        
        mainFrame.getContentPane().setPreferredSize(new Dimension(500, 350));

        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);   
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  
        if (e.getActionCommand().equals("Save")){ 
            
        ListOutput = "";
        if (chkApplicationDevelopment.isSelected()) 
        {
             ListOutput = HardSkillsList.get(0) + " \n";
        }
        if (chkArchitecture.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(1) + " \n";
        }
         if (chkArtificialIntelligence.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(2) + " \n";
        }
          if (chkCloudComputing.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(3) + " \n";
        }
           if (chkHTML.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(4) + " \n";
        }
            if (chkC.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(5) + " \n";
        }
             if (chkCLanguage.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(6) + " \n";
        }
             if (chkPHP.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(7) + " \n";
        }             
               if (chkUXDesign.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(8) + " \n";
        } 
               if (chkPython.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(9) + " \n";
        }
                 if (chkJavaScript.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(10) + " \n";
        }       
                 if (chkJava.isSelected())
        {
             ListOutput = ListOutput + HardSkillsList.get(11) + " \n";
        } 
                 
        try{
            FileWriter write = new FileWriter("C:/Users/Julian/Desktop/Files/HardSkills.txt",true);
            BufferedWriter buff = new BufferedWriter(write);
            buff.write(new java.util.Date() + "\n" + ListOutput + "\n");
            buff.close();
        }
        catch (IOException a){
            System.err.println("Error while writing to file: " + a.getMessage());
        }

        JOptionPane.showMessageDialog(null, "You have saved the following Hard Skills:\n" + ListOutput);
        }
        
        else if (e.getActionCommand().equals("Back")){
            System.exit(0);
        } 
        
        else if (e.getActionCommand().equals("Next")){
            System.exit(0);
        } 
        
    }
    
    public static void main (String[] args) {
         
        new HardSkillsGUI().setGUI();
            
    }
    
}
