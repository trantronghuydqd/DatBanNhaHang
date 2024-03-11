package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Frm_QuenMatKhau extends JFrame {

	private JPanel contentPane;
	private JTextField txtSdt;
	private JTextField txtMatkhaumoi;
	private JTextField txtMaxacnhan;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JButton btnGuima;
	private JButton btnNewButton_1;
	private JButton btnXacnhan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_QuenMatKhau frame = new Frm_QuenMatKhau();
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
	public Frm_QuenMatKhau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 567, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quên Mật Khẩu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(126, 0, 314, 50);
		panel.add(lblNewLabel);
		
		txtSdt = new JTextField();
		txtSdt.setBounds(301, 84, 231, 20);
		contentPane.add(txtSdt);
		txtSdt.setColumns(10);
		
		JLabel lblSdt = new JLabel("Số điện thoại");
		lblSdt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSdt.setBounds(301, 61, 103, 24);
		contentPane.add(lblSdt);
		
		txtMatkhaumoi = new JTextField();
		txtMatkhaumoi.setBounds(301, 130, 231, 20);
		contentPane.add(txtMatkhaumoi);
		txtMatkhaumoi.setColumns(10);
		
		JLabel lblMatkhaumoi = new JLabel("Mật khẩu mới");
		lblMatkhaumoi.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMatkhaumoi.setBounds(301, 109, 103, 20);
		contentPane.add(lblMatkhaumoi);
		
		JLabel lblMaxacnhan = new JLabel("Mã xác nhận");
		lblMaxacnhan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMaxacnhan.setBounds(301, 169, 95, 19);
		contentPane.add(lblMaxacnhan);
		
		btnNewButton = new FixButton("Gữi mã");
		btnGuima = new FixButton("img/guima.png", 20, 16);
		btnGuima.setForeground(new Color(0, 0, 0));
		btnGuima.setText("Gữi mã");
		btnGuima.setBackground(new Color(210, 255, 255));
		btnGuima.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGuima.setBounds(429, 167, 103, 23);
		contentPane.add(btnGuima);
		
		txtMaxacnhan = new JTextField();
		txtMaxacnhan.setBounds(301, 196, 231, 20);
		contentPane.add(txtMaxacnhan);
		txtMaxacnhan.setColumns(10);
		
		btnNewButton_1 = new FixButton("Xác nhận");
		btnXacnhan = new FixButton("img/xacnhan.png", 20, 16);
		btnXacnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXacnhan.setForeground(new Color(0, 0, 0));
		btnXacnhan.setText("Xác nhận");
		btnXacnhan.setBackground(new Color(130, 130, 255));
		btnXacnhan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnXacnhan.setBounds(301, 245, 231, 24);
		contentPane.add(btnXacnhan);
		
		lblNewLabel_4 = new JLabel("");
		String imgNV = "img/quenmatkhau.png";
        int setRongiconNV = 291; // Đặt chiều rộng mong muốn
        int setDaiiconNV = 241; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgNV));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiiconNV * aspectRatio);
            int scaledHeight = setDaiiconNV;

            if (scaledWidth > setRongiconNV) {
                scaledWidth = setRongiconNV;
                scaledHeight = (int) (setRongiconNV / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblNewLabel_4.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblNewLabel_4.setBounds(31, 51, 260, 241);
		contentPane.add(lblNewLabel_4);

	}
}
