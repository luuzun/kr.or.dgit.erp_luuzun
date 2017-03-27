package kr.or.dgit.erp_luuzun.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
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
			UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
			SyntheticaLookAndFeel.setFont("인터파크고딕 L", 12);
		} catch (UnsupportedLookAndFeelException | ParseException e) {
			e.printStackTrace();
		}
		
		viewSale viewSale = new viewSale();
		add(viewSale);
	}
}
