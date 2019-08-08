package java_20190807.unicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnicastClient implements ActionListener {

	private String id;
	private String ip;
	private int port;
	private JFrame jframe;
	private JTextArea jta;
	private JTextField jtf;
	private JButton jbtn;

	public UnicastClient(String id, String ip, int port) {
		this.id = id;
		this.ip = ip;
		this.port = port;

		jframe = new JFrame("Unicast Chatting");
		/*********************** 중앙시작 *************************************/

		jtf = new JTextField(30);
		jta = new JTextArea("", 30, 50);
		jta.setEditable(false);
//jframe.add(jta,BorderLayout.CENTER);

		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		/*********************** 중앙끝 *************************************/

		jtf = new JTextField(30);
		jbtn = new JButton("전송");
		jbtn.setBackground(Color.ORANGE);

		/*********************** 하단시작 *************************************/
		JPanel j1 = new JPanel();
		j1.setLayout(new BorderLayout());
		j1.add(jtf, BorderLayout.CENTER);
		j1.add(jbtn, BorderLayout.EAST);
		/*********************** 하단끝 *************************************/

		/*********************** 상단시작 *************************************/

		JPanel j2 = new JPanel();
		JLabel jl1 = new JLabel("User ID  : [" +id+"]");
		JLabel jl2 = new JLabel("Server IPP : " + ip);
		j2.setLayout(new BorderLayout());
		j2.add(jl1, BorderLayout.EAST);
		j2.add(jl2, BorderLayout.EAST);

		/*********************** 상단끝 *************************************/

		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(j1, BorderLayout.SOUTH);
		jframe.add(j2, BorderLayout.NORTH);

		jframe.setSize(500, 300);
		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);
		
		
		jframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				int a = 10;
				double d = 20;
			}
		});
		jbtn.addActionListener(this);
		jtf.addActionListener(this);


	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new UnicastClient("nkstu9", "127.0.0.1", 5000);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("action....");
		Object obj = e.getSource();
		if(obj == jtf) {
			System.out.println("action jtf...");
			String massage = jtf.getText();
			jta.append(id+ ": " +massage+"\n");
			jtf.setText("");
		}else if(obj == jbtn) {
			System.out.println("action jbtn...");
			String massage = jtf.getText();
			jta.append(id+ ": " +massage+"\n");
			jtf.setText("");
			jtf.requestFocus();

		}
	}

}
