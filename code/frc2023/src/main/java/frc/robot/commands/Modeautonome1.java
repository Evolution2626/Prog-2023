// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Modeautonome1 extends SequentialCommandGroup {
  /** Creates a new Modeautonome1. */
  public Modeautonome1() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
       



      // 1. Deposer l'objet

      // 2. Recule jusqua la plateform 

      // 3. Crabe pour saligner sur la plateform
      // 4. Aller sur la plateform
    );
  }
}
