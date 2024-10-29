
package Sesion35LopezED_Pila2;

import java.util.Stack;
import javax.swing.JOptionPane;


public class TestLibroPila extends javax.swing.JFrame {
        //declaracion de pila libros
    Stack<Libro> pila =new Stack<Libro>();
    
    Libro libro1=new Libro("Ceballos", "c++", 2024, "Ed.Rama");
     Libro libro2=new Libro("Deitel", "Java", 2023, "Ed.Mc Graw Hill");
      Libro libro3=new Libro("Grssmann", "Angular", 2024, "Ed.Planeta");
       Libro libro4=new Libro("Ceballos", "c", 2024, "Ed.RAMA");
        Libro libro5=new Libro("Garcia", "Android", 2023, "Ed.Trillas");
        
    public TestLibroPila() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnConsultarLibrosPila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Operaciones Libros Biblioteca LOPEZ");

        btnConsultarLibrosPila.setText("Consultar Libros");
        btnConsultarLibrosPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLibrosPilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnConsultarLibrosPila)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(57, 57, 57)
                .addComponent(btnConsultarLibrosPila)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarLibrosPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLibrosPilaActionPerformed
        // agrregar informacion de libros
        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);
        
        //imprimri informaciond de libros(en la pila)
       
         while (!pila.isEmpty()) {//inicia while
             JOptionPane.showMessageDialog(null, "DATOS DE LIBROS"
                                               +"\n Autor: "+pila.peek().getAutor()
                                               +"\n Titulo: "+pila.peek().getTitulo()
                                               +"\n Fecha de Publicacion: "+pila.peek().getAnio()
                                               +"\n Editorial: "+pila.peek().getEditorial());
             pila.pop();//ultimo elemento de la pila
        }//termina while
    }//GEN-LAST:event_btnConsultarLibrosPilaActionPerformed

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
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLibroPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarLibrosPila;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
