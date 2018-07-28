package masa.gcis;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;



public class FadeInOutSprite extends Actor {
    protected Sprite sprite;
    private float fadeInDuration;
    private float fadeOutDuration;
    public FadeInOutSprite(Texture texture, float fadeInDuration, float fadeOutDuration, float y) {
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        sprite = new Sprite(texture);
        setColor(1f,1f,1f,0f);
        setPosition(Game.WIDTH/2f - sprite.getWidth()/2f, y);
    }
	
	public FadeInOutSprite(Texture texture, float fadeInDuration, float fadeOutDuration) {
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        sprite = new Sprite(texture);
        setColor(1f,1f,1f,0f);
        setPosition(Game.WIDTH - sprite.getWidth(), Game.HEIGHT - sprite.getHeight()-5);
    }

    public void show() {
        addAction(Actions.fadeIn(fadeInDuration));
    }

    public void hide() {
        addAction(Actions.fadeOut(fadeOutDuration));
    }

    public void updateTexture(Texture tex){
        sprite.setTexture(tex);
    }

    @Override
    public void draw(Batch batch, float alpha) {
        batch.setColor(1f,1f,1f, getColor().a);
        batch.draw(sprite, getX(), getY());
        batch.setColor(1f,1f,1f,1f);
    }

}
