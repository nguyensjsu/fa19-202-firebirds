/* 
 * Displays the Menu screen
 * 
 */

import greenfoot.*;

public class MenuWorld extends World {
public GreenfootSound bgm = new GreenfootSound("main.mp3");
    /**
     * Constructor for objects of MenuWorld
     */
    public MenuWorld() {

        super(1100, 700, 1);
        GreenfootImage image = new GreenfootImage("menu.jpeg");
        setBackground(image);
        bgm.playLoop();
        prepare();
    }

    /**
     * Setting buttons at appropriate positions
     */
    private void prepare() {

        Receiver playRcv = new Receiver();

        Play pc = new Play();
        Help hc = new Help();
        Receiver helpRcv = new Receiver();

        pc.setReceiver(playRcv);
        hc.setReceiver(helpRcv);

        ButtonPlay bp = new ButtonPlay();
        ButtonHelp bh = new ButtonHelp();

        bh.setCommand(hc);
        bp.setCommand(pc);

        addObject(bp, 450, 251);
        addObject(bh, 650, 251);

       

    }

    public void act() {

    }

}
