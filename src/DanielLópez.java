
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xp
 */
public class DanielLópez extends javax.swing.JFrame {
//creamos una variable de tipo linea para guardar y la llamaremos forma 1

    Line2D.Double linea = new Line2D.Double();
    // Con esta variable crearemos los círculos y la llamaremos forma 2
    Ellipse2D.Double circulo = new Ellipse2D.Double();
    //Con esta variable creamos los rectángulos y la llamaremos forma 3
    Rectangle2D.Double rectangulo = new Rectangle2D.Double();

    //creamos una variable para saber el tipo de objeto
    //que estamos creando
    int forma = 1;

    //en una variable de tipo BufferedImage puedo
    //almacenar una imagen
    private BufferedImage buffer = null;

    //almacena el color seleccionado
    Color colorSeleccionado = Color.black;

    public DanielLópez() {
        initComponents();
        jDialog1.setSize(800, 600);
        int anchoPanel = jPanel1.getWidth();
        int altoPanel = jPanel1.getHeight();

        //enlazo el buffer al jPanel
        buffer = (BufferedImage) jPanel1.createImage(anchoPanel, altoPanel);

        //inicializa el buffer para que sea de color blanco
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, anchoPanel, altoPanel);
    }

    @Override
    public void paint(Graphics g) {
        //llamo al paintComponents de la clase jFrame
        // para que se pinten bien los objetos de la aplicación
        super.paintComponents(g);

        //a continuación apunto al jPanel
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();

        //pinto el buffer sobre el jpanel
        g2.drawImage(buffer, 0, 0, null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        AceptarColor = new javax.swing.JButton();
        CancelarColor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BontonCirculo = new javax.swing.JButton();
        BotonCuadrado = new javax.swing.JButton();
        BotonColor = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        Discontinuo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Relleno1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        BotonRellenar = new javax.swing.JButton();

        AceptarColor.setText("Aceptar");
        AceptarColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AceptarColorMousePressed(evt);
            }
        });

        CancelarColor.setText("Cancelar");
        CancelarColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CancelarColorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(AceptarColor)
                .addGap(18, 18, 18)
                .addComponent(CancelarColor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarColor)
                    .addComponent(CancelarColor))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 420, 560));

        BontonCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/o_don.gif"))); // NOI18N
        BontonCirculo.setText("Circ");
        BontonCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BontonCirculoMousePressed(evt);
            }
        });
        getContentPane().add(BontonCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 110));

        BotonCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuadrado-2.png"))); // NOI18N
        BotonCuadrado.setText("Cuad");
        BotonCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonCuadradoMousePressed(evt);
            }
        });
        getContentPane().add(BotonCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, 90));

        BotonColor.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        BotonColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paleta-y-pinceles1.jpg"))); // NOI18N
        BotonColor.setText("COLOR");
        BotonColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonColorMousePressed(evt);
            }
        });
        getContentPane().add(BotonColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 260, 170));
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 132, -1));

        Discontinuo.setText("Discontinuo");
        getContentPane().add(Discontinuo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Canvas_linewidth_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 110, 40));

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goma-de-borrar_135.gif"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorrarMousePressed(evt);
            }
        });
        getContentPane().add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 260, 170));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paint");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 280, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ganancias%20forex.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 90));

        Relleno1.setText("Relleno objeto");
        getContentPane().add(Relleno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 70, 130, -1));

        BotonRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/250px-Backpack_Mann_Co._Painting_Set.png"))); // NOI18N
        BotonRellenar.setText("Rellenar");
        getContentPane().add(BotonRellenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 210, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       //cuando apretamos en el botón, se empieza a dibujar la linea

        //así que almaceno en x1 y y1 el punto donde se ha producido
        switch (forma) {

            case 1: {

                linea.x1 = evt.getX();
                linea.x2 = evt.getX();
                linea.y1 = evt.getY();
                linea.y2 = evt.getY();
                Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
                g2.draw(linea);
            }
            break;
            case 2: {
                //cuando apretamos el botón se empieza a dibujar el círculo
                circulo.x = evt.getX();
                circulo.y = evt.getY();
                circulo.width = 1;
                circulo.height = 1;
            }
            break;
            case 3: {
                //cuando apretamos el boton se empieza a dibujar el rectángulo
                rectangulo.x = evt.getX();
                rectangulo.y = evt.getY();
                rectangulo.width = 1;
                rectangulo.height = 1;

            }
            break;
        }


    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // para arrastrar el cursor por la pantalla
        //apunta la jpanel
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);
        g2.setColor(colorSeleccionado);
           // si discontinuo esta activado nos dibujará los objetos de
        //forma discontinua
        if (Discontinuo.isSelected()) {
            float dash[] = {10.0f};
            //Hemos creado un jSlider para elegir el grosor
            //de nuestro objeto
          
            g2.setStroke(new BasicStroke(jSlider1.getValue(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f));
        } else {
            g2.setStroke(new BasicStroke(jSlider1.getValue()));
        }

        switch (forma) {
            case 1: {
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();
                g2.draw(linea);
            }
            break;
            case 2: {
                if (Relleno1.isSelected()) {
                   // si el relleno de objeto está activado nos dibujara el
                    //círculo relleno

                    circulo.width = Math.abs(evt.getX()) - circulo.x;
                    circulo.height = Math.abs(evt.getY()) - circulo.y;
                    g2.draw(circulo);
                    g2.fill(circulo);

                } else {
                    //si no está activado lo dibujara normal    
                    circulo.width = Math.abs(evt.getX()) - circulo.x;
                    circulo.height = Math.abs(evt.getY()) - circulo.y;
                    g2.draw(circulo);
                }
            }
            break;
            case 3: {
                   // si el relleno de objeto está activado nos dibujara el
                //rectángulo relleno
                if (Relleno1.isSelected()) {

                    rectangulo.width = evt.getX() - rectangulo.x;
                    rectangulo.height = evt.getY() - rectangulo.y;
                    g2.draw(rectangulo);
                    g2.draw(rectangulo);
                } else {
                    //si no está activado lo dibujara normal 
                    rectangulo.width = evt.getX() - rectangulo.x;
                    rectangulo.height = evt.getY() - rectangulo.y;
                    g2.draw(rectangulo);
                }
            }
            break;
        }


    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        //cuando soltamos en botón 
        //apunta al buffer
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        g2.setColor(colorSeleccionado);
        if (Discontinuo.isSelected()) {
            float dash[] = {10.0f};
            g2.setStroke(new BasicStroke(jSlider1.getValue(), BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f));
        } else {
            g2.setStroke(new BasicStroke(jSlider1.getValue()));
        }
            //una vez soltemos el bóton del ratón nos dibujará la
        //forma elejida con relleno o sin relleno
        //según la opción elegida

        switch (forma) {
            case 1: {
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();
                g2.draw(linea);
            }
            break;
            case 2: {

                if (Relleno1.isSelected()) {
                    circulo.width = evt.getX() - circulo.x;
                    circulo.height = evt.getY() - circulo.y;

                    g2.draw(circulo);
                    g2.fill(circulo);

                } else {
                    circulo.width = evt.getX() - circulo.x;
                    circulo.height = evt.getY() - circulo.y;

                    g2.draw(circulo);
                }
            }
            break;
            case 3: {

                if (Relleno1.isSelected()) {
                    rectangulo.width = evt.getX() - rectangulo.x;
                    rectangulo.height = evt.getY() - rectangulo.y;
                    g2.draw(rectangulo);
                    g2.fill(rectangulo);
                } else {

                    rectangulo.width = evt.getX() - rectangulo.x;
                    rectangulo.height = evt.getY() - rectangulo.y;
                    g2.draw(rectangulo);
                }
            }
            break;
        }

        g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);

    }//GEN-LAST:event_jPanel1MouseReleased

    private void BotonColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonColorMousePressed
        //Al apretar el botón color nos saldra el panel de control de colores
        jDialog1.setVisible(true);

    }//GEN-LAST:event_BotonColorMousePressed

    private void AceptarColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarColorMousePressed
        //el usuario ha elegido un color
        colorSeleccionado = jColorChooser1.getColor();
        jDialog1.setVisible(false);
        BotonColor.setBackground(colorSeleccionado);
    }//GEN-LAST:event_AceptarColorMousePressed

    private void CancelarColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarColorMousePressed
        //Dentro del panel de control de colores este se usará
        //para cancelar un color
        jDialog1.setVisible(false);
    }//GEN-LAST:event_CancelarColorMousePressed

    private void BontonCirculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BontonCirculoMousePressed
        //Al pulsar este botón nos dibujará el círculo
        forma = 2;

    }//GEN-LAST:event_BontonCirculoMousePressed

    private void BotonCuadradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCuadradoMousePressed
        //Al pulsar este botón nos dibujará el rectángulo
        forma = 3;

    }//GEN-LAST:event_BotonCuadradoMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        //Al pulsar este botón nos dibujará la línea
        forma = 1;
    }//GEN-LAST:event_jButton1MousePressed

    private void BorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMousePressed
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
      //Al apretar el botón borrar la pantalla borrará lo que haya en 
        //y volverá a su forma inicial
        //elegimos el color blanco y cogemos las dimensiones de la Pantalla
        g2.setPaint(Color.WHITE);
        g2.fillRect(0, 0, getSize().width, getSize().height);
        g2.setPaint(Color.BLACK);
        repaint();


    }//GEN-LAST:event_BorrarMousePressed

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
            java.util.logging.Logger.getLogger(DanielLópez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanielLópez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanielLópez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanielLópez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanielLópez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarColor;
    private javax.swing.JButton BontonCirculo;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton BotonColor;
    private javax.swing.JButton BotonCuadrado;
    private javax.swing.JButton BotonRellenar;
    private javax.swing.JButton CancelarColor;
    private javax.swing.JCheckBox Discontinuo;
    private javax.swing.JCheckBox Relleno1;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
