/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author USER
 */
public class resto extends javax.swing.JFrame {

    /**
     * Creates new form resto
     */
    public resto() {
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

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        le = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        ra = new javax.swing.JSpinner();
        f = new javax.swing.JSpinner();
        p = new javax.swing.JSpinner();
        a = new javax.swing.JSpinner();
        let = new javax.swing.JSpinner();
        o = new javax.swing.JSpinner();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        two = new javax.swing.JToggleButton();
        total = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        cash = new javax.swing.JTextField();
        change = new javax.swing.JLabel();
        jToggleButton11 = new javax.swing.JToggleButton();
        enter = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        one = new javax.swing.JToggleButton();
        four = new javax.swing.JToggleButton();
        three = new javax.swing.JToggleButton();
        six = new javax.swing.JToggleButton();
        seven = new javax.swing.JToggleButton();
        eight = new javax.swing.JToggleButton();
        nine = new javax.swing.JToggleButton();
        zero = new javax.swing.JToggleButton();
        five = new javax.swing.JToggleButton();
        DEL = new javax.swing.JToggleButton();

        jMenu1.setText("jMenu1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nn.jpg"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("BARBEQUE");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pak.jpg"))); // NOI18N
        jToggleButton2.setSelected(true);
        jToggleButton2.setText("BARBEQUE");

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ll.jpg"))); // NOI18N
        jToggleButton9.setSelected(true);
        jToggleButton9.setText("BARBEQUE");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oo.jpg"))); // NOI18N
        jToggleButton10.setSelected(true);
        jToggleButton10.setText("BARBEQUE");

        le.setIcon(new javax.swing.ImageIcon(getClass().getResource("/letchon.jpg"))); // NOI18N
        le.setSelected(true);
        le.setText("BARBEQUE");
        le.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leActionPerformed(evt);
            }
        });

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dob.jpg"))); // NOI18N
        jToggleButton4.setSelected(true);
        jToggleButton4.setText("BARBEQUE");

        ra.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        f.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        f.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fStateChanged(evt);
            }
        });

        p.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        a.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        let.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        o.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jToggleButton5.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton5.setText("PLACE ORDER");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton8.setText("RESET");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton5)
                        .addGap(362, 362, 362))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(le, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(let, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(le, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(let, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 700));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total.setText("P: ");

        jToggleButton7.setText("TOTAL");

        cash.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });

        change.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        change.setText("P: ");

        jToggleButton11.setText("CHANGE");

        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        jToggleButton12.setText("CASH");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        DEL.setText("DEL");
        DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(DEL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enter)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jToggleButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jToggleButton7)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(cash))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(537, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 300, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

         
    
    
    private void enter(String v){
         String num=cash.getText()+v;
         cash.setText(num);
        }
    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
         enter("2");
    }//GEN-LAST:event_twoActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        int y=0,v=0,k=0;
         y=Integer.parseInt(cash.getText());
         v=Integer.parseInt(total.getText());
        if(y>=v){
             k=y-v;
            change.setText(String.valueOf(k));
        }else{
            change.setText("INVALID INPUT");
        }
        
    }//GEN-LAST:event_enterActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        enter("1");
    }//GEN-LAST:event_oneActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        enter("4");
    }//GEN-LAST:event_fourActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        enter("3");
    }//GEN-LAST:event_threeActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        enter("6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        enter("7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        enter("8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        enter("9");
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        enter("0");
    }//GEN-LAST:event_zeroActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        enter("5");
    }//GEN-LAST:event_fiveActionPerformed

    private void DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELActionPerformed
     String b=null;
    if (cash.getText().length()>0){
    StringBuilder n=new StringBuilder(cash.getText());
    n.deleteCharAt(cash.getText().length()-1);
    b=n.toString();
    cash.setText(b);
    
    } 
    
    }//GEN-LAST:event_DELActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        int v=0;
        f.setValue(v);
        ra.setValue(v);
        o.setValue(v);
        p.setValue(v);
        a.setValue(v);
        let.setValue(v);
        total.setText("");
        cash.setText("");
        change.setText("");
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        int d=0,u=0,v=0,l=0,t=0,r=0;
        int fried=0,rice=0,or=0,pa=0,ad=0,le=0,ans=0;
        d=(int)f.getValue();
        u=(int)ra.getValue();
        v=(int)o.getValue();
        l=(int)p.getValue();
        t=(int)a.getValue();
        r=(int)let.getValue();
        fried=d*50;
        rice=u*15;
        or=v*15;
        pa=l*30;
        ad=t*70;
        le=r*100;
        ans=fried+rice+or+pa+ad+le;
        total.setText(String.valueOf(ans));

    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void fStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_fStateChanged

    private void leActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(resto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton DEL;
    private javax.swing.JSpinner a;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel change;
    private javax.swing.JToggleButton eight;
    private javax.swing.JToggleButton enter;
    private javax.swing.JSpinner f;
    private javax.swing.JToggleButton five;
    private javax.swing.JToggleButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JToggleButton le;
    private javax.swing.JSpinner let;
    private javax.swing.JToggleButton nine;
    private javax.swing.JSpinner o;
    private javax.swing.JToggleButton one;
    private javax.swing.JSpinner p;
    private javax.swing.JSpinner ra;
    private javax.swing.JToggleButton seven;
    private javax.swing.JToggleButton six;
    private javax.swing.JToggleButton three;
    private javax.swing.JLabel total;
    private javax.swing.JToggleButton two;
    private javax.swing.JToggleButton zero;
    // End of variables declaration//GEN-END:variables
}
