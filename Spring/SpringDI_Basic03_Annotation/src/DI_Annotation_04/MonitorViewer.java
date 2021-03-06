package DI_Annotation_04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
//	private Recorder recorder;
//
//	public Recorder getRecorder() {
//		return recorder;
//	}
//
//	public void setRecorder(Recorder recorder) {
//		this.recorder = recorder;
//	}
	
	//setter 통한 자동주입
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	//@Autowired 예외 (같은 타입의 객체가 여러개)
	@Resource(name = "zz") //by name (같은 타입이 여러개 있더라도 name 으로 지정된 것 하나 선택)
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공");
	}
	
}






















