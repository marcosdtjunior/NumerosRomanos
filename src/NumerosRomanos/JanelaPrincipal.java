/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosRomanos;

/**
 *
 * @author Marcos Júnior
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JanelaPrincipal extends JFrame {

    private JButton jButton1;

    private JLabel jLabel1;

    private JScrollPane jScrollPane1;

    private JTextField jTextField1;

    private JTextPane jTextPane1;

    public JanelaPrincipal() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTextPane1 = new JTextPane();
        setDefaultCloseOperation(3);
        setTitle("Conversor de Números Romanos");
        this.jLabel1.setText("Digite um número de 0 a 3999");
        this.jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JanelaPrincipal.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jButton1.setText("Converter para Números Romanos");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JanelaPrincipal.this.jButton1ActionPerformed(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTextPane1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addComponent(this.jTextField1, -2, 96, -2).addGap(37, 37, 37).addComponent(this.jButton1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, 32767).addComponent(this.jScrollPane1, -2, 125, -2).addGap(27, 27, 27)).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel1).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addComponent(this.jScrollPane1, -2, -1, -2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 22, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jButton1)))).addContainerGap(29, 32767)));
        getAccessibleContext().setAccessibleName("");
        pack();
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String numero = this.jTextField1.getText();
        int decimal = Integer.parseInt(numero);
        this.jTextPane1.setText(NumerosRomanos.converter(decimal));
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new JanelaPrincipal()).setVisible(true);
            }
        });
    }
}
