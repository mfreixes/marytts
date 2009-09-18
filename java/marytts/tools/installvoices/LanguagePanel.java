/*
 * LanguagePanel.java
 *
 * Created on 17. September 2009, 16:31
 */

package marytts.tools.installvoices;

/**
 *
 * @author  marc
 */
public class LanguagePanel extends javax.swing.JPanel {
    
    /** Creates new form LanguagePanel */
    public LanguagePanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel8 = new javax.swing.JLabel();
        lLocale = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lVersion = new javax.swing.JLabel();
        lNameValue = new javax.swing.JLabel();
        lLocaleValue = new javax.swing.JLabel();
        lVersionValue = new javax.swing.JLabel();
        cbSelect = new javax.swing.JCheckBox();
        lSize = new javax.swing.JLabel();
        lSizeValue = new javax.swing.JLabel();
        spDescription = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        lStatus = new javax.swing.JLabel();
        lStatusValue = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel8.setText("Version:");

        setBorder(javax.swing.BorderFactory.createTitledBorder("Language"));
        lLocale.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lLocale.setText("Locale:");

        lName.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lName.setText("Name:");

        lVersion.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lVersion.setText("Version:");

        lNameValue.setText("de");

        lLocaleValue.setText("de");

        lVersionValue.setText("4.0.0");

        cbSelect.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cbSelect.setMargin(new java.awt.Insets(0, 0, 0, 0));

        lSize.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lSize.setText("Size:");

        lSizeValue.setText("400kB");

        taDescription.setColumns(20);
        taDescription.setEditable(false);
        taDescription.setFont(new java.awt.Font("Courier New", 0, 10));
        taDescription.setRows(5);
        taDescription.setText("German language components");
        spDescription.setViewportView(taDescription);

        lStatus.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lStatus.setText("Status:");

        lStatusValue.setText("available");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cbSelect)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lStatus)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(lStatusValue)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 297, Short.MAX_VALUE)
                                .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(5, 5, 5)
                                .add(lName)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lNameValue)
                                .add(62, 62, 62)
                                .add(lLocale)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lLocaleValue)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 67, Short.MAX_VALUE)
                                .add(lVersion)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lVersionValue)
                                .add(59, 59, 59)
                                .add(lSize)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lSizeValue)))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(spDescription, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .add(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lVersion)
                    .add(lVersionValue)
                    .add(lSizeValue)
                    .add(lSize)
                    .add(cbSelect, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lName)
                    .add(lNameValue)
                    .add(lLocale)
                    .add(lLocaleValue))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(spDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(lStatus)
                        .add(lStatusValue))
                    .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbSelect;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lLocale;
    private javax.swing.JLabel lLocaleValue;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lNameValue;
    private javax.swing.JLabel lSize;
    private javax.swing.JLabel lSizeValue;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lStatusValue;
    private javax.swing.JLabel lVersion;
    private javax.swing.JLabel lVersionValue;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JScrollPane spDescription;
    private javax.swing.JTextArea taDescription;
    // End of variables declaration//GEN-END:variables
    
}