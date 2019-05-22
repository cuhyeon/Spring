package DI_Annotation_03;

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

	//@Autowired(required = true) 기본설정 (무조건  : Injection) false 하면 있으면 넣고 없으면 말고~ 
	// 애초에 주입을 하려고 만든거라 잘 안씀  
	@Autowired(required = false) //타입기반 (IOC 컨테이너 안에 Recorder 타입을 가지는 객체가 있으면
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공");
	}
	
}






















