package kr.or.dgit.erp_luuzun.application.software;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import erp_myframework.ComboPanel;
import erp_myframework.RadioPanel;
import erp_myframework.TextFiledPanel;

@SuppressWarnings("serial")
public class ContentSoftware extends JPanel {

	public ContentSoftware() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {300, 200, 50};
		gridBagLayout.rowHeights = new int[]{30, 30, 30,30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel label = new JLabel("소프트웨어 관리");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 14));
		
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(10, 10, 10, 10);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		gbc_label.gridwidth = 2;
		add(label, gbc_label);
		
		TextFiledPanel tfpSWCode = new TextFiledPanel();
		tfpSWCode.setTitle("제품번호");
		GridBagConstraints gbc_tfptfpSWCode = new GridBagConstraints(); 
		gbc_tfptfpSWCode.fill = GridBagConstraints.HORIZONTAL; 
		gbc_tfptfpSWCode.insets = new Insets(0, 0, 5, 5);
		gbc_tfptfpSWCode.gridx = 0;
		gbc_tfptfpSWCode.gridy = 1;
		add(tfpSWCode, gbc_tfptfpSWCode);

		TextFiledPanel tfpSWName = new TextFiledPanel();
		tfpSWName.setTitle("제품명");
		GridBagConstraints gbc_tfpSWName = new GridBagConstraints();
		gbc_tfpSWName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpSWName.insets = new Insets(0, 0, 5, 5);
		gbc_tfpSWName.gridx = 0;
		gbc_tfpSWName.gridy = 2;
		add(tfpSWName, gbc_tfpSWName);
		
		TextFiledPanel tfpSwPrice = new TextFiledPanel();
		tfpSwPrice.setTitle("판매가격");
		GridBagConstraints gbc_tfptfpSwPrice = new GridBagConstraints();
		gbc_tfptfpSwPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfptfpSwPrice.insets = new Insets(0, 0, 0, 5);
		gbc_tfptfpSwPrice.gridx = 0;
		gbc_tfptfpSwPrice.gridy = 3;
		add(tfpSwPrice, gbc_tfptfpSwPrice);
		
		ComboPanel tfpCompName = new ComboPanel();
		tfpCompName.setTitle("공급회사");
		GridBagConstraints gbc_tfpCompName = new GridBagConstraints();
		gbc_tfpCompName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpCompName.insets = new Insets(0, 0, 5, 5);
		gbc_tfpCompName.gridx = 1;
		gbc_tfpCompName.gridy = 1;
		add(tfpCompName, gbc_tfpCompName);
				
		ComboPanel tfpGroupName = new ComboPanel();
		tfpGroupName.setTitle("분류");
		GridBagConstraints gbc_tfpGroupName = new GridBagConstraints();
		gbc_tfpGroupName.insets = new Insets(0, 0, 5, 5);
		gbc_tfpGroupName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpGroupName.gridx = 1;
		gbc_tfpGroupName.gridy = 2;
		add(tfpGroupName, gbc_tfpGroupName);

		RadioPanel tfpIsSale = new RadioPanel();
		tfpIsSale.setTitle("판매여부");
		tfpIsSale.setRadioItems("판매","판매중지");
		GridBagConstraints gbc_tfpIsSale = new GridBagConstraints();
		gbc_tfpIsSale.insets = new Insets(0, 0, 0, 5);
		gbc_tfpIsSale.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfpIsSale.gridx = 1;
		gbc_tfpIsSale.gridy = 3;
		add(tfpIsSale, gbc_tfpIsSale);
	}

}
