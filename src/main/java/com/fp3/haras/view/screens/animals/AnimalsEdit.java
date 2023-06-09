package com.fp3.haras.view.screens.animals;

import com.fp3.haras.model.Animal;
import com.fp3.haras.utils.Colors;
import com.fp3.haras.utils.EntityUtils;
import com.fp3.haras.utils.GenericObservable;
import com.fp3.haras.utils.GenericObserver;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AnimalsEdit extends javax.swing.JFrame implements GenericObservable {
    
    private Animal selectedAnimal;
    private List<GenericObserver> observers = new ArrayList<>();

    public AnimalsEdit() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panelBack.setBackground(Colors.WHITEBG);
        panelForm.setBackground(Colors.PRIMARYBG);
        lblTitle.putClientProperty("FlatLaf.styleClass", "h00");
        
        jLabel10.setEnabled(false);
        boxProprietario.setEnabled(false);
    }
    
    public void populateData(Animal animal) {
        this.selectedAnimal = animal;
        
        this.boxProprietario.removeAllItems();
        
        this.txtNome.setText(animal.getName());
        this.boxPelagem.setSelectedItem(animal.getCoat());
        this.boxCategoria.setSelectedItem(animal.getCategory());
        this.txtOrigem.setText(animal.getOrigin());
        this.boxAie.setSelected(animal.getHasExameAie());
        this.boxGta.setSelected(animal.getHasGta());
        this.boxMormo.setSelected(animal.getHasExameMormo());
        if (animal.getSex().equals("Macho")) {
            this.rbtnMacho.setSelected(true);
        } else {
            this.rbtnFemea.setSelected(true);
        }
        this.boxProprietario.addItem(animal.getOwners().get(0).getName());
        //TODO: Setar os combobox de suggestionp proprietario/condominio
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBack = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        txtOrigem = new javax.swing.JTextField();
        boxPelagem = new javax.swing.JComboBox<>();
        boxAie = new javax.swing.JCheckBox();
        boxGta = new javax.swing.JCheckBox();
        boxMormo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        boxCategoria = new javax.swing.JComboBox<>();
        rbtnMacho = new javax.swing.JRadioButton();
        rbtnFemea = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        boxProprietario = new com.fp3.haras.components.ComboBoxSuggestion();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        panelBack.setBackground(new java.awt.Color(244, 244, 244));
        panelBack.setPreferredSize(new java.awt.Dimension(630, 475));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("EDIÇÃO");

        panelForm.setMinimumSize(new java.awt.Dimension(570, 290));
        panelForm.setPreferredSize(new java.awt.Dimension(570, 290));

        boxPelagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Branca", "Preta", "Alazã", "Castanha", "Baia", "Pêlo de Rato", "Tordilha", "Rosilha", "Lobuna", "Ruão", "Pampa", "Leopardo", "Mantado", "Nevado" }));

        jLabel2.setText("CATEGORIA");

        jLabel10.setText("PROPRIETÁRIO");

        jLabel5.setText("PELAGEM");

        jLabel6.setText("ORIGEM");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("SEXO:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AIE:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("GTA:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("MORMO:");

        boxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Appaloosa", "Campolina", "Bretão", "Lusitano", "Mangalarga", "Nordestino", "Pampa", "Quarto de Milha", "Akhal-Teke" }));

        buttonGroup1.add(rbtnMacho);
        rbtnMacho.setText("Macho");

        buttonGroup1.add(rbtnFemea);
        rbtnFemea.setText("Fêmea");

        jLabel1.setText("NOME");

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(boxAie)
                .addGap(91, 91, 91)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(boxGta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(boxMormo)
                .addGap(67, 67, 67))
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelFormLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelFormLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelFormLayout.createSequentialGroup()
                                    .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panelFormLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtnMacho)
                                        .addComponent(rbtnFemea)))))
                        .addGroup(panelFormLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelFormLayout.createSequentialGroup()
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelFormLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxPelagem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addComponent(rbtnMacho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnFemea)))
                        .addGap(6, 6, 6)
                        .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(46, 46, 46))
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(6, 6, 6)
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxPelagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(boxMormo)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxAie)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(boxGta))
                        .addGap(18, 18, 18)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnDelete.setText("EXCLUIR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("SALVAR");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCELAR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBackLayout = new javax.swing.GroupLayout(panelBack);
        panelBack.setLayout(panelBackLayout);
        panelBackLayout.setHorizontalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle))
            .addGroup(panelBackLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBackLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBackLayout.setVerticalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Realmente deseja apagar este cadastro?", "ATENÇÃO", JOptionPane.WARNING_MESSAGE) == 0) {
            selectedAnimal.setName(txtNome.getText());
            selectedAnimal.setCoat((String) boxPelagem.getSelectedItem());
            if (rbtnMacho.isSelected()) {
                selectedAnimal.setSex(rbtnMacho.getText());
            } else if (rbtnFemea.isSelected()) {
                selectedAnimal.setSex(rbtnFemea.getText());
            }
            selectedAnimal.setCategory((String) boxCategoria.getSelectedItem());
            selectedAnimal.setOrigin(txtOrigem.getText());
            selectedAnimal.setHasExamAie(boxAie.isSelected());
            selectedAnimal.setHasExamMormo(boxMormo.isSelected());
            selectedAnimal.setHasGta(boxGta.isSelected());
            selectedAnimal.setIsDeleted(true);
            
            EntityUtils.update(selectedAnimal);
            
            JOptionPane.showMessageDialog(null, "Os dados foram removidos!", null, JOptionPane.INFORMATION_MESSAGE, null);
            dispose();
            this.notifyObservers("");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        selectedAnimal.setName(txtNome.getText());
        selectedAnimal.setCoat((String) boxPelagem.getSelectedItem());
        if (rbtnMacho.isSelected()) {
            selectedAnimal.setSex(rbtnMacho.getText());
        } else if (rbtnFemea.isSelected()) {
            selectedAnimal.setSex(rbtnFemea.getText());
        }
        selectedAnimal.setCategory((String) boxCategoria.getSelectedItem());
        selectedAnimal.setOrigin(txtOrigem.getText());
        selectedAnimal.setHasExamAie(boxAie.isSelected());
        selectedAnimal.setHasExamMormo(boxMormo.isSelected());
        selectedAnimal.setHasGta(boxGta.isSelected());
        
        EntityUtils.update(selectedAnimal);
        
        JOptionPane.showMessageDialog(null, "Animal atualizado!", "Cadastro Atualizado", JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
        this.notifyObservers("");
    }//GEN-LAST:event_btnSaveActionPerformed
    
    @Override
    public void addObserver(GenericObserver o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(GenericObserver o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers(Object o) {
        for (GenericObserver observer: this.observers) {
            observer.update(o);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxAie;
    private javax.swing.JComboBox<String> boxCategoria;
    private javax.swing.JCheckBox boxGta;
    private javax.swing.JCheckBox boxMormo;
    private javax.swing.JComboBox<String> boxPelagem;
    private com.fp3.haras.components.ComboBoxSuggestion boxProprietario;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBack;
    private javax.swing.JPanel panelForm;
    private javax.swing.JRadioButton rbtnFemea;
    private javax.swing.JRadioButton rbtnMacho;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOrigem;
    // End of variables declaration//GEN-END:variables
}
