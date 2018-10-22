/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1038.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Spark;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class Robot extends IterativeRobot {

    Spark left;
    Spark right;
    Joystick j;
    Relay on;
    Relay off;

    public void robotInit() {
    	left = new Spark(Wiring.LEFT_MOTOR);
    	right = new Spark(Wiring.RIGHT_MOTOR);
        j = new Joystick(0);
        on=new Relay(Joystick1038.X_BUTTON);
        off=new Relay(Joystick1038.A_BUTTON);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {

        left.set(j.getRawAxis(1));
        right.set(j.getRawAxis(3));
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {

    }

}