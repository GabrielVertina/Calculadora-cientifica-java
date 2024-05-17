
public class Calculadora extends javax.swing.JFrame {
    private boolean igual,inicio = true, operacao1,operacao2;
       private double a,b,c,seno,cos,acos,aseno,tan,atan,memoria = 0,resultado,valor1,valor2;
       private String cadeia,funcoes,tipoOperacoes; 
       public Calculadora() {
            initComponents();
       this.setLocationRelativeTo(null);
    Label_Memoria.setVisible(false);
       }
       
    
                          
        private void initComponents() {
    
            buttonGroup1 = new javax.swing.ButtonGroup();
            buttonGroup2 = new javax.swing.ButtonGroup();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            sexage = new javax.swing.JRadioButton();
            radiano = new javax.swing.JRadioButton();
            butaocoseno = new javax.swing.JButton();
            butaoseno = new javax.swing.JButton();
            MC = new javax.swing.JButton();
            butaotan = new javax.swing.JButton();
            MS = new javax.swing.JButton();
            MMenos = new javax.swing.JButton();
            MMAIS = new javax.swing.JButton();
            MR = new javax.swing.JButton();
            butaoaseno = new javax.swing.JButton();
            retrocesso = new javax.swing.JButton();
            butaoatan = new javax.swing.JButton();
            apagarC = new javax.swing.JButton();
            raizquadrada = new javax.swing.JButton();
            maismenos = new javax.swing.JButton();
            apagaTudo = new javax.swing.JButton();
            butaoacose = new javax.swing.JButton();
            xelevado3 = new javax.swing.JButton();
            N6 = new javax.swing.JButton();
            elevmenos1 = new javax.swing.JButton();
            inverso = new javax.swing.JButton();
            N7 = new javax.swing.JButton();
            multiplicacao = new javax.swing.JButton();
            XelevadoY = new javax.swing.JButton();
            N5 = new javax.swing.JButton();
            N9 = new javax.swing.JButton();
            e = new javax.swing.JButton();
            porcentagem = new javax.swing.JButton();
            divisao = new javax.swing.JButton();
            N8 = new javax.swing.JButton();
            yraizx = new javax.swing.JButton();
            numerodepi = new javax.swing.JButton();
            N4 = new javax.swing.JButton();
            mais = new javax.swing.JButton();
            xquadrado = new javax.swing.JButton();
            N3 = new javax.swing.JButton();
            dezelevX = new javax.swing.JButton();
            subtracao = new javax.swing.JButton();
            N2 = new javax.swing.JButton();
            funcaoEXP = new javax.swing.JButton();
            Nfatorial = new javax.swing.JButton();
            N0 = new javax.swing.JButton();
            logariti = new javax.swing.JButton();
            decimal = new javax.swing.JButton();
            raizcub = new javax.swing.JButton();
            botaoigual = new javax.swing.JButton();
            N1 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            TextField_Principal = new javax.swing.JTextField();
            TextField_previo = new javax.swing.JTextField();
            Label_Memoria = new javax.swing.JLabel();
    
            jLabel1.setText("jLabel1");
    
            jLabel2.setText("jLabel2");
    
            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
    
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
            buttonGroup1.add(sexage);
            sexage.setText("sexages");
            sexage.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sexageActionPerformed(evt);
                }
            });
    
            buttonGroup1.add(radiano);
            radiano.setText("radiano");
            radiano.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    radianoActionPerformed(evt);
                }
            });
    
            butaocoseno.setText("cos");
            butaocoseno.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    butaocosenoActionPerformed(evt);
                }
            });
    
            butaoseno.setText("sin");
            butaoseno.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    butaosenoActionPerformed(evt);
                }
            });
    
            MC.setText("MC");
            MC.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MCActionPerformed(evt);
                }
            });
    
            butaotan.setText("tan");
            butaotan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    butaotanActionPerformed(evt);
                }
            });
    
            MS.setText("MS");
            MS.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MSActionPerformed(evt);
                }
            });
    
            MMenos.setText("M-");
            MMenos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MMenosActionPerformed(evt);
                }
            });
    
            MMAIS.setText("M+");
            MMAIS.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MMAISActionPerformed(evt);
                }
            });
    
            MR.setText("MR");
            MR.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MRActionPerformed(evt);
                }
            });
    
            butaoaseno.setText("sin-1");
            butaoaseno.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    butaoasenoActionPerformed(evt);
                }
            });
    
            retrocesso.setText("<--");
            retrocesso.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    retrocessoActionPerformed(evt);
                }
            });
    
            butaoatan.setText("tan-1");
            butaoatan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    butaoatanActionPerformed(evt);
                }
            });
    
            apagarC.setText("C");
            apagarC.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    apagarCActionPerformed(evt);
                }
            });
    
            raizquadrada.setText("√ ");
            raizquadrada.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    raizquadradaActionPerformed(evt);
                }
            });
    
            maismenos.setText("±");
            maismenos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    maismenosActionPerformed(evt);
                }
            });
    
            apagaTudo.setText("CE");
            apagaTudo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    apagaTudoActionPerformed(evt);
                }
            });
    
            butaoacose.setText("cos-1");
            butaoacose.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    butaoacoseActionPerformed(evt);
                }
            });
    
            xelevado3.setText("x^3");
            xelevado3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    xelevado3ActionPerformed(evt);
                }
            });
    
            N6.setText("6");
            N6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N6ActionPerformed(evt);
                }
            });
    
            elevmenos1.setText("x^-1");
            elevmenos1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    elevmenos1ActionPerformed(evt);
                }
            });
    
            inverso.setText("1/x");
            inverso.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    inversoActionPerformed(evt);
                }
            });
    
            N7.setText("7");
            N7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N7ActionPerformed(evt);
                }
            });
    
            multiplicacao.setText("*");
            multiplicacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    multiplicacaoActionPerformed(evt);
                }
            });
    
            XelevadoY.setText("x^y");
            XelevadoY.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    XelevadoYActionPerformed(evt);
                }
            });
    
            N5.setText("5");
            N5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N5ActionPerformed(evt);
                }
            });
    
            N9.setText("9");
            N9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N9ActionPerformed(evt);
                }
            });
    
            e.setText("e");
            e.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    eActionPerformed(evt);
                }
            });
    
            porcentagem.setText("%");
            porcentagem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    porcentagemActionPerformed(evt);
                }
            });
    
            divisao.setText("/");
            divisao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    divisaoActionPerformed(evt);
                }
            });
    
            N8.setText("8");
            N8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N8ActionPerformed(evt);
                }
            });
    
            yraizx.setText("y√ x");
            yraizx.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    yraizxActionPerformed(evt);
                }
            });
    
            numerodepi.setText("pi(n)");
            numerodepi.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    numerodepiActionPerformed(evt);
                }
            });
    
            N4.setText("4");
            N4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N4ActionPerformed(evt);
                }
            });
    
            mais.setText("+");
            mais.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    maisActionPerformed(evt);
                }
            });
    
            xquadrado.setText("x^2");
            xquadrado.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    xquadradoActionPerformed(evt);
                }
            });
    
            N3.setText("3");
            N3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N3ActionPerformed(evt);
                }
            });
    
            dezelevX.setText("10^x");
            dezelevX.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dezelevXActionPerformed(evt);
                }
            });
    
            subtracao.setText("-");
            subtracao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    subtracaoActionPerformed(evt);
                }
            });
    
            N2.setText("2");
            N2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N2ActionPerformed(evt);
                }
            });
    
            funcaoEXP.setText("EXP");
            funcaoEXP.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    funcaoEXPActionPerformed(evt);
                }
            });
    
            Nfatorial.setText("N!");
            Nfatorial.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NfatorialActionPerformed(evt);
                }
            });
    
            N0.setText("0");
            N0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N0ActionPerformed(evt);
                }
            });
    
            logariti.setText("log");
            logariti.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    logaritiActionPerformed(evt);
                }
            });
    
            decimal.setText(".");
            decimal.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    decimalActionPerformed(evt);
                }
            });
    
            raizcub.setText("3√x ");
            raizcub.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    raizcubActionPerformed(evt);
                }
            });
    
            botaoigual.setText("=");
            botaoigual.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botaoigualActionPerformed(evt);
                }
            });
    
            N1.setText("1");
            N1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    N1ActionPerformed(evt);
                }
            });
    
            TextField_Principal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            TextField_Principal.setText("0");
            TextField_Principal.setFocusable(false);
            TextField_Principal.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    TextField_PrincipalActionPerformed(evt);
                }
            });
    
            TextField_previo.setBackground(new java.awt.Color(255, 255, 255));
            TextField_previo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            TextField_previo.setForeground(new java.awt.Color(0, 0, 0));
            TextField_previo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            TextField_previo.setCaretColor(new java.awt.Color(0, 0, 0));
            TextField_previo.setDisabledTextColor(new java.awt.Color(109, 109, 109));
            TextField_previo.setFocusable(false);
            TextField_previo.setMargin(new java.awt.Insets(2, 2, 2, 2));
            TextField_previo.setOpaque(true);
    
            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TextField_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                        .addComponent(TextField_previo))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField_previo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(TextField_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
    
            Label_Memoria.setText("m");
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(butaocoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(butaoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(butaotan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MMAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(butaoacose, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(butaoaseno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(butaoatan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(retrocesso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(apagaTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(apagarC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(maismenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(raizquadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yraizx, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(xelevado3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inverso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(numerodepi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(elevmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(XelevadoY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dezelevX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(funcaoEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(logariti, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(N0, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(mais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Nfatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(raizcub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(xquadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botaoigual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 6, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sexage)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radiano)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Memoria)
                            .addGap(106, 106, 106))))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radiano)
                                .addComponent(sexage)))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Label_Memoria)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butaocoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butaoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butaotan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MMAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butaoacose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butaoaseno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butaoatan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(retrocesso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apagaTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apagarC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maismenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(raizquadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numerodepi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(elevmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(XelevadoY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yraizx, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xelevado3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inverso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nfatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(raizcub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xquadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dezelevX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(funcaoEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logariti, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(N0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(botaoigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
    
            pack();
        }// </editor-fold>                        
    
        private void MMenosActionPerformed(java.awt.event.ActionEvent evt) {                                       
              memoria = memoria-Double.parseDouble(TextField_previo.getText());
            Label_Memoria.setVisible(true);
        }                                      
    //botoes numericos
        private void N1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("1");
    inicio = false;
    }else {
     TextField_previo.setText(TextField_previo.getText()+"1");     
    }        
        }                                  
    
        private void N2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
          if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("2");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"2");     
    
    }   
        }                                  
    
        private void N3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("3");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"3");     
    }   
        }                                  
    
        private void N4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("4");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"4");     
    }   
        }                                  
    
        private void N5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
          if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("5");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"5");     
    
    }   
        }                                  
    
        private void N6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
           if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("6");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"6");     
    }   
        }                                  
    
        private void N7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
           if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("7");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"7");     
    }   
        }                                  
    
        private void N8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
           if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("8");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"8");     
    }   
        }                                  
    
        private void N9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
          if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("9");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"9");     
    
    }   
        }                                  
    
        private void N0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         if (inicio == true){        
    TextField_previo.setText("");
    TextField_previo.setText("0");
    inicio = false;
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+"0");    
    }   
        }                                  
    //BOTOES OPERACIONAIS
        // decimal
        private void decimalActionPerformed(java.awt.event.ActionEvent evt) {                                        
            if (TextField_previo.getText().contains(".")){        
    }
    else {
     TextField_previo.setText(TextField_previo.getText()+".");     
    inicio =false;
            }
        }                                       
    //  botão soma
        private void maisActionPerformed(java.awt.event.ActionEvent evt) {                                     
    
            inicio = true;
          igual = true;
          // condiçao
          if(operacao1  = true){
          valor1=Double.parseDouble(TextField_previo.getText().trim());
          
          TextField_Principal.setText("");
          TextField_Principal.setText(TextField_previo.getText()+"+");
          operacao1 = false;
          }
          else {
               if(operacao2 = true){
          valor2=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText(TextField_previo.getText()+"+");
          operacao2 = false;
          }
          else {
               TextField_Principal.setText(TextField_previo.getText()+"+");
              operacoes(resultado,valor2);
               }          
          }
          tipoOperacoes = "+";
        }                                    
    //  botao multiplicacao
        private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {                                              
          
            inicio = true;
          igual = true;
          // condiçao
          if(operacao1 = true){
          valor1=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText("");
          TextField_Principal.setText(TextField_previo.getText()+"*");
          operacao1 = false;
          }
          else {
               if(operacao2 = true){
          valor2=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText(TextField_previo.getText()+"*");
          operacao2 = false;
          }
          else {
               TextField_Principal.setText(TextField_previo.getText()+"*");
              operacoes(resultado,valor2);
               }          
          }
          tipoOperacoes = "*";
         
        }                                             
    // botao menos
        private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        inicio = true;
          igual = true;
          // condiçao
          if(operacao1 = true){
          valor1=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText("");
          TextField_Principal.setText(TextField_previo.getText()+"-");
          operacao1 = false;
          }
          else {
               if(operacao2 = true){
          valor2=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText(TextField_previo.getText()+"-");
          operacao2 = false;
          }
          
          else {
               TextField_Principal.setText(TextField_previo.getText()+"-");
              operacoes(resultado,valor2);
               }          
          }
          tipoOperacoes = "-";
        
        }                                         
    // botao divisao
        private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {                                        
               inicio = true;
          igual = true;
          // condiçao
          if(operacao1 = true){
          valor1=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText("");
          TextField_Principal.setText(TextField_previo.getText()+"/");
          operacao1 = false;
          }
          else {
               if(operacao2 = true){
          valor2=Double.parseDouble(TextField_previo.getText());
          TextField_Principal.setText(TextField_previo.getText()+"/");
          operacao2 = false;
          }
          else {
               TextField_Principal.setText(TextField_previo.getText()+"/");
              operacoes(resultado,valor2);
               }          
          }
          tipoOperacoes = "/";
    
        }                                       
    private void operacoes(double valor1,double  valor2){
    // switch que realiza as operacoes
    switch(tipoOperacoes){
    // case com as funcoes de soma 
        case "+":
            resultado = valor1 + valor2;
            TextField_previo.setText(resultado+"");
            valor1 = Double.parseDouble(TextField_previo.getText());
            break;
            // case da subtracao
              case "-":
            resultado = valor1 - valor2;
            TextField_previo.setText(resultado+"");
            valor1 = Double.parseDouble(TextField_previo.getText());
            break;
              case "*":
            resultado = valor1 * valor2;
            TextField_previo.setText(resultado+"");
            valor1 = Double.parseDouble(TextField_previo.getText());
            break;
               case "/":
                   if (valor2 == 0){
                       TextField_previo.setText("nao existe divisão por zero");
                   break;
                   }else{         
            resultado = valor1 / valor2;
            TextField_previo.setText(resultado+"");
            valor1 = Double.parseDouble(TextField_previo.getText());
            break; 
                   }
                   // case da potenciação 
               case "potencia":
                   resultado = Math.pow(valor1,valor2);
                   TextField_Principal.setText(resultado+" ");
                   break;
                   // caso da função que saca a raiz X 
               case "raizX":
                   if (valor2<=0){
                   TextField_previo.setText("error ");
                   break;
                   }else{
                   TextField_Principal.setText(valor2+" Yroot ");
                   a = 1;
                   c = a/valor2;
                   TextField_previo.setText(Math.pow(valor1,c)+" ");
                   break;
                   }
                 
    }
    }             
    // codigo das operacoes basicas soma menos divisao  multiplicacao
        private void botaoigualActionPerformed(java.awt.event.ActionEvent evt) {                                           
         inicio = true;
           operacao1 = true;
            if(igual= true ){
            if ( tipoOperacoes == null){
            }
            else{
             valor2 = Double.parseDouble(TextField_previo.getText());
            TextField_Principal.setText(TextField_Principal.getText()+TextField_previo.getText());
            operacoes(valor1,valor2);
            igual = false;
            }
            }else{
            TextField_Principal.setText("");
             operacoes(valor1,valor2);
            }
        }                                          
    
        private void TextField_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        }                                                   
    //raizquadrada
        private void raizquadradaActionPerformed(java.awt.event.ActionEvent evt) {                                             
    valor1 = Double.parseDouble(TextField_previo.getText());      
            if(valor1>=0){
    TextField_Principal.setText("sqrt( "+valor1+" )");
    TextField_previo.setText(Math.sqrt(valor1)+"");
            }else{
    TextField_previo.setText("error");
            }
        }                                            
    // botao de porcentagem
        private void porcentagemActionPerformed(java.awt.event.ActionEvent evt) {                                            
         
            // TODO add your handling code here:
            if(valor1==0){
            valor1=1;
            }
            valor2 = Double.parseDouble(TextField_previo.getText());    
            TextField_Principal.setText( TextField_Principal.getText()+TextField_previo.getText());
            TextField_previo.setText((valor1*valor2)/100+" ");
            igual = true;
        }                                           
    // botao de oeperaçao inversa
        private void inversoActionPerformed(java.awt.event.ActionEvent evt) {                                        
            valor1 = Double.parseDouble(TextField_previo.getText());
            TextField_Principal.setText("reciproco( "+valor1+" )");
            TextField_previo.setText(1/valor1+" ");
        }                                       
    // botao de  mais ou menos
        private void maismenosActionPerformed(java.awt.event.ActionEvent evt) {                                          
            double nu1 = 0,nu2,nu3;
    nu2 = Double.parseDouble(TextField_previo.getText());
    nu3 = nu1 - nu2;
    TextField_previo.setText(nu3+" ");
        }                                         
    
        private void apagarCActionPerformed(java.awt.event.ActionEvent evt) {                                        
            
            TextField_previo.setText("0");
        TextField_Principal.setText("");
            inicio = true;
            funcoes = "";
            operacao1 = true;
            operacao2 = true;
                    igual = true;
                    valor1 = 0;
                    valor2 = 0;
                   resultado =0;
        }                                       
    
        private void apagaTudoActionPerformed(java.awt.event.ActionEvent evt) {                                          
         TextField_previo.setText("0");
        TextField_Principal.setText("");
            inicio = true;
            funcoes = "";
        }                                         
    
        private void sexageActionPerformed(java.awt.event.ActionEvent evt) {                                       
          
        }                                      
    
        private void retrocessoActionPerformed(java.awt.event.ActionEvent evt) {                                           
            if(TextField_previo.getText().length()>0){
                TextField_previo.setText(TextField_previo.getText().substring(0,TextField_previo.getText().length()-1));
                if (TextField_previo.getText().length()==0){
                TextField_previo.setText("0");
                inicio = true;
     
                }
        }                                          
        }
        public void Trigonometria(){
        if (sexage.isSelected()){
        switch (funcoes){
            case "seno":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("seno("+valor1+")");
       seno= Math.sin(Math.PI*(valor1/180));
                TextField_previo.setText(seno+" ");
        break;
        //seno inverso
        case "aseno":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("seno("+valor1+")");
      aseno= Math.sin((valor1*180/Math.PI));
                TextField_previo.setText(aseno+" ");
        break;
        // coseno
        case "cos":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("cos("+valor1+")");
       cos= Math.cos(Math.PI*(valor1/180));
                TextField_previo.setText(cos+" ");
        break;
        // acoseno
        case "acos":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("acos("+valor1+")");
       acos= Math.acos(valor1)*180/Math.PI;
                TextField_previo.setText(cos+" ");
        break;
        // tangente
        case "tan":    
        valor1=Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("tan("+valor1+")");
        tan = Math.tan(Math.PI*(valor1)/180);
        TextField_Principal.setText(tan+"");
        break;
        // tangente inversa
        case "atan":
        valor1 =  Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("atan("+valor1+")");
        atan = Math.atan(valor1)*180/Math.PI;
        TextField_Principal.setText(atan+"");
        break;
      
        }
        //RADIANO
        
        }else {
          if (radiano.isSelected()){
        switch (funcoes){
            case "seno":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("senoR("+valor1+")");
       seno= Math.sin(valor1);
                TextField_previo.setText(seno+" ");
        break;
        //seno inverso
        case "aseno":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("senoR("+valor1+")");
      aseno= Math.asin(valor1);
                TextField_previo.setText(aseno+" ");
        break;
        // coseno
        case "cos":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("cosR("+valor1+")");
       cos= Math.cos(valor1);
                TextField_previo.setText(cos+" ");
        break;
        // acoseno
        case "acos":
        valor1 =Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("acosR("+valor1+")");
       acos= Math.acos(valor1);
                TextField_previo.setText(cos+" ");
        break;
        // tangente
        case "tan":    
        valor1=Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("tanR("+valor1+")");
        tan = Math.tan(valor1);
        TextField_Principal.setText(tan+"");
        break;
        // tangente inversa
        case "atan":
        valor1 =  Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("atanR("+valor1+")");
        atan = Math.atan(valor1);
        TextField_Principal.setText(atan+"");
        break;
      
        }
        }  
    
        
        }
        }
        private void butaocosenoActionPerformed(java.awt.event.ActionEvent evt) {                                            
      funcoes = "cos";
            Trigonometria();
        }                                           
    
        private void butaosenoActionPerformed(java.awt.event.ActionEvent evt) {                                          
          funcoes = "seno";
            Trigonometria();
            
        }                                         
    
        private void butaotanActionPerformed(java.awt.event.ActionEvent evt) {                                         
           funcoes = "tan";
           Trigonometria();
        }                                        
    
        private void butaoacoseActionPerformed(java.awt.event.ActionEvent evt) {                                           
           funcoes = "acos";
           Trigonometria();
        }                                          
    
        private void butaoasenoActionPerformed(java.awt.event.ActionEvent evt) {                                           
          funcoes = "aseno";
          Trigonometria();
        }                                          
    
        private void butaoatanActionPerformed(java.awt.event.ActionEvent evt) {                                          
            funcoes = "atan";
            Trigonometria();
        }                                         
    // botao de pi
        private void numerodepiActionPerformed(java.awt.event.ActionEvent evt) {                                           
           TextField_Principal.setText("PI");
            TextField_previo.setText(Math.PI+" "); 
        }                                          
    // elevado a menos 1
        private void elevmenos1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
      valor1 = Double.parseDouble(TextField_previo.getText());
            TextField_Principal.setText(valor1+"^-1");
            TextField_previo.setText(Math.pow(valor1,-1)+ " ");
    
        }                                          
    
        private void XelevadoYActionPerformed(java.awt.event.ActionEvent evt) {                                          
         inicio = true;
         valor1 = Double.parseDouble(TextField_previo.getText());
         TextField_Principal.setText(valor1+"^");
        tipoOperacoes ="potencia";
         operacao1 = false;
         igual = true;
        }                                         
    
        private void radianoActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        }                                       
    // botao y raiz de x
        private void yraizxActionPerformed(java.awt.event.ActionEvent evt) {                                       
            inicio = true;
            valor1 = Double.parseDouble(TextField_previo.getText());
            TextField_Principal.setText(valor1+"Yroot");
            tipoOperacoes = "raizx";
            operacao1 = false;
            igual = true;
        }                                      
    
        private void xelevado3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    valor1 = Double.parseDouble(TextField_previo.getText());
           TextField_Principal.setText("cube( " +valor1+" ) ");
            TextField_previo.setText(Math.pow(valor1, 3)+ " ");
        }                                         
    
        private void NfatorialActionPerformed(java.awt.event.ActionEvent evt) {                                          
         a = 1;
            valor1 = Double.parseDouble(TextField_Principal.getText());
            TextField_previo.setText("fact " +valor1+ " ) ");
            for(b = 1 ; b <= valor1;b++ ){
         a = a*b;         
        }                                         
        }
        private void eActionPerformed(java.awt.event.ActionEvent evt) {                                  
          TextField_Principal.setText("E ");
                  TextField_previo.setText(Math.E + " "); 
                  
        }                                 
    
        private void raizcubActionPerformed(java.awt.event.ActionEvent evt) {                                        
           valor1 = Double.parseDouble(TextField_previo.getText());
            a = 1 ;
            b = 3;
            c = a/b;
            TextField_Principal.setText("cuberot( " +valor1+" ) ");
            TextField_previo.setText(Math.pow (valor1,c)+" ");
        }                                       
    
        private void xquadradoActionPerformed(java.awt.event.ActionEvent evt) {                                          
      valor1 = Double.parseDouble(TextField_previo.getText());
            TextField_Principal.setText("sqr("+valor1+")");
            TextField_previo.setText(Math.pow(valor1,2)+" ");
        }                                         
    
        private void dezelevXActionPerformed(java.awt.event.ActionEvent evt) {                                         
           valor1 = Double.parseDouble(TextField_previo.getText());
           TextField_Principal.setText("powten("+valor1+")");
           TextField_previo.setText(Math.pow(10,valor1)+" ");
        }                                        
    // euler^X
        private void funcaoEXPActionPerformed(java.awt.event.ActionEvent evt) {                                          
    valor1 = Double.parseDouble(TextField_previo.getText());
            TextField_Principal.setText(Math.exp(valor1)+" ");
        }                                         
    
        private void logaritiActionPerformed(java.awt.event.ActionEvent evt) {                                         
        valor1 = Double.parseDouble(TextField_previo.getText());
        TextField_Principal.setText("log("+valor1+")");
        TextField_previo.setText(Math.log(valor1)+" ");
        }                                        
    
        private void MCActionPerformed(java.awt.event.ActionEvent evt) {                                   
          memoria = 0;
            Label_Memoria.setVisible (false);
        }                                  
    
        private void MRActionPerformed(java.awt.event.ActionEvent evt) {                                   
           TextField_previo.setText(memoria + " ");
        }                                  
    
        private void MSActionPerformed(java.awt.event.ActionEvent evt) {                                   
           memoria = Double.parseDouble(TextField_Principal.getText());
           Label_Memoria.setVisible(true);
        }                                  
    
        private void MMAISActionPerformed(java.awt.event.ActionEvent evt) {                                      
           memoria = memoria+Double.parseDouble(TextField_previo.getText());
            Label_Memoria.setVisible(true);
        }                                     
     
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
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
    
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Calculadora().setVisible(true);
                }
            });
        }
        // Variables declaration - do not modify                     
        private javax.swing.JLabel Label_Memoria;
        private javax.swing.JButton MC;
        private javax.swing.JButton MMAIS;
        private javax.swing.JButton MMenos;
        private javax.swing.JButton MR;
        private javax.swing.JButton MS;
        private javax.swing.JButton N0;
        private javax.swing.JButton N1;
        private javax.swing.JButton N2;
        private javax.swing.JButton N3;
        private javax.swing.JButton N4;
        private javax.swing.JButton N5;
        private javax.swing.JButton N6;
        private javax.swing.JButton N7;
        private javax.swing.JButton N8;
        private javax.swing.JButton N9;
        private javax.swing.JButton Nfatorial;
        private javax.swing.JTextField TextField_Principal;
        private javax.swing.JTextField TextField_previo;
        private javax.swing.JButton XelevadoY;
        private javax.swing.JButton apagaTudo;
        private javax.swing.JButton apagarC;
        private javax.swing.JButton botaoigual;
        private javax.swing.JButton butaoacose;
        private javax.swing.JButton butaoaseno;
        private javax.swing.JButton butaoatan;
        private javax.swing.JButton butaocoseno;
        private javax.swing.JButton butaoseno;
        private javax.swing.JButton butaotan;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.ButtonGroup buttonGroup2;
        private javax.swing.JButton decimal;
        private javax.swing.JButton dezelevX;
        private javax.swing.JButton divisao;
        private javax.swing.JButton e;
        private javax.swing.JButton elevmenos1;
        private javax.swing.JButton funcaoEXP;
        private javax.swing.JButton inverso;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JButton logariti;
        private javax.swing.JButton mais;
        private javax.swing.JButton maismenos;
        private javax.swing.JButton multiplicacao;
        private javax.swing.JButton numerodepi;
        private javax.swing.JButton porcentagem;
        private javax.swing.JRadioButton radiano;
        private javax.swing.JButton raizcub;
        private javax.swing.JButton raizquadrada;
        private javax.swing.JButton retrocesso;
        private javax.swing.JRadioButton sexage;
        private javax.swing.JButton subtracao;
        private javax.swing.JButton xelevado3;
        private javax.swing.JButton xquadrado;
        private javax.swing.JButton yraizx;
        // End of variables declaration                   
    }
    