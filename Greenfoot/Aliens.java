import greenfoot.*;  

public class Aliens extends Actor implements Observer
{
    
    protected int score = 0;
    protected AlienExplosiveFactory alienexplosiveFactory;
    private boolean explosiveLaunch = false;
    private int counterLaunch = MyWorld.levelsStrategy.getStartCounterForLaunch();
    private int counterToReleaseExplosive = MyWorld.levelsStrategy.getCounterToReleaseExplosive();
    
    public void act() {
        move(-MyWorld.levelsStrategy.getSpeed());
        if (!explosiveLaunch && counterLaunch > counterToReleaseExplosive) {
            getWorld().addObject(alienexplosiveFactory.getExplosive(), getX(), getY() - 20);
            counterLaunch = 0;
        } else {
            counterLaunch ++;
        }
    }
    
    public void update(int X1, int X2) {
        if(this.getWorld() != null && getX() >= X1 && getX() <= X2) {
            getWorld().removeObject(this);
            MyWorld.scoreCntr.addScore(score);
            MyWorld.myWorld.removeObserver(this);
        }
    }
}
