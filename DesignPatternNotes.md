**Strategy Pattern**

Feature: 
Making changes to different aspects of gameplay when level changes

Explanation: 
Strategy pattern allows developing a family of interchangeable algorithms by encapsulating them in a common interface. The client using the algorithm doesn't need to be aware of the internal implementation.

In our case, MyWorld is a client that uses LevelsStrategy.
LevelFirstStrategy and LevelSecondStrategy are two child implementations of LevelsStrategy.
When the player achieves a certain score, the client just has to switch from using one strategy to another.
Alien spawning rate, background and speed of game are behaviors defined in LevelsStrategy.
These automatically change when the LevelsStrategy instance changes, without the knowledge of the client.

**Observer Pattern**

Feature: 
Updating scores and health

Explanation: 
Observer pattern defines a 1:Many dependency, such that when one objects changes its dependents are notified and get updated. 
Score and Health class are updated using this pattern.


**Command Pattern**

Feature: 
Play &  Help Initiation

Explanation: 
Command pattern encapsulate all the information needed to trigger an event. 
In the game, Play button triggers My World to instatiate. Once it is hit, the pilot(Bazooka) moves to the right and Aliens randomly throws the weapon at the pilot. 
Help button triggers a new page with instructions on game strategies and other useful information.


**Factory Pattern**

Feature:
Different types of Alien explosive objects 

Explanation:
Factory Pattern is a creational pattern that creates an object for the class that uses it while at the same time hiding the object creation logic.
In the game, 3 alien explosives, bomb, metal and grenade are created from AlienExplosiveFactory. Since the game requires multiple different types of instances of explosives used by different types of aliens, we found it best to make use of (Creational) Fatory Pattern. 
