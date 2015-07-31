package com.game.uyen.game3D.graphics;

import java.util.Arrays;
import java.util.Random;

public class Screen extends Render {

	private Render test;

	public Screen(int width, int height) {
		super(width, height);
		Random random = new Random();
		test = new Render(256, 256);

		for (int i = 0; i < 256 * 256; i++) {
			test.pixels[i] = random.nextInt();
		}
	}

	public void render() {

		int animX = (int) (Math.sin(System.currentTimeMillis() % 1000.0 / 1000 * Math.PI * 2) * 100);
		int animY = (int) (Math.cos(System.currentTimeMillis() % 1000.0 / 1000 * Math.PI * 2) * 100);
		Draw(test, (width - 256) / 2 + animX, (height - 256) / 2 + animY);
	}
	
	public void clear() {
		Arrays.fill(pixels, 0);
	}

}
