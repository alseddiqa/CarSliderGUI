package exercise5_4;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderTester {

	static JFrame frame = new JFrame();
	static Car car = new Car(100, 100);

	public static void main(String[] args) {
		
		frame.setSize(500, 700);
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 10);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				int val = slider.getValue();

				car.changeCarPosition(val);
				frame.repaint();

			}

		});

		frame.setTitle("Slider Tester");

		frame.getContentPane().setLayout(new GridLayout(2, 1));

		frame.getContentPane().add(car);

		frame.getContentPane().add(slider);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}
}
