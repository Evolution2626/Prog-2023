// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.allo

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public interface Constants {
  public interface OperatorConstants {
     int DeviceNumberAvantDroit = 6;
     int DeviceNumberAvantGauche = 5;
     int DeviceNumberArriereDroit = 7;
     int DeviceNumberArriereGauche = 3;
     int DeviceNumbermoteurGobbeur = 2;
    int kDriverControllerPort = 0;
  }
  public interface PCM{
    int PISTON_BACK_LEFT_FORWARD = 0;
    int PISTON_BACK_LEFT_REVERSE = 1;
    int PISTON_BACK_RIGHT_FORWARD = 2;
    int PISTON_BACK_RIGHT_REVERSE = 3;


    int PISTON_FRONT_LEFT_FORWARD = 4;
    int PISTON_FRONT_LEFT_REVERSE = 5;
    int PISTON_FRONT_RIGHT_FORWARD = 6;
    int PISTON_FRONT_RIGHT_REVERSE = 7;

    int PISTON_PINCE_FORWARD = 0;
    int PISTON_PINCE_REVERSE = 1;


}
}