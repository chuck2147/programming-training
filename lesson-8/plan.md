# Lesson 8: August 5: Network Tables

## Steps
- Project check in
- https://docs.wpilib.org/en/stable/docs/software/networktables/networktables-intro.html
- Purposes of network tables:
  - Share variables/data between different devices on the robot network
  - Communicate with software on the driver station laptop
  - Communicate with the FMS
  - Communicate with network-connected devices on the robot (limelight, etc.)
- Example use: Knowing which command a subsystem is being used for
- Example: Displaying information to the driver
  - Sending ball sensor state
- Example use: Knowing which auto mode to run
  - Robot tells driver station laptop which auto modes are available
  - When the drivers select an auto mode, it sends the selected one's name to the robot over networktables
  - The robot starts whichever auto mode corresponds with the currently selected autonomous name

- What should we cover in future weeks?
  - Vision tracking
  - Practice writing/modifying robot code
  - Autonomous path following
  - Practice reading other teams' robot code

## Assignment
- Continue working on your robot project

