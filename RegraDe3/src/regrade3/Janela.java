package regrade3;

import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {

    public Janela() {
        initComponents();
        this.setTitle("Regra de 3");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        estaPara = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        estaPara1 = new javax.swing.JLabel();
        n4 = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        RegraDe3 = new javax.swing.JLabel();
        Resetar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(556, 300));
        setMinimumSize(new java.awt.Dimension(556, 300));
        setPreferredSize(new java.awt.Dimension(556, 300));
        setResizable(false);

        Painel.setMaximumSize(new java.awt.Dimension(500, 300));
        Painel.setMinimumSize(new java.awt.Dimension(500, 300));
        Painel.setPreferredSize(new java.awt.Dimension(500, 300));

        n1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        n1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n1KeyTyped(evt);
            }
        });

        n2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        n2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n2KeyTyped(evt);
            }
        });

        estaPara.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        estaPara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estaPara.setText("---->");

        n3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        n3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        n3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n3KeyTyped(evt);
            }
        });

        estaPara1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        estaPara1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estaPara1.setText("---->");

        n4.setEditable(false);
        n4.setBackground(new java.awt.Color(204, 204, 204));
        n4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n4.setForeground(new java.awt.Color(102, 102, 102));
        n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n4.setText("X");
        n4.setBorder(null);
        n4.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        n4.setEnabled(false);
        n4.setFocusable(false);
        n4.setRequestFocusEnabled(false);

        Calcular.setBackground(new java.awt.Color(229, 229, 229));
        Calcular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.setFocusPainted(false);
        Calcular.setMaximumSize(new java.awt.Dimension(85, 30));
        Calcular.setMinimumSize(new java.awt.Dimension(85, 30));
        Calcular.setPreferredSize(new java.awt.Dimension(85, 30));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        RegraDe3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RegraDe3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegraDe3.setText("Regra de 3");

        Resetar.setBackground(new java.awt.Color(229, 229, 229));
        Resetar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Resetar.setText("Resetar");
        Resetar.setFocusPainted(false);
        Resetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resetar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegraDe3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estaPara)
                                    .addComponent(estaPara1))
                                .addGap(16, 16, 16)
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(n2)
                                    .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(RegraDe3)
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaPara))
                .addGap(60, 60, 60)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estaPara1))
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resetar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            a = Double.parseDouble(n3.getText().replace(",", "."));
            b = Double.parseDouble(n2.getText().replace(",", "."));
            c = Double.parseDouble(n1.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira somente números e ponto nos campos");
            System.out.println(e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não deixe os campos vazios");
            System.out.println(e);
        }
        double x;
        if ((a == 0) || (b == 0) || (c == 0)) {//erro da divisão por zero
            x = 0.00;
        } else {
            x = (a * b) / c;
        }
        String result = x + "";//transforma o resultado (x) em string
        int index = result.length();//pega o número de caracteres que o resultado tem
        if (result.substring(2).equals(".0")) {//retira o '.0' no final dos resultados quando são inteiros
            result = result.substring(0, index - 2);
        }
        n4.setText(result.replace(".", ","));
        if (index > 9) {//se o resultado for maior que 9 caracteres, exiba os 9 primeiros e acrescente '...' (para caber dentro do JTextField)
            result = result.substring(0, 11) + "...";
        }
    }//GEN-LAST:event_CalcularActionPerformed

    private void n1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyTyped
        String caracteres = "0987654321.,-";
        if (!caracteres.contains(evt.getKeyChar() + "") || n1.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_n1KeyTyped

    private void n2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2KeyTyped
        String caracteres = "0987654321.,-";
        if (!caracteres.contains(evt.getKeyChar() + "") || n2.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_n2KeyTyped

    private void n3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n3KeyTyped
        String caracteres = "0987654321.,-";
        if (!caracteres.contains(evt.getKeyChar() + "") || n3.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_n3KeyTyped

    private void ResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetarActionPerformed
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("X");
    }//GEN-LAST:event_ResetarActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel RegraDe3;
    private javax.swing.JButton Resetar;
    private javax.swing.JLabel estaPara;
    private javax.swing.JLabel estaPara1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    // End of variables declaration//GEN-END:variables
}
