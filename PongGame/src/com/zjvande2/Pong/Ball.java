package com.zjvande2.Pong;

import java.awt.Graphics;

public class Ball {
	private int xSize;
	private int ySize;
	private int xPos;
	private int yPos;

	private int ballSpeed;

	private boolean wasInit = false;

	public Ball(int x, int y, int xs, int ys, int bs) {
		this.xPos = x;
		this.yPos = y;
		this.xSize = xs;
		this.ySize = ys;
		this.ballSpeed = bs;

	}

	public int getXPos() {
		return this.xPos;
	}

	public int getYPos() {
		return this.yPos;
	}

	public int getXSize() {
		return this.xSize;
	}

	public int getYSize() {
		return this.ySize;
	}

	public int getMoveSpeed() {
		return ballSpeed;
	}

	public void setXPos(int x) {
		this.xPos = x;
	}

	public void setYPos(int y) {
		this.yPos = y;
	}

	public String getInfo() {
		String ballInfo = ("This is a ball for now ");
		return ballInfo;
	}

	public void drawBall(Graphics g) {
		moveBall(g);
		drawCollider(true, g);
		clearBall();
	}

	public void moveBall(Graphics g) {
		setXPos(getMoveSpeed());
		setYPos(getMoveSpeed());

		g.fillArc(this.getXPos(), this.getYPos(), this.getXSize(), this.getYSize(), 0, 360);
	}

	public void clearBall() {

	}

	public void drawCollider(boolean draw, Graphics g) {
		if (draw) {
			g.drawRect(getXPos(), getYPos(), getXSize(), getYSize());
		} else {
			return;

		}
	}
}
