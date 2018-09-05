
import java.util.Random;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private float scoreKeep = 0;

	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}

	public void tick() {
		scoreKeep++;

		if (scoreKeep >= 500) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			if(hud.getLevel() <= 3) {
				for(int i =0;i<hud.getLevel();i++) {
				handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH), r.nextInt((int)Game.HEIGHT), ID.BasicEnemy, handler));
				
				}
			}
			else if(hud.getLevel() == 4 || hud.getLevel() == 5) 
			{
				handler.addObject(new FastEnemy(r.nextInt((int)Game.WIDTH), r.nextInt((int)Game.HEIGHT), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 6){
				handler.addObject(new SmartEnemy(r.nextInt((int)Game.WIDTH), r.nextInt((int)Game.HEIGHT), ID.SmartEnemy, handler));
			}
				
				
				
		}

	}

}
