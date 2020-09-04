package com.bandtec.projetocontinuada01.barrasdeprogresso;

import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.paint.Color;


public class TelaPrincipal extends javax.swing.JFrame {
    Maquina maquina = new Maquina();
    
    void atualizarDados(Double cpu, Double memoria, Double disco){
        maquina.cpuTotal += cpu;
        maquina.memoriaTotal += memoria;
        maquina.discoTotal += disco;
        maquina.cont ++;
        
        lblCpuMedia.setText(String.format("%.2f GHz", (maquina.cpuTotal / maquina.cont)));
        lblMemoriaMedia.setText(String.format("%.2f GB", (maquina.memoriaTotal / maquina.cont)));
        lblDiscoMedia.setText(String.format("%.2f GB", (maquina.discoTotal / maquina.cont)));
        
        if (maquina.cont == 1){
            maquina.minCpu = 2.3;
            maquina.minMemoria = 4.0;
            maquina.minDisco = 1000.0;
        }
        
        
        if (cpu > maquina.maxCpu){
            maquina.maxCpu = cpu;
            lblCpuMax.setText(String.format("%.2f GHz", maquina.maxCpu));
        }
        if(cpu < maquina.minCpu){
            maquina.minCpu = cpu;
            lblCpuMin.setText(String.format("%.2f GHz", maquina.minCpu));
        }
        
        
        if (memoria > maquina.maxMemoria){
            maquina.maxMemoria = memoria;
            lblMemoriaMax.setText(String.format("%.2f GB", maquina.maxMemoria));
        }
        if(memoria < maquina.minMemoria){
            maquina.minMemoria = memoria;
            lblMemoriaMin.setText(String.format("%.2f GB", maquina.minMemoria));
        }
        
         
        if (disco > maquina.maxDisco){
            maquina.maxDisco = disco;
            lblDiscoMax.setText(String.format("%.2f GB", maquina.maxDisco));
        }
        if(disco < maquina.minDisco){
            maquina.minDisco = disco;
            lblDiscoMin.setText(String.format("%.2f GB", maquina.minDisco));
        }
        
    }
    
    void preencherBarras(Double cpu, Double memoria, Double disco){
        Double cpuPorcentagem = (cpu * 100)/2.3;
        Double memoriaPorcentagem = (memoria * 100)/4;
        Double discoPorcentagem = (disco * 100)/1000;
        
        barCpu.setValue(cpuPorcentagem.intValue());
        barMemoria.setValue(memoriaPorcentagem.intValue());
        barDisco.setValue(discoPorcentagem.intValue());
        
         barCpu.setStringPainted(true);
        barMemoria.setStringPainted(true);
        barDisco.setStringPainted(true);

        barCpu.setForeground(java.awt.Color.blue);
        barMemoria.setForeground(java.awt.Color.blue);
        barDisco.setForeground(java.awt.Color.blue);

        barCpu.setString(String.format("%.2f%", cpuPorcentagem));
        barMemoria.setString(String.format("%.2f%", memoriaPorcentagem));
        barMemoria.setString(String.format("%.2f%", discoPorcentagem));
            
    }
            
    public TelaPrincipal() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barCpu = new javax.swing.JProgressBar();
        lblCpuValor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCpuMax = new javax.swing.JLabel();
        lblCpuMin = new javax.swing.JLabel();
        lblCpuMedia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        barDisco = new javax.swing.JProgressBar();
        lblDiscoValor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblDiscoMax = new javax.swing.JLabel();
        lblDiscoMin = new javax.swing.JLabel();
        lblDiscoMedia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        barMemoria = new javax.swing.JProgressBar();
        lblMemoriaValor = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMemoriaMedia = new javax.swing.JLabel();
        lblMemoriaMax = new javax.swing.JLabel();
        lblMemoriaMin = new javax.swing.JLabel();
        btnLerDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monitoramento dos Dados da Máquina");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("CPU");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Máximo:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Mínimo:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Média:");

        lblCpuMax.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblCpuMax.setForeground(new java.awt.Color(0, 204, 0));
        lblCpuMax.setText("0");

        lblCpuMin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblCpuMin.setForeground(new java.awt.Color(204, 0, 0));
        lblCpuMin.setText("0");

        lblCpuMedia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblCpuMedia.setForeground(new java.awt.Color(0, 0, 204));
        lblCpuMedia.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(barCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpuValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpuMin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpuMax))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpuMedia)))
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblCpuMax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblCpuMin))))
                .addGap(2, 2, 2)
                .addComponent(lblCpuValor)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblCpuMedia))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("DISCO");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Máximo:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Mínimo:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Média:");

        lblDiscoMax.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDiscoMax.setForeground(new java.awt.Color(0, 204, 0));
        lblDiscoMax.setText("0");

        lblDiscoMin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDiscoMin.setForeground(new java.awt.Color(204, 0, 0));
        lblDiscoMin.setText("0");

        lblDiscoMedia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDiscoMedia.setForeground(new java.awt.Color(0, 0, 204));
        lblDiscoMedia.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(barDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiscoValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiscoMin))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiscoMedia))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiscoMax)))
                .addGap(231, 231, 231))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblDiscoMax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblDiscoMin))))
                .addGap(2, 2, 2)
                .addComponent(lblDiscoValor)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblDiscoMedia))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setText("MEMÓRIA");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Máximo:");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("Mínimo:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel16.setText("Média:");

        lblMemoriaMedia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblMemoriaMedia.setForeground(new java.awt.Color(0, 0, 204));
        lblMemoriaMedia.setText("0");

        lblMemoriaMax.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblMemoriaMax.setForeground(new java.awt.Color(0, 204, 0));
        lblMemoriaMax.setText("0");

        lblMemoriaMin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblMemoriaMin.setForeground(new java.awt.Color(204, 0, 0));
        lblMemoriaMin.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(barMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMemoriaValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemoriaMin))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemoriaMedia))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemoriaMax)))
                .addGap(231, 231, 231))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblMemoriaMax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblMemoriaMin))))
                .addGap(3, 3, 3)
                .addComponent(lblMemoriaValor)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblMemoriaMedia))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnLerDados.setBackground(new java.awt.Color(0, 204, 204));
        btnLerDados.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnLerDados.setText("LER DADOS DA MÁQUINA");
        btnLerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(btnLerDados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnLerDados)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerDadosActionPerformed

            Double cpuAtual = ThreadLocalRandom.current().nextDouble(0.0, 2.3);
            Double memoriaAtual = ThreadLocalRandom.current().nextDouble(0.0, 4.0);
            Double discoAtual = ThreadLocalRandom.current().nextDouble(0.0, 1000.0);
            
            lblCpuValor.setText(String.format("%.2f GHz", cpuAtual));
            lblMemoriaValor.setText(String.format("%.2f GB", memoriaAtual));
            lblDiscoValor.setText(String.format("%.2f GB", discoAtual));
            
            atualizarDados(cpuAtual, memoriaAtual, discoAtual);
            preencherBarras(cpuAtual, memoriaAtual, discoAtual);
            
    }//GEN-LAST:event_btnLerDadosActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barCpu;
    private javax.swing.JProgressBar barDisco;
    private javax.swing.JProgressBar barMemoria;
    private javax.swing.JButton btnLerDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCpuMax;
    private javax.swing.JLabel lblCpuMedia;
    private javax.swing.JLabel lblCpuMin;
    private javax.swing.JLabel lblCpuValor;
    private javax.swing.JLabel lblDiscoMax;
    private javax.swing.JLabel lblDiscoMedia;
    private javax.swing.JLabel lblDiscoMin;
    private javax.swing.JLabel lblDiscoValor;
    private javax.swing.JLabel lblMemoriaMax;
    private javax.swing.JLabel lblMemoriaMedia;
    private javax.swing.JLabel lblMemoriaMin;
    private javax.swing.JLabel lblMemoriaValor;
    // End of variables declaration//GEN-END:variables
}
