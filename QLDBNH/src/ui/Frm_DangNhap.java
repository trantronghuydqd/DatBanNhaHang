package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frm_DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JPasswordField password;
	private JButton btnQuenMK;
	private JButton btnThoat;
	private JButton btnThoat_1;
	private JButton btnngNhp;
	private JButton btnDangNhap;
	private JButton btnDangNhap_1;
	private JLabel lblLogin;
    private Frm_QuenMatKhau qMK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_DangNhap frame = new Frm_DangNhap();
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
	public Frm_DangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 331);
		setTitle("ĐĂNG NHẬP HỆ THỐNG");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		qMK = new Frm_QuenMatKhau();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaiKhoan = new JLabel("Mật Khẩu");
		lblTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTaiKhoan.setBounds(285, 137, 87, 24);
		contentPane.add(lblTaiKhoan);
		
		JLabel lblTaiKhoan_1 = new JLabel("Tài Khoản");
		lblTaiKhoan_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTaiKhoan_1.setBounds(285, 82, 87, 24);
		contentPane.add(lblTaiKhoan_1);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setBounds(285, 106, 245, 20);
		contentPane.add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(285, 162, 245, 20);
		contentPane.add(password);
		
		btnQuenMK = new JButton("Quên mật khẩu ?");
		btnQuenMK.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				qMK.setVisible(true);
			}
		});
		btnQuenMK.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQuenMK.setBounds(394, 197, 136, 23);
		contentPane.add(btnQuenMK);
		
		btnThoat = new JButton("Thoát");
        btnThoat_1 = new FixButton("img/thoat.png", 20, 16);
        btnThoat_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        btnThoat_1.setText("Thoát");
		btnThoat_1.setForeground(new Color(255, 255, 255));
		btnThoat_1.setBackground(new Color(255, 0, 0));
		btnThoat_1.setBounds(285, 239, 89, 23);
		contentPane.add(btnThoat_1);
		
		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap_1 = new FixButton("img/dangnhap.png", 26, 16);
		btnDangNhap_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDangNhap_1.setText("Đăng nhập");
		btnDangNhap_1.setBackground(new Color(0, 0, 255));
		btnDangNhap_1.setForeground(new Color(255, 255, 255));
		btnDangNhap_1.setBounds(415, 239, 115, 23);
		contentPane.add(btnDangNhap_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 567, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTieuDeDN = new JLabel("Đăng Nhập");
		lblTieuDeDN.setBounds(95, 0, 381, 50);
		panel.add(lblTieuDeDN);
		lblTieuDeDN.setBackground(new Color(0, 255, 255));
		lblTieuDeDN.setForeground(new Color(0, 0, 0));
		lblTieuDeDN.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDeDN.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		lblLogin = new JLabel("");
		String imgNV = "img/anhlogin.png";
        int setRongiconNV = 275; // Đặt chiều rộng mong muốn
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
            lblLogin.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblLogin.setBounds(0, 51, 275, 241);
		contentPane.add(lblLogin);
	}
}
