package Employ;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.table.AbstractTableModel;
@SuppressWarnings("serial")
public class TableData extends AbstractTableModel {
	private List<Employ.EmInfo> list;
	private String[] headers = {"회사명","채용공고명","담당업무","지원자격","등록일","마감일"};
	public TableData() {
		updateList();
	}
	
	public String getColumnName(int cell) {
		return headers[cell];
	}
	
	public void updateList() {
		list = new ArrayList<>();
		try {
		
		Scanner sc = new Scanner(new File("src/Employ/data.csv"));
		for(int i = 0;sc.hasNextLine();i++) {
			String[] data = sc.nextLine().split(",");
			if(i!=0) {
			EmInfo e = new EmInfo();
			EmInfoBuilder eb = new EmInfoBuilder(e);
			
			e = eb
					.companyName(data[0])
					.Title(data[1])
					.Task(data[2])
					.Requirements(data[3])
					.startDate(data[4])
					.endDate(data[5])
					.emInfo();
			 
			list.add(e);
			}
		  }
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		switch(col) {
		case 0:
			return list.get(row).getCompanyName();
		case 1:
			return list.get(row).getTitle();
		case 2:
			return list.get(row).getDescription();
		case 3:
			return list.get(row).getRequirements();
		case 4:
			return list.get(row).getStartDate();
		case 5:
			return list.get(row).getEndDate();
		}
		return null;
	}



}
