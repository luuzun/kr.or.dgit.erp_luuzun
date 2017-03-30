package kr.or.dgit.erp_luuzun.application.showlist;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class ViewList extends JPanel{
	public ViewList() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0}; //각 열의 최소 넓이  
		gridBagLayout.rowHeights = new int[]{0, 0}; //각 행의 최소 넓이
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE}; //각 열의 가중치
		gridBagLayout.rowWeights = new double[]{0.0, 1.0}; //각 행의 가중치
		setLayout(gridBagLayout);
		
		ContentList pContent = new ContentList();
		GridBagConstraints gbc_pContent = new GridBagConstraints();
		gbc_pContent.insets = new Insets(10, 10, 10, 10);
		gbc_pContent.fill = GridBagConstraints.NONE;
		gbc_pContent.gridx = 0;
		gbc_pContent.gridy = 0;
		add(pContent, gbc_pContent);
		
		TableList pTable = new TableList();
		GridBagConstraints gbc_pTable = new GridBagConstraints();
		gbc_pTable.insets = new Insets(0, 0, 0, 0);
		gbc_pTable.fill = GridBagConstraints.BOTH;
		gbc_pTable.gridx = 0;
		gbc_pTable.gridy = 1;
		add(pTable, gbc_pTable);
	}
}
