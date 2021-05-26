/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package needrollswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author chobus
 */
public class NeedRollSwing {
    
    JPanel topPanel(){
        JPanel rootLeftPanel = new JPanel();
        
        return rootLeftPanel;
    }
    
    JPanel centerPanel(){
        JPanel rootCenterPanel = new JPanel();
        
        return rootCenterPanel;
    }
    
    JPanel bottomPanel(){
        JPanel rootBottomPanel = new JPanel();
        
        return rootBottomPanel;
    }
    
    JPanel rightPanel(){
        JPanel rootRightPanel = new JPanel();
        
        return rootRightPanel;
    }
    
    JPanel leftPanel(){
        
        JPanel rootLeftPanel = new JPanel();
        rootLeftPanel.setLayout(new FlowLayout());
        
        JButton btnSelectRoom = new JButton("Комната");
        btnSelectRoom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnSelectWall = new JButton("Стена");
        btnSelectWall.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnAddWall = new JButton(" + Стена");
        btnAddWall.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnAddWindow = new JButton(" + Окно");
        btnAddWindow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnAddRoom = new JButton(" + Дверь");
        btnAddRoom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnDelArea = new JButton("Отнять");
        btnDelArea.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        
        JLabel jlTypeWallpaper = new JLabel("Тип обоев");
        DefaultComboBoxModel fruitsName = new DefaultComboBoxModel();

        fruitsName.addElement("Apple");
        fruitsName.addElement("Grapes");
        fruitsName.addElement("Mango");
        fruitsName.addElement("Peer");

        final JComboBox fruitCombo = new JComboBox(fruitsName);    
        fruitCombo.setSelectedIndex(0);
        
        rootLeftPanel.add(fruitCombo);
        rootLeftPanel.setVisible(true);
        
        return rootLeftPanel;
    }
    
    NeedRollSwing(){
        
        JFrame root = new JFrame("NeedRollSwing");
        root.setLayout(new BorderLayout());
        root.setSize(900,800);
        root.setBackground(Color.yellow);
        root.setResizable(false);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        
        //root.add( , BorderLayout.NORTH);
        //root.add( , BorderLayout.SOUTH);
        //root.add( , BorderLayout.CENTER);
        root.add(leftPanel() , BorderLayout.WEST);
        //root.add( , BorderLayout.EAST);
        
        root.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new NeedRollSwing();
            }
        });
    }
    
}
