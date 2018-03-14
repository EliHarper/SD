## Jets Project

### Description:

I used a lot of what I've recently learned in this program.
The structure of my program is in line with the UML diagram that was posted for reference.
I used some of the array-copying information that we used and learned about during in the CarRepository lab to create arrays with specific models. Once I got that working, I commented it out and tried to implement a similar idea using the ArrayList data type.

I broke it several times in the process. 

The JetsApp launch() method runs the program, which calls on the rest of the classes. Jet was my abstract class that contained getters/setters for each of the Jet objects and their properties. The main menu functioned using a switch statement that ran directly out of the launch method, calling methods of instances that were contained in my other classes. 

The addJet method seemed to give me the most trouble; although it was a little easier with the ArrayList as opposed to the array.
While I fixed the majority of the problems, I haven't ironed out an issue where the addJet method needs you to hit return again after adding your range (the last prompt) - I've tried adding in more .nextLine() which I've read can help, but it still isn't perfect.

I had a recurring issue that more than one sysout would print to get user input to add each Jet, which then broke the program.
I'm sure there are other ways to fix that issue, but I fixed it by using the .nextLine() method and parsing each String to their corresponding type. I didn't mind doing it, and it was cool to be able to use that soon after learning about it.