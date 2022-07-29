package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {

        JFrame research = new JFrame();

        JPanel polka = new JPanel();
        polka.setBackground(Color.RED);
        research.add(polka);




















        JLabel logo = new JLabel("DRAGON");
        logo.setForeground(Color.DARK_GRAY);
        polka.add(logo);

        JTextField textField = new JTextField(100);
        polka.add(textField);

        JButton button = new JButton("SCRUTINY CORRECTLY");
        button.setBackground(Color.green);
        polka.add(button);

        button.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.bing.com/search?q=" + textField.getText().trim().replace(" ", "+")));
            } catch (IOException | URISyntaxException ioException) {
                ioException.printStackTrace();
            }
        });

        research.setSize(2000, 800);
        research.setVisible(true);
    }
}
