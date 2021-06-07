/**
 * Project 2
 * @author Jayden Johnson 219086796
 * 2021
 */
package za.ac.cput.project2;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class ProjectGUI extends JFrame implements ActionListener  {
    
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
    
    public ProjectGUI (){
     
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
        
        panelCenter.setLayout(new GridLayout(12, 1));
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
        
        mainFrame.getContentPane().setPreferredSize(new Dimension(500, 500));

        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);   
         
    }

    @Override
    public void actionPerformed(ActionEvent e){
  
        if (e.getActionCommand().equals("Save")){ 
            ArrayList list = new ArrayList<>();
            if (chkApplicationDevelopment.isSelected()){
                list.add("Application Development");
            }
            if (chkArchitecture.isSelected()){
                list.add("Architecture");
            }
            if (chkArtificialIntelligence.isSelected()){
                list.add("Artificial Intelligence");
            }
            if (chkCloudComputing.isSelected()){
                list.add("Cloud Computing");
            }
            if (chkHTML.isSelected()){
                list.add("HTML");
            }
            if (chkC.isSelected()){
                list.add("C++");
            }
            if (chkCLanguage.isSelected()){
                list.add("C Language");
            }
            if (chkPHP.isSelected()){
                list.add("PHP");
            }
            if (chkUXDesign.isSelected()){
                list.add("UX Design");
            }
            if (chkPython.isSelected()){
                list.add("Python");
            }
            if (chkJavaScript.isSelected()){
                list.add("JavaScript");
            }
            if (chkJava.isSelected()){
                list.add("Java");
            } 
            JOptionPane.showMessageDialog(null, "The following hard skills saved: " + "\n" + list);
        }
        
        else if (e.getActionCommand().equals("Back")){
            System.exit(0);
        } 
        
        else if (e.getActionCommand().equals("Next")){
            System.exit(0);
        } 
        
    }
    
    public static void main (String[] args) {
         
        new ProjectGUI().setGUI();
            
    }
    
}
