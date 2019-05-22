/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooproject2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author dell
 */
public class Info extends JFrame {

    private JFrame frame;
    private JButton engBtn;
    private JButton turkceBtn;
    private JScrollPane jScrollPane;
    private JTextArea text_area;
    JToolBar shapeBar,scrollBar;
    ButtonActs buttonActs;

   

    public Info() {
        initComponents();
        text_area.setText(read_file("about/README.TXT"));
        text_area.setCaretPosition(0);
    }

    private void initComponents() {
        buttonActs = new ButtonActs();

        frame = new JFrame(" ABOUT ");
        shapeBar = new JToolBar(null, JToolBar.HORIZONTAL);
        scrollBar = new JToolBar(null, JToolBar.VERTICAL);
        
        shapeBar.setFloatable(false);
        scrollBar.setFloatable(false);
        
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        engBtn = new JButton("    ENGLISH     ");
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        turkceBtn = new JButton("    TURKCE      ");

        engBtn.addActionListener(buttonActs);
        turkceBtn.addActionListener(buttonActs);
        
        jScrollPane = new JScrollPane(text_area);
        text_area = new JTextArea();

        scrollBar.add(jScrollPane);
        
        frame.add(shapeBar, BorderLayout.NORTH);
        frame.add(scrollBar,BorderLayout.WEST);
        
        shapeBar.add(engBtn);
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        shapeBar.add(turkceBtn);
        frame.add(jScrollPane, BorderLayout.CENTER);
       
        text_area.setColumns(20);
        text_area.setEditable(false);
        text_area.setLineWrap(true);
        text_area.setRows(5);
        text_area.setWrapStyleWord(true);
        jScrollPane.setViewportView(text_area);
       

        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(350, 400);
        frame.setResizable(false);
        frame.show();
        pack();

    }

    private class ButtonActs extends JPanel
            implements MouseListener, MouseMotionListener, ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == engBtn) {
                text_area.setText(read_file("about/README.TXT"));
                text_area.setCaretPosition(0);
            }
            if (ae.getSource() == turkceBtn) {
                text_area.setText(read_file("about/OKU.TXT"));
                text_area.setCaretPosition(0);
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseDragged(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private String read_file(String file_address) {
        String str;
        StringBuffer file_content = new StringBuffer();
        try {
            BufferedReader in
                    = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(file_address), "ISO-8859-9"));
            while ((str = in.readLine()) != null) {
                file_content.append(" " + str + " \n");
            }
            in.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        str = file_content.toString();
        file_content = null;
        return str;
    }

}
