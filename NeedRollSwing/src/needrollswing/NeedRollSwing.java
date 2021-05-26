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
        JPanel rootTopPanel = new JPanel();
        rootTopPanel.setLayout(new FlowLayout());
        rootTopPanel.setBackground(Color.blue);
        //rootTopPanel.setSize(450, 150);
        
        return rootTopPanel;
    }
    
    JPanel centerPanel(){
        JPanel rootCenterPanel = new JPanel();
        rootCenterPanel.setLayout(new FlowLayout());
        rootCenterPanel.setSize(300, 200);
        rootCenterPanel.setBackground(Color.gray);
        
        return rootCenterPanel;
    }
    
    JPanel bottomPanel(){
        JPanel rootBottomPanel = new JPanel();
        rootBottomPanel.setLayout(new FlowLayout());
        rootBottomPanel.setBackground(Color.blue);
        //rootBottomPanel.setSize(450, 150);
        
        return rootBottomPanel;
    }
    
    JPanel rightPanel(){
        JPanel rootRightPanel = new JPanel();
        rootRightPanel.setLayout(new GridLayout(4,0));
        rootRightPanel.setBackground(Color.black);
        
        JTextArea t1,t2;  
        t1=new JTextArea("Welcome \nto \nJavatpoint.");  
        //t1.setBounds(50,100, 200,30);  
        t2=new JTextArea("AWT \nTutorial");  
        //t2.setBounds(50,150, 200,30);  
    
        rootRightPanel.add(t1);
        rootRightPanel.add(t2);
    
        rootRightPanel.setVisible(true);
        
        return rootRightPanel;
    }
    
    JPanel leftPanel(){
        
        JPanel rootLeftPanel = new JPanel();
        rootLeftPanel.setLayout(new GridLayout(20,0));                           // 8-rows; 0-col
        //rootLeftPanel.setSize(450, 150);
        rootLeftPanel.setBackground(Color.black);
        
        JButton btnSelectRoom = new JButton("Комната");
        btnSelectRoom.setBounds(0, 0, 95, 30);
        btnSelectRoom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnSelectWall = new JButton("Стена");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnSelectWall.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnAddWall = new JButton(" + Стена");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnAddWall.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnAddWindow = new JButton(" + Окно");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnAddWindow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnAddDoor = new JButton(" + Дверь");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnAddDoor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnDelArea = new JButton("Отнять");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnDelArea.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        
        JLabel jlTypeWallpaper = new JLabel("Тип обоев");
        
        DefaultComboBoxModel listTypeWallpaper = new DefaultComboBoxModel();
        listTypeWallpaper.addElement("Бумажные");
        listTypeWallpaper.addElement("Виниловые");
        listTypeWallpaper.addElement("Текстильные");
        listTypeWallpaper.addElement("Жидкие");
        final JComboBox jcbListTypeWallpaper = new JComboBox(listTypeWallpaper);    
        jcbListTypeWallpaper.setSelectedIndex(0);
        
        rootLeftPanel.add(btnSelectRoom);
        rootLeftPanel.add(btnSelectWall);
        rootLeftPanel.add(btnAddWall);
        rootLeftPanel.add(btnAddWindow);
        rootLeftPanel.add(btnAddDoor);
        rootLeftPanel.add(btnDelArea);
        rootLeftPanel.add(jlTypeWallpaper);
        rootLeftPanel.add(jcbListTypeWallpaper);
        
        rootLeftPanel.setVisible(true);
        
        return rootLeftPanel;
    }
    
    NeedRollSwing(){
        
        JFrame root = new JFrame("NeedRollSwing");
        root.setLayout(new BorderLayout());
        root.setSize(900,800);
        root.setBackground(Color.yellow);
        root.setResizable(true);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        
        root.add(topPanel() , BorderLayout.NORTH);
        root.add(bottomPanel() , BorderLayout.SOUTH);
        root.add(centerPanel() , BorderLayout.CENTER);
        root.add(leftPanel() , BorderLayout.WEST);
        root.add(rightPanel() , BorderLayout.EAST);
        
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
