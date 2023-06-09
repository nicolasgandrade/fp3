package com.fp3.haras.view.container;

import com.fp3.haras.utils.Colors;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.border.EmptyBorder;

public class MainContainer extends javax.swing.JPanel {
    private FeatureWrapper wrapper;
    
    public MainContainer() {
        initComponents();
        this.setBackground(Colors.WHITEBG);
    }
    
    private void initComponents() {
        this.setLayout(new GridBagLayout());
        this.wrapper = new FeatureWrapper();
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weighty = 1;
        gbc.weightx = 1;
        
        this.setBorder(new EmptyBorder(36, 36, 0, 36));
        
        this.add(wrapper, gbc);
    }
    
    public FeatureWrapper getFeatureWrapper() {
        return this.wrapper;
    }
}
