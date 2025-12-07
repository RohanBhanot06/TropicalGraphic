package JavaGraphicsAssignment;

/* Name: Rohan Bhanot 
 * Starting Date: Friday, March 1, 2024
 * Ending Date: Thursday, March 7, 2024
 * Teacher: Elena Kapustina
 * Course Code: ICS4U1-02
 * Program Name: RohanGraphicsAssignment
 * Description: Creating Nature in my Native Country: Sail ship in the ocean (Nicobar Islands, India).
 */

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RohanGraphicsAssignment extends JFrame {

	public void paint(Graphics g) {

		Graphics2D ga = (Graphics2D) g;
		Graphics2D g2 = (Graphics2D) ga;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Drawing background
		Point2D backgroundStart = new Point(0, 0);
		Point2D backgroundEnd = new Point(500, 400);
		Color backgroundStartColor = new Color(78, 204, 220); // Light blue
		Color backgroundEndColor = new Color(186, 240, 250); // Light white/blue
		GradientPaint backgroundGradient = new GradientPaint(backgroundStart, backgroundStartColor, backgroundEnd, backgroundEndColor);
		ga.setPaint(backgroundGradient);
		ga.fillRect(0, 0, 500, 400);

		// Drawing sun
		Point2D sunStart = new Point(420, 0);
		Point2D sunEnd = new Point(520, 100);
		Color sunStartColor = Color.YELLOW; // Yellow
		Color sunEndColor = new Color(255, 140, 0); // Deep orange
		GradientPaint sunGradient = new GradientPaint(sunStart, sunStartColor, sunEnd, sunEndColor);
		ga.setPaint(sunGradient);
		ga.fillOval(420, 0, 100, 100);

		// Drawing clouds
		ga.setColor(new Color(224, 252, 254));
		ga.fillOval(50, 50, 70, 40);
		ga.fillOval(80, 60, 70, 40);
		ga.fillOval(120, 50, 70, 40);
		ga.fillOval(150, 60, 70, 40);
		ga.fillOval(300, 50, 70, 40);
		ga.fillOval(330, 60, 70, 40);
		ga.fillOval(360, 120, 70, 40);
		ga.fillOval(400, 130, 70, 40);
		ga.fillOval(50, 120, 70, 40);
		ga.fillOval(80, 130, 70, 40);
		ga.fillOval(200, 120, 70, 40);

		// Drawing birds
		ga.setColor(Color.white);
		drawBird(ga, 250, 80);
		drawBird(ga, 15, 80);
		drawBird(ga, 300, 120);
		drawBird(ga, 400, 100);
		drawBird(ga, 15, 160);
		drawBird(ga, 460, 170);

		// Drawing water
		Point2D waterStart = new Point(0, 200);
		Point2D waterEnd = new Point(0, 400);
		Color waterStartColor = new Color(105, 223, 251); // Light blue
		Color waterEndColor = new Color(0, 118, 209); // Dark blue
		GradientPaint waterGradient = new GradientPaint(waterStart, waterStartColor, waterEnd, waterEndColor);
		ga.setPaint(waterGradient);
		Rectangle2D.Double water = new Rectangle2D.Double(0, 200, 500, 200);
		ga.fill(water);

		// Drawing waves
		ga.setColor(new Color(186, 240, 250));
		int waveWidth = 60;
		int waveHeight = 10;
		for (int i = 0; i < 500; i += waveWidth) {
			drawWave(ga, i, 200, waveWidth, waveHeight);
			drawWave(ga, i, 220, waveWidth, waveHeight);
			drawWave(ga, i, 240, waveWidth, waveHeight);
			drawWave(ga, i, 260, waveWidth, waveHeight);
			drawWave(ga, i, 280, waveWidth, waveHeight);
			drawWave(ga, i, 310, waveWidth, waveHeight);
			drawWave(ga, i, 330, waveWidth, waveHeight);
			drawWave(ga, i, 350, waveWidth, waveHeight);
			drawWave(ga, i, 370, waveWidth, waveHeight);
			drawWave(ga, i, 390, waveWidth, waveHeight);
		}

		// Drawing island
		ga.setColor(new Color(255, 235, 193));
		ga.fillOval(40, 250, 300, 60);
		ga.fillOval(70, 260, 300, 40);
		ga.fillOval(10, 260, 300, 40);
		ga.setColor(new Color(251, 226, 170));
		ga.fillOval(40, 250, 290, 50);
		ga.fillOval(70, 265, 290, 30);
		ga.fillOval(10, 265, 290, 30);

		// Drawing mountains
		Polygon mountain = new Polygon();
		mountain.addPoint(50, 275);
		mountain.addPoint(325, 275);
		mountain.addPoint(188, 50);
		ga.setColor(new Color(89, 110, 124));
		ga.fill(mountain);
		Polygon mountainMiddle = new Polygon();
		mountainMiddle.addPoint(60, 275);
		mountainMiddle.addPoint(315, 275);
		mountainMiddle.addPoint(188, 90);
		ga.setColor(new Color(126, 155, 177));
		ga.fill(mountainMiddle);
		Polygon mountainMiddle1 = new Polygon();
		mountainMiddle1.addPoint(70, 275);
		mountainMiddle1.addPoint(305, 275);
		mountainMiddle1.addPoint(188, 130);
		ga.setColor(new Color(89, 110, 124));
		ga.fill(mountainMiddle1);
		Polygon mountainLeft1 = new Polygon();
		mountainLeft1.addPoint(20, 275);
		mountainLeft1.addPoint(198, 275);
		mountainLeft1.addPoint(88, 130);
		ga.setColor(new Color(115, 142, 165));
		ga.fill(mountainLeft1);
		Polygon mountainRight1 = new Polygon();
		mountainRight1.addPoint(178, 275);
		mountainRight1.addPoint(365, 275);
		mountainRight1.addPoint(288, 130);
		ga.setColor(new Color(115, 142, 165));
		ga.fill(mountainRight1);
		Polygon mountainLeft = new Polygon();
		mountainLeft.addPoint(30, 275);
		mountainLeft.addPoint(188, 275);
		mountainLeft.addPoint(88, 160);
		ga.setColor(new Color(89, 110, 124));
		ga.fill(mountainLeft);
		Polygon mountainRight = new Polygon();
		mountainRight.addPoint(188, 275);
		mountainRight.addPoint(355, 275);
		mountainRight.addPoint(288, 160);
		ga.setColor(new Color(89, 110, 124));
		ga.fill(mountainRight);

		// Round Mountain 1
		Path2D.Double mountain1 = new Path2D.Double();
		mountain1.moveTo(20, 275);
		mountain1.curveTo(50, 275, 100, 100, 150, 275);
		mountain1.curveTo(150, 275, 100, 50, 200, 275); // Adjusted to 200 to stay within the limit
		mountain1.curveTo(200, 275, 150, 100, 250, 275); // Adjusted to 250 to stay within the limit
		mountain1.curveTo(250, 275, 200, 100, 320, 275); // Adjusted to 320 to stay within the limit
		mountain1.lineTo(320, 275); // Adjusted to 320 to stay within the limit
		mountain1.closePath();
		g2.setColor(new Color(115, 143, 165));
		g2.fill(mountain1);

		// Round Mountain 2
		Path2D.Double mountain2 = new Path2D.Double();
		mountain2.moveTo(40, 275); // Adjusted to 40, so it starts after the x value of 20
		mountain2.curveTo(100, 275, 150, 150, 200, 275);
		mountain2.curveTo(200, 275, 150, 100, 250, 275); // Adjusted to 250 to stay within the limit
		mountain2.curveTo(250, 275, 200, 150, 350, 275); // Adjusted to 350 to stay within the limit
		mountain2.lineTo(350, 275); // Adjusted to 350 to stay within the limit
		mountain2.closePath();
		g2.setColor(new Color(126, 155, 177));
		g2.fill(mountain2);

		// Round Mountain 3
		Path2D.Double mountain3 = new Path2D.Double();
		mountain3.moveTo(60, 275); // Adjusted to 60, so it starts after the x value of 20
		mountain3.curveTo(150, 275, 200, 200, 250, 275); // Adjusted to 250 to stay within the limit
		mountain3.curveTo(250, 275, 200, 150, 320, 275); // Adjusted to 320 to stay within the limit
		mountain3.curveTo(320, 275, 300, 200, 355, 275); // Adjusted to 355 to stay within the limit
		mountain3.lineTo(355, 275); // Adjusted to 355 to stay within the limit
		mountain3.closePath();
		g2.setColor(new Color(115, 143, 165));
		g2.fill(mountain3);

		// Drawing palm trees
		drawPalmTree(ga, 50, 180);
		drawPalmTree(ga, 120, 180);
		drawPalmTree(ga, 190, 180);
		drawPalmTree(ga, 260, 180);
		drawPalmTree(ga, 320, 180);

		// Drawing bushes
		Point2D bushStart = new Point(0, 250);
		Point2D bushEnd = new Point(0, 290);
		Color bushStartColor = new Color(36, 105, 3); // Darker green
		Color bushEndColor = new Color(113, 193, 4); // Lighter green
		GradientPaint bushGradient = new GradientPaint(bushStart, bushStartColor, bushEnd, bushEndColor);
		ga.setPaint(bushGradient);
		for (int i = 30; i <= 310; i += 20) {
			ga.fillOval(i, 250, 40, 40);
		}

		// Drawing boat
		drawBoat(ga, 275, 275);

		// Drawing leaves
		ga.setColor(new Color(115, 189, 7)); // Green leaves
		drawLeaf(ga, 75, 180);
		ga.setColor(new Color(78, 152, 4)); // Green leaves
		drawLeaf(ga, 5, 180);
		ga.setColor(new Color(115, 189, 7)); // Green leaves
		drawLeaf(ga, 215, 180);
		ga.setColor(new Color(78, 152, 4)); // Green leaves
		drawLeaf(ga, 145, 180);
		ga.setColor(new Color(78, 152, 4)); // Green leaves
		drawLeaf(ga, 275, 180);

	}

	/*
	 * Method Name: drawPalmTree Purpose: Draws a palm tree at the specified
	 * location. PRE: Graphics2D ga, int x, int y POST: None
	 */
	private void drawPalmTree(Graphics2D ga, int x, int y) {
		ga.setColor(new Color(94, 80, 48)); // Brown trunk
		ga.fillRect(x, y, 10, 100);
	}

	/*
	 * Method Name: drawBoat Purpose: Draws a boat at the specified location. PRE:
	 * Graphics2D ga, int x, int y POST: None
	 */
	private void drawBoat(Graphics2D ga, int x, int y) {
		// Drawing boat body
		ga.setColor(new Color(217, 143, 84));
		Arc2D.Float boatBody = new Arc2D.Float(x, y, 200, 100, 180, 180, Arc2D.OPEN);
		ga.fill(boatBody);
		ga.setColor(new Color(67, 51, 46));
		Arc2D.Float boatBodyInside = new Arc2D.Float(x, y + 35, 195, 30, 180, 180, Arc2D.OPEN);
		ga.fill(boatBodyInside);
		ga.setColor(new Color(249, 228, 203));
		Arc2D.Float boatStripe1 = new Arc2D.Float(x + 10, y + 60, 180, 20, 180, 180, Arc2D.OPEN);
		ga.fill(boatStripe1);
		ga.setColor(new Color(249, 228, 203));
		Arc2D.Float boatStripe2 = new Arc2D.Float(x + 43, y + 80, 114, 20, 180, 180, Arc2D.OPEN);
		ga.fill(boatStripe2);

		// Drawing mast
		ga.setColor(Color.black);
		ga.fillRect(x + 190, y - 50, 2, 100);
		ga.fillRect(x + 90, y + 42, 100, 2);

		// Drawing flag
		ga.setColor(new Color(240, 239, 239));
		Arc2D.Float flag = new Arc2D.Float(x + 108, y - 50, 200, 100, 100, 135, Arc2D.OPEN);
		ga.fill(flag);
		Polygon flag1 = new Polygon();
		flag1.addPoint(425, 315);
		flag1.addPoint(370, 315);
		flag1.addPoint(382, 270);
		ga.setColor(new Color(231, 24, 54));
		ga.fill(flag1);
		Polygon flag2 = new Polygon();
		flag2.addPoint(433, 300);
		flag2.addPoint(446, 270);
		flag2.addPoint(395, 250);
		flag2.addPoint(386, 260);
		ga.setColor(new Color(231, 24, 54));
		ga.fill(flag2);
		Polygon flag3 = new Polygon();
		flag3.addPoint(466, 224);
		flag3.addPoint(435, 230);
		flag3.addPoint(410, 240);
		flag3.addPoint(455, 250);
		ga.setColor(new Color(231, 24, 54));
		ga.fill(flag3);

		// String
		ga.setColor(Color.black);
		Arc2D.Float leftWing = new Arc2D.Float(x + 178, y - 56, 50, 120, 120, 110, Arc2D.OPEN);
		ga.draw(leftWing);
	}

	/*
	 * Method Name: drawWave Purpose: Draws a wave at the specified location with
	 * given width and height. PRE: Graphics2D ga, int x, int y, int width, int
	 * height POST: None
	 */
	private void drawWave(Graphics2D ga, int x, int y, int width, int height) {
		Arc2D.Float wave = new Arc2D.Float(x, y, width, height, 0, 180, Arc2D.OPEN);
		ga.draw(wave);
	}

	/*
	 * Method Name: drawBird Purpose: Draws a bird at the specified location. PRE:
	 * Graphics2D ga, int x, int y POST: None
	 */
	private void drawBird(Graphics2D ga, int x, int y) {
		// Left wing
		Arc2D.Float leftWing = new Arc2D.Float(x - 10, y, 20, 20, 0, 120, Arc2D.OPEN);
		ga.draw(leftWing);

		// Right wing
		Arc2D.Float rightWing = new Arc2D.Float(x + 10, y, 20, 20, 60, 120, Arc2D.OPEN);
		ga.draw(rightWing);
	}

	/*
	 * Method Name: drawLeaf Purpose: Draws a leaf at the specified location. PRE:
	 * Graphics2D ga, int x, int y POST: None
	 */
	private void drawLeaf(Graphics2D ga, int x, int y) {
		int leafWidth = 100;
		int leafHeight = 40;

		// Angled left leaf
		Arc2D.Float angledLeafLeft = new Arc2D.Float(x, y + 15, leafWidth, leafHeight, 60, 140, Arc2D.CHORD);
		ga.fill(angledLeafLeft);

		// Angled right leaf
		Arc2D.Float angledLeafRight = new Arc2D.Float(x + 10, y + 13, leafWidth, leafHeight, -20, 120, Arc2D.CHORD);
		ga.fill(angledLeafRight);

		// Angled left leaf2
		Arc2D.Float angledLeafLeft2 = new Arc2D.Float(x, y + 15, leafWidth, leafHeight, 60, 140, Arc2D.CHORD);
		ga.fill(angledLeafLeft2);

		// Angled right leaf2
		Arc2D.Float angledLeafRight2 = new Arc2D.Float(x + 10, y + 13, leafWidth, leafHeight, -20, 120, Arc2D.CHORD);
		ga.fill(angledLeafRight2);

		// Left leaf
		Arc2D.Float leafLeft = new Arc2D.Float(x, y + 3, 100, 40, 60, 120, Arc2D.CHORD);
		ga.fill(leafLeft);

		// Right leaf
		Arc2D.Float leafRight = new Arc2D.Float(x, y, 100, 40, 0, 120, Arc2D.CHORD);
		ga.fill(leafRight);
	}

	public static void main(String args[]) {
		JFrame frame = new RohanGraphicsAssignment();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);

	}

}