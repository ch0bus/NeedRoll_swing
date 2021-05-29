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
    
    
    public static JFrame root = new JFrame("NeedRollSwing");
       
    
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
        //rootCenterPanel.setSize(300, 200);
        rootCenterPanel.setBackground(Color.black);
        
        rootCenterPanel.setVisible(true);
                
        return rootCenterPanel;
    }
    JPanel centerPanel_Wallpaper(){
        JPanel rootCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel layoutWallpaperParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel layoutWallpaperParametr = new JPanel(new GridLayout(4,2,10,5));
        //rootCenterPanel.setSize(300, 200);
        //rootCenterPanel.setBackground(Color.gray);
        JButton btnWallpaperDiscard = new JButton("Сбросить");
        JButton btnAddWallpaper = new JButton("Добавить");
        JLabel jlWallpaperIntro = new JLabel("Параметры Обоев");
        JLabel jlWallpaperParametr = new JLabel("Введите размер выбраного рулона");
        JLabel jlWallpaperWidth = new JLabel("ширина");         
        JLabel jlWallpaperLength = new JLabel("длина");
        JLabel jlWallpaperRaport = new JLabel("рапорт");
        JLabel jlWallpaperWidthMeasure = new JLabel("м");         
        JLabel jlWallpaperLengthMeasure = new JLabel("м");
        JLabel jlWallpaperRaportMeasure = new JLabel("см");
        JTextField jtfWallpaperWidth = new JTextField(5);
        JTextField jtfWallpaperLength = new JTextField(5);
        JTextField jtfWallpaperRaport = new JTextField(5);
        layoutWallpaperParametrButton.add(btnWallpaperDiscard);
        layoutWallpaperParametrButton.add(btnAddWallpaper);
  
        layoutWallpaperParametr.add(jlWallpaperWidth);
        layoutWallpaperParametr.add(jtfWallpaperWidth);
        layoutWallpaperParametr.add(jlWallpaperWidthMeasure);
        layoutWallpaperParametr.add(jlWallpaperLength);
        layoutWallpaperParametr.add(jtfWallpaperLength);
        layoutWallpaperParametr.add(jlWallpaperLengthMeasure);
        layoutWallpaperParametr.add(jlWallpaperRaport);
        layoutWallpaperParametr.add(jtfWallpaperRaport);
        layoutWallpaperParametr.add(jlWallpaperRaportMeasure);
        
        rootCenterPanel.add(jlWallpaperIntro);
        rootCenterPanel.add(jlWallpaperParametr);
        rootCenterPanel.add(layoutWallpaperParametr);
        rootCenterPanel.add(layoutWallpaperParametrButton);
        
        return rootCenterPanel;
    }
    JPanel centerPanel_Room(){
        JPanel rootCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //rootCenterPanel.setBackground(Color.green);
        JPanel layoutRoomParametr = new JPanel(new GridLayout(4,2,10,5));
        JPanel layoutWindowParametr = new JPanel(new GridLayout(2,2,10,5));
        JPanel layoutDoorParametr = new JPanel(new GridLayout(2,2,10,5));
        JPanel layoutRoomParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel layoutWindowParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel layoutDoorParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton btnRoomDiscard = new JButton("Сбросить");
        JButton btnAddRoom = new JButton("Добавить");
        JLabel jlRoomIntro = new JLabel("Параметры Комнаты");
        JLabel jlRoomParametr = new JLabel("Введите размеры комнаты");
        JLabel jlRoomWidth = new JLabel("ширина");         
        JLabel jlRoomLength = new JLabel("длина");
        JLabel jlRoomHeight = new JLabel("высота");
        JLabel jlRoomWidthMeasure = new JLabel("м");         
        JLabel jlRoomLengthMeasure = new JLabel("м");
        JLabel jlRoomHeightMeasure = new JLabel("м");
        JTextField jtfRoomWidth = new JTextField(5);
        JTextField jtfRoomLength = new JTextField(5);
        JTextField jtfRoomHeight = new JTextField(5);
        layoutRoomParametrButton.add(btnRoomDiscard);
        layoutRoomParametrButton.add(btnAddRoom);
        
        JButton btnWindowDiscard = new JButton("Сбросить");
        JButton btnAddWindow = new JButton("Добавить");
        JLabel jlWindowParametr = new JLabel("Введите размеры окна");
        JLabel jlWindowWidth = new JLabel("ширина");         
        //JLabel jlWindowLength = new JLabel("длина");
        JLabel jlWindowHeight = new JLabel("высота");
        JLabel jlWindowWidthMeasure = new JLabel("м");         
        //JLabel jlWindowLengthMeasure = new JLabel("м");
        JLabel jlWindowHeightMeasure = new JLabel("м");
        JTextField jtfWindowWidth = new JTextField(5);
        //JTextField jtfWindowLength = new JTextField(5);
        JTextField jtfWindowHeight = new JTextField(5);
        layoutWindowParametrButton.add(btnWindowDiscard);
        layoutWindowParametrButton.add(btnAddWindow);
        
        JButton btnDoorDiscard = new JButton("Сбросить");
        JButton btnAddDoor = new JButton("Добавить");
        JLabel jlDoorParametr = new JLabel("Введите размеры двери");
        JLabel jlDoorWidth = new JLabel("ширина");         
        //JLabel jlDoorLength = new JLabel("длина");
        JLabel jlDoorHeight = new JLabel("высота");
        JLabel jlDoorWidthMeasure = new JLabel("м");         
        //JLabel jlDoorLengthMeasure = new JLabel("м");
        JLabel jlDoorHeightMeasure = new JLabel("м");
        JTextField jtfDoorWidth = new JTextField(5);
        //JTextField jtfDoorLength = new JTextField(5);
        JTextField jtfDoorHeight = new JTextField(5);
        layoutDoorParametrButton.add(btnDoorDiscard);
        layoutDoorParametrButton.add(btnAddDoor);
        
        layoutRoomParametr.add(jlRoomWidth);
        layoutRoomParametr.add(jtfRoomWidth);
        layoutRoomParametr.add(jlRoomWidthMeasure);
        layoutRoomParametr.add(jlRoomLength);
        layoutRoomParametr.add(jtfRoomLength);
        layoutRoomParametr.add(jlRoomLengthMeasure);
        layoutRoomParametr.add(jlRoomHeight);
        layoutRoomParametr.add(jtfRoomHeight);
        layoutRoomParametr.add(jlRoomHeightMeasure);
        
        layoutWindowParametr.add(jlWindowWidth);
        layoutWindowParametr.add(jtfWindowWidth);
        layoutWindowParametr.add(jlWindowWidthMeasure);
        //layoutWindowParametr.add(jlWindowLength);
        //layoutWindowParametr.add(jtfWindowLength);
        //layoutWindowParametr.add(jlWindowLengthMeasure);
        layoutWindowParametr.add(jlWindowHeight);
        layoutWindowParametr.add(jtfWindowHeight);
        layoutWindowParametr.add(jlWindowHeightMeasure);
        
        layoutDoorParametr.add(jlDoorWidth);
        layoutDoorParametr.add(jtfDoorWidth);
        layoutDoorParametr.add(jlDoorWidthMeasure);
        //layoutWindowParametr.add(jlWindowLength);
        //layoutWindowParametr.add(jtfWindowLength);
        //layoutWindowParametr.add(jlWindowLengthMeasure);
        layoutDoorParametr.add(jlDoorHeight);
        layoutDoorParametr.add(jtfDoorHeight);
        layoutDoorParametr.add(jlDoorHeightMeasure);
        
        rootCenterPanel.add(jlRoomIntro);
        rootCenterPanel.add(jlRoomParametr);
        rootCenterPanel.add(layoutRoomParametr);
        rootCenterPanel.add(layoutRoomParametrButton);
        rootCenterPanel.add(jlWindowParametr);
        rootCenterPanel.add(layoutWindowParametr);
        rootCenterPanel.add(layoutWindowParametrButton);
        rootCenterPanel.add(jlDoorParametr);
        rootCenterPanel.add(layoutDoorParametr);
        rootCenterPanel.add(layoutDoorParametrButton);
        //rootCenterPanel.add(btnRoomDiscard);
        //rootCenterPanel.add(btnAddRoom);
        
        return rootCenterPanel;
    }
    JPanel centerPanel_Wall(){
        JPanel rootCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //rootCenterPanel.setSize(300, 200);
        //rootCenterPanel.setBackground(Color.green);
        JPanel layoutRoomParametr = new JPanel(new GridLayout(4,2,10,5));
        JPanel layoutRoomParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton btnRoomDiscard = new JButton("Сбросить");
        JButton btnAddRoom = new JButton("Добавить");
        JLabel jlRoomIntro = new JLabel("Параметры Стены");
        JLabel jlRoomParametr = new JLabel("Введите размер оклеиваемой стены");
        JLabel jlRoomWidth = new JLabel("ширина");         
        JLabel jlRoomLength = new JLabel("длина");
        JLabel jlRoomHeight = new JLabel("высота");
        JLabel jlRoomWidthMeasure = new JLabel("м");         
        JLabel jlRoomLengthMeasure = new JLabel("м");
        JLabel jlRoomHeightMeasure = new JLabel("м");
        JTextField jtfRoomWidth = new JTextField(5);
        JTextField jtfRoomLength = new JTextField(5);
        JTextField jtfRoomHeight = new JTextField(5);
        layoutRoomParametrButton.add(btnRoomDiscard);
        layoutRoomParametrButton.add(btnAddRoom);
        
        layoutRoomParametr.add(jlRoomWidth);
        layoutRoomParametr.add(jtfRoomWidth);
        layoutRoomParametr.add(jlRoomWidthMeasure);
        layoutRoomParametr.add(jlRoomLength);
        layoutRoomParametr.add(jtfRoomLength);
        layoutRoomParametr.add(jlRoomLengthMeasure);
        layoutRoomParametr.add(jlRoomHeight);
        layoutRoomParametr.add(jtfRoomHeight);
        layoutRoomParametr.add(jlRoomHeightMeasure);
        
        rootCenterPanel.add(jlRoomIntro);
        rootCenterPanel.add(jlRoomParametr);
        rootCenterPanel.add(layoutRoomParametr);
        rootCenterPanel.add(layoutRoomParametrButton);
                
        return rootCenterPanel;
    }
    
    JPanel centerPanel_Wall_del(){
        JPanel rootCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //rootCenterPanel.setSize(300, 200);
        //rootCenterPanel.setBackground(Color.green);
        JPanel layoutRoomParametr = new JPanel(new GridLayout(4,3,10,5));
        JPanel layoutRoomParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton btnRoomDiscard = new JButton("Сбросить");
        JButton btnAddRoom = new JButton("Удалить");
        JLabel jlRoomIntro = new JLabel("Параметры Стены");
        JLabel jlRoomParametr = new JLabel("Введите размер неоклеиваемой стены");
        JLabel jlRoomWidth = new JLabel("ширина");         
        JLabel jlRoomLength = new JLabel("длина");
        JLabel jlRoomHeight = new JLabel("высота");
        JLabel jlRoomWidthMeasure = new JLabel("м");         
        JLabel jlRoomLengthMeasure = new JLabel("м");
        JLabel jlRoomHeightMeasure = new JLabel("м");
        JTextField jtfRoomWidth = new JTextField(5);
        JTextField jtfRoomLength = new JTextField(5);
        JTextField jtfRoomHeight = new JTextField(5);
        layoutRoomParametrButton.add(btnRoomDiscard);
        layoutRoomParametrButton.add(btnAddRoom);
        
        layoutRoomParametr.add(jlRoomWidth);
        layoutRoomParametr.add(jtfRoomWidth);
        layoutRoomParametr.add(jlRoomWidthMeasure);
        layoutRoomParametr.add(jlRoomLength);
        layoutRoomParametr.add(jtfRoomLength);
        layoutRoomParametr.add(jlRoomLengthMeasure);
        layoutRoomParametr.add(jlRoomHeight);
        layoutRoomParametr.add(jtfRoomHeight);
        layoutRoomParametr.add(jlRoomHeightMeasure);
        
        rootCenterPanel.add(jlRoomIntro);
        rootCenterPanel.add(jlRoomParametr);
        rootCenterPanel.add(layoutRoomParametr);
        rootCenterPanel.add(layoutRoomParametrButton);
                
        return rootCenterPanel;
    }
    
    JPanel centerPanel_Window(){
        JPanel rootCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //rootCenterPanel.setSize(300, 200);
        //rootCenterPanel.setBackground(Color.green);
        JPanel layoutRoomParametr = new JPanel(new GridLayout(2,3,10,5));
        JPanel layoutRoomParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton btnRoomDiscard = new JButton("Сбросить");
        JButton btnAddRoom = new JButton("Удалить");
        JLabel jlRoomIntro = new JLabel("Параметры Окна");
        JLabel jlRoomParametr = new JLabel("Введите размер оконного проёма");
        JLabel jlRoomWidth = new JLabel("ширина");         
        //JLabel jlRoomLength = new JLabel("длина");
        JLabel jlRoomHeight = new JLabel("высота");
        JLabel jlRoomWidthMeasure = new JLabel("м");         
        JLabel jlRoomLengthMeasure = new JLabel("м");
        JLabel jlRoomHeightMeasure = new JLabel("м");
        JTextField jtfRoomWidth = new JTextField(5);
        //JTextField jtfRoomLength = new JTextField(5);
        JTextField jtfRoomHeight = new JTextField(5);
        layoutRoomParametrButton.add(btnRoomDiscard);
        layoutRoomParametrButton.add(btnAddRoom);
        
        layoutRoomParametr.add(jlRoomWidth);
        layoutRoomParametr.add(jtfRoomWidth);
        layoutRoomParametr.add(jlRoomWidthMeasure);
        //layoutRoomParametr.add(jlRoomLength);
        //layoutRoomParametr.add(jtfRoomLength);
        //layoutRoomParametr.add(jlRoomLengthMeasure);
        layoutRoomParametr.add(jlRoomHeight);
        layoutRoomParametr.add(jtfRoomHeight);
        layoutRoomParametr.add(jlRoomHeightMeasure);
        
        rootCenterPanel.add(jlRoomIntro);
        rootCenterPanel.add(jlRoomParametr);
        rootCenterPanel.add(layoutRoomParametr);
        rootCenterPanel.add(layoutRoomParametrButton);
                
        return rootCenterPanel;
    }
    
    JPanel centerPanel_Door(){
        JPanel rootCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //rootCenterPanel.setSize(300, 200);
        //rootCenterPanel.setBackground(Color.green);
        JPanel layoutRoomParametr = new JPanel(new GridLayout(2,3,10,5));
        JPanel layoutRoomParametrButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JButton btnRoomDiscard = new JButton("Сбросить");
        JButton btnAddRoom = new JButton("Удалить");
        JLabel jlRoomIntro = new JLabel("Параметры Двери");
        JLabel jlRoomParametr = new JLabel("Введите размер дверного проёма");
        JLabel jlRoomWidth = new JLabel("ширина");         
        //JLabel jlRoomLength = new JLabel("длина");
        JLabel jlRoomHeight = new JLabel("высота");
        JLabel jlRoomWidthMeasure = new JLabel("м");         
        JLabel jlRoomLengthMeasure = new JLabel("м");
        JLabel jlRoomHeightMeasure = new JLabel("м");
        JTextField jtfRoomWidth = new JTextField(5);
        //JTextField jtfRoomLength = new JTextField(5);
        JTextField jtfRoomHeight = new JTextField(5);
        layoutRoomParametrButton.add(btnRoomDiscard);
        layoutRoomParametrButton.add(btnAddRoom);
        
        layoutRoomParametr.add(jlRoomWidth);
        layoutRoomParametr.add(jtfRoomWidth);
        layoutRoomParametr.add(jlRoomWidthMeasure);
        //layoutRoomParametr.add(jlRoomLength);
        //layoutRoomParametr.add(jtfRoomLength);
        //layoutRoomParametr.add(jlRoomLengthMeasure);
        layoutRoomParametr.add(jlRoomHeight);
        layoutRoomParametr.add(jtfRoomHeight);
        layoutRoomParametr.add(jlRoomHeightMeasure);
        
        rootCenterPanel.add(jlRoomIntro);
        rootCenterPanel.add(jlRoomParametr);
        rootCenterPanel.add(layoutRoomParametr);
        rootCenterPanel.add(layoutRoomParametrButton);
                
        return rootCenterPanel;
    }
    
    JPanel bottomPanel(){
        JPanel rootBottomPanel = new JPanel(new GridLayout(2,3));
        JPanel rootBottomPanel_below = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel rootBottomPanel_above = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rootBottomPanel.setBackground(Color.blue);
        //rootBottomPanel.setSize(450, 150);
        
        JButton btnCalculate = new JButton("Расчитать");
        btnCalculate.setPreferredSize(new Dimension(300,40));
        btnCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnSave = new JButton("Сохранить");
        btnSave.setPreferredSize(new Dimension(150,30));
        btnSave.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });
        JButton btnDiscard = new JButton("Сбросить");
        btnDiscard.setPreferredSize(new Dimension(150,30));
        btnDiscard.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });        
        JButton btnExit = new JButton("Выход");
        btnExit.setPreferredSize(new Dimension(150,30));
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int response = JOptionPane.showConfirmDialog(
                        root, "Вы действительно хотите выйти?", "Выход", JOptionPane.YES_NO_OPTION);
                if(response==JOptionPane.YES_OPTION)
                    //root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    System.exit(0);
            }
        });
        
        rootBottomPanel_above.add(btnCalculate);
        rootBottomPanel_below.add(btnSave);
        rootBottomPanel_below.add(btnDiscard);
        rootBottomPanel_below.add(btnExit);
        
        rootBottomPanel.add(rootBottomPanel_above);
        rootBottomPanel.add(rootBottomPanel_below);
        
        return rootBottomPanel;
    }
    
    JPanel rightPanel(){
        JPanel rootRightPanel = new JPanel();
        rootRightPanel.setLayout(new GridLayout(4,0));
        rootRightPanel.setBackground(Color.gray);
        
        JTextArea jtaIntro, jtaRoom, jtaWall, jtaWindow, jtaDoor, jtaAdd, jtaDel, jtaWallpaper;
        
        jtaIntro = new JTextArea("Расчетные параметры",1,20);  
        //t1.setBounds(50,100, 200,30);  
        //t2=new JTextArea("AWT \nTutorial");  
        //t2.setBounds(50,150, 200,30);  
    
        rootRightPanel.add(jtaIntro);
        //rootRightPanel.add(t2);
    
        //rootRightPanel.setSize(200, 0);
        rootRightPanel.setVisible(true);
        
        return rootRightPanel;
    }
    
    JPanel leftPanel(){
        
        JPanel rootLeftPanel = new JPanel();
        rootLeftPanel.setLayout(new GridLayout(11,1, 10,10));                           // 8-rows; 0-col
        //rootLeftPanel.setSize(450, 660);
        rootLeftPanel.setBackground(Color.gray);
        
        JButton btnSelectWallpaper = new JButton("Обои");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnSelectWallpaper.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Wallpaper() , BorderLayout.CENTER);
                root.setVisible(true);
            }
        });
        
        JButton btnSelectRoom = new JButton("Комната");
        btnSelectRoom.setPreferredSize(new Dimension(150,30));
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnSelectRoom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Room() , BorderLayout.CENTER);
                root.setVisible(true);
            }
        });
        JButton btnSelectWall = new JButton("Стена");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnSelectWall.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Wall() , BorderLayout.CENTER);
                root.setVisible(true);         
            }
        });
        JButton btnAddWall = new JButton(" + Стена");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnAddWall.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Wall() , BorderLayout.CENTER);
                root.setVisible(true);         
            }
        });
        JButton btnDelArea = new JButton(" - Стена");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnDelArea.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Wall_del() , BorderLayout.CENTER);
                root.setVisible(true);         
            }
        });
        JButton btnAddWindow = new JButton(" - Окно");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnAddWindow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Window() , BorderLayout.CENTER);
                root.setVisible(true);         
            }
        });
        JButton btnAddDoor = new JButton(" - Дверь");
        //btnSelectRoom.setBounds(0, 0, 95, 30);
        btnAddDoor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                root.setLayout(new BorderLayout());
                
                root.add(topPanel() , BorderLayout.NORTH);
                root.add(bottomPanel() , BorderLayout.SOUTH);           
                root.add(leftPanel() , BorderLayout.WEST);
                root.add(rightPanel() , BorderLayout.EAST);
                root.add(centerPanel_Door() , BorderLayout.CENTER);
                root.setVisible(true);         
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
        
        rootLeftPanel.add(btnSelectWallpaper);
        rootLeftPanel.add(btnSelectRoom);
        rootLeftPanel.add(btnSelectWall);
        rootLeftPanel.add(btnAddWall);
        rootLeftPanel.add(btnDelArea);
        rootLeftPanel.add(btnAddWindow);
        rootLeftPanel.add(btnAddDoor);        
        //rootLeftPanel.add(jlTypeWallpaper);
        //rootLeftPanel.add(jcbListTypeWallpaper);
        
        rootLeftPanel.setVisible(true);
        
        return rootLeftPanel;
    }
    
    NeedRollSwing(){
        
        //root.setLayout(new BorderLayout());
        root.setSize(720,700);
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
