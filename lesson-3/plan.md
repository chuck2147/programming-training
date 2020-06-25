# Lesson 3: June 24

## Goals
- Learn more about return statements
- Learn more about parameters, and learn overloads
- Static Methods
- Using the Command Line
- Learning to use Git and GitHub
- Installing and using VSCode
- Installing and using Java

## Steps
- Return statement example: isPrime
- Static method example: isPrime, checkIsPrime
- Overloads explanation - example: Add print boolean parameter to isPrime
  - Function/Method Signature
- Setting up your computer for programming
- Folder == directory
- Command line: 
- Command line navigation:
  - `cd`: Change Directory. Go to a different folder
  - `pwd`: Print Working Directory. Prints out which folder you are currently in
  - `ls`: List out all the files and folders in the current folder
- Git: Version Control System
- GitHub: Version Control Host (uses git)
- VS Code
- Git terms:
  - Repo/Repository:
  - Clone:
  - Commit:
    - Commit Messages
  - Pull:
  - Push:
  - Merge Conflict:
  - Branch:
- GitHub terms:
  - Pull Request/PR:
  - Review:
    - Diff:
    - Example: https://github.com/cloudfour/cloudfour.com-patterns/pull/716

## Assignment: Set up your computer and push your code to GitHub

Note: If you are on a Chromebook you won't be able to do these steps. Let me know and we'll figure something out
Note: If you are on Linux let me know and I will write steps for you

You're probably going to run into some problem while doing these steps because your computer is different from mine. I wrote out the steps as best as I could, but you will probably run into something that I didn't expect. That is ok, let me know and I can try to help.

### MacOS:

- To access a terminal on MacOS, look for the Terminal application.
- Install Homebrew. This is a package manager which means it lets you install stuff for programming really easily. Like steam but for programming instead of games and everything is free. https://brew.sh/
- Install Git
  - Run `brew install git`
- Install VS Code
  - Run `brew cask install visual-studio-code`. Cask means that it is installing an application that has a graphical interface rather than just a command line tool.
- Install Java JDK:
  - Run `brew cask install java`

### Windows:

- Install Git for Windows: https://gitforwindows.org/. There will be some options that you have to check/uncheck when you install. I don't remember what all of these options are. Make sure you enable any options related to installing Git Bash. If you aren't sure about an option, ask me
- After you install Git for Windows, you can access a terminal via Git Bash
- Install VS Code: https://code.visualstudio.com/Download
- Install Java JDK: https://www.oracle.com/java/technologies/javase-downloads.html

### Upload your code to GitHub (all OS's)

- Create a GitHub Account: https://github.com/
- In your GitHub account create a repository: https://github.com/new. You can call it `summer-java-programming` or something. Make sure it is set to public and the "Initialize this repository with a README" box is checked.
- Clone the repository to your computer. The instructions are [here](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/cloning-a-repository) (make sure to select the right OS so it gives you the right instructions)
- Once the repo is cloned, open VS Code to the folder where you have cloned the repo. You can run `code .` to do this automatically
- In VS Code, create files for each of the previous assignments. Paste the code for the projects into those files. Then compile and run the code with Java to make sure it is working.
- Stage the new files and commit them
