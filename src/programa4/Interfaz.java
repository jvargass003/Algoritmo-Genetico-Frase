package programa4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import programa4.*;

public class Interfaz extends javax.swing.JFrame {

    Poblacion pob;
    int sizePob, generaciones, alfabeto = 223;
    String cadena;
    FuncionAptitud fun;
    ArrayList<Individuo> individuos = new ArrayList<Individuo>();
    ArrayList<Integer> aptitudes = new ArrayList<Integer>();
    ArrayList<Integer> ruleta = new ArrayList<Integer>();
  

    public Interfaz() {
        initComponents();
        textFraseFinal.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelIndividuo = new javax.swing.JLabel();
        labelParejas = new javax.swing.JLabel();
        labelAptitudes = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGenerarPoblacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextMejor = new javax.swing.JTextArea();
        textIndividuos = new javax.swing.JTextField();
        labelCadena = new javax.swing.JLabel();
        labelIndividuos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTextUltima = new javax.swing.JTextArea();
        textCadena = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextIndividuos = new javax.swing.JTextArea();
        labelTitulo = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        textFraseFinal = new javax.swing.JTextField();
        frase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        labelIndividuo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelIndividuo.setText("INDIVIDUOS");

        labelParejas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelParejas.setText("ULTIMA GENERACION");

        labelAptitudes.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelAptitudes.setText("MEJOR INDIVIDUO");

        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGenerarPoblacion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnGenerarPoblacion.setText("GENERAR POBLACIÓN");
        btnGenerarPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPoblacionActionPerformed(evt);
            }
        });

        areaTextMejor.setColumns(20);
        areaTextMejor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        areaTextMejor.setRows(5);
        jScrollPane1.setViewportView(areaTextMejor);

        textIndividuos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textIndividuos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIndividuosActionPerformed(evt);
            }
        });
        textIndividuos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIndividuosKeyTyped(evt);
            }
        });

        labelCadena.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelCadena.setText("PALABRA/FRASE");

        labelIndividuos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelIndividuos.setText("INDIVIDUOS");

        areaTextUltima.setColumns(20);
        areaTextUltima.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        areaTextUltima.setRows(5);
        jScrollPane3.setViewportView(areaTextUltima);

        textCadena.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        textCadena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCadenaKeyTyped(evt);
            }
        });

        areaTextIndividuos.setColumns(20);
        areaTextIndividuos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        areaTextIndividuos.setRows(5);
        jScrollPane2.setViewportView(areaTextIndividuos);

        labelTitulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 102, 102));
        labelTitulo.setText("ALGORITMO GENÉTICO");

        btnReiniciar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        textFraseFinal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        frase.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        frase.setText("FRASE FINAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelCadena)
                        .addGap(18, 18, 18)
                        .addComponent(textCadena, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(labelIndividuos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAptitudes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIndividuo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnGenerarPoblacion)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(280, 280, 280))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(labelParejas)
                                .addGap(48, 48, 48)))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(frase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFraseFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)
                        .addGap(16, 16, 16))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCadena)
                    .addComponent(textCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIndividuo)
                    .addComponent(btnGenerarPoblacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAptitudes)
                    .addComponent(labelIndividuos)
                    .addComponent(labelParejas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frase)
                    .addComponent(textFraseFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir)
                    .addComponent(btnReiniciar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void textIndividuosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIndividuosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIndividuosActionPerformed

    private void textCadenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCadenaKeyTyped

    }//GEN-LAST:event_textCadenaKeyTyped

    private void textIndividuosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIndividuosKeyTyped
        //Se devuelve lo que esta escrito en el cuadro de texto
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //Se verifica que no se ingresen letras
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_textIndividuosKeyTyped

    private void btnGenerarPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPoblacionActionPerformed
        areaTextIndividuos.setText("");
        areaTextMejor.setText("");
        areaTextUltima.setText("");
        cadena = textCadena.getText();

        if (!"".equals(cadena.trim()) && !"".equals(textIndividuos.getText())) {
            sizePob = Integer.parseInt(textIndividuos.getText());
            if (cadena.substring(cadena.length() - 1).equals(" ") || cadena.substring(0, 1).equals(" ")) {
                int seleccion = JOptionPane.showConfirmDialog(null, "Existen espacios al inicio o final de la frase/palabra. ¿Deseas eliminarnos?");
                if (seleccion == 0 || seleccion == 1) {
                    if (seleccion == 0) {
                        cadena = cadena.trim();
                    }
                } else {
                    return;
                }

            }
            Evolucion evo = new Evolucion(cadena, sizePob, areaTextUltima, textFraseFinal);
            evo.evolucion();

        } else {
            JOptionPane.showMessageDialog(null, "Error: No se a ingresado una frase/palabra o cantidad de individuos ");
        }

    }//GEN-LAST:event_btnGenerarPoblacionActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        textIndividuos.setText("");
        textFraseFinal.setText("");
        textCadena.setText("");
        areaTextIndividuos.setText(null);
        areaTextMejor.setText(null);
        areaTextUltima.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areaTextIndividuos;
    public static javax.swing.JTextArea areaTextMejor;
    private javax.swing.JTextArea areaTextUltima;
    private javax.swing.JButton btnGenerarPoblacion;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel frase;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAptitudes;
    private javax.swing.JLabel labelCadena;
    private javax.swing.JLabel labelIndividuo;
    private javax.swing.JLabel labelIndividuos;
    private javax.swing.JLabel labelParejas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCadena;
    private javax.swing.JTextField textFraseFinal;
    private javax.swing.JTextField textIndividuos;
    // End of variables declaration//GEN-END:variables
}
