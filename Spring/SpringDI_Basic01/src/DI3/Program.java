package DI3;

import DI3.NewRecordView;

public class Program {
	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100, 70, 80);
		
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord(100, 60, 80);
		
		view.setRecord(record);
		view.input();
		view.print();
		
	}
}
