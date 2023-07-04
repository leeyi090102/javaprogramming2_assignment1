package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class GameInterface extends JFrame {
    public GameInterface() {
        setTitle("Galaxy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);
        setLayout(null);

        // Background Image
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\leeyi\\IdeaProjects\\javaprogramming2_assignment1\\src\\main\\resources\\Forest.jpeg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 800, 600);
        add(backgroundLabel);

        // Game Name
        JLabel gameNameLabel = new JLabel("Galaxy");
        gameNameLabel.setForeground(Color.WHITE);
        gameNameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gameNameLabel.setBounds(20, 20, 200, 30);
        backgroundLabel.add(gameNameLabel);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(350, 20, 135, 30);

        JMenu menuOption = new JMenu("Menu");
        JMenu docsOption = new JMenu("Docs");
        JMenu whitepaperOption = new JMenu("Profile");

        menuBar.add(menuOption);
        menuBar.add(docsOption);
        menuBar.add(whitepaperOption);

        backgroundLabel.add(menuBar);

        // Social Media Icons
        ImageIcon socialIcon1 = new ImageIcon("C:\\Users\\leeyi\\IdeaProjects\\javaprogramming2_assignment1\\src\\main\\resources\\social_1.jpeg");
        ImageIcon socialIcon2 = new ImageIcon("C:\\Users\\leeyi\\IdeaProjects\\javaprogramming2_assignment1\\src\\main\\resources\\social_2.jpeg");
        ImageIcon socialIcon3 = new ImageIcon("C:\\Users\\leeyi\\IdeaProjects\\javaprogramming2_assignment1\\src\\main\\resources\\social_3.png");

        int iconSize = 30; // Adjust the size of the icons as per your requirements

        JLabel socialIconLabel1 = new JLabel(resizeIcon(socialIcon1, iconSize, iconSize));
        JLabel socialIconLabel2 = new JLabel(resizeIcon(socialIcon2, iconSize, iconSize));
        JLabel socialIconLabel3 = new JLabel(resizeIcon(socialIcon3, iconSize, iconSize));

        socialIconLabel1.setBounds(680, 20, iconSize, iconSize);
        socialIconLabel2.setBounds(715, 20, iconSize, iconSize);
        socialIconLabel3.setBounds(750, 20, iconSize, iconSize);

        backgroundLabel.add(socialIconLabel1);
        backgroundLabel.add(socialIconLabel2);
        backgroundLabel.add(socialIconLabel3);

        // Message
        JLabel messageLabel = new JLabel("Welcome to the Game!");
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 30));
        messageLabel.setBounds(250, 250, 400, 50);
        backgroundLabel.add(messageLabel);

        // Play Button
        JButton playButton = new JButton("Play");
        playButton.setBounds(350, 350, 100, 40);
        backgroundLabel.add(playButton);

        setVisible(true);
    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameInterface::new);
    }
}
