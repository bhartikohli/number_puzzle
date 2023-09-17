import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class game implements ActionListener {
	Frame f;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b;
	
	game()
	{
	f=new Frame("MINI GAME");
	f.setSize(400,500);	
	f.setVisible(true);
	f.setTitle("MINI GAME");
	f.setBackground(Color.BLACK);
	f.setForeground(Color.pink);	
	
	Font font=new Font("arial",Font.BOLD,40);
	b1=new Button("");
	b1.setBounds(25,25,100,100);
	b1.setBackground(Color.gray);
	b1.setFont(font);

	b2=new Button("5");
	b2.setBounds(135,25,100,100);
	b2.setBackground(Color.gray);
	b2.setFont(font);

	b3=new Button("1");
	b3.setBounds(245,25,100,100);
	b3.setBackground(Color.gray);
	b3.setFont(font);

	b4=new Button("3");
	b4.setBounds(25,135,100,100);
	b4.setBackground(Color.gray);
	b4.setFont(font);

	b5=new Button("4");
	b5.setBounds(135,135,100,100);
	b5.setBackground(Color.gray);
	b5.setFont(font);

	b6=new Button("6");
	b6.setBounds(245,135,100,100);
	b6.setBackground(Color.gray);
	b6.setFont(font);

	b7=new Button("2");
	b7.setBounds(25,245,100,100);
	b7.setBackground(Color.gray);
	b7.setFont(font);

	b8=new Button("8");
	b8.setBounds(135,245,100,100);
	b8.setBackground(Color.gray);
	b8.setFont(font);

	b9=new Button("7");
	b9.setBounds(245,245,100,100);
	b9.setBackground(Color.gray);
	b9.setFont(font);

Font font1=new Font("arial",Font.BOLD,45);
	b=new Button("SHUFFLE");
	b.setBounds(100,400,200,50);
	b.setBackground(Color.BLUE);
	b8.setFont(font1);

	b0=new Button("");
	b0.setBounds(100,400,200,100);


	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(b);
	f.add(b0);

	b1.addActionListener((ActionListener) this);  
    b2.addActionListener((ActionListener) this);  
    b3.addActionListener((ActionListener) this);  
    b4.addActionListener((ActionListener) this);  
    b5.addActionListener((ActionListener) this);  
    b6.addActionListener((ActionListener) this);  
    b7.addActionListener((ActionListener) this);  
    b8.addActionListener((ActionListener) this);  
    b9.addActionListener((ActionListener) this);
	b.addActionListener((ActionListener) this);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String s=b1.getLabel();
			if(b2.getLabel().equals(""))
			{
				b2.setLabel(s);
				b1.setLabel("");
			}
			if(b4.getLabel().equals(""))
			{
				b4.setLabel(s);
				b1.setLabel("");
			}
		}
		
		if(e.getSource()==b2)
		{
			String s=b2.getLabel();
			if(b3.getLabel().equals(""))
			{
				b3.setLabel(s);
				b2.setLabel("");
			}
			if(b1.getLabel().equals(""))
			{
				b1.setLabel(s);
				b2.setLabel("");
			}
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(s);
				b2.setLabel("");
			}
		}
		
		if(e.getSource()==b3)
		{
			String s=b3.getLabel();
			if(b2.getLabel().equals(""))
			{
				b2.setLabel(s);
				b3.setLabel("");
			}
			if(b6.getLabel().equals(""))
			{
				b6.setLabel(s);
				b3.setLabel("");
			}
		}
		
		if(e.getSource()==b4)
		{
			String s=b4.getLabel();
			if(b1.getLabel().equals(""))
			{
				b1.setLabel(s);
				b4.setLabel("");
			}
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(s);
				b4.setLabel("");
			}
			if(b7.getLabel().equals(""))
			{
				b7.setLabel(s);
				b4.setLabel("");
			}
		}
		
		if(e.getSource()==b5)
		{
			String s=b5.getLabel();
			if(b4.getLabel().equals(""))
			{
				b4.setLabel(s);
				b5.setLabel("");
			}
			if(b6.getLabel().equals(""))
			{
				b6.setLabel(s);
				b5.setLabel("");
			}
			if(b8.getLabel().equals(""))
			{
				b8.setLabel(s);
				b5.setLabel("");
			}
			if(b2.getLabel().equals(""))
			{
				b2.setLabel(s);
				b5.setLabel("");
			}
		}
		
		if(e.getSource()==b6)
		{
			String s=b6.getLabel();
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(s);
				b6.setLabel("");
			}
			if(b9.getLabel().equals(""))
			{
				b9.setLabel(s);
				b6.setLabel("");
			}
			if(b3.getLabel().equals(""))
			{
				b3.setLabel(s);
				b6.setLabel("");
			}
		}
		
		if(e.getSource()==b7)
		{
			String s=b7.getLabel();
			if(b4.getLabel().equals(""))
			{
				b4.setLabel(s);
				b7.setLabel("");
			}
			if(b8.getLabel().equals(""))
			{
				b8.setLabel(s);
				b7.setLabel("");
			}
		}
		
		if(e.getSource()==b8)
		{
			String s=b8.getLabel();
			if(b7.getLabel().equals(""))
			{
				b7.setLabel(s);
				b8.setLabel("");
			}
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(s);
				b8.setLabel("");
			}
			if(b9.getLabel().equals(""))
			{
				b9.setLabel(s);
				b8.setLabel("");
			}
		}
		
		if(e.getSource()==b9)
		{
			String s=b9.getLabel();
			if(b8.getLabel().equals(""))
			{
				b8.setLabel(s);
				b9.setLabel("");
			}
			if(b6.getLabel().equals(""))
			{
				b6.setLabel(s);
				b9.setLabel("");
			}
			if(e.getSource()==b)
			{
				String a=b1.getLabel();
				b1.setLabel(b4.getLabel());
				b4.setLabel(b8.getLabel());
				b8.setLabel(b9.getLabel());
				b9.setLabel(b6.getLabel());
				b6.setLabel(b2.getLabel());
				b2.setLabel(b3.getLabel());
				b3.setLabel(b7.getLabel());
				b7.setLabel(b5.getLabel());
				b5.setLabel(a);

			}
		}
		if((b1.getLabel().equals("1"))&&(b2.getLabel().equals("2"))&&(b3.getLabel().equals("3"))&&(b4.getLabel().equals("4"))&&(b5.getLabel().equals("5"))&&(b6.getLabel().equals("6"))&&(b7.getLabel().equals("7"))&&(b8.getLabel().equals("8"))&&(b9.getLabel().equals("")))
		{
		JOptionPane.showMessageDialog(f,"WOOOOHOOOO!!! YOU WON!! :)");
		}
	}
		
public static void main(String[] args) {
	game g=new game();

}
}