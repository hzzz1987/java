package java;

class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	public Player(int x, int y, int width, int height, int health) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	private int getWidth() {
		return width;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	private int getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

	private int getHealth() {
		return health;
	}

	private void setHealth(int health) {
		this.health = health;
	}
	
	
}


class Enemy {
	private int xenemy;
	private int yenemy;
	private int widthenemy;
	private int heightenemy;
	private int damage;
	
	public Enemy(int xenemy, int yenemy, int widthenemy, int heightenemy, int damage) {
		
		this.xenemy = xenemy;
		this.yenemy = yenemy;
		this.widthenemy = widthenemy;
		this.heightenemy = heightenemy;
		this.damage = damage;
	}

	private int getXenemy() {
		return xenemy;
	}

	private void setXenemy(int xenemy) {
		this.xenemy = xenemy;
	}

	private int getYenemy() {
		return yenemy;
	}

	private void setYenemy(int yenemy) {
		this.yenemy = yenemy;
	}

	private int getWidthenemy() {
		return widthenemy;
	}

	private void setWidthenemy(int widthenemy) {
		this.widthenemy = widthenemy;
	}

	private int getHeightenemy() {
		return heightenemy;
	}

	private void setHeightenemy(int heightenemy) {
		this.heightenemy = heightenemy;
	}

	private int getDamage() {
		return damage;
	}

	private void setDamage(int damage) {
		this.damage = damage;
	}
	
	
	
	
	
}


public class Game {

	public static void main(String[] args) {
		

	}

}
