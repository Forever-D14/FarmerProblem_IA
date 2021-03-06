
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacho
 */
public class farmerUI extends javax.swing.JFrame {
    Arbol arbolito;
    Nodo inicial,estadoFinal;
    /**
     * Creates new form farmerUI
     */
    public farmerUI() {
        initComponents();
        jPanel2.add(new Contenedor(jPanel2));
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        granjeroComboB = new javax.swing.JComboBox<>();
        loboComboB = new javax.swing.JComboBox<>();
        colComboB = new javax.swing.JComboBox<>();
        ovejaComboB = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        profundidadButton = new javax.swing.JButton();
        anchuraButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ovejaComboBF = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        colComboBF = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        loboComboBF = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        granjeroComboBF = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));
        setForeground(new java.awt.Color(0, 204, 102));
        setMinimumSize(new java.awt.Dimension(1010, 820));
        setPreferredSize(new java.awt.Dimension(1010, 820));
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 820));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setName(""); // NOI18N

        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 588));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Granjero");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Lobo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Oveja");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Col");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 20, 20));

        granjeroComboB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        granjeroComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));
        granjeroComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granjeroComboBActionPerformed(evt);
            }
        });
        jPanel3.add(granjeroComboB, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 30, 100, -1));

        loboComboB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loboComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));
        loboComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loboComboBActionPerformed(evt);
            }
        });
        jPanel3.add(loboComboB, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 30, 100, -1));

        colComboB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        colComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));
        colComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colComboBActionPerformed(evt);
            }
        });
        jPanel3.add(colComboB, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 30, 100, -1));

        ovejaComboB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ovejaComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izquierda", "Derecha" }));
        ovejaComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovejaComboBActionPerformed(evt);
            }
        });
        jPanel3.add(ovejaComboB, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 30, 100, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Profundidad");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 110, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Anchura");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Reiniciar");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        profundidadButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        profundidadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorButton.png"))); // NOI18N
        profundidadButton.setBorderPainted(false);
        profundidadButton.setContentAreaFilled(false);
        profundidadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profundidadButtonActionPerformed(evt);
            }
        });
        jPanel3.add(profundidadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        anchuraButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        anchuraButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorButton.png"))); // NOI18N
        anchuraButton.setBorderPainted(false);
        anchuraButton.setContentAreaFilled(false);
        anchuraButton.setFocusPainted(false);
        anchuraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anchuraButtonActionPerformed(evt);
            }
        });
        jPanel3.add(anchuraButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Estado Inicial");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 72, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Estado Final");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 72, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Oveja");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 20));

        ovejaComboBF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ovejaComboBF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Derecha", "Izquierda" }));
        ovejaComboBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovejaComboBFActionPerformed(evt);
            }
        });
        jPanel3.add(ovejaComboBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 130, 100, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Col");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 28, 20));

        colComboBF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        colComboBF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Derecha", "Izquierda" }));
        colComboBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colComboBFActionPerformed(evt);
            }
        });
        jPanel3.add(colComboBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 130, 100, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Lobo");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 20));

        loboComboBF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loboComboBF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Derecha", "Izquierda" }));
        loboComboBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loboComboBFActionPerformed(evt);
            }
        });
        jPanel3.add(loboComboBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 130, 100, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Granjero");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        granjeroComboBF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        granjeroComboBF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Derecha", "Izquierda" }));
        granjeroComboBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granjeroComboBFActionPerformed(evt);
            }
        });
        jPanel3.add(granjeroComboBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 130, 100, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorButton.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void granjeroComboBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granjeroComboBFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_granjeroComboBFActionPerformed

    private void loboComboBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loboComboBFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loboComboBFActionPerformed

    private void colComboBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colComboBFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_colComboBFActionPerformed

    private void ovejaComboBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovejaComboBFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ovejaComboBFActionPerformed

    private void anchuraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anchuraButtonActionPerformed
        // TODO add your handling code here:
       
        this.inicializeStates();
        this.arbolito = new Arbol(inicial,estadoFinal);
        
        if(this.arbolito.loboOvejaGranjero(inicial) || this.arbolito.loboOvejaGranjero(estadoFinal))
            JOptionPane.showMessageDialog(null,"Recuerda que el Lobo y la Oveja no pueden estar juntos sin el Granjero");
            else if(this.arbolito.ovejaColGranjero(inicial) || this.arbolito.ovejaColGranjero(estadoFinal))
                JOptionPane.showMessageDialog(null,"Recuerda que la Oveja y la Col no pueden estar juntos sin el Granjero");
            else if(!this.arbolito.inicial.estadoS.equals(this.arbolito.estadoFinal.estadoS)){
                        this.arbolito.busquedaAnchura(inicial, estadoFinal);
                        animacionCompleta.start();
                        JOptionPane.showMessageDialog(null,"Nodos Visitados: " + this.arbolito.caminoA.toString()+"\n Camino por Anchura:"+this.arbolito.caminoAnchura);
            }else
                JOptionPane.showMessageDialog(null,"El estado Final y el Inicial son los mismos");
    }//GEN-LAST:event_anchuraButtonActionPerformed

    
    
    private void profundidadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profundidadButtonActionPerformed
        
        this.inicializeStates();
        this.arbolito = new Arbol(inicial,estadoFinal);
        
        if(this.arbolito.loboOvejaGranjero(inicial) || this.arbolito.loboOvejaGranjero(estadoFinal))
            JOptionPane.showMessageDialog(null,"Recuerda que el Lobo y la Oveja no pueden estar juntos sin el Granjero");
            else if(this.arbolito.ovejaColGranjero(inicial) || this.arbolito.ovejaColGranjero(estadoFinal))
                JOptionPane.showMessageDialog(null,"Recuerda que la Oveja y la Col no pueden estar juntos sin el Granjero");
            else if(!this.arbolito.inicial.estadoS.equals(this.arbolito.estadoFinal.estadoS)){
                        this.arbolito.busquedaProfundidad(inicial, estadoFinal);
                        animacionCompleta.start();
                        JOptionPane.showMessageDialog(null,"Nodos Visitados: " + this.arbolito.caminoP.toString()+"\n Camino por Profundidad:"+this.arbolito.caminoProfundidad);
            }else
                JOptionPane.showMessageDialog(null,"El estado Final y el Inicial son los mismos");
    }//GEN-LAST:event_profundidadButtonActionPerformed

   Thread animacionCompleta = new Thread(){
       Thread anterior=new Thread();
       int[] posiciones;
       
        @Override
        public void run(){
            posiciones = inicial.estado.clone();
            while(!arbolito.operadores.isEmpty()){
                String x = arbolito.operadores.pop();
                System.out.println(x);
                
                
                switch(x){
                    case "granjeroOveja" -> {
                        if(posiciones[0]==1)
                            try {
                                Contenedor.movOvejaGranjeroIzqDer.run();
                                Contenedor.movOvejaGranjeroIzqDer.join();
                                posiciones[0]=0;
                                break;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (Throwable ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        else{
                            try {
                                Contenedor.movOvejaGranjeroDerIzq.run();
                                Contenedor.movOvejaGranjeroDerIzq.join();
                                posiciones[0]=1;
                                break;
                            } catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (Throwable ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                    }

                    case "soloGranjero" -> {
                        if(posiciones[0]==1)
                            try {
                            Contenedor.movGranjeroIzqDer.run();
                            Contenedor.movGranjeroIzqDer.join();
                            Contenedor.movGranjeroIzqDer.stop();
                            
                            posiciones[0]=0;
                            break;
                            }catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        else try {
                            Contenedor.movGranjeroDerIzq.run();
                            Contenedor.movGranjeroDerIzq.join();
                            Contenedor.movGranjeroDerIzq.stop();
                            
                            posiciones[0]=1;
                            break;
                            }catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
                    }
                    
                    case "granjeroLobo" ->{
                        if(posiciones[0]==1)
                            try {
                                Contenedor.movLoboGranjeroIzqDer.run();
                                Contenedor.movLoboGranjeroIzqDer.join();
                                posiciones[0]=0;
                                break;
                            }catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        else try {
                                Contenedor.movLoboGranjeroDerIzq.run();
                                Contenedor.movLoboGranjeroDerIzq.join();
                                posiciones[0]=1;
                                break;
                            }catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
                    }
                    
                    case "granjeroCol" ->{
                        if(posiciones[0]==1)
                            try {
                                Contenedor.movColGranjeroIzqDer.run();
                                Contenedor.movColGranjeroIzqDer.join();
                                posiciones[0]=0;
                                break;
                            }catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        else try {
                                Contenedor.movColGranjeroDerIzq.run();
                                Contenedor.movColGranjeroDerIzq.join();
                                posiciones[0]=1;
                                break;
                            }catch (InterruptedException ex) {
                                Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                    
                    }

                }
            }
        }
    };
    
    private void ovejaComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovejaComboBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ovejaComboBActionPerformed

    private void colComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colComboBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_colComboBActionPerformed

    private void loboComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loboComboBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loboComboBActionPerformed

    private void granjeroComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granjeroComboBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_granjeroComboBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            Runtime.getRuntime().exec("java -jar C:\\Users\\nacho\\OneDrive\\Documentos\\NetBeansProjects\\farmerProblemPF\\dist\\farmerProblemPF.jar");
        } catch (IOException ex) {
            Logger.getLogger(farmerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void inicializeStates(){
        int[] estadoAux = {convertion(this.getGranjeroComboB().getSelectedItem().toString()),
                           convertion(this.getLoboComboB().getSelectedItem().toString()),
                           convertion(this.getOvejaComboB().getSelectedItem().toString()),
                           convertion(this.getColComboB().getSelectedItem().toString())};
        int [] estadoAuxF = {convertion(this.getGranjeroComboBF().getSelectedItem().toString()),
                           convertion(this.getLoboComboBF().getSelectedItem().toString()),
                           convertion(this.getOvejaComboBF().getSelectedItem().toString()),
                           convertion(this.getColComboBF().getSelectedItem().toString())};
        
        inicial = new Nodo(estadoAux);
        estadoFinal = new Nodo(estadoAuxF);
        
        if(estadoAux[0]==0){
            int x = Contenedor.columnaGranjero;
            Contenedor.columnaGranjero = Contenedor.columnaGranjeroF;
            Contenedor.columnaGranjeroF = x;
            x=Contenedor.columnaBote;
            Contenedor.columnaBote = Contenedor.columnaBoteF;
            Contenedor.columnaBoteF = x;
                    }
        
        if(estadoAux[1]==0){
            int x = Contenedor.columnaLobo;
            Contenedor.columnaLobo = Contenedor.columnaLoboF;
            Contenedor.columnaLoboF = x;
                    }
        
        if(estadoAux[2]==0){
            int x = Contenedor.columnaOveja;
            Contenedor.columnaOveja = Contenedor.columnaOvejaF;
            Contenedor.columnaOvejaF = x;
                    }
        
        if(estadoAux[3]==0){
            int x = Contenedor.columnaCol;
            Contenedor.columnaCol = Contenedor.columnaColF;
            Contenedor.columnaColF = x;
                    }
        
        
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(farmerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(farmerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(farmerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(farmerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new farmerUI().setVisible(true);
            }
        });
    }

    public void validation(int x, int y){
        
    
    }
    
   public int convertion(String x){
       
       if(x.equals("Izquierda"))
           return 1; 
       else
           return 0;
   }

    public JComboBox<String> getColComboB() {
        return colComboB;
    }

    public void setColComboB(JComboBox<String> colComboB) {
        this.colComboB = colComboB;
    }

    public JComboBox<String> getColComboBF() {
        return colComboBF;
    }

    public void setColComboBF(JComboBox<String> colComboBF) {
        this.colComboBF = colComboBF;
    }

    public JComboBox<String> getGranjeroComboB() {
        return granjeroComboB;
    }

    public void setGranjeroComboB(JComboBox<String> granjeroComboB) {
        this.granjeroComboB = granjeroComboB;
    }

    public JComboBox<String> getGranjeroComboBF() {
        return granjeroComboBF;
    }

    public void setGranjeroComboBF(JComboBox<String> granjeroComboBF) {
        this.granjeroComboBF = granjeroComboBF;
    }

    public JComboBox<String> getLoboComboB() {
        return loboComboB;
    }

    public void setLoboComboB(JComboBox<String> loboComboB) {
        this.loboComboB = loboComboB;
    }

    public JComboBox<String> getLoboComboBF() {
        return loboComboBF;
    }

    public void setLoboComboBF(JComboBox<String> loboComboBF) {
        this.loboComboBF = loboComboBF;
    }

    public JComboBox<String> getOvejaComboB() {
        return ovejaComboB;
    }

    public void setOvejaComboB(JComboBox<String> ovejaComboB) {
        this.ovejaComboB = ovejaComboB;
    }

    public JComboBox<String> getOvejaComboBF() {
        return ovejaComboBF;
    }

    public void setOvejaComboBF(JComboBox<String> ovejaComboBF) {
        this.ovejaComboBF = ovejaComboBF;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anchuraButton;
    private javax.swing.JComboBox<String> colComboB;
    private javax.swing.JComboBox<String> colComboBF;
    private javax.swing.JComboBox<String> granjeroComboB;
    private javax.swing.JComboBox<String> granjeroComboBF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JComboBox<String> loboComboB;
    private javax.swing.JComboBox<String> loboComboBF;
    private javax.swing.JComboBox<String> ovejaComboB;
    private javax.swing.JComboBox<String> ovejaComboBF;
    private javax.swing.JButton profundidadButton;
    // End of variables declaration//GEN-END:variables
}
