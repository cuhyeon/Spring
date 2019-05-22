package DI3;
//VO, DTO, Domain과 같은 개념 (데이터를 담을 수 있는 클래스)
public class NewRecord implements Record{
	private int kor;
	private int eng;
	private int math;
	
	public NewRecord(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int total() {
		return this.kor + this.eng + this.math;
	}
	
	@Override
	public float avg( ) {
		return total()/3.0f; //실수자리 for 접미사 : f
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}