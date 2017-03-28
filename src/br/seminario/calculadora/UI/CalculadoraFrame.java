/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.seminario.calculadora.UI;

import br.seminario.calculadora.Operacoes.Operacao;

/**
 *
 * @author renan
 * @version 0.1
 */
public class CalculadoraFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraFrame
     */
    public CalculadoraFrame() {
        initComponents();
        calcDisplay.setText("");
    }

    public void mostraResultado(String resultado)
    {
        calcDisplay.setText("");
        calcDisplay.setText(resultado);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        calcDisplay = new javax.swing.JTextArea();
        botaoUm = new javax.swing.JButton();
        botaoDois = new javax.swing.JButton();
        botaoTres = new javax.swing.JButton();
        botaoZero = new javax.swing.JButton();
        botaoQuatro = new javax.swing.JButton();
        botaoCinco = new javax.swing.JButton();
        botaoSeis = new javax.swing.JButton();
        botaoNove = new javax.swing.JButton();
        botaoSete = new javax.swing.JButton();
        botaoOito = new javax.swing.JButton();
        botaoC = new javax.swing.JButton();
        botaoSoma = new javax.swing.JButton();
        botaoSub = new javax.swing.JButton();
        botaoMulti = new javax.swing.JButton();
        botaoDiv = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 400));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        calcDisplay.setEditable(false);
        calcDisplay.setBackground(new java.awt.Color(102, 174, 128));
        calcDisplay.setColumns(20);
        calcDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        calcDisplay.setRows(1);
        calcDisplay.setText("##########");
        jScrollPane1.setViewportView(calcDisplay);

        botaoUm.setText("1");
        botaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUmActionPerformed(evt);
            }
        });

        botaoDois.setText("2");
        botaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoisActionPerformed(evt);
            }
        });

        botaoTres.setText("3");
        botaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTresActionPerformed(evt);
            }
        });

        botaoZero.setText("0");
        botaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZeroActionPerformed(evt);
            }
        });

        botaoQuatro.setText("4");
        botaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuatroActionPerformed(evt);
            }
        });

        botaoCinco.setText("5");
        botaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCincoActionPerformed(evt);
            }
        });

        botaoSeis.setText("6");
        botaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeisActionPerformed(evt);
            }
        });

        botaoNove.setText("9");
        botaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNoveActionPerformed(evt);
            }
        });

        botaoSete.setText("7");
        botaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeteActionPerformed(evt);
            }
        });

        botaoOito.setText("8");
        botaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOitoActionPerformed(evt);
            }
        });

        botaoC.setText("C");
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCActionPerformed(evt);
            }
        });

        botaoSoma.setText("+");
        botaoSoma.setMaximumSize(new java.awt.Dimension(75, 30));
        botaoSoma.setMinimumSize(new java.awt.Dimension(75, 30));
        botaoSoma.setPreferredSize(new java.awt.Dimension(75, 30));
        botaoSoma.setSize(new java.awt.Dimension(97, 30));
        botaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomaActionPerformed(evt);
            }
        });

        botaoSub.setText("-");
        botaoSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubActionPerformed(evt);
            }
        });

        botaoMulti.setText("X");
        botaoMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiActionPerformed(evt);
            }
        });

        botaoDiv.setText("/");
        botaoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivActionPerformed(evt);
            }
        });

        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(botaoZero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(botaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(botaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(botaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoDiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(433, 433, 433))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUmActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "1";
        } else {
            textDisplay += "1";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoUmActionPerformed

    private void botaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoisActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "2";
        } else {
            textDisplay += "2";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoDoisActionPerformed

    private void botaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTresActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "3";
        } else {
            textDisplay += "3";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoTresActionPerformed

    private void botaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZeroActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "0";
        } else {
            textDisplay += "0";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoZeroActionPerformed

    private void botaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuatroActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "4";
        } else {
            textDisplay += "4";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoQuatroActionPerformed

    private void botaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCincoActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "5";
        } else {
            textDisplay += "5";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoCincoActionPerformed

    private void botaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeisActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "6";
        } else {
            textDisplay += "6";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoSeisActionPerformed

    private void botaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNoveActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "9";
        } else {
            textDisplay += "9";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoNoveActionPerformed

    private void botaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeteActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "7";
        } else {
            textDisplay += "7";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoSeteActionPerformed

    private void botaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOitoActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "8";
        } else {
            textDisplay += "8";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoOitoActionPerformed

    private void botaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCActionPerformed
        // TODO add your handling code here:
        calcDisplay.setText("");
    }//GEN-LAST:event_botaoCActionPerformed

    private void botaoMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "X";
        } else {
            textDisplay += "X";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoMultiActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        // TODO add your handling code here:
        Operacao op = new Operacao();
        String calculo = calcDisplay.getText();
        if (!calculo.isEmpty())
        {
            if(calculo.contains("+"))
            {
                int valor = op.verificaOperacao("\\+", calculo);
                String resultado = String.valueOf(valor);
                mostraResultado(resultado);
                
            }
        }
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomaActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "+";
        } else {
            textDisplay += "+";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoSomaActionPerformed

    private void botaoSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "-";
        } else {
            textDisplay += "-";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoSubActionPerformed

    private void botaoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivActionPerformed
        // TODO add your handling code here:
        String textDisplay = calcDisplay.getText();
        if (textDisplay.equals(""))
        {
            textDisplay = "/";
        } else {
            textDisplay += "/";
        }
        calcDisplay.setText(textDisplay);
    }//GEN-LAST:event_botaoDivActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoC;
    private javax.swing.JButton botaoCinco;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoDois;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMulti;
    private javax.swing.JButton botaoNove;
    private javax.swing.JButton botaoOito;
    private javax.swing.JButton botaoQuatro;
    private javax.swing.JButton botaoSeis;
    private javax.swing.JButton botaoSete;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSub;
    private javax.swing.JButton botaoTres;
    private javax.swing.JButton botaoUm;
    private javax.swing.JButton botaoZero;
    private javax.swing.JTextArea calcDisplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
