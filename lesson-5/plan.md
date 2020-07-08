# Lesson 5: July 8: Learn how to use WPILib to write code for robots

## Steps
- WPILib
- Documentation: https://docs.wpilib.org/en/stable/index.html
- API Documentation (list of all the classes and methods): https://first.wpi.edu/FRC/roborio/release/docs/java/index.html
- Review: RoboRIO
- Review: Motor Controllers
- Installing "WPILib" and "Language Support for Java" extensions in VSCode
- Initializing WPILib project (ctrl+shift+p/command+shift+p -> WPILib: Create a new project)
  - Template, Java, Command Robot
  - Open project in current window
  - All the robot code is in src/main/java/frc/robot
- `./gradlew build`
- "WPILib: Set VS Code Java Home to FRC Home" then restart
- Stage code in git
- Init vs Periodic methods
  - if vs while loops in periodic methods
- Demo motor control code in Robot.java - Spark and SpeedController
- Demo tank drive code in Robot.java
- Piston/solenoid control in Robot.java - Cursor
- Command-based programming: https://docs.wpilib.org/en/stable/docs/software/commandbased/what-is-command-based.html
  - Subsystems
  - Commands
- Moving tank drive code into subsystem
  - SetDefaultCommand
- Moving intake code into subsystem
- Command groups: https://github.com/chuck2147/FRC-2020/blob/master/src/main/java/frc/robot/commands/autonomous/TrenchAuto.java
  - Add auto mode command to example robot

## Assignment: Program part of a robot
- Set up wpilib stuff on your computer (I listed which things to install above, tell me if you have questions)
- Initialize a new project
- Find a robot on the blue alliance (can be one from last week's list or any other frc robot)
- Program all the parts of the robot with manual control.
  - I would recommend using Subsystems and Commands rather than putting everything into Robot.java, but it is up to you.
  - You will probably need to reference the [Command Based Programming](https://docs.wpilib.org/en/stable/docs/software/commandbased/index.html) documentation. If you have any questions feel free to ask me
- We don't have a way to test your code, so that makes it really hard to know if your code will work
- At the very least you should be able to build it with `./gradlew build`
- Create a new repository on GitHub (follow instructions from a couple weeks ago) and commit and push your changes there. Let me know if you need help, I can put more instructions here.

