# Lesson 6: July 14: More commands and command groups

## Steps
- How is assignment so far
- WPILib commands documentation: https://docs.wpilib.org/en/stable/docs/software/commandbased/commands.html
- Go through robot code I was working on https://www.thebluealliance.com/team/2056/2019
- Go through EjectHatch command
  - Command start and end, isFinished
  - withTimeout
  - SequentialCommandGroup
  - ParallelCommandGroup
  - RunCommand
- Ball intake: Add sensor
- Add an autonomous
  - andThen (sequential)
  - alongWith (parallel)
  - ParallelRaceGroup / raceWith
  - ParallelDeadlineGroup / deadlineWith

Here is the code from this week: https://github.com/calebeby/example-robot

## Assignment: 
- Finish project from last week
- Add to that project: Add an "autonomous mode" as a command made from command groups. Add any other commands you need to make it work (i.e. driving commands, turning commands, etc.)

--------------------------------------
this is for later, decided to leave it out this time

- Install vendor libraries for CTRE devices:
  - If you get stuck on these steps let me know
  - http://www.ctr-electronics.com/hro.html#product_tabs_technical_resources
  - Download CTRE Phoenix Framework (No Installer) package 5.18.3
  - Extract zip
  - Inside the extracted folder there will be a vendordeps folder. Copy that folder to your WPIlib installation folder. [This shows where to find your wpilib folder](https://docs.wpilib.org/en/latest/docs/software/wpilib-overview/3rd-party-libraries.html#the-mechanism-c-java).
  - Inside the extracted folder there will be a maven folder. Copy that file to the vendordeps folder in your WPIlib folder.
  - In vscode right click on the build.gradle file. Click Manage Vendor Libraries. Then click "Install new libraries offline" then choose ctre
  - Then run a build again to make sure everything worked
- CTRE documentation: https://phoenix-documentation.readthedocs.io/en/latest/index.html
