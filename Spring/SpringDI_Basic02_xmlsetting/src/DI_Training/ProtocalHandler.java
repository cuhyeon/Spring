package DI_Training;

import java.util.List;

public class ProtocalHandler {
	private List<MyFilter> filters;

	public List<MyFilter> getFilters(){
		
		return this.filters;
	}
	
	public void setFilters(List<MyFilter> filters) {
		this.filters = filters;
	}

	//검증하는 함수
	public int filter_Length() {
		return this.filters.size();
	}

}
