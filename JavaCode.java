
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEHUL
 */
public class FrontEnd extends javax.swing.JFrame {
    void datentry(){
        DateTimeFormatter dat=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now=LocalDateTime.now();
        String comp=dat.format(now);
        cdate.setText(comp);
        
    }

    /**
     * Creates new form FrontEnd
     */
    public FrontEnd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edes = new javax.swing.JTextArea();
        ename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        evenu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        etime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cdate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Event Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 130, 268, 41);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Event Description");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 180, 268, 29);

        edes.setColumns(20);
        edes.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        edes.setRows(10);
        jScrollPane1.setViewportView(edes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(533, 162, 336, 173);

        ename.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(ename);
        ename.setBounds(533, 114, 336, 41);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Event Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 380, 268, 29);

        edate.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(edate);
        edate.setBounds(533, 362, 336, 35);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Event Venue");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 430, 268, 29);

        evenu.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(evenu);
        evenu.setBounds(533, 415, 336, 32);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Event Time");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 480, 268, 29);

        etime.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(etime);
        etime.setBounds(533, 465, 336, 35);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("   Events Counter");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(208, 30, 342, 42);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Enter Event");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(374, 549, 188, 59);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 102));
        jLabel10.setText("Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(644, 30, 76, 45);

        cdate.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        cdate.setForeground(new java.awt.Color(255, 102, 102));
        getContentPane().add(cdate);
        cdate.setBounds(727, 30, 134, 45);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fback.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-170, -100, 1130, 850);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        datentry();
        
        String name=ename.getText();
        String descr=edes.getText();
        int date = Integer.parseInt(edate.getText());
        String venue=evenu.getText();
        int time=Integer.parseInt(etime.getText());
        
        
        
         Connection con=null;
        try {
            int i=1;
            Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            String acc="accc";
            String q="INSERT INTO events (eno,ename,description,edate,venue,etime ) VALUES ('"+i+"','"+name+"','"+descr+"',"+date+",'"+venue+"','"+time+"')";
            
            Statement stmt=con.createStatement();
            int a=stmt.executeUpdate(q);
            if(a>0)
            {
                JOptionPane.showMessageDialog(this,"Data is saved successfully");
                 System.out.println("inserted");
            }               
            else
                 System.out.println("not inserted");
             con.close();
             i++;
            
            
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.print("Please Try Again");
        }
        
        
        
        
        
        
        
        
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel cdate;
    private javax.swing.JTextField edate;
    private javax.swing.JTextArea edes;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField etime;
    private javax.swing.JTextField evenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
