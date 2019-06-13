import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class game 
{
    JFrame jf;
    JButton jb;
    JLabel jl,jl1,jl2,jl3,jl4;
    public JRadioButton jr,jr1,jr2,jr3;
    ButtonGroup bg,bg1;
    JTextField jtf,jtf1;
    game()
    {
	    jf=new JFrame("GAME");
		jf.setSize(400,400);
        jf.getContentPane().setBackground(Color.yellow);
        jf.setLayout(null);

        jl=new JLabel("TicTacToe");
        jl.setBounds(130,40,140,30);
        jl.setFont(new Font("calibri",Font.BOLD,30));
        jf.add(jl);

        jl1=new JLabel("Player1");
        jl1.setBounds(10,120,60,20);
        jl1.setFont(new Font("calibri",Font.ITALIC+Font.BOLD,18));
        jf.add(jl1);
        jtf=new JTextField();
		jtf.setBounds(70,120,100,20);
		jf.add(jtf);
		
		jl3=new JLabel("> What would your choice..");
        jl3.setBounds(10,160,180,20);
        jf.add(jl3);
        jr=new JRadioButton("x");
        jr.setBounds(10,180,40,25);
        jr.setBackground(Color.yellow);
        jr.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ae)
            {
                if(jr.isSelected())
                jr3.setSelected(true);
                else
                jr2.setSelected(true);
            }
        });
        jf.add(jr);
        jr1=new JRadioButton("0");
        jr1.setBounds(10,200,40,25);
        jr1.setBackground(Color.yellow);
		jr1.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ae)
            {
                if(jr1.isSelected())
                jr2.setSelected(true);
                else
                jr3.setSelected(true);
            }
        });
        jf.add(jr1);
        bg=new ButtonGroup();
        bg.add(jr);
        bg.add(jr1);

        jl2=new JLabel("Player2");
        jl2.setBounds(220,120,60,20);
        jl2.setFont(new Font("calibri",Font.ITALIC+Font.BOLD,18));
        jf.add(jl2);
        jtf1=new JTextField();
        jtf1.setBounds(280,120,100,20);
        jf.add(jtf1);

        jl4=new JLabel("> What would your choice..");
        jl4.setBounds(220,160,180,20);
        jf.add(jl4);
        jr2=new JRadioButton("x");
        jr2.setBounds(220,180,40,25);
        jr2.setBackground(Color.yellow);
		jr2.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ae)
            {
                if(jr2.isSelected())
                jr1.setSelected(true);
                else
                jr.setSelected(true);
            }
        });
        jf.add(jr2);
        jr3=new JRadioButton("0");
        jr3.setBounds(220,200,40,25);
        jr3.setBackground(Color.yellow);
		jr3.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ae)
            {
                if(jr3.isSelected())
                jr.setSelected(true);
                else
                jr1.setSelected(true);
            }
        });
        jf.add(jr3);
        bg1=new ButtonGroup();
        bg1.add(jr2);
        bg1.add(jr3);

        jb=new JButton("OK");
        jb.setBounds(150,280,80,30);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new frame2();
            }
        });
        jf.add(jb);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}
}
class tictactoe
{
    public static void main(String arg[])
	{
	    new game();
	}
}
class frame2
{
        JFrame jf;
        JButton jb;
        boolean test; 
        int i; 		
        frame2()
        {
                jf=new JFrame("Tic Tac Toe");
                jf.setSize(400,400);
                jf.setLayout(new GridLayout(3,3));

         
                JButton jb[]=new JButton[9];
                for(i=0;i<=8;i++)
                jb[i]=new JButton(); 
                for(i=0;i<=8;i++)
                jf.add(jb[i]);
            /*  for(int i=0;i<=8;i++)
                {
                    jb[i].addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent ae)
                        {
                            if(test==true)
                            jb[i].setText("X");
                            else
                            jb[i].setText("0");
                            test=! test;
                        }
                    });
                }  */                                  
                jb[0].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {	
					    if(jr.getSelected(true))
                            jb[0].setText("X");
         				else
				            jb[0].setText("O");
                        test=!test;
						jb[0].setFont(new Font("calibri",Font.BOLD,25));
						jb[0].setEnabled(false);
                    }
                });
                jb[1].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[1].setText("X");
                        else
                            jb[1].setText("O");
                        test=! test;
						jb[1].setFont(new Font("calibri",Font.BOLD,25));
                        jb[1].setEnabled(false);
                    }
                });
                jb[2].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[2].setText("X");
                        else
                            jb[2].setText("O");
                        test=! test;
						jb[2].setFont(new Font("calibri",Font.BOLD,25));
                        jb[2].setEnabled(false);
                    }
                });
                jb[3].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[3].setText("X");
                        else
                            jb[3].setText("O");
                        test=! test;
						jb[3].setFont(new Font("calibri",Font.BOLD,25));
                        jb[3].setEnabled(false);
                    }
                });
                jb[4].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[4].setText("X");
                        else
                             jb[4].setText("O");
                        test=! test;
						jb[4].setFont(new Font("calibri",Font.BOLD,25));
                        jb[4].setEnabled(false);
                    }
                });
                jb[5].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[5].setText("X");
                        else
                            jb[5].setText("O");
                        test=! test;
						jb[5].setFont(new Font("calibri",Font.BOLD,25));
                        jb[5].setEnabled(false);
                    }
                });
                jb[6].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[6].setText("X");
                        else
                            jb[6].setText("O");
                        test=! test;
						jb[6].setFont(new Font("calibri",Font.BOLD,25));
                        jb[6].setEnabled(false);
                    }
                });
                jb[7].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[7].setText("X");
                        else
                            jb[7].setText("O");
                        test=! test;
						jb[7].setFont(new Font("calibri",Font.BOLD,25));
                        jb[7].setEnabled(false);
                    }
                });
                jb[8].addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        if(test)
                            jb[8].setText("X");
                        else
                            jb[8].setText("O");
                        test=! test;
						jb[8].setFont(new Font("calibri",Font.BOLD,25));
                        jb[8].setEnabled(false);
                    }
                });
		        jf.setVisible(true);
        }
		/*void show()
		{
			frame2=new JButton[9];
			if(jb[0].getText()=="x")
			{
				if(jb[1].getText()=="x")
				{
					if(jb[2].getText()=="x")
					{
						jb[0].setBackground(Color.green);
						jb[1].setBackground(Color.green);
						jb[2].setBackground(Color.green);
					}	
				}	
			}	
		}*/
}