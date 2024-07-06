
public class GameRunner {

	mario m;
	GameLauncher g1;
	public GameRunner(GameRunner g1) {
		// TODO Auto-generated constructor stub
		this.m = g1;
	}
	public void run() {
		// TODO Auto-generated method stub
		m.up();
		m.down();
		m.goBack();
		m.ahead();
	}

}
