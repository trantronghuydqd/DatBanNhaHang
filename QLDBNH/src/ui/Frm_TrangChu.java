package ui;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class Frm_TrangChu extends JFrame {

	private JPanel contentPane;
	private JLabel lblTrangChu;
	private JLabel lblBan;
	private JLabel lblMon;
	private JLabel lblNhanVien;
	private JLabel lblKhachHang;
	private JLabel lblHoaDon;
	private JLabel lblChiTietHoaDon;
	private JLabel lblThongKe;
	private JLabel lblKhuyenMai;
	private JLabel lblTaiKhoan;
	private JLabel lblTenTaiKhoan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_TrangChu frame = new Frm_TrangChu();
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
	public Frm_TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1484, 813);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlheader = new JPanel();
		pnlheader.setBackground(new Color(255, 213, 170));
		pnlheader.setBounds(0, 0, 221, 774);
		contentPane.add(pnlheader);
		pnlheader.setLayout(null);
		
		JPanel pnlTrangChu = new JPanel();
		pnlTrangChu.setBackground(new Color(255, 213, 170));
		pnlTrangChu.setBounds(0, 133, 218, 44);
		pnlheader.add(pnlTrangChu);
		pnlTrangChu.setLayout(null);
		
		lblTrangChu = new JLabel("Trang Chủ");
		lblTrangChu.setBackground(new Color(255, 213, 170));
		lblTrangChu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		String imgNV = "img/trangchu.png";
        int setRongiconNV = 26; // Đặt chiều rộng mong muốn
        int setDaiiconNV = 26; // Đặt chiều cao mong muốn

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
            lblTrangChu.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblTrangChu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrangChu.setBounds(0, 0, 218, 43);
		pnlTrangChu.add(lblTrangChu);
		
		JPanel pnlBan = new JPanel();
		pnlBan.setBackground(new Color(255, 213, 170));
		pnlBan.setLayout(null);
		pnlBan.setBounds(0, 177, 218, 44);
		pnlheader.add(pnlBan);
		
		lblBan = new JLabel("Bàn");
		lblBan.setBackground(new Color(255, 213, 170));
		lblBan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		String imgb = "img/ban.png";
        int setRongiconb = 26; // Đặt chiều rộng mong muốn
        int setDaiconb = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgb));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiconb * aspectRatio);
            int scaledHeight = setDaiconb;

            if (scaledWidth > setRongiconb) {
                scaledWidth = setRongiconb;
                scaledHeight = (int) (setRongiconb / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblBan.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblBan.setHorizontalAlignment(SwingConstants.CENTER);
		lblBan.setBounds(0, 0, 218, 44);
		pnlBan.add(lblBan);
		
		JPanel pnlMon = new JPanel();
		pnlMon.setBackground(new Color(255, 213, 170));
		pnlMon.setLayout(null);
		pnlMon.setBounds(0, 221, 218, 45);
		pnlheader.add(pnlMon);
		
		lblMon = new JLabel("Món Ăn");
		String imgM = "img/monan.png";
        int setRongiconM = 26; // Đặt chiều rộng mong muốn
        int setDaiiconM = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgM));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiiconM * aspectRatio);
            int scaledHeight = setDaiiconM;

            if (scaledWidth > setRongiconM) {
                scaledWidth = setRongiconM;
                scaledHeight = (int) (setRongiconM / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblMon.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblMon.setBackground(new Color(255, 213, 170));
		lblMon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMon.setHorizontalAlignment(SwingConstants.CENTER);
		lblMon.setBounds(0, 0, 218, 45);
		pnlMon.add(lblMon);
		
		JPanel pnlNhanVien = new JPanel();
		pnlNhanVien.setBackground(new Color(255, 213, 170));
		pnlNhanVien.setLayout(null);
		pnlNhanVien.setBounds(0, 266, 218, 44);
		pnlheader.add(pnlNhanVien);
		
	    lblNhanVien = new JLabel("Nhân Viên");
	    String imgnv = "img/nhanvien.png";
        int setRongiconnv = 26; // Đặt chiều rộng mong muốn
        int setDaiiconnv = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgnv));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiiconnv * aspectRatio);
            int scaledHeight = setDaiiconnv;

            if (scaledWidth > setRongiconnv) {
                scaledWidth = setRongiconnv;
                scaledHeight = (int) (setRongiconM / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblNhanVien.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
	    lblNhanVien.setBackground(new Color(255, 213, 170));
	    lblNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhanVien.setBounds(0, 0, 218, 44);
		pnlNhanVien.add(lblNhanVien);
		
		JPanel pnlKhachHang = new JPanel();
		pnlKhachHang.setBackground(new Color(255, 213, 170));
		pnlKhachHang.setLayout(null);
		pnlKhachHang.setBounds(0, 310, 218, 44);
		pnlheader.add(pnlKhachHang);
		
		lblKhachHang = new JLabel("Khách Hàng");
		String imgkh = "img/khachhang.png";
        int setRongiconkh = 26; // Đặt chiều rộng mong muốn
        int setDaiiconkh = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgkh));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiiconkh * aspectRatio);
            int scaledHeight = setDaiiconkh;

            if (scaledWidth > setRongiconkh) {
                scaledWidth = setRongiconkh;
                scaledHeight = (int) (setRongiconkh / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblKhachHang.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblKhachHang.setBackground(new Color(255, 213, 170));
		lblKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang.setBounds(0, 0, 218, 44);
		pnlKhachHang.add(lblKhachHang);
		
		JPanel pnlHoaDon = new JPanel();
		pnlHoaDon.setBackground(new Color(255, 213, 170));
		pnlHoaDon.setLayout(null);
		pnlHoaDon.setBounds(0, 354, 218, 44);
		pnlheader.add(pnlHoaDon);
		
		lblHoaDon = new JLabel("Hóa Đơn");
		String imghd = "img/TaoHoaDon.png";
        int setRongiconhd = 26; // Đặt chiều rộng mong muốn
        int setDaiiconhd = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imghd));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiiconhd * aspectRatio);
            int scaledHeight = setDaiiconhd;

            if (scaledWidth > setRongiconhd) {
                scaledWidth = setRongiconhd;
                scaledHeight = (int) (setRongiconhd / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblHoaDon.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblHoaDon.setBackground(new Color(255, 213, 170));
		lblHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoaDon.setBounds(0, 0, 218, 43);
		pnlHoaDon.add(lblHoaDon);
		
		JPanel pnlChiTietHoaDon = new JPanel();
		pnlChiTietHoaDon.setBackground(new Color(255, 213, 170));
		pnlChiTietHoaDon.setLayout(null);
		pnlChiTietHoaDon.setBounds(0, 398, 218, 45);
		pnlheader.add(pnlChiTietHoaDon);
		
		lblChiTietHoaDon = new JLabel("Chi Tiết Hóa Đơn");
		String imgcthd = "img/XemChiTiet.png";
        int setRongiconcthd = 26; // Đặt chiều rộng mong muốn
        int setDaiiconcthd = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgcthd));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiiconcthd * aspectRatio);
            int scaledHeight = setDaiiconcthd;

            if (scaledWidth > setRongiconcthd) {
                scaledWidth = setRongiconcthd;
                scaledHeight = (int) (setRongiconcthd / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblChiTietHoaDon.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblChiTietHoaDon.setBackground(new Color(255, 213, 170));
		lblChiTietHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChiTietHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblChiTietHoaDon.setBounds(0, 0, 218, 45);
		pnlChiTietHoaDon.add(lblChiTietHoaDon);
		
		JPanel pnlThongKe = new JPanel();
		pnlThongKe.setBackground(new Color(255, 213, 170));
		pnlThongKe.setLayout(null);
		pnlThongKe.setBounds(0, 443, 218, 45);
		pnlheader.add(pnlThongKe);
		
		lblThongKe = new JLabel("Thống Kê");
		String imgtk = "img/thongke.png";
        int setRongicontk = 26; // Đặt chiều rộng mong muốn
        int setDaiicontk = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgtk));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiicontk * aspectRatio);
            int scaledHeight = setDaiicontk;

            if (scaledWidth > setRongicontk) {
                scaledWidth = setRongicontk;
                scaledHeight = (int) (setRongicontk / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblThongKe.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblThongKe.setBackground(new Color(255, 213, 170));
		lblThongKe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongKe.setBounds(0, 0, 218, 45);
		pnlThongKe.add(lblThongKe);
		
		JPanel pnlKhuyenMai = new JPanel();
		pnlKhuyenMai.setBackground(new Color(255, 213, 170));
		pnlKhuyenMai.setLayout(null);
		pnlKhuyenMai.setBounds(0, 488, 218, 44);
		pnlheader.add(pnlKhuyenMai);
		
		lblKhuyenMai = new JLabel("Khuyến Mãi");
		String imgkm = "img/khuyenmai.png";
        int setRongiconkm = 26; // Đặt chiều rộng mong muốn
        int setDaiiconkm = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgkm));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiicontk * aspectRatio);
            int scaledHeight = setDaiicontk;

            if (scaledWidth > setRongicontk) {
                scaledWidth = setRongicontk;
                scaledHeight = (int) (setRongicontk / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblKhuyenMai.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblKhuyenMai.setBackground(new Color(255, 213, 170));
		lblKhuyenMai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKhuyenMai.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhuyenMai.setBounds(0, 0, 218, 44);
		pnlKhuyenMai.add(lblKhuyenMai);
		
		JPanel pnlTaiKhoan = new JPanel();
		pnlTaiKhoan.setBackground(new Color(255, 213, 170));
		pnlTaiKhoan.setLayout(null);
		pnlTaiKhoan.setBounds(0, 532, 218, 43);
		pnlheader.add(pnlTaiKhoan);
		
		lblTaiKhoan = new JLabel("Tài Khoản");
		String imgtkk = "img/taikhoan.png";
        int setRongicontkk = 26; // Đặt chiều rộng mong muốn
        int setDaiicontkk = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgtkk));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiicontkk * aspectRatio);
            int scaledHeight = setDaiicontkk;

            if (scaledWidth > setRongicontkk) {
                scaledWidth = setRongicontkk;
                scaledHeight = (int) (setRongicontkk / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblTaiKhoan.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblTaiKhoan.setBackground(new Color(255, 213, 170));
		lblTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaiKhoan.setBounds(0, 0, 218, 43);
		pnlTaiKhoan.add(lblTaiKhoan);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 213, 170));
		panel.setBounds(221, 0, 1247, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblTenTaiKhoan = new JLabel("Vo Cong Tuan Anh");
		String imgtk1 = "img/taikhoan.png";
        int setRongicontkk1 = 26; // Đặt chiều rộng mong muốn
        int setDaiicontkk1 = 26; // Đặt chiều cao mong muốn

        try {
            // Đọc hình ảnh từ tệp
            BufferedImage originalImage = ImageIO.read(new File(imgtkk));

            // Thay đổi kích thước hình ảnh với giữ nguyên tỷ lệ khung hình
            int originalWidth = originalImage.getWidth();
            int originalHeight = originalImage.getHeight();
            double aspectRatio = (double) originalWidth / originalHeight;

            int scaledWidth = (int) (setDaiicontkk1 * aspectRatio);
            int scaledHeight = setDaiicontkk1;

            if (scaledWidth > setRongicontkk1) {
                scaledWidth = setRongicontkk1;
                scaledHeight = (int) (setRongicontkk1 / aspectRatio);
            }

            Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            lblTenTaiKhoan.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
		lblTenTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTenTaiKhoan.setBounds(1002, 11, 245, 22);
		panel.add(lblTenTaiKhoan);
		
		JPanel pnlTong = new JPanel();
		pnlTong.setBounds(221, 44, 1247, 730);
		contentPane.add(pnlTong);
	}
}
