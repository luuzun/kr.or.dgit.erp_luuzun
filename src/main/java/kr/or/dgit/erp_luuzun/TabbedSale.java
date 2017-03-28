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

import kr.or.dgit.erp_luuzun.content.ContentSale;
import kr.or.dgit.erp_luuzun.view.ViewSale;

public class TabbedSale extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabbedSale frame = new TabbedSale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TabbedSale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
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
		
		tabbedPane.add("Sale",new ViewSale());
	}
}
