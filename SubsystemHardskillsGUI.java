       
/*
Jayden Johnson
 */
package za.ac.cput.projectmerg1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SubsystemHardskillsGUI extends javax.swing.JFrame {

    ArrayList <String> HardSkillsList = new ArrayList<>();
    String ListOutput;
    String FinalListOutput = "";
    public SubsystemHardskillsGUI()
    {        
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
           
        initComponents();
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblSoftskills = new javax.swing.JLabel();
        PnlPinkColourLeft = new javax.swing.JPanel();
        ChkBxCommunication = new javax.swing.JCheckBox();
        ChkBxCommunication1 = new javax.swing.JCheckBox();
        ChkBxCommunication2 = new javax.swing.JCheckBox();
        ChkBxCommunication3 = new javax.swing.JCheckBox();
        ChkBxCommunication4 = new javax.swing.JCheckBox();
        ChkBxCommunication5 = new javax.swing.JCheckBox();
        ChkBxCommunication6 = new javax.swing.JCheckBox();
        ChkBxCommunication8 = new javax.swing.JCheckBox();
        ChkBxCommunication9 = new javax.swing.JCheckBox();
        ChkBxCommunication10 = new javax.swing.JCheckBox();
        ChkBxCommunication11 = new javax.swing.JCheckBox();
        PnlPinkColourRight = new javax.swing.JPanel();
        ChkBxCommunication7 = new javax.swing.JCheckBox();
        BtnExit = new javax.swing.JButton();
        BtnSaveSkills = new javax.swing.JButton();
        BtnContinue = new javax.swing.JButton();
        PnlPinkColourTop = new javax.swing.JPanel();
        PnlPinkColourBottom = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblSoftskills.setBackground(new java.awt.Color(0, 204, 255));
        LblSoftskills.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LblSoftskills.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSoftskills.setText("Hard Skills");
        LblSoftskills.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PnlPinkColourLeft.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourLeftLayout = new javax.swing.GroupLayout(PnlPinkColourLeft);
        PnlPinkColourLeft.setLayout(PnlPinkColourLeftLayout);
        PnlPinkColourLeftLayout.setHorizontalGroup(
            PnlPinkColourLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        PnlPinkColourLeftLayout.setVerticalGroup(
            PnlPinkColourLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ChkBxCommunication.setText("Application Development");
        ChkBxCommunication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunicationActionPerformed(evt);
            }
        });

        ChkBxCommunication1.setText("Architecture");
        ChkBxCommunication1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunication1ActionPerformed(evt);
            }
        });

        ChkBxCommunication2.setText("C++");

        ChkBxCommunication3.setText("HTML");

        ChkBxCommunication4.setText("Artificial Intelligence");
        ChkBxCommunication4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunication4ActionPerformed(evt);
            }
        });

        ChkBxCommunication5.setText("C Language");

        ChkBxCommunication6.setText("Cloud Computing");
        ChkBxCommunication6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunication6ActionPerformed(evt);
            }
        });

        ChkBxCommunication8.setText("Java");
        ChkBxCommunication8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunication8ActionPerformed(evt);
            }
        });

        ChkBxCommunication9.setText("PHP");

        ChkBxCommunication10.setText("Python");
        ChkBxCommunication10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunication10ActionPerformed(evt);
            }
        });

        ChkBxCommunication11.setText("JavaScript");

        PnlPinkColourRight.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourRightLayout = new javax.swing.GroupLayout(PnlPinkColourRight);
        PnlPinkColourRight.setLayout(PnlPinkColourRightLayout);
        PnlPinkColourRightLayout.setHorizontalGroup(
            PnlPinkColourRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        PnlPinkColourRightLayout.setVerticalGroup(
            PnlPinkColourRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ChkBxCommunication7.setText("UX Design");
        ChkBxCommunication7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxCommunication7ActionPerformed(evt);
            }
        });

        BtnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExit.setText("Back");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnSaveSkills.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSaveSkills.setText("Save Skills");
        BtnSaveSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveSkillsActionPerformed(evt);
            }
        });

        BtnContinue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnContinue.setText("Exit");
        BtnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinueActionPerformed(evt);
            }
        });

        PnlPinkColourTop.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourTopLayout = new javax.swing.GroupLayout(PnlPinkColourTop);
        PnlPinkColourTop.setLayout(PnlPinkColourTopLayout);
        PnlPinkColourTopLayout.setHorizontalGroup(
            PnlPinkColourTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        PnlPinkColourTopLayout.setVerticalGroup(
            PnlPinkColourTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        PnlPinkColourBottom.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PnlPinkColourBottomLayout = new javax.swing.GroupLayout(PnlPinkColourBottom);
        PnlPinkColourBottom.setLayout(PnlPinkColourBottomLayout);
        PnlPinkColourBottomLayout.setHorizontalGroup(
            PnlPinkColourBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        PnlPinkColourBottomLayout.setVerticalGroup(
            PnlPinkColourBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSaveSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PnlPinkColourLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkBxCommunication4)
                                    .addComponent(ChkBxCommunication)
                                    .addComponent(ChkBxCommunication1)
                                    .addComponent(ChkBxCommunication6)
                                    .addComponent(ChkBxCommunication3)
                                    .addComponent(ChkBxCommunication2))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkBxCommunication5)
                                    .addComponent(ChkBxCommunication9)
                                    .addComponent(ChkBxCommunication7)
                                    .addComponent(ChkBxCommunication10)
                                    .addComponent(ChkBxCommunication11)
                                    .addComponent(ChkBxCommunication8))
                                .addGap(106, 106, 106)
                                .addComponent(PnlPinkColourRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblSoftskills, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PnlPinkColourTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PnlPinkColourBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblSoftskills, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlPinkColourTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PnlPinkColourRight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication)
                            .addComponent(ChkBxCommunication5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication1)
                            .addComponent(ChkBxCommunication9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication4)
                            .addComponent(ChkBxCommunication7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication6)
                            .addComponent(ChkBxCommunication10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication3)
                            .addComponent(ChkBxCommunication11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkBxCommunication2)
                            .addComponent(ChkBxCommunication8)))
                    .addComponent(PnlPinkColourLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(PnlPinkColourBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnSaveSkills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChkBxCommunication1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunication1ActionPerformed

    }//GEN-LAST:event_ChkBxCommunication1ActionPerformed

    private void ChkBxCommunication4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunication4ActionPerformed

    }//GEN-LAST:event_ChkBxCommunication4ActionPerformed

    private void ChkBxCommunication6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunication6ActionPerformed

    }//GEN-LAST:event_ChkBxCommunication6ActionPerformed

    private void ChkBxCommunication10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunication10ActionPerformed

    }//GEN-LAST:event_ChkBxCommunication10ActionPerformed

    private void ChkBxCommunication8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunication8ActionPerformed

    }//GEN-LAST:event_ChkBxCommunication8ActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        new SubsystemSoftskillsGUI().setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnSaveSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveSkillsActionPerformed
        //Save skills which were selected
        ListOutput = "";
        if (ChkBxCommunication.isSelected())
        {
            ListOutput = HardSkillsList.get(0) + " \n";
        }
        if (ChkBxCommunication1.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(1) + " \n";
        }
        if (ChkBxCommunication4.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(2) + " \n";
        }
        if (ChkBxCommunication6.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(3) + " \n";
        }
        if (ChkBxCommunication3.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(4) + " \n";
        }
        if (ChkBxCommunication2.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(5) + " \n";
        }
        if (ChkBxCommunication5.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(6) + " \n";
        }
        if (ChkBxCommunication9.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(7) + " \n";
        }
        if (ChkBxCommunication7.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(8) + " \n";
        }
        if (ChkBxCommunication10.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(9) + " \n";
        }
        if (ChkBxCommunication11.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(10) + " \n";
        }
        if (ChkBxCommunication8.isSelected())
        {
            ListOutput = ListOutput + HardSkillsList.get(11) + " \n";
        }        

        try{
            FileWriter write = new FileWriter("C:/Users/Julian/Desktop/Files/HardSkills.txt",true);
            BufferedWriter buff = new BufferedWriter(write);
            buff.write(new java.util.Date() + "\n" + "Hard Skills:" + "\n" +  ListOutput + "\n");
            buff.close();
        }
        catch (IOException a){
            System.err.println("Error while writing to file: " + a.getMessage());
        }
        
        

        JOptionPane.showMessageDialog(null,"You have saved the following Hard Skills:\n" + ListOutput);
    }//GEN-LAST:event_BtnSaveSkillsActionPerformed

    private void BtnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinueActionPerformed
           System.exit(0);
    }//GEN-LAST:event_BtnContinueActionPerformed

    private void ChkBxCommunicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunicationActionPerformed

    }//GEN-LAST:event_ChkBxCommunicationActionPerformed

    private void ChkBxCommunication7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxCommunication7ActionPerformed

    }//GEN-LAST:event_ChkBxCommunication7ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubsystemHardskillsGUI().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinue;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSaveSkills;
    private javax.swing.JCheckBox ChkBxCommunication;
    private javax.swing.JCheckBox ChkBxCommunication1;
    private javax.swing.JCheckBox ChkBxCommunication10;
    private javax.swing.JCheckBox ChkBxCommunication11;
    private javax.swing.JCheckBox ChkBxCommunication2;
    private javax.swing.JCheckBox ChkBxCommunication3;
    private javax.swing.JCheckBox ChkBxCommunication4;
    private javax.swing.JCheckBox ChkBxCommunication5;
    private javax.swing.JCheckBox ChkBxCommunication6;
    private javax.swing.JCheckBox ChkBxCommunication7;
    private javax.swing.JCheckBox ChkBxCommunication8;
    private javax.swing.JCheckBox ChkBxCommunication9;
    private javax.swing.JLabel LblSoftskills;
    private javax.swing.JPanel PnlPinkColourBottom;
    private javax.swing.JPanel PnlPinkColourLeft;
    private javax.swing.JPanel PnlPinkColourRight;
    private javax.swing.JPanel PnlPinkColourTop;
    // End of variables declaration//GEN-END:variables
}
