package numbershift;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import java.util.*;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.*;


public class NumberShifting
{

	private JFrame frame;
	Window window1 = new Window(frame);
	JPanel panel = new JPanel();
	JButton button1 = new JButton(" ");
	JButton button2 = new JButton(" ");
	JButton button3 = new JButton(" ");
	JButton button4 = new JButton(" ");
	JButton button5 = new JButton(" ");
	JButton button6 = new JButton(" ");
	JButton button7 = new JButton(" ");
	JButton button8 = new JButton(" ");
	JButton button9 = new JButton(" ");
	JButton button10 = new JButton(" ");
	JButton button11 = new JButton(" ");
	JButton button12 = new JButton(" ");
	JButton button13 = new JButton(" ");
	JButton button14 = new JButton(" ");
	JButton button15 = new JButton(" ");
	JButton button16 = new JButton(" ");
	//JButton button21 = new JButton();
	
	JLabel label1 = new JLabel("");
	JPanel panel_1 = new JPanel();
	JButton button17 = new JButton("START");
	JButton button18 = new JButton("RESET");
	
	int arr[][] = new int[4][4];
	static int move = 500;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new JFXPanel();// this will prepare JavaFX toolkit and environment
					NumberShifting window = new NumberShifting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberShifting() {
		initialize();
		
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 585, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.RED);
		panel.setBounds(63, 53, 446, 322);
		frame.getContentPane().add(panel);
		panel.setLayout(null);	
		
		
		button1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button1.setBounds(24, 24, 89, 57);
		panel.add(button1);
		
		
		button2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button2.setBounds(123, 24, 89, 57);
		panel.add(button2);
		
		
		button3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button3.setBounds(222, 24, 89, 57);
		panel.add(button3);
		
		
		button4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button4.setBounds(321, 24, 89, 57);
		panel.add(button4);
		
			
		button5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button5.setBounds(24, 92, 89, 57);
		panel.add(button5);
		
		
		button6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button6.setBounds(123, 92, 89, 57);
		panel.add(button6);
		
		
		button7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button7.setBounds(222, 92, 89, 57);
		panel.add(button7);
		
		
		button8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button8.setBounds(321, 92, 89, 57);
		panel.add(button8);
		
		
		button9.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button9.setBounds(24, 160, 89, 57);
		panel.add(button9);
		
		
		
		button10.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button10.setBounds(123, 160, 89, 57);
		panel.add(button10);
		
		
		button11.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button11.setBounds(222, 160, 89, 57);
		panel.add(button11);
		
		
		button12.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button12.setBounds(321, 160, 89, 57);
		panel.add(button12);
		
		
		button13.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button13.setBounds(24, 228, 89, 57);
		panel.add(button13);
		
		
		button14.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button14.setBounds(123, 228, 89, 57);
		panel.add(button14);
		
		
		button15.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button15.setBounds(222, 228, 89, 57);
		panel.add(button15);
		
		
		button16.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button16.setBounds(321, 228, 89, 57);
		panel.add(button16);
		
			
		label1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
		label1.setBounds(63, 11, 446, 31);
		frame.getContentPane().add(label1);
		
		
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(63, 386, 446, 62);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				move = 500;
				label1.setText("Moves Remaining: "+move);
				setNumber();
				keycheck();				
							
			}
		});
		
		
		button17.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button17.setBounds(97, 11, 116, 36);
		panel_1.add(button17);
		
		
		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reset();
				
			}
		});
		button18.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		button18.setBounds(225, 11, 116, 36);
		panel_1.add(button18);
		
		
	}
	
	public void reset()
	{
		for (int i = 0; i < 16; i++) {
			
			JButton button[] = {button1, button2, button3,button4,button5,button6,
					button7, button8,button9,button10,button11,button12, button13,
					button14, button15, button16};
	    	button[i].setText(" "); 					
		}	
	}
	
	public void checkWin()
	{
		int k = 0;
		boolean win = true;
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if(k<15)
				{
					k++;
				}
				else {
					k = 0;
				}
				
				if (arr[i][j] != k) 
				{
					win =false;
					break;
				}
			}
			if(win == false)
			{
				break;
			}
		}
			
		if(win == true)
		{
			JOptionPane.showMessageDialog(null, "You Win...:)");
			setNumber();
			reset();
		}
	}
	
	public void setNumber()
	{
		
		
		
			int pool[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			
			int maxIndex = 14;
			Random random = new Random();
			int rand = random.nextInt(500)+1;
			int index;
			int k = 0;					
						
			
			
			checkWin();

			for (int i = 0; i < 4; i++) 
			{
				
				for (int j = 0; j < 4; j++) 
				{
					
					if (maxIndex>=0) {
						
						index = rand % (maxIndex+1);
						arr[i][j] = pool[index];
						pool[index] = pool[maxIndex];
						maxIndex--;
						
					}
					else
					{
						arr[i][j] = 0;
					}
				}					
			}
			
			for (int i = 0; i < 4; i++) 
			{
				for (int j = 0; j < 4; j++) 
				{						
					JButton button[] = {button1, button2, button3,button4,button5,button6,
							button7, button8,button9,button10,button11,button12, button13,
							button14, button15, button16};  
					
					if (arr[i][j] !=0) 
						{
							
					    	int n = arr[i][j];								
							button[k].setText(String.valueOf(n));
							k++;
						
					    }
					    else {
					    	button[k].setText(" ");
					    }
					
				}
			}
	
	}
	
	public void keycheck()
	{
		InputMap inputMap = panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = panel.getActionMap();
		
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, false), "RIGHT ARROW");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, false), "LEFT ARROW");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, false), "UP ARROW");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, false), "DOWN ARROW");
		
		actionMap.put("RIGHT ARROW", new ArrowAction("RIGHT ARROW"));
		actionMap.put("LEFT ARROW", new ArrowAction("LEFT ARROW"));
		actionMap.put("UP ARROW", new ArrowAction("UP ARROW"));
		actionMap.put("DOWN ARROW", new ArrowAction("DOWN ARROW"));
		
	}
	
	class ArrowAction extends AbstractAction
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String cmd;
		
		public ArrowAction(String cmd)
		{
			this.cmd = cmd;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (cmd.equalsIgnoreCase("RIGHT ARROW")) 
			{
				int temp;
				int s = 0;
				int u = 0;						
												
				boolean zeroFound = false;
												
				for (s = 0; s < 4; s++) 
				{
					for (u = 0; u < 4; u++) 
					{
						if (arr[s][u] == 0) 
						{
							zeroFound = true;
							break;
						}
					}
					if (zeroFound == true) 
					{
						break;
					}
				}
				
				if (u == 0) 
				{
					JOptionPane.showMessageDialog(null, "Please enter valid arrow key:)");
				}
				else
				{
					temp = arr[s][u];
					arr[s][u] = arr[s][u-1];
					arr[s][u-1] = temp;								
					
					for (int b = 0; b < 16; b++) 
					{						
						JButton button[] = {button1, button2, button3,button4,button5,button6,
								button7, button8,button9,button10,button11,button12, button13,
								button14, button15, button16};  
										
						if (button[b].getText() == " ") 
						{
												
							int n = arr[s][u];
							//String s1 = String.valueOf(arr[s][u-1]);
							button[b].setText(String.valueOf(n));
							button[b-1].setText(" ");
							RemainingMoves();
							play();
							break;
						}
					}						
					
				}
			}
			else if (cmd.equalsIgnoreCase("LEFT ARROW")) 
			{
				int temp;
				int s = 0;
				int u = 0;						
												
				boolean zeroFound = false;
												
				for (s = 0; s < 4; s++) 
				{
					for (u = 0; u < 4; u++) 
					{
						if (arr[s][u] == 0) 
						{
							zeroFound = true;
							break;
						}
					}
					if (zeroFound == true) 
					{
						break;
					}
				}
				
				if (u == 3) 
				{
					JOptionPane.showMessageDialog(null, "Please enter valid arrow key:)");
					
				}
				else
				{
					temp = arr[s][u];
					arr[s][u] = arr[s][u+1];
					arr[s][u+1] = temp;								
					
					for (int b = 0; b < 16; b++) 
					{						
						JButton []button= {button1, button2, button3,button4,button5,button6,
								button7, button8,button9,button10,button11,button12, button13,
								button14, button15, button16};  
										
						if (button[b].getText() == " ") 
						{
							
							int n = arr[s][u];
							button[b].setText(String.valueOf(n));
							button[b+1].setText(" ");
							RemainingMoves();
							play();
							break;
							
						}
					}						
					
				}
			}
			else if (cmd.equalsIgnoreCase("UP ARROW")) 
			{
				int temp;
				int s = 0;
				int u = 0;						
												
				boolean zeroFound = false;
												
				for (s = 0; s < 4; s++) 
				{
					for (u = 0; u < 4; u++) 
					{
						if (arr[s][u] == 0) 
						{
							zeroFound = true;
							break;
						}
					}
					if (zeroFound == true) 
					{
						break;
					}
				}
				
				if (s == 3) 
				{
					JOptionPane.showMessageDialog(null, "Please enter valid arrow key:)");
				}
				else
				{
					temp = arr[s][u];
					arr[s][u] = arr[s+1][u];
					arr[s+1][u] = temp;								
					
					for (int b = 0; b < 16; b++) 
					{						
						JButton []button= {button1, button2, button3,button4,button5,button6,
								button7, button8,button9,button10,button11,button12, button13,
								button14, button15, button16};  
										
						if (button[b].getText() == " ") 
						{
							
							int n = arr[s][u];
							button[b].setText(String.valueOf(n));
							button[b+4].setText(" ");
							RemainingMoves();
							play();
							break;
							
						}
					}						
					
				}
			}
			else if (cmd.equalsIgnoreCase("DOWN ARROW")) 
			{
				int temp;
				int s = 0;
				int u = 0;						
												
				boolean zeroFound = false;
												
				for (s = 0; s < 4; s++) 
				{
					for (u = 0; u < 4; u++) 
					{
						if (arr[s][u] == 0) 
						{
							zeroFound = true;
							break;
						}
					}
					if (zeroFound == true) 
					{
						break;
					}
				}
				
				if (s == 0) 
				{
					JOptionPane.showMessageDialog(null, "Please enter valid arrow key:)");
				}
				else
				{
					temp = arr[s][u];
					arr[s][u] = arr[s-1][u];
					arr[s-1][u] = temp;								
					
					for (int b = 0; b < 16; b++) 
					{						
						JButton []button= {button1, button2, button3,button4,button5,button6,
								button7, button8,button9,button10,button11,button12, button13,
								button14, button15, button16};  
										
						if (button[b].getText() == " ") 
						{
							
							int n = arr[s][u];
							button[b].setText(String.valueOf(n));
							button[b-4].setText(" ");
							RemainingMoves();
							play();
							break;
							
						}
					}						
					
				}
			}
	}
		
		
}		
	
	public void RemainingMoves()
	{
		move--;
		label1.setText("Moves Remaining: "+move);
				
		if (move == 0) {
		
			JOptionPane.showMessageDialog(null, "No Moves Left. You Lose:(");
			setNumber();
			reset();
		}
		
		checkWin();
	}
	
	public void play()
	{
		String audio = "MouseClick.mp3";
		Media hit = new Media(new File(audio).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}
}	

