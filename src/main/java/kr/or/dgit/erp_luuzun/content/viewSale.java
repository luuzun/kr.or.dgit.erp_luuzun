package kr.or.dgit.erp_luuzun.content;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import erp_myframework.CheckBoxPanel;
import erp_myframework.ComboPanel;
import erp_myframework.TextFiledPanel;

public class viewSale extends JPanel {
	public viewSale() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 200};
		gridBagLayout.rowHeights = new int[]{70, 70, 70};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		TextFiledPanel panel = new TextFiledPanel();
		panel.setTitle("주문번호");
		GridBagConstraints gbc_panel = new GridBagConstraints(); 
		gbc_panel.fill = GridBagConstraints.HORIZONTAL; //수평으로 꽉 채워라!
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		TextFiledPanel panel_2 = new TextFiledPanel();
		panel_2.setTitle("주문일자");
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		add(panel_2, gbc_panel_2);
		
		TextFiledPanel panel_1 = new TextFiledPanel();
		panel_1.setTitle("주문수량");
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
		
		ComboPanel panel_3 = new ComboPanel();
		panel_3.setTitle("고객상호명");
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		add(panel_3, gbc_panel_3);
		
		ComboPanel panel_4 = new ComboPanel();
		panel_4.setTitle("품목명");
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 2;
		add(panel_4, gbc_panel_4);
		
		CheckBoxPanel panel_5 = new CheckBoxPanel();
		panel_5.setTitle("입금여부");
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 2;
		add(panel_5, gbc_panel_5);

	}

}
