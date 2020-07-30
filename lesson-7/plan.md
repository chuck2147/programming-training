# Lesson 7: July 28: Motion Control with Commands

## Steps
- How is project going
- Install VS Live share and join session

- Sensors
  - Limit switch: Detect if a known thing is at or past a certain position
    - Regular limit switch:
      - Detect if something is there or not
      - Good for when you know exactly where the thing you are detecting will move to/from
      - Bad for gamepieces
      - Very brittle and easy to break and cheap
      - Good for sensing end positions for robot arms/elevators
      - https://andymark-weblinc.netdna-ssl.com/product_images/push-switch/5bd37fe461a10d29679644f6/zoom.jpg?c=1540587492
      - Use DigitalInput class in WPILib
    - Magnetic limit switch (aka hall effect sensor):
      - Good for the same things as regular limit switch
      - Contactless and much more durable so you probably won't break them
      - https://cdn11.bigcommerce.com/s-t3eo8vwp22/images/stencil/500x500/products/285/1188/Hall_Sensor_FTC_FRC_Legal__67361.1531412477.png?c=2
      - Use DigitalInput class in WPILib: https://docs.wpilib.org/en/stable/docs/software/sensors/digital-inputs-software.html
  - Infrared/Ultrasonic sensors:
    - Good for sensing if something is there or not without contact
    - Much better than limit switches at sensing varied/inconsistent objects than limit switches
    - Great for sensing gamepieces
    - Also it is able to sense how far something is, but it depends on which sensor, and that tends to not work very well
    - Use AnalogInput class in WPILib: https://docs.wpilib.org/en/stable/docs/software/sensors/analog-inputs-software.html
  - Encoders: Measure the angle of an axis
    - Encoders can be used to sense drivetrain motion, elevator position, arm position
    - Some of them (absolute encoders) will still know where they are if you power off/on the robot
    - Others (relative encoders) reset when you power them off
    - Magnetic encoder: http://www.ctr-electronics.com/cancoder.html
      - This is a pretty good, pretty durable encoder
      - You can use the CANCoder class in the CTRE library
    - US Digital Encoder: https://www.andymark.com/products/ma3-absolute-encoder-with-cable
      - The connector breaks really easily. This is the one that we (and many teams) use for swerve
      - Harder to deal with in software, you have to use the AnalogInput class in WPILib
      - The encoder gives you back a voltage between 0V and 5V based on the angle, [here's an example of how to convert it to an angle](https://github.com/FRCTeam2910/Common/blob/master/robot/src/main/java/org/frcteam2910/common/robot/drivers/Mk2SwerveModuleBuilder.java#L91)
    - The Falcon and NEO motors have built in "encoders" that are able to tell you the angle

- Steps for installing vendor libraries for CTRE devices (only needed for CANCoder or Falcon): [Here are the steps](https://phoenix-documentation.readthedocs.io/en/latest/ch05_PrepWorkstation.html#what-to-download-and-why)
  - If you're on windows follow Option 1, otherwise Option 2
  - If you get stuck on these steps let me know
  - Here is a clarification of Option 2 for if you are not on Windows:
    - http://www.ctr-electronics.com/hro.html#product_tabs_technical_resources
    - Download CTRE Phoenix Framework (No Installer) package 5.18.3
    - Extract zip
    - Inside the extracted folder there will be a `vendordeps` folder. Copy that folder to your WPIlib installation folder. [This shows where to find your wpilib folder](https://docs.wpilib.org/en/latest/docs/software/wpilib-overview/3rd-party-libraries.html#the-mechanism-c-java).
    - Inside the extracted folder there will also be a `maven` folder. Copy that folder to your WPILib installation folder too.
  - Then after installing (either using option 1 or 2):
  - In VSCode right click on the build.gradle file in your project. Click Manage Vendor Libraries. Then click "Install new libraries offline" then choose ctre
  - Then run a build again to make sure everything worked
- CTRE documentation: https://phoenix-documentation.readthedocs.io/en/latest/index.html

- Adding an infrared hatch sensor
- Adding a PID controlled elevator with an encoder and a magnetic limit switch
- Updating to a motion profiled elevator if there is time

Here is the code from this week: https://github.com/calebeby/example-robot

## Assignment
- If you haven't caught up on the previous parts of the project, focus on working on that. Don't worry about this next step unless you are caught up:
- Try to add motion control to at least one part of your robot code
  - This involves using some sort of sensor, up to you what sensor you want to use. You can try to use the same sensor as the robot you are replicating uses, or you can choose another sensor.
  - If it is helpful, you can use my code to help figure out how to do that: https://github.com/calebeby/example-robot
  - I'll also be available on slack to help out if you are stuck

