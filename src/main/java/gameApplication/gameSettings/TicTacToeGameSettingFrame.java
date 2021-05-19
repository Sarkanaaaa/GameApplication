package gameApplication.gameSettings;
import gameApplication.frames.TictactoeGameFrame;
import score.PacmanScore;
import score.ScoresManager;
import score.TictactoeScore;
import tictactoeGame.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGameSettingFrame extends JFrame implements ActionListener {

    JFrame gameSettingFrame;
    JButton newGameButton;
    JButton scoresButton;
    JButton backButton;
    JButton exitButton;

    public TicTacToeGameSettingFrame(){

        newGameButton = new JButton();
        newGameButton.setBounds(100, 30, 250, 50);
        newGameButton.addActionListener(this);
        newGameButton.setText("NEW GAME");
        newGameButton.setFocusable(false);
        newGameButton.setFont(new Font("Calibre", Font.BOLD,20));
        newGameButton.setBackground(new Color(225, 220, 96));
        newGameButton.setBorder(BorderFactory.createBevelBorder(0));

        scoresButton = new JButton();
        scoresButton.setBounds(100, 110, 250, 50);
        scoresButton.addActionListener(this);
        scoresButton.setText("VIEW SCORE");
        scoresButton.setFocusable(false);
        scoresButton.setFont(new Font("Calibre", Font.BOLD,20));
        scoresButton.setBackground(new Color(225, 220, 96));
        scoresButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 190, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibre", Font.BOLD,20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 270, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        gameSettingFrame = new JFrame();
        gameSettingFrame.setTitle("Settings!");
        ImageIcon chooseGameImage = new ImageIcon("settingImage.png");
        gameSettingFrame.setIconImage(chooseGameImage.getImage());
        gameSettingFrame.setResizable(false);
        gameSettingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameSettingFrame.getContentPane().setBackground(new Color(151, 186, 213));
        gameSettingFrame.setLayout(null);
        gameSettingFrame.setSize(450, 550);
        gameSettingFrame.setVisible(true);
        gameSettingFrame.add(newGameButton);
        gameSettingFrame.add(scoresButton);
        gameSettingFrame.add(backButton);
        gameSettingFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newGameButton){
            gameSettingFrame.dispose();
            TicTacToe ticTacToe = new TicTacToe();
        }else if(e.getSource() == scoresButton) {
            gameSettingFrame.dispose();
            ScoresManager iNeedMyScoreManager = new ScoresManager();
            iNeedMyScoreManager.getAllScores("Tictactoe game").forEach(PacmanScore::showScore);
            TicTacToeGameSettingFrame ticTacToeGameSettingFrame = new TicTacToeGameSettingFrame();
        }else if (e.getSource() == backButton){
            gameSettingFrame.dispose();
            TictactoeGameFrame tictactoeGameFrame = new TictactoeGameFrame();
        }else {
            System.exit(0);
        }
    }
}
