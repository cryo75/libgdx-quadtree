package com.innerlogic.quadtreedemo;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher
{
    public static void main(String[] arg)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title = "quadtree-demo";
        config.useGL20 = true;
        config.width = 1000;
        config.height = 1000;

        new LwjglApplication(new QuadtreeDemo(), config);
    }
}