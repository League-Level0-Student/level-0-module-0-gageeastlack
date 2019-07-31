package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
 Robot c3po = new Robot();
	c3po.penDown();
	c3po.setRandomPenColor();
	c3po.setSpeed(10);
	c3po.move(200);
	c3po.turn(90);
	c3po.move(200);
	c3po.turn(180);
	c3po.move(200);
	c3po.turn(270);
	c3po.move(200);
	c3po.turn(270);
	c3po.move(200);
	c3po.turn(270);
	c3po.move(100);
	c3po.turn(270);
	c3po.move(100);
}
}
