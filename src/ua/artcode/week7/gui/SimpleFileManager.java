package ua.artcode.week7.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class SimpleFileManager extends JFrame {

    private JList<File> list = null;
    private DefaultListModel<File> listModel = null;
    private File root = new File("/");
    private JScrollPane jScrollPane = null;
    private JTextField textField = null;

    public SimpleFileManager() throws HeadlessException {

        super();
        setSize(new Dimension(600,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        listModel = new DefaultListModel<>();
        list = new JList<File>();
        list.setModel(listModel);
        jScrollPane = new JScrollPane(list);
        textField = new JTextField();
        textField.setEditable(false);

        list.addMouseListener(new MouseClickListener());
        list.addKeyListener(new MyKeyListener());

        getContentPane().add(jScrollPane, BorderLayout.CENTER);
        getContentPane().add(textField, BorderLayout.NORTH);
        initListModel(root);
    }

    private void initListModel(File selected){

        if(selected == null || selected.isFile()){
            JOptionPane.showMessageDialog(this, "Can't open the file\nWrite implementation",
                    "Dont know how to open", JOptionPane.ERROR_MESSAGE);
            return;
        }

        root = selected;
        listModel.clear();

        for(File file : root.listFiles()){
            listModel.addElement(file);
        }

        textField.setText(root.getAbsolutePath());
    }


    public static void main(String[] args) {
        new SimpleFileManager();
    }


    private class MouseClickListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            initListModel(list.getSelectedValue());
        }

    }

    private class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                initListModel(root.getParentFile());
            }

            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                initListModel(list.getSelectedValue());
            }
        }

    }




}
