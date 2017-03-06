package com.example.felipe.juegoandengine2;

import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.util.color.Color;
import com.example.felipe.juegoandengine2.SceneManager.SceneType;
/**
 * Created by felipe on 3/03/17.
 */

public class LoadingScene extends BaseScene
{
    @Override
    public void createScene()
    {
        setBackground(new Background(Color.WHITE));
        Text texto = new Text(400, 240, resourcesManager.font, "Loading...", vbom);
        texto.setPosition(400-texto.getWidth()/2, 240-texto.getHeight()/2);
        attachChild(texto);
    }

    @Override
    public void onBackKeyPressed()
    {
        return;
    }

    @Override
    public SceneType getSceneType()
    {
        return SceneType.SCENE_LOADING;
    }

    @Override
    public void disposeScene()
    {

    }


}