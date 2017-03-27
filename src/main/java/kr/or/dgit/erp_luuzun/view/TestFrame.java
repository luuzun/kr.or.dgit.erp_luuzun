package kr.or.dgit.erp_luuzun.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import de.javasoft.plaf.synthetica.*;

import kr.or.dgit.erp_luuzun.content.viewSale;
public class TestFrame extends JFrame {

	private JPanel contentPane;

	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		try {
			UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		viewSale viewSale = new viewSale();		
		add(viewSale);
	}

}
