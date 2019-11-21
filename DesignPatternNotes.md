**Strategy Pattern**

Feature: 
Making changes to different aspects of gameplay when level changes

Explanation: 
Strategy pattern allows developing a family of interchangeable algorithms by encapsulating them in a common interface. The client using the algorithm doesn't need to be aware of the internal implementation.

In our case, MyWorld is a client that uses LevelsStrategy.
LevelFirstStrategy and LevelSecondStrategy are two child implementations of LevelsStrategy.
When the player achieves a certain score, the client just has to switch from using one strategy to another.
Alien spawning rate, background and speed of game are behaviors defined LevelsStrategy.
These automatically change when the LevelsStrategy instance changes, without the knowledge of the client.

**Observer Pattern**

Feature: 
Updating scores and health

Explanation: 
Observer pattern defines a 1:Many dependency, such that when one objects changes its dependents are notified and get updated. 
Score and Health class are updated using this pattern.



Feature: 

Explanation: 

