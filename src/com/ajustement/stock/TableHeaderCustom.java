/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajustement.stock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author HP-MGBI
 */
public class TableHeaderCustom extends DefaultTableCellRenderer{

    public TableHeaderCustom() {
        setBackground(Color.WHITE);
        setFont(new Font("sansserif", 1, 12));
        setForeground(new Color(50,50,50)); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void paint(Graphics grphs){
        super.paint(grphs);
        grphs.setColor(Color.LIGHT_GRAY);
        //grphs.setColor(new Color(230, 230, 230));
        grphs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
    
}
