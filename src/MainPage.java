/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    
    public static LoginFrom login = new LoginFrom();
    public static RegisterForm register = new RegisterForm();
    public static Full_details fd = new Full_details();   
    public static CustomerForm cf = new CustomerForm();  
    public static Customer_table ct = new Customer_table();  
    public static Customer_update cu=new Customer_update();
    public static Customer_delete cd=new Customer_delete();
    public static MobileForm mf=new MobileForm();
    public static Mobile_table mt=new Mobile_table();
    public static Mobile_delete md=new Mobile_delete();
    public static Mobile_update mu=new Mobile_update();
    public static Buy_form bf=new Buy_form();
    public static Report report=new Report();
    public static Bill_form bill=new Bill_form();
    public MainPage() {
        initComponents();
        
        jDesktopPane1.add(login);
        jDesktopPane1.add(register);
        jDesktopPane1.setVisible(true);
        jDesktopPane1.add(fd);
        jDesktopPane1.add(cf);
        jDesktopPane1.add(ct);
        jDesktopPane1.add(cu);
        jDesktopPane1.add(cd);
        jDesktopPane1.add(mf);
        jDesktopPane1.add(mt);
        jDesktopPane1.add(md);
        jDesktopPane1.add(mu);
        jDesktopPane1.add(bf);
        jDesktopPane1.add(report);
        jDesktopPane1.add(bill);
        login.setVisible(true);
        register.setVisible(false);
        fd.setVisible(false);
        cf.setVisible(false);
        ct.setVisible(false);
        cu.setVisible(false);
        cd.setVisible(false);
        mf.setVisible(false);
        mt.setVisible(false);
        md.setVisible(false);
        mu.setVisible(false);
        bf.setVisible(false);
        report.setVisible(false);
        bill.setVisible(false);

       jDesktopPane1.moveToFront(login);
       resize();
    }
    
    public void resize(){
        login.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        login.setLocation(0,0);
        register.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        fd.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        cf.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        ct.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        cu.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        cd.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        mf.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        mt.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        md.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        mu.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        bf.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        report.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        bill.setSize(jDesktopPane1.getWidth(),jDesktopPane1.getHeight());
        register.setLocation(0,0);
        fd.setLocation(0,0);
        cf.setLocation(0,0);
        ct.setLocation(0,0);
        cu.setLocation(0,0);
        cd.setLocation(0,0);
        mf.setLocation(0,0);
        mt.setLocation(0,0);
        md.setLocation(0,0);
        mu.setLocation(0,0);
        bf.setLocation(0,0);
        report.setLocation(0,0);
        bill.setLocation(0,0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDesktopPane1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentResized
        // TODO add your handling code here:
        resize();
    }//GEN-LAST:event_jDesktopPane1ComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*jyoti
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
