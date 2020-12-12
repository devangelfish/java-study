package prob3;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute(String function) {
		if (function.equals("앱")) {
			playApp();
			return;
		} else if (function.equals("음악")) {
			playMusic();
			return;
		}
		
		super.execute(function);
	}

	private void playApp(){
		System.out.println("앱실행");
	}
	
	private void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
}
