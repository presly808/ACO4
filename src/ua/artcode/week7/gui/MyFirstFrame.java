package ua.artcode.week7.gui;

import ua.artcode.io.FileHelperImpl;
import ua.artcode.io.IFileHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class MyFirstFrame extends JFrame {

    private IFileHelper fileHelper = new FileHelperImpl();
    private JTextArea textArea;
    private JTextField pathField;

    public MyFirstFrame(){
        setTitle("FirstFrame");
        setSize(600, 600);
        init();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // init all components
    public void init(){

        JPanel southPanel = new JPanel(new GridLayout(1,2));

        JButton saveButton = new JButton("Load");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String res = fileHelper.getFileContent(pathField.getText());
                    textArea.setText(res);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(getContentPane(), e1.getMessage());
                }
            }
        });

        JButton loadButton = new JButton("Save");
        loadButton.addActionListener(new SaveButtonListener());


        southPanel.add(saveButton);
        southPanel.add(loadButton);
        getContentPane().add(southPanel, BorderLayout.SOUTH);


        textArea = new JTextArea();
        getContentPane().add(textArea,BorderLayout.CENTER);

        pathField = new JTextField("/");
        getContentPane().add(pathField, BorderLayout.NORTH);

    }

    private class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                fileHelper.saveToFile(pathField.getText(), textArea.getText());
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(getContentPane(), e1.getMessage());
            }
        }
    }

}
