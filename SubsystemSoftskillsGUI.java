
package project2subsystem;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// JESSE HIEBNER | Student Number: 220357676


public class SubsystemSoftskillsGUI extends javax.swing.JFrame
{ 
    ArrayList <String> SoftSkillsList = new ArrayList<>();
    String FinalListOutput;
    public SubsystemSoftskillsGUI()
    {        
        SoftSkillsList.add("Communication");
        SoftSkillsList.add("Organization");
        SoftSkillsList.add("Teamwork");
        SoftSkillsList.add("Punctuality");
        SoftSkillsList.add("Critical Thinking");
        SoftSkillsList.add("Social Skills");
        SoftSkillsList.add("Creativity");
        SoftSkillsList.add("Interpersonal Communication");
        SoftSkillsList.add("Adaptibility");
        SoftSkillsList.add("Friendly Personality");    
           
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        BtnContinue = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        ChkBxCommunication = new javax.swing.JCheckBox();
        ChkBxOrganization = new javax.swing.JCheckBox();
        ChkBxTeamwork = new javax.swing.JCheckBox();
        ChkBxPunctuality = new javax.swing.JCheckBox();
        ChkBxCritThinking = new javax.swing.JCheckBox();
        ChkBxSocialSkills = new javax.swing.JCheckBox();
        ChkBxCreativity = new javax.swing.JCheckBox();
        ChkBxIntrCom = new javax.swing.JCheckBox();
        ChkBxAdaptability = new javax.swing.JCheckBox();
        ChkBxFriendlyPersonality = new javax.swing.JCheckBox();
        LblSoftskills = new javax.swing.JLabel();
        PnlPinkColourBottom = new javax.swing.JPanel();
        PnlPinkColourTop = new javax.swing.JPanel();
        PnlPinkColourLeft = new javax.swing.JPanel();
        PnlPinkColourRight = new javax.swing.JPanel();
        BtnSaveSkills = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnContinue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnContinue.setText("Continue");
        BtnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinueActionPerformed(evt);
            }
        });

        BtnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        ChkBxCommunication.setText("Communication");

        ChkBxOrganization.setText("Organization");

        ChkBxTeamwork.setText("Teamwork");

        ChkBxPunctuality.setText("Punctuality");

        ChkBxCritThinking.setText("Critical Thinking");

        ChkBxSocialSkills.setText("Social Skills");

        ChkBxCreativity.setText("Creativity");

        ChkBxIntrCom.setText("Interpersonal Communication");

        ChkBxAdaptability.setText("Adaptability");

        ChkBxFriendlyPersonality.setText("Friendly Personality");

        LblSoftskills.setBackground(new java.awt.Color(0, 204, 255));
        LblSoftskills.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LblSoftskills.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSoftskills.setText("Softskills");
        LblSoftskills.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PnlPinkColourBottom.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourBottomLayout = new javax.swing.GroupLayout(PnlPinkColourBottom);
        PnlPinkColourBottom.setLayout(PnlPinkColourBottomLayout);
        PnlPinkColourBottomLayout.setHorizontalGroup(
            PnlPinkColourBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnlPinkColourBottomLayout.setVerticalGroup(
            PnlPinkColourBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        PnlPinkColourTop.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourTopLayout = new javax.swing.GroupLayout(PnlPinkColourTop);
        PnlPinkColourTop.setLayout(PnlPinkColourTopLayout);
        PnlPinkColourTopLayout.setHorizontalGroup(
            PnlPinkColourTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnlPinkColourTopLayout.setVerticalGroup(
            PnlPinkColourTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        PnlPinkColourLeft.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourLeftLayout = new javax.swing.GroupLayout(PnlPinkColourLeft);
        PnlPinkColourLeft.setLayout(PnlPinkColourLeftLayout);
        PnlPinkColourLeftLayout.setHorizontalGroup(
            PnlPinkColourLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PnlPinkColourLeftLayout.setVerticalGroup(
            PnlPinkColourLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PnlPinkColourRight.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourRightLayout = new javax.swing.GroupLayout(PnlPinkColourRight);
        PnlPinkColourRight.setLayout(PnlPinkColourRightLayout);
        PnlPinkColourRightLayout.setHorizontalGroup(
            PnlPinkColourRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        PnlPinkColourRightLayout.setVerticalGroup(
            PnlPinkColourRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        BtnSaveSkills.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSaveSkills.setText("Save Skills");
        BtnSaveSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveSkillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSoftskills, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlPinkColourBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlPinkColourTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PnlPinkColourLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkBxOrganization)
                            .addComponent(ChkBxTeamwork)
                            .addComponent(ChkBxPunctuality)
                            .addComponent(ChkBxCritThinking)
                            .addComponent(ChkBxCommunication))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkBxAdaptability)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ChkBxIntrCom)
                                .addComponent(ChkBxCreativity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ChkBxSocialSkills, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(ChkBxFriendlyPersonality))
                        .addGap(69, 69, 69)
                        .addComponent(PnlPinkColourRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSaveSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BtnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblSoftskills, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlPinkColourTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication)
                            .addComponent(ChkBxSocialSkills))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxOrganization)
                            .addComponent(ChkBxCreativity))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxTeamwork)
                            .addComponent(ChkBxIntrCom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxPunctuality)
                            .addComponent(ChkBxAdaptability))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCritThinking)
                            .addComponent(ChkBxFriendlyPersonality))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PnlPinkColourRight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlPinkColourLeft, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(PnlPinkColourBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSaveSkills, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
     System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinueActionPerformed
       //This button in the future will load one of the students' form
       this.dispose(); 
       
       JFrame HardSkillsGUI = new JFrame();
       HardSkillsGUI.setVisible(true);
                
    }//GEN-LAST:event_BtnContinueActionPerformed

    private void BtnSaveSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveSkillsActionPerformed
        //Save skills which were selected
        FinalListOutput = "";
        if (ChkBxCommunication.isSelected()) 
        {
             FinalListOutput = SoftSkillsList.get(0) + " \n";
        }
        if (ChkBxOrganization.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(1) + " \n";
        }
         if (ChkBxTeamwork.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(2) + " \n";
        }
          if (ChkBxPunctuality.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(3) + " \n";
        }
           if (ChkBxCritThinking.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(4) + " \n";
        }
            if (ChkBxSocialSkills.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(5) + " \n";
        }
             if (ChkBxCreativity.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(6) + " \n";
        }
             if (ChkBxIntrCom.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(7) + " \n";
        }             
               if (ChkBxAdaptability.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(8) + " \n";
        } 
               if (ChkBxFriendlyPersonality.isSelected())
        {
             FinalListOutput = FinalListOutput + SoftSkillsList.get(9) + " \n";
        }
               
        JOptionPane.showMessageDialog(null, "You have saved the following Soft Skills:\n" + FinalListOutput);
    }//GEN-LAST:event_BtnSaveSkillsActionPerformed

    public static void main(String args[])
    {
       
    // Subsystem
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubsystemSoftskillsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinue;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSaveSkills;
    private javax.swing.JCheckBox ChkBxAdaptability;
    private javax.swing.JCheckBox ChkBxCommunication;
    private javax.swing.JCheckBox ChkBxCreativity;
    private javax.swing.JCheckBox ChkBxCritThinking;
    private javax.swing.JCheckBox ChkBxFriendlyPersonality;
    private javax.swing.JCheckBox ChkBxIntrCom;
    private javax.swing.JCheckBox ChkBxOrganization;
    private javax.swing.JCheckBox ChkBxPunctuality;
    private javax.swing.JCheckBox ChkBxSocialSkills;
    private javax.swing.JCheckBox ChkBxTeamwork;
    private javax.swing.JLabel LblSoftskills;
    private javax.swing.JPanel PnlPinkColourBottom;
    private javax.swing.JPanel PnlPinkColourLeft;
    private javax.swing.JPanel PnlPinkColourRight;
    private javax.swing.JPanel PnlPinkColourTop;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
