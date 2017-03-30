package kr.or.dgit.erp_luuzun;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.erp_luuzun.application.delivery.ViewDelivery;
import kr.or.dgit.erp_luuzun.application.sales.ViewSale;
import kr.or.dgit.erp_luuzun.application.showlist.ViewList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainTab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTab frame = new MainTab();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 532);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("파일");
		menuBar.add(mnFile);
		
		JMenuItem mntmInit = new JMenuItem("초기화");
		mnFile.add(mntmInit);
		
		JMenuItem mntmBackup = new JMenuItem("백업");
		mnFile.add(mntmBackup);
		
		JMenuItem mntmRestore = new JMenuItem("복원");
		mnFile.add(mntmRestore);
		
		JMenuItem mntmExit = new JMenuItem("종료");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("도움말");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("AboutProject");
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		tabbedPane.add("주문 관리",new ViewSale());
		tabbedPane.add("납품 관리",new ViewDelivery());
		tabbedPane.add("거래내역 확인",new ViewList());
		
		JPanel pButton = new JPanel();
		contentPane.add(pButton, BorderLayout.NORTH);
		
		JButton btnSupplyComp = new JButton("공급사 관리");
		btnSupplyComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pButton.add(btnSupplyComp);
		
		JButton btnSoftWare = new JButton("S/W 관리");
		pButton.add(btnSoftWare);
		
		JButton btnClient = new JButton("고객 관리");
		pButton.add(btnClient);
		
		JButton btnChart = new JButton("통계차트");
		pButton.add(btnChart);
		
		JButton btnReport = new JButton("보고서");
		pButton.add(btnReport);
	}
}