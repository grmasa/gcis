package masa.gcis;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;



public class ScoreText extends Actor {
    private BitmapFont font = Game.content.getFont();
    private Greeceball greeceball;
    public ScoreText(Greeceball greeceball) {
        this.greeceball = greeceball;
    }

    public void updateTextures(){
        font = Game.content.getFont();
    }

    @Override
    public void draw(Batch batch, float alpha){
        font.draw(batch, String.format("%06d", greeceball.getScore()), 10f, Game.HEIGHT-10f);
    }
}
