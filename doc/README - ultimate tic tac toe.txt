[Ultimate Tic Tac Toe]
Authors: Irena Liu, Katy Tsao
Revision: 5-22-2021


Introduction: 
If you like logic games, Ultimate Tic-Tac-Toe will be fun for you. This game is based on the very well-known game tic-tac-toe, but includes 10 games in progress simultaneously, with strategy needed to bring them all together. 
Last year in physics we played ultimate tic-tac-toe with friends, but after a lot of wasted paper, some of our friends got tired of it and we were sad. This program will solve both the problem of bored high schoolers wasting a vast amount of paper for tic-tac-toe games, and being lonely. By creating a digital version, we can do our part in promoting sustainability and conserving crucial resources such as paper. In addition, traditional tic-tac-toe requires 2 people which means that bored and lonely high schoolers can’t enjoy the game at their own convenience which can harm their mental wellbeing. With our program, these people can find joy in playing tic-tac-toe without having to worry about finding someone else to play with them thanks to our AI mode consisting of several levels. 
In Ultimate Tic-Tac-Toe, there is a large tic-tac-toe grid and in each box there is a smaller game. The rules are similar to regular tic-tac-toe in that you want to win the large game by getting three in a row, but in order to claim a box of the large game you have to win the smaller game in that location. After your opponent selects a box of a small game, you have to play in the game in the location of the big game corresponding to the location they played in the smaller game.
Our game can be used by all people, regardless of their age and location thanks to the instructions embedded into the program, as well as the use of firebase to allow people to join different game servers.
Other primary features include color-coding for last plays and highlighted games, undo and reset buttons, AI mode, and speed mode. 



Instructions:
When the user first runs the program, they are met with a screen to chose their "game room" or create their own. Once the user joins a room the main menu is displayed in which they will navigate through to set up the game. If there are two people in a room, one person should be designated to do the controls to avoid crashes. The icons that are displayed in the main menu are “settings,” “how to play,” and “play.” 

If the user selects “settings,” they are able to change their game mode. The options are enabling AI mode and Speed mode.  If AI is selected the user will play against the computer and will not need to find an opponent. If timer mode is selected, the game will move at a faster pace and the users players have to make all their moves in 120 seconds total. If the timer runs out, the opponent automatically wins.
After they customize their game, they will have to go back to the main menu and select “play” to go to the main game.

If the user selects “how to play,” they will be shown the instructions. 

During the match, they click on the space on the board where they would like to place their next move. You have to make your next move in the mini-game corresponding to your opponent's last move. The mini-game box will light up green and that will signify where the next move should be placed. If none of the boxes light up, you can place your move anywhere you'd like. This happens when the mini-game the user should move to is already claimed (there's a winner there). 


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* Full graphics: we’ll use Swing graphics to draw the games. Most user interaction will be through clicking, so we will implement MouseListeners that allow you to click through menus and select boxes.
* Undo and reset buttons: we’ll implement buttons that will remove the last play, or reset the game.
* Basic AI: an AI that really just randomly selects an available location. It won’t be too hard to win against this basic AI. 
* Main menu: the starting menu. Its options will include Play, where users can play the game; How to Play, which will have game instructions; and Settings, where players can change the game colors and icons, and select an AI level.
* Online game (Firebase): embed this game in a website (and use something with constant push/pull requests like websockets) so people can play the game with friends remotely. 


Want-to-have Features:
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]

* Color coding: different colors will highlight the last play, and the current mini-game.
* Changing colors: users will be able to change the color of their X/O color, or the highlight color
* Changing icons: we’ll have options other than X and O, and users will be able to change their icon.
* Speed game: player has a certain amount of time total
* Win tally: If players are playing multiple games, we’ll keep a running tally of how many games each player has won, and their win streak[b]
* Timer: have a timer that runs the time limit for one turn, so that players can’t spend forever on their turn. This can be enabled/disabled in settings, and max time per turn can be adjusted. 



Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Learning AI: AI that starts at the highest strategic level, and has algorithms to learn what the user’s strategies are and block those. 
* Mobile play: find a way to play this game on a mobile device instead of just desktop.
* Additional players: allow adding additional players to make it harder, so you have to win against multiple people, meaning there's now multiple players in a game not just 2. 
* Simultaneous games: Use Firebase to allow the ability to create/join different rooms

Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]

* AI	
	* RandomPlayer
* Board
* Mark
	* O
	* X
* Spot
* Post 
* Main
* Game
* Instructions
* Menu
* Settings
* View
* RoomChooser




Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
* Give credit to all outside resources used. This includes downloaded images or sounds, external java libraries, parent/tutor/student coding help, etc.]

Outside resources:
* Main menu tic tac toe image: wikipedia
* Setting background colors: https://svn.apache.org/repos/asf/uima/uimaj/trunk/uimaj-ep-cas-editor/src/main/java/org/apache/uima/caseditor/core/model/DefaultColors.java
* Mr. Shelby's firebase and swing graphics demos
* Java API for swing

Irena Liu:
* Created and updated UML
* Views package (Main menu, Instructions, etc)
* Implement navigation between pages
* Game modes
* Discuss Game board setup
* Plan and edit presentation


Katy Tsao:
* Setup Eclipse project and classes
* Objects package (board, marks, etc)
* Basic AI
* FireBase
* Discuss and setup Game board
* Fixed navigation and firebase bug



