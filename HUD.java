
import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	public static float HEALTH = 100;
	private float greenValue = 255;

	private float score = 0;
	private float level = 1;

	public void tick() {

		HEALTH = (int) Game.clamp(HEALTH, 0, 100);
		greenValue = (int) Game.clamp(greenValue, 0, 255);

		greenValue = HEALTH * 2;

		score++;
	}

	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);
		try{g.setColor(new Color(75,(int) greenValue, 0));}
		catch(IllegalArgumentException e) {
			
		}
		g.fillRect(15, 15, (int) (HEALTH * 2), 32);
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);

		g.drawString("Score: " + score, 15, 64);
		g.drawString("|| Level: " + level, 100, 64);
		
		g.drawString("Level 1-3: basic enemies",15,80);
		g.drawString("Level 4-5: fast enemies ",15, 90);
		g.drawString("Level 6: smart enemy ",15, 100);


	}

	public void score(float score) {
		this.score = score;

	}

	public float getScore() {
		return score;
	}

	public void setLevel(float level) {
		this.level = level;
	}

	public float getLevel() {
		return level;
	}

}
