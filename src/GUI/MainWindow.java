/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.SessionParameters;
import javax.swing.text.DefaultCaret;
import logic.GlobalParameters;
import logic.IniHandler;
import logic.LangHandler;
import logic.YdlBridge_slimlined;

/**
 *
 * @author Ozymandias42
 */
public class MainWindow extends javax.swing.JFrame {
    private MainWindow mw;
    private final MainWindowHandler mwh;
    private SessionParameters dp;

    /**
     * Creates new form MainWindow2
     */
    public MainWindow() {
        MainWindowHandler.init(this);
        this.mwh = MainWindowHandler.getMWI();
        GlobalParameters.init();
        IniHandler.init();
        IniHandler.getIni();
        LangHandler.init();
        initComponents();
        //IniHandler.getIni();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vidDownButton = new javax.swing.JButton();
        audDownButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        ydlOutputLabel = new javax.swing.JLabel();
        urlTextField = new javax.swing.JTextField();
        urlFieldLabel = new javax.swing.JLabel();
        downloadProgressBar = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        ydlOutput = new javax.swing.JTextArea();
        pbarTxtLabel = new javax.swing.JLabel();
        dwnDstLabel = new javax.swing.JLabel();
        dwnDst = new javax.swing.JLabel();
        changeDwnDstButton = new javax.swing.JButton();
        jMenuBar1 = (javax.swing.JMenuBar) new MenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(LangHandler.getValue("mw.title")
        );

        String vddwnbtn = LangHandler.getValue("mw.downvid-btn");
        vidDownButton.setText(vddwnbtn);
        vidDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidDownButtonActionPerformed(evt);
            }
        });

        String auddwnbtn = LangHandler.getValue("mw.downaud-btn");
        audDownButton.setText(auddwnbtn);
        audDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audDownButtonActionPerformed(evt);
            }
        });

        String label = LangHandler.getValue("mw.exitbutton");
        exitButton.setText(label);
        exitButton.setFocusCycleRoot(true);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        String ydloutlabel = LangHandler.getValue("mw.ydlout-label");
        ydlOutputLabel.setText(ydloutlabel);

        String defText = LangHandler.getValue("mw.url-field");
        urlTextField.setText(defText);
        urlTextField.setToolTipText("");

        urlFieldLabel.setText(LangHandler.getValue("mw.url-field.label"));

        ydlOutput.setEditable(false);
        ydlOutput.setColumns(20);
        ydlOutput.setLineWrap(true);
        ydlOutput.setRows(5);
        DefaultCaret caret = (DefaultCaret)ydlOutput.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        jScrollPane2.setViewportView(ydlOutput);

        pbarTxtLabel.setText("-%");
        pbarTxtLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        dwnDstLabel.setText(LangHandler.getValue("mw.save-path.label"));

        dwnDst.setText(IniHandler.getIni().getProperty("default-download.path"));

        changeDwnDstButton.setText("...");
        changeDwnDstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDwnDstButtonActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dwnDstLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(vidDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                        .addComponent(audDownButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(dwnDst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(changeDwnDstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(downloadProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pbarTxtLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(urlFieldLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(urlTextField)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ydlOutputLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(urlFieldLabel))
                    .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dwnDstLabel)
                    .addComponent(dwnDst)
                    .addComponent(changeDwnDstButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(audDownButton)
                    .addComponent(vidDownButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ydlOutputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(downloadProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton))
                    .addComponent(pbarTxtLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void vidDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidDownButtonActionPerformed
        // TODO add your handling code here:
        this.dp = SessionParameters.getInstance();
        dp.configParameters(urlTextField.getText(), 0, dwnDst.getText());
        YdlBridge_slimlined ydlbs = null;

        try {
            ydlbs = new YdlBridge_slimlined();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ydlbs.start();
        
        
        
    }//GEN-LAST:event_vidDownButtonActionPerformed

    private void audDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audDownButtonActionPerformed
        // TODO add your handling code here:
        this.dp = SessionParameters.getInstance();
        dp.configParameters(urlTextField.getText(), 1, dwnDst.getText());
        YdlBridge_slimlined ydlbs = null;
        
        try {
            ydlbs = new YdlBridge_slimlined();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ydlbs.start();
        
    }//GEN-LAST:event_audDownButtonActionPerformed

    private void changeDwnDstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDwnDstButtonActionPerformed
        // TODO add your handling code here:
        YdlFileChooser chooser = new YdlFileChooser(this);
        if(chooser.showDiag()!=0){
            String path = chooser.getPath();
            dwnDst.setText(path);
        }
    }//GEN-LAST:event_changeDwnDstButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        // handle exception
        // handle exception
        // handle exception


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton audDownButton;
    private javax.swing.JButton changeDwnDstButton;
    private javax.swing.JProgressBar downloadProgressBar;
    private javax.swing.JLabel dwnDst;
    private javax.swing.JLabel dwnDstLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pbarTxtLabel;
    private javax.swing.JLabel urlFieldLabel;
    private javax.swing.JTextField urlTextField;
    private javax.swing.JButton vidDownButton;
    private javax.swing.JTextArea ydlOutput;
    private javax.swing.JLabel ydlOutputLabel;
    // End of variables declaration//GEN-END:variables

    public void ydlOutputAddLine(String line) {
        ydlOutput.append(line);
        
    }
    public void downloadProgessbarUpdate(int i){
        downloadProgressBar.setValue(i);
        pbarTxtLabel.setText(Integer.toString(i)+"%");
    }
    
    public void updateDefDwnDst(String newPath){
        this.dwnDst.setText(newPath);
    }
}
