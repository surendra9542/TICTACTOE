package com.negi;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class  Tictactoe extends JFrame implements ActionListener {

	static char turn='X';
	int z=0;
	Button b[]=new Button[9];
	static char b1='a',b2='b',b3='c',b4='d',b5='e',b6='f',b7='g',b8='h',b9='i';
    //static char chance='y';
    int i;
    static int x=0;
    static char winner='n';
	public Tictactoe()
	{
		for(int j=0;j<9;j++)
        { b[j]=new Button("");
		add(b[j]);
        }
		
		for( i=0;i<9;i++)
			b[i].addActionListener(this);
		
	}
	public  void comp()
	{ 
		x++;
		char chance='y';
		 if(b[0].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[0].setLabel("X");
		   b[0].setEnabled(false);
		  turn='0';
		  b1='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[0].setLabel("0");
			  b[0].setEnabled(false);
		      turn='X';
		      b1='0';
		     chance='n';
		  }   //close else
		  //winner='y';
		  }  //close if enableed
		
		 if(b[1].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[1].setLabel("X");
		   b[1].setEnabled(false);
		  turn='0';
		  b2='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[1].setLabel("0");
			  b[1].setEnabled(false);
		      turn='X';
		      b2='0';
		      chance='n';
		  }   //close else
		  //winner='y';
		  } // close if  enabled
		  
		 
		 if(b[2].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[2].setLabel("X");
		   b[2].setEnabled(false);
		  turn='0';
		  b3='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[2].setLabel("0");
			  b[2].setEnabled(false);
		      turn='X';
		      b3='0';
		     chance='n';
		  }   //close else
		  winner='y';
		  } // close if  enabled
		  
	  
		 if(b[3].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[3].setLabel("X");
		   b[3].setEnabled(false);
		  turn='0';
		  b4='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[3].setLabel("0");
		      turn='X';
		      b4='0';
		      chance='n';
		  }   //close else
		  //winner='y';
		  }//close  is enable
		  
		  if(b[4].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[4].setLabel("X");
		   b[4].setEnabled(false);
		  turn='0';
		  b5='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[4].setLabel("0");
			  b[4].setEnabled(false);
		      turn='X';
		      b5='0';
		      chance='n';
		  }   //close else
		//  winner='y';
		  } //close is enable
		  
		  
		  
		  if(b[5].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[5].setLabel("X");
		   b[5].setEnabled(false);
		  turn='0';
		  b6='X';
		 chance='n';
		  }  //close if
		  else
		  {
			  b[5].setLabel("0");
			  b[5].setEnabled(false);
		      turn='X';
		      b6='0';
		      chance='n';
		  }   //close else
		  //winner='y';
		  } //close is enable
		  
		  if(b[6].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[6].setLabel("X");
		   b[6].setEnabled(false);
		  turn='0';
		  b7='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[6].setLabel("0");
			  b[6].setEnabled(false);
		      turn='X';
		      b7='0';
		      chance='n';
		  }   //close else
		  //winner='y';
		  } //close is enable
		  
		  if(b[7].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[7].setLabel("X");
		   b[7].setEnabled(false);
		  turn='0';
		  b8='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[7].setLabel("0");
			  b[7].setEnabled(false);
		      turn='X';
		      b8='0';
		      chance='n';
		  }   //close else
		  //winner='y';
		  } //close is enable
		  
		  if(b[8].isEnabled()&&chance=='y')
		  {
		  if(turn=='X')
		  {
		   b[8].setLabel("X");
		   b[8].setEnabled(false);
		  turn='0';
		  b9='X';
		  chance='n';
		  }  //close if
		  else
		  {
			  b[8].setLabel("0");
			  b[8].setEnabled(false);
		      turn='X';
		      b9='0';
		      chance='n';
		  }   //close else
		//  winner='y';
		  } //close is enable
		  
		  
		  }  //close method comp
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource()==b[0])
		{
			
			if(turn=='X')
				{
					b[0].setLabel("X");
					turn='0';
					b[0].setEnabled(false);
					b1='X';
					}
			else
				{
				b[0].setLabel("0");
				turn='X';
				b[0].setEnabled(false);
				b1='0';
				}
			comp();
			result();
			//Draw();
		
		}
		
		
		if(event.getSource()==b[1])
		{
			if(turn=='X')
				{
					b[1].setLabel("X");
					turn='0';
					b[1].setEnabled(false);
					b2='X';
				}
			else
				{
				b[1].setLabel("0");
				turn='X';
				b[1].setEnabled(false);
				b2='0';
				}
			comp();
			result();
			//Draw();
		}
		
		
		if(event.getSource()==b[2])
		{
			if(turn=='X')
				{
					b[2].setLabel("X");
					turn='0';
					b[2].setEnabled(false);
					b3='X';
				}
			else
				{
				b[2].setLabel("0");
				turn='X';
				b[2].setEnabled(false);
				b3='0';
				}
			comp();
			result();
			//Draw();
		}
		if(event.getSource()==b[3])
		{
			if(turn=='X')
				{
					b[3].setLabel("X");
					turn='0';
					b[3].setEnabled(false);
					b4='X';
				}
			else
				{
				b[3].setLabel("0");
				turn='X';
				b[3].setEnabled(false);
				b4='0';
				}
			comp();
			result();
			//Draw();
		}
		
		if(event.getSource()==b[4])
		{
		if(turn=='X')
			{
				b[4].setLabel("X");
				turn='0';
				b[4].setEnabled(false);
				b5='X';
			}
		else
			{
			b[4].setLabel("0");
			turn='X';
			b[4].setEnabled(false);
			b5='0';
			}
		comp();
		result();
		//Draw();
	
}
		if(event.getSource()==b[5])
		{
		if(turn=='X')
			{
				b[5].setLabel("X");
				turn='0';
				b[5].setEnabled(false);
				b6='X';
			}
		else
			{
			b[5].setLabel("0");
			turn='X';
			b[5].setEnabled(false);
			b6='0';
			}
		comp();
		result();
		//Draw();
		}

	if(event.getSource()==b[6])
	{
		if(turn=='X')
			{
				b[6].setLabel("X");
				turn='0';
				b[6].setEnabled(false);
				b7='X';
			}
		else
			{
			b[6].setLabel("0");
			turn='X';
			b[6].setEnabled(false);
			b7='0';
			}
		comp();
		result();
	//	Draw();
	}

	
	
	if(event.getSource()==b[7])
	{
		if(turn=='X')
			{
				b[7].setLabel("X");
				turn='0';
				b[7].setEnabled(false);
				b8='X';
			}
		else
			{
			b[7].setLabel("0");
			turn='X';
			b[7].setEnabled(false);
			b8='0';
			}
		comp();
		result();
		//Draw();
	}

	
	if(event.getSource()==b[8])
	{
		if(turn=='X')
			{
				b[8].setLabel("X");
				turn='0';
				b[8].setEnabled(false);
				b9='X';
			}
		else
			{
			b[8].setLabel("0");
			turn='X';
			b[8].setEnabled(false);
			b9='0';
			}
		comp();
		result();
		//Draw();
	}
}	
		public static void result()
	{
		x++;
		if(b1==b2 && b1==b3)
		{
			if(b1=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
		
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
				
			winner='w';
		}
		if(b1==b4 && b1==b7)
		{
			if(b1=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
			winner='y';		
		}
		if(b2==b5 && b2==b8)
		{
			if(b2=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
			winner='y';			
		}
		if(b3==b6 && b3==b9)
		{
			if(b3=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
			winner='y';		
		}
		if(b1==b5 && b1==b9)
		{
			if(b1=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
			winner='y';	
		}
		if(b3==b5 && b3==b7)
		{
			if(b3=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
			winner='y';
						
		}
		if(b4==b5 && b4==b6)
		{
			if(b4=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins","Winner",1);
			winner='y';
						
		}
		if(b7==b8 && b7==b9)
		{
			if(b7=='X')
				JOptionPane.showMessageDialog(null, "X wins","Winner",1);
			else
				JOptionPane.showMessageDialog(null, "0 wins", "Winner", 1);
						winner='y';
		}
		if(x==18 && winner=='n')
		{
			JOptionPane.showMessageDialog(null, "MAtch tie","Winner",1);
		}
			
		
		
	}
	
	
	public static void main(String[] args) {
		Tictactoe t=new Tictactoe();
		t.setSize(500,500);
		t.setLayout(new GridLayout(3, 3));
		t.setVisible(true);
		
	}

}
