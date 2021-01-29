import java.awt.*;
import java.awt.event.*;

class SampleDialog extends Dialog implements ActionListener {
	Divider bld;
	SampleDialog(Frame parent, String title) {
		super(parent, title, false); 
		bld = (Divider)parent;
		setLayout(new FlowLayout());
		setSize(500, 150);
		add(new Label(bld.msg ) );
		Button b = new Button("OK");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
	 	dispose();
	}
}

public class Divider extends Frame implements ActionListener {
	TextField num1,num2,result;
	String msg = " ";
	Button divide;
	public Divider() {
		setLayout(new FlowLayout());
		Label n1 = new Label("Num 1: ",Label.RIGHT);
		Label n2 = new Label("Num 2: ",Label.RIGHT);
		Label res = new Label("Result: ",Label.RIGHT);
		Button b = new Button("Divide");
		
		num1 = new TextField();
		num1.setBounds(50, 50, 150, 20);
		num2 = new TextField();
		num2.setBounds(50, 100, 150, 20);
		result = new TextField();
		result.setBounds(50, 150, 150, 20);
		result.setEditable(false);
		
		
		add(n1);
		add(num1);
		add(n2);
		add(num2);
		divide = (Button) add(b);
		add(res);
		add(result);
		

		num1.addActionListener(this);
		num2.addActionListener(this);
		divide.addActionListener(this);
		addWindowListener(new myWindowAdapter());
	}

	public void actionPerformed(ActionEvent ae) {
		String s1 = num1.getText();
		String s2 = num2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
	    if(ae.getSource() == divide) {
			try {
				c = a/b;
				String r = String.valueOf(c);
				result.setText(r);
	        } catch(NumberFormatException e) {
		        msg = "" + e;
		        SampleDialog d = new SampleDialog(this, "Dialog");
				d.setVisible(true);
			} catch(ArithmeticException e) {
		        msg = "" + e;
		        SampleDialog d = new SampleDialog(this, "Dialog");
		        d.setVisible(true);
			}
		}
	}
				
	public static void main(String[] args)
	{
		Divider d = new Divider();
		d.setSize(new Dimension(400,200));
		d.setTitle("INTEGER DIVISION");
		d.setVisible(true);
	}
}

class myWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
