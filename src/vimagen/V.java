
package vimagen;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class V extends javax.swing.JFrame {
JLabel lb =new JLabel();
ImageIcon  icono,ajuste;
String [] imagenes ={"imagen1","imagen2","imagen3","imagen4","imagen5","imagen6"};
int i=0,j;
String imagen, ruta;
ImageIcon[] imagenesLista=new ImageIcon[6];
        

    
    public V() {
        initComponents();
       mostrarImagen();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNext = new javax.swing.JButton();
        LBMissatge = new javax.swing.JLabel();
        BTSortir = new javax.swing.JToggleButton();
        BTDetras = new javax.swing.JButton();
        BTImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNext.setText("Next");
        BTNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNextActionPerformed(evt);
            }
        });

        LBMissatge.setText("jLabel1");
        LBMissatge.setPreferredSize(new java.awt.Dimension(400, 400));
        LBMissatge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBMissatgeMouseClicked(evt);
            }
        });

        BTSortir.setText("Surtir");
        BTSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSortirActionPerformed(evt);
            }
        });

        BTDetras.setText("Detras");
        BTDetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTDetrasActionPerformed(evt);
            }
        });

        BTImagen.setText("jButton1");
        BTImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BTDetras, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNext, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(232, Short.MAX_VALUE)
                        .addComponent(LBMissatge, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTSortir, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(BTImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(BTSortir)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTDetras, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNext, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(LBMissatge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BTImagen)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSortirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTSortirActionPerformed

    private void BTNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNextActionPerformed
        
        
       
                    i++;
                imagenesLista[i]= new ImageIcon(getClass().getResource("/vimagen/img/"+imagenes[i]+".jpeg"));
          //this.LBMissatge.setIcon(icono);
            ajuste= new ImageIcon(imagenesLista[i].getImage().getScaledInstance(LBMissatge.getWidth(),LBMissatge.getHeight(),Image.SCALE_SMOOTH)); 
            
               
              if(i<imagenesLista.length) 
            {
                
                LBMissatge.setIcon(ajuste);
            }
        
          
    }//GEN-LAST:event_BTNextActionPerformed

    private void BTDetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTDetrasActionPerformed
        i--;
        imagenesLista[i]= new ImageIcon(getClass().getResource("/vimagen/img/"+imagenes[i]+".jpeg"));
          //this.LBMissatge.setIcon(icono);
            ajuste= new ImageIcon(imagenesLista[i].getImage().getScaledInstance(LBMissatge.getWidth(),LBMissatge.getHeight(),Image.SCALE_SMOOTH)); 
            
               
              if(i>=0) 
            {
                
                LBMissatge.setIcon(ajuste);
            }
    }//GEN-LAST:event_BTDetrasActionPerformed

    private void BTImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTImagenActionPerformed

    private void LBMissatgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBMissatgeMouseClicked
         icono= new ImageIcon(getClass().getResource("/vimagen/img/"+imagenes[i]+".jpeg"));
          //this.LBMissatge.setIcon(icono);
        ajuste= new ImageIcon(icono.getImage().getScaledInstance(LBMissatge.getWidth(),LBMissatge.getHeight(),Image.SCALE_SMOOTH)); 
         this.BTImagen.setIcon(ajuste);
        //this.repaint();              
    }//GEN-LAST:event_LBMissatgeMouseClicked

   
    
    
    public void mostrarImagen()
    {
         
         icono= new ImageIcon(getClass().getResource("/vimagen/img/"+imagenes[0]+".jpeg"));
          //this.LBMissatge.setIcon(icono);
        ajuste= new ImageIcon(icono.getImage().getScaledInstance(LBMissatge.getWidth(),LBMissatge.getHeight(),Image.SCALE_SMOOTH)); 
          LBMissatge.setIcon(ajuste);
        //this.repaint();                         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTDetras;
    private javax.swing.JButton BTImagen;
    private javax.swing.JButton BTNext;
    private javax.swing.JToggleButton BTSortir;
    private javax.swing.JLabel LBMissatge;
    // End of variables declaration//GEN-END:variables
}
