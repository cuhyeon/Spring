package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

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

	@Autowired //타입기반 (IOC 컨테이너 안에 Recorder 타입을 가지는 객체가 있으면
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	
}
