package GerenciaSNMP;

import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
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

        jFrame1 = new javax.swing.JFrame();
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
        txtTimeout = new javax.swing.JTextField();
        txtRetransmissoes = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cbVersion = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbInterfaces = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIntervalo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInterfaces = new javax.swing.JTextArea();
        btnIntervalo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBanda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jFrame1.setName("frameGrafico"); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        cbVersion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2c" }));
        cbVersion.setSelectedIndex(1);

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
                            .addComponent(jLabel3)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetransmissoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(cbVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnIntervalo.setText("Iniciar");
        btnIntervalo.setEnabled(false);
        btnIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntervaloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cmbInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIntervalo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                    .addComponent(txtIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIntervalo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Taxa de Utilização"));

        txtBanda.setText("0");

        jLabel9.setText("Utilização em Porcentagem");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(Gráfico)");
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setName("labelGrafico"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addComponent(txtBanda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanda)
                    .addComponent(jLabel9)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        if (txtIp.getText().equals("") || txtPorta.getText().equals("")
                || txtTimeout.getText().equals("") || txtRetransmissoes.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Verifique se todos os campos foram digitados!", "Erro", JOptionPane.OK_CANCEL_OPTION);
            return;
        }

        // Recebimeto de Valores
        ipAddress = txtIp.getText();

        port = txtPorta.getText();

        community = txtCommunity.getText();

        version = cbVersion.getSelectedIndex();

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
            txtDescricao.setText("Descrição, contato, nome, localização e tempo que está ligado");
            txtInterfaces.setText("Índice, descrição, tipo, speed, MAC, status administrativo e operacional");
            txtIntervalo.setText("");
            txtBanda.setText("0");
            cmbInterfaces.removeAllItems();
            cmbInterfaces.addItem("Nenhum");
            JOptionPane.showMessageDialog(null, "Não houve comunicação com o equipamento informado!", "Erro", JOptionPane.OK_CANCEL_OPTION);
            return;
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

        if (index > 0) {
            btnIntervalo.setEnabled(true);
        } else if (index == 0) {
            btnIntervalo.setEnabled(false);
            txtInterfaces.setText("Índice, descrição, tipo, speed, MAC, status administrativo e operacional");
            return;
        } else {
            return;
        }
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
        // Criar o dataset para usar no gráfico
        DefaultCategoryDataset dadosGrafico = new DefaultCategoryDataset();

        if (btnIntervalo.getText().equals("Iniciar")) {
            btnIntervalo.setText("Parar");
            jButton1.setEnabled(false);

        } else {
            btnIntervalo.setText("Iniciar");
            obterOctetos.stop();
            txtBanda.setText("0");
            jButton1.setEnabled(true);

            // Criar o gráfico
            JFreeChart grafico = ChartFactory.createLineChart("Dados de utilização", "Intervalo",
                    "Valor", dadosGrafico, PlotOrientation.VERTICAL, true, true, false);

            // Escrever o gráfico
            OutputStream arquivo;
            try {
                arquivo = new FileOutputStream("grafico.png");
                ChartUtilities.writeChartAsPNG(arquivo, grafico, 300, 200);
                arquivo.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ImageIcon icon = new ImageIcon("grafico.png");
            jLabel10.setIcon(icon);
            
            

            return;
        }

        int index = cmbInterfaces.getSelectedIndex();

        obterOctetos = new Thread() {
            int ifInOctetos_x = 0;
            int ifOutOctetos_x = 0;
            int ifInOctetos_y = 0;
            int ifOutOctetos_y = 0;
            int deltaInOctetos = 0;
            int deltaOutOctetos = 0;
            int ifSpeed = 0;
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

                                System.out.println("In x = " + ifInOctetos_x);
                                oidResposta = requsicaoSNMP(oidIfInOctetos);
                                System.out.println("Oid In = " + oidResposta);
                                oidResposta = oidResposta.substring(25 + (Integer.toString(index)).length(), (oidResposta.length() - 1));
                                System.out.println("Oid In substring = " + oidResposta);
                                ifInOctetos_y = Integer.parseInt(oidResposta);

                                System.out.println("Out x = " + ifOutOctetos_x);
                                oidResposta = requsicaoSNMP(oidIfOutOctetos);
                                System.out.println("Oid Out = " + oidResposta);
                                oidResposta = oidResposta.substring(25 + (Integer.toString(index)).length(), (oidResposta.length() - 1));
                                System.out.println("Oid Out substring = " + oidResposta);
                                ifOutOctetos_y = Integer.parseInt(oidResposta);

                                if (aux) {
                                    deltaInOctetos = ifInOctetos_y - ifInOctetos_x;
                                    deltaOutOctetos = ifOutOctetos_y - ifOutOctetos_x;
                                    int totalBytes = deltaInOctetos + deltaOutOctetos;
                                    double totalBytesPorSeg = totalBytes / tempo;
                                    double totalBitsPorSeg = totalBytesPorSeg * 8;
                                    double taxaUtilizacao = (totalBitsPorSeg / ifSpeed) * 100;

                                    System.out.println("ifSpeed: " + ifSpeed);
                                    System.out.println("Intervalo: " + tempo);
                                    System.out.println("Bytes enviados: " + deltaOutOctetos);
                                    System.out.println("Bytes recebidos: " + deltaInOctetos);
                                    System.out.println("Total de Bytes: " + totalBytes);
                                    System.out.println("Total de Bytes por segundo: " + totalBytesPorSeg);
                                    System.out.println("Total de bits por segundo: " + totalBitsPorSeg);
                                    System.out.println("Total de Kilobits por segundo: " + totalBitsPorSeg / 1024);
                                    System.out.println("Taxa de utilização: " + taxaUtilizacao);

                                    txtBanda.setText(taxaUtilizacao + " %");

                                    dadosGrafico.addValue(taxaUtilizacao, "maximo", "intervalo 1");

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

        ResponseEvent response = snmp.get(pdu, comtarget);

        // Process Agent Response
        if (response != null) {
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
    private javax.swing.JComboBox<String> cbVersion;
    private javax.swing.JComboBox<String> cmbInterfaces;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    // End of variables declaration//GEN-END:variables
}
