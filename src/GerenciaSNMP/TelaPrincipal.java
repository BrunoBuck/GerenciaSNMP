package GerenciaSNMP;

import java.awt.EventQueue;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        txtPorta = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JPasswordField();
        txtVersao = new javax.swing.JTextField();
        txtTimeout = new javax.swing.JTextField();
        txtRetransmissoes = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbInterfaces = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIntervalo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInterfaces = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtBanda = new javax.swing.JLabel();
        btnIntervalo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Equipamento"));

        jLabel1.setText("IP:");

        jLabel2.setText("Porta:");

        jLabel3.setText("Community:");

        jLabel4.setText("Versão:");

        jLabel5.setText("Timeout:");

        jLabel6.setText("Retransmissões:");

        txtIp.setText("127.0.0.1");
        txtIp.setName("txtIp"); // NOI18N

        txtPorta.setText("161");
        txtPorta.setName("txtPorta"); // NOI18N

        txtCommunity.setText("abcBolinhas");
        txtCommunity.setName(""); // NOI18N

        txtVersao.setText("1");

        txtTimeout.setText("1000");

        txtRetransmissoes.setText("2");

        txtDescricao.setEditable(false);
        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setText("Descrição, contato, nome, localização e tempo que está ligado");
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo do equipamento:"));
        jScrollPane2.setViewportView(txtDescricao);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTimeout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtRetransmissoes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetransmissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interfaces"));

        jLabel7.setText("Interface:");

        cmbInterfaces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));
        cmbInterfaces.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbInterfacesItemStateChanged(evt);
            }
        });

        jLabel8.setText("Intervalo:");

        txtInterfaces.setEditable(false);
        txtInterfaces.setColumns(20);
        txtInterfaces.setRows(5);
        txtInterfaces.setText("Índice, descrição, tipo, speed, MAC, status administrativo e operacional");
        txtInterfaces.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo da Interface"));
        jScrollPane3.setViewportView(txtInterfaces);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIntervalo)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Taxa de Utilização"));

        txtBanda.setText("0");

        btnIntervalo.setText("Ok");
        btnIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntervaloActionPerformed(evt);
            }
        });

        jLabel9.setText("Utilização em Porcentagem");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addComponent(txtBanda)
                .addGap(42, 42, 42)
                .addComponent(btnIntervalo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIntervalo)
                    .addComponent(txtBanda)
                    .addComponent(jLabel9))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Recebimeto de Valores
    static String ipAddress = "";

    static String port = "";

    static String community = "";

    static int version = 0;

    static int timeout = 0;

    static int retries = 0;

    Thread obterOctetos;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Recebimeto de Valores
        ipAddress = txtIp.getText();

        port = txtPorta.getText();

        community = txtCommunity.getText();

        version = Integer.parseInt(txtVersao.getText());

        timeout = Integer.parseInt(txtTimeout.getText());

        retries = Integer.parseInt(txtRetransmissoes.getText());

        // Limpando Text Area de Descrição
        txtDescricao.setText("");

        // Buscando os valores do Resumo do Equipamento e Mostrando no Text Area de Descrição
        String[] resumo = {"Descrição: ", "Object ID", "Tempo que está ligado: ", "Contato: ", "Nome: ", "Localização: ", "Services"};
        try {
            for (int i = 1; i < 7; i++) {
                if (i != 2) {
                    String oidSystem = ".1.3.6.1.2.1.1." + i + ".0";
                    String oidResposta = requsicaoSNMP(oidSystem);
                    oidResposta = oidResposta.substring(21, (oidResposta.length() - 1));
                    txtDescricao.append(resumo[i - 1] + oidResposta + "\n");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        int ifNumber = 0;
        // Buscando número de Interfaces
        try {
            String oidIfNumber = ".1.3.6.1.2.1.2.1.0";
            String stringIfNumber = requsicaoSNMP(oidIfNumber);
            ifNumber = Integer.parseInt(stringIfNumber.substring(21, (stringIfNumber.length() - 1)));

        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Buscando nomes das Interfaces
        try {
            for (int i = 1; i <= ifNumber; i++) {
                String oidIfNumber = ".1.3.6.1.2.1.2.2.1.2." + i;
                String stringIfNumber = requsicaoSNMP(oidIfNumber);
                stringIfNumber = stringIfNumber.substring(24 + (Integer.toString(i)).length(), (stringIfNumber.length() - 1));
                stringIfNumber = stringIfNumber.replace(":", "");
                String ascii = fromHexString(stringIfNumber);
                cmbInterfaces.addItem(ascii);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbInterfacesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbInterfacesItemStateChanged
        // Pegando o índice da interface selecionada
        int index = cmbInterfaces.getSelectedIndex();

        // Limpando a Text Area de Interfaces 
        txtInterfaces.setText("");

        // Inicializando a matriz
        String[][] resumo = new String[][]{{"Índice: ", ""}, {"Descrição: ", ""}, {"Tipo: ", ""}, {"MTU: ", ""}, {"Velocidade: ", ""}, {"MAC: ", ""}, {"Admin Status: ", ""}, {"Oper Status: ", ""}};

        // Populando a matriz com os valores
        try {
            for (int i = 1; i < 9; i++) {
                String oidIf = ".1.3.6.1.2.1.2.2.1." + i + "." + index;
                String oidResposta = requsicaoSNMP(oidIf);
                resumo[i - 1][1] = oidResposta.substring(24 + (Integer.toString(index)).length(), (oidResposta.length() - 1));
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Convertendo valores necessários
        for (EnumIfType e : EnumIfType.values()) {
            if (resumo[2][1].equals(e.showType())) {
                resumo[2][1] = e.name();
            }
        }

        resumo[1][1] = resumo[1][1].replace(":", "");
        resumo[1][1] = fromHexString(resumo[1][1]);
        resumo[6][1] = resumo[6][1].equals("1") ? "Up" : "Down";
        resumo[7][1] = resumo[7][1].equals("1") ? "Up" : "Down";

        // Inputando na Text Area os valores da matriz
        for (int i = 0; i < 8; i++) {
            if (!resumo[i][1].isEmpty()) {
                txtInterfaces.append(resumo[i][0] + resumo[i][1] + "\n");
            }
        }
    }//GEN-LAST:event_cmbInterfacesItemStateChanged

    private void btnIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntervaloActionPerformed

        if (btnIntervalo.getText().equals("Ok")) {
            btnIntervalo.setText("Parar");
        } else {
            btnIntervalo.setText("Ok");
            obterOctetos.stop();
            txtIntervalo.setText("0");
            return;
        }

        int index = cmbInterfaces.getSelectedIndex();

        obterOctetos = new Thread() {
            int ifInOctetos_x = 0;
            int ifOutOctetos_x = 0;
            int ifInOctetos_y = 0;
            int ifOutOctetos_y = 0;
            int diffInOctetos = 0;
            int diffOutOctetos = 0;
            double ifSpeed = 0;
            String oidIfInOctetos = ".1.3.6.1.2.1.2.2.1.10." + index;
            String oidIfOutOctetos = ".1.3.6.1.2.1.2.2.1.16." + index;
            String oidResposta = "";
            int tempo = Integer.parseInt(txtIntervalo.getText());
            boolean aux = false;

            public void run() {
                while (Integer.parseInt(txtIntervalo.getText()) != 0) {
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {

                                oidResposta = requsicaoSNMP(oidIfInOctetos);
                                oidResposta = oidResposta.substring(25 + (Integer.toString(index)).length(), (oidResposta.length() - 1));
                                ifInOctetos_y = Integer.parseInt(oidResposta);

                                oidResposta = requsicaoSNMP(oidIfOutOctetos);
                                oidResposta = oidResposta.substring(25 + (Integer.toString(index)).length(), (oidResposta.length() - 1));
                                ifOutOctetos_y = Integer.parseInt(oidResposta);

                                if (aux) {
                                    diffInOctetos = ifInOctetos_y - ifInOctetos_x;
                                    diffOutOctetos = ifOutOctetos_y - ifOutOctetos_x;
                                    int totalBytes = diffInOctetos + diffOutOctetos;
                                    int totalBytesPorSeg = totalBytes / tempo;
                                    double totalBitsPorSeg = totalBytesPorSeg * 8;
                                    double taxaUtilizacao = totalBitsPorSeg / ifSpeed;

                                    System.out.println("ifSpeed: " + ifSpeed);
                                    System.out.println("Intervalo: " + tempo);
                                    System.out.println("Total de Bytes: " + totalBytes);
                                    System.out.println("Total de Bytes por segundo: " + totalBytesPorSeg);
                                    System.out.println("Total de bits por segundo: " + totalBitsPorSeg);
                                    System.out.println("Total de Kilobits por segundo: " + totalBitsPorSeg / 1024);
                                    System.out.println("Taxa de utilização: " + taxaUtilizacao);

                                    txtBanda.setText(Double.toString(taxaUtilizacao * 100) + " %");

//                                    txtBanda.setText(Double.toString(taxaUtilizacao * 100) + " %");
                                    ifInOctetos_x = ifInOctetos_y;
                                    ifOutOctetos_x = ifOutOctetos_y;

                                } else {
                                    ifInOctetos_x = ifInOctetos_y;
                                    ifOutOctetos_x = ifOutOctetos_y;
                                    String oidIfSpeed = ".1.3.6.1.2.1.2.2.1.5." + index;
                                    oidResposta = requsicaoSNMP(oidIfSpeed);
                                    oidResposta = oidResposta.substring(24 + (Integer.toString(index)).length(), (oidResposta.length() - 1));
                                    ifSpeed = Integer.parseInt(oidResposta);
                                    aux = true;
                                }
                            } catch (Exception ex) {
                                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    });
                    try {
                        sleep(tempo * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        obterOctetos.start();
    }//GEN-LAST:event_btnIntervaloActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });

    }

    public static String requsicaoSNMP(String oid) throws Exception {
        // Create TransportMapping and Listen
        TransportMapping transport = new DefaultUdpTransportMapping();
        Snmp snmp = new Snmp(transport);
        transport.listen();

        // Create Target Address object
        CommunityTarget comtarget = new CommunityTarget();
        comtarget.setCommunity(new OctetString(community));
        comtarget.setVersion(version);
        comtarget.setAddress(new UdpAddress(ipAddress + "/" + port));
        comtarget.setRetries(retries);
        comtarget.setTimeout(timeout);

        // Create the PDU object
        PDU pdu = new PDU();
        pdu.add(new VariableBinding(new OID(oid)));
        pdu.setType(PDU.GET);
        pdu.setRequestID(new Integer32(1));

        // Create Snmp object for sending data to Agent
        System.out.println("Sending Request to Agent...");
        ResponseEvent response = snmp.get(pdu, comtarget);

        // Process Agent Response
        if (response != null) {
            System.out.println("Got Response from Agent");
            PDU responsePDU = response.getResponse();

            if (responsePDU != null) {
                int errorStatus = responsePDU.getErrorStatus();
                int errorIndex = responsePDU.getErrorIndex();
                String errorStatusText = responsePDU.getErrorStatusText();

                if (errorStatus == PDU.noError) {
                    return responsePDU.getVariableBindings().toString();

                } else {
                    System.out.println("Error: Request Failed");
                    System.out.println("Error Status = " + errorStatus);
                    System.out.println("Error Index = " + errorIndex);
                    System.out.println("Error Status Text = " + errorStatusText);
                }
            } else {
                System.out.println("Error: Response PDU is null");
            }
        } else {
            System.out.println("Error: Agent Timeout... ");
        }
        return null;

    }

    public static String fromHexString(String hex) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            str.append((char) Integer.parseInt(hex.substring(i, i + 2), 16));
        }
        return str.toString();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIntervalo;
    private javax.swing.JComboBox<String> cmbInterfaces;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel txtBanda;
    private javax.swing.JPasswordField txtCommunity;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextArea txtInterfaces;
    private javax.swing.JTextField txtIntervalo;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtRetransmissoes;
    private javax.swing.JTextField txtTimeout;
    private javax.swing.JTextField txtVersao;
    // End of variables declaration//GEN-END:variables
}
