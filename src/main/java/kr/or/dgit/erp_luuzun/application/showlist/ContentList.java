package kr.or.dgit.erp_luuzun.application.showlist;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import erp_myframework.CheckBoxPanel;
import erp_myframework.ComboPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class ContentList extends JPanel{
	public ContentList() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {300, 50, 50};
		gridBagLayout.rowHeights = new int[]{30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel label = new JLabel("거래내역 확인");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 14));
		
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(10, 10, 10, 10);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		gbc_label.gridwidth = 2;
		add(label, gbc_label);
		
		ComboPanel tfpSwName = new ComboPanel();
		tfpSwName.setTitle("품목명");
		GridBagConstraints gbc_tfpSwName = new GridBagConstraints();
		gbc_tfpSwName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSwName.insets = new Insets(0, 0, 5, 5);
		gbc_tfpSwName.gridx = 0;
		gbc_tfpSwName.gridy = 1;
		add(tfpSwName, gbc_tfpSwName);
		
		JButton btnSwAllFind = new JButton("전체");
		GridBagConstraints gbc_btnSwAllFind = new GridBagConstraints();
		gbc_btnSwAllFind.insets = new Insets(0, 0, 5, 5);
		gbc_btnSwAllFind.gridx = 1;
		gbc_btnSwAllFind.gridy = 1;
		add(btnSwAllFind, gbc_btnSwAllFind);
		

		ComboPanel tfpClntName = new ComboPanel();
		tfpClntName.setTitle("고객상호");
		GridBagConstraints gbc_tfpClntName = new GridBagConstraints();
		gbc_tfpClntName.insets = new Insets(0, 0, 5, 5);
		gbc_tfpClntName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpClntName.gridx = 0;
		gbc_tfpClntName.gridy = 2;
		add(tfpClntName, gbc_tfpClntName);
		
		JButton btnClntAllFind = new JButton("전체");
		GridBagConstraints gbc_btnClntAllFind = new GridBagConstraints();
		gbc_btnClntAllFind.insets = new Insets(0, 0, 5, 5);
		gbc_btnClntAllFind.gridx = 1;
		gbc_btnClntAllFind.gridy = 2;
		add(btnClntAllFind, gbc_btnClntAllFind);
		
		ComboPanel tfpGroup = new ComboPanel();
		tfpGroup.setTitle("그룹별");
		GridBagConstraints gbc_tfpGroup = new GridBagConstraints();
		gbc_tfpGroup.insets = new Insets(0, 0, 5, 5);
		gbc_tfpGroup.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpGroup.gridx = 0;
		gbc_tfpGroup.gridy = 3;
		add(tfpGroup, gbc_tfpGroup);
		
		JButton btnGroupAllFind = new JButton("전체");
		GridBagConstraints gbc_btnGroupAllFind = new GridBagConstraints();
		gbc_btnGroupAllFind.insets = new Insets(0, 0, 5, 5);
		gbc_btnGroupAllFind.gridx = 1;
		gbc_btnGroupAllFind.gridy = 3;
		add(btnGroupAllFind, gbc_btnGroupAllFind);
	}
}
