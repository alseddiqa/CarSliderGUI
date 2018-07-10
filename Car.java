package exercise5_4;

import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;

import java.awt.geom.Line2D;

import java.awt.geom.Point2D;

import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * 
 * A car shape that can be positioned anywhere on the screen.
 * 
 */

public class Car extends JPanel

{

	private double x;

	private double y;

	private int tyreWidth;

	private int bodyWidth;

	private int bodyHeight;

	private int tyreHeight;

	/**
	 * 
	 * Constructs a car with a given top left corner
	 * 
	 * @param x
	 *            the x coordinate of the top left corner
	 * 
	 * @param y
	 *            the y coordinate of the top left corner
	 * 
	 */

	public Car(double x, double y)

	{

		this.x = x;

		this.y = y;

		tyreWidth = 10;

		bodyHeight = 10;

		tyreHeight = 10;

		bodyWidth = 60;

	}


	@Override

	protected void paintComponent(Graphics g) {

		draw((Graphics2D) g);
	}

	/**
	 * 
	 * Draws the car
	 * 
	 * @param g2
	 *            the graphics context
	 * 
	 */

	public void draw(Graphics2D g2)
	{
		Rectangle2D.Double body

				= new Rectangle2D.Double(x, y + bodyHeight, bodyWidth, bodyHeight);

		Ellipse2D.Double frontTire

				= new Ellipse2D.Double(x + 10, y + 2 * tyreHeight, tyreWidth, tyreHeight);

		Ellipse2D.Double rearTire

				= new Ellipse2D.Double(x + 30 + 10, y + 2 * tyreHeight, tyreWidth, tyreHeight);

		// the bottom of the front windshield

		Point2D.Double r1

				= new Point2D.Double(x + bodyHeight, y + bodyHeight);

		// the front of the roof

		Point2D.Double r2

				= new Point2D.Double(x + 10 + bodyHeight, y);

		// the rear of the roof

		Point2D.Double r3

				= new Point2D.Double(x + 30 + bodyHeight, y);

		// the bottom of the rear windshield

		Point2D.Double r4

				= new Point2D.Double(x + 40 + bodyHeight, y + bodyHeight);

		Line2D.Double frontWindshield

				= new Line2D.Double(r1, r2);

		Line2D.Double roofTop

				= new Line2D.Double(r2, r3);

		Line2D.Double rearWindshield

				= new Line2D.Double(r3, r4);

		g2.draw(body);

		g2.draw(frontTire);

		g2.draw(rearTire);

		g2.draw(frontWindshield);

		g2.draw(roofTop);

		g2.draw(rearWindshield);

	}
	
	public void changeCarPosition(int value) {
		x = value * 2;
	}


}