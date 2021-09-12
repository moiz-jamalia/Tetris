package tetris;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.awt.event.ActionEvent;

public class StartMenu extends JFrame {

	private JPanel contentPane;
	public static ScoreBoard scoreBoard;
	public static GUI gui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartMenu frame = new StartMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartMenu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(158, 50, 130, 23);
		contentPane.add(btnStart);
		
		JButton btnScoreBoard = new JButton("Scoreboard");
		btnScoreBoard.setBounds(158, 108, 130, 23);
		contentPane.add(btnScoreBoard);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(158, 165, 130, 23);
		contentPane.add(btnQuit);
		
		
		//ActionListener
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				gui = new GUI();
				gui.setVisible(true);
			}
		});
		
		btnScoreBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				scoreBoard = new ScoreBoard();
				scoreBoard.setVisible(true);
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
