AP Computer Science Final Project - README Template


Instructions:
The first step in creating an excellent APCS final project is to write up a README. At this stage, this README file acts as your project proposal. Once you’ve filled in all components, Shelby will read through it and suggest edits. Ultimately, you need a document that adequately describes your project idea and we must agree on this plan.


Have one member of your group make a copy of this Google Doc. Then, they should share it with all other members so that every group member has edit permissions.


There’s a lot of parts of this document that you might not have full answers for yet. Because you haven’t written the program yet, it’s difficult to think about the instructions or which group members will do which parts. Even though this is hard to think about, you must have something in these sections that acts as your current plan. However, during the course of the project, you’ll continuously update this document. This means that you will not be held to exactly what you put here - components of this document can change (and it’s pretty common!).


There is one exception: the Features List section. Once Shelby OKs your README, the Features List section cannot be modified. For this reason, it is most important that you get a solid idea of what you want to make and the primary features it will have now.


Talk with your group. Consider drawing some pictures of what you think your project might look like. Be precise. When you’re ready, fill this out together. Each component in brackets below ( [these things] ) should be replaced with your ideas. Note that there are several sample READMEs posted on this assignment for you to use as guidance.




-------------------When README is finalized, remove everything above this line--------------------


[Ultimate Tic Tac Toe]
Authors: Irena Liu, Katy Tsao
Revision: 5-6-2021


Introduction: 
If you like logic games, Ultimate Tic-Tac-Toe will be fun for you. This game is based on the very well-known game tic-tac-toe, but includes 10 games in progress simultaneously, with strategy needed to bring them all together. 
Last year in physics we played ultimate tic-tac-toe with friends, but after a lot of wasted paper, some of our friends got tired of it and we were sad. This program will solve both the problem of bored high schoolers wasting a vast amount of paper for tic-tac-toe games, and being lonely. By creating a digital version, we can do our part in promoting sustainability and conserving crucial resources such as paper. In addition, traditional tic-tac-toe requires 2 people which means that bored and lonely high schoolers can’t enjoy the game at their own convenience which can harm their mental wellbeing. With our program, these people can find joy in playing tic-tac-toe without having to worry about finding someone else to play with them thanks to our AI mode consisting of several levels. In Ultimate Tic-Tac-Toe, there is a large tic-tac-toe grid and in each box there is a smaller game. The rules are similar to regular tic-tac-toe in that you want to win the large game by getting three in a row, but in order to claim a box of the large game you have to win the smaller game in that location. After your opponent selects a box of a small game, you have to play in the game in the location of the big game corresponding to the location they played in the smaller game.
Primary features include color-coding for last plays and highlighted games, undo and reset buttons, and a multi-level AI. 




Instructions:
When the user first runs the program, they are met with the main menu in which they will navigate through to set up the game. The icons that are displayed in the main menu are “settings,” “how to play,” and “play.” 

If the user selects “settings,” they are able to customize their player by changing their icon and X/O color. This is also where they chose between the AI or multiplayer mode.  If AI is selected there may be multiple levels that the player can choose to play against. 

After they customize their game, they will have to go back to the main menu and select “play” to go to the main game.

If the user selects “how to play,” they will be shown the instructions. 

During the match, they click on the space on the board where they would like to place their next move.


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* Full graphics: we’ll use Swing graphics to draw the games. Most user interaction will be through clicking, so we will implement MouseListeners that allow you to click through menus and select boxes.
* Undo and reset buttons: we’ll implement buttons that will remove the last play, or reset the game.
* Basic AI: an AI that really just randomly selects an available location. It won’t be too hard to win against this basic AI. 
* Main menu: the starting menu. Its options will include Play, where users can play the game; How to Play, which will have game instructions; and Settings, where players can change the game colors and icons, and select an AI level.
* Online game: embed this game in a website (and use something with constant push/pull requests like websockets) so people can play the game with friends remotely. 


Want-to-have Features:[a]
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]


* Color coding: different colors will highlight the last play, and the current mini-game.
* Changing colors: users will be able to change the color of their X/O color, or the highlight color
* Changing icons: we’ll have options other than X and O, and users will be able to change their icon.
* Multi-level AI: an AI that has some sort of strategy algorithm, instead of just randomly picking. 


* Win tally: If players are playing multiple games, we’ll keep a running tally of how many games each player has won, and their win streak[b]
* Timer: have a timer that runs the time limit for one turn, so that players can’t spend forever on their turn. This can be enabled/disabled in settings, and max time per turn can be adjusted. 
* Speed Tic-tac-toe: this game mode is like speed chess in that each player has a total amount of time they can spend on their turns. This mode can be toggled in the settings menu, and total time can be adjusted. 


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Learning AI: AI that starts at the highest strategic level, and has algorithms to learn what the user’s strategies are and block those. 
* Mobile play: find a way to play this game on a mobile device instead of just desktop.
* Ultimate Ultimate Tic-Tac-Toe: a tic-tac-toe game of 9 Ultimate Tic-Tac-Toe games, where you have to win 3 ultimate tic-tac-toe games in a row in the biggest game.
* Additional players: allow adding additional players to make it harder, so you have to win against multiple people. [c]


Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]
* Main(JFrame): runs a JFrame with the game in it
* Menu(JPanel)
* Game(JPanel)
* Board
* Post
* Spot(Rectangle)
* Mark
   * X(Mark)
   * O(Mark)
* AI
   * RandomPlayer
* Instructions(JPanel)
* Settings(JPanel)
* View



Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
* Give credit to all outside resources used. This includes downloaded images or sounds, external java libraries, parent/tutor/student coding help, etc.]

Outside resources:
* Main menu tic tac toe image: wikipedia
* Setting background colors: https://svn.apache.org/repos/asf/uima/uimaj/trunk/uimaj-ep-cas-editor/src/main/java/org/apache/uima/caseditor/core/model/DefaultColors.java

Irena Liu:
Done:
* Created and updated UML
To-do:
* Figure out navigation between pages


Katy Tsao:
Done:
* Setup Eclipse project and classes
To-do:
* Set up the main game