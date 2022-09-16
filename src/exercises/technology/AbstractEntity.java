package exercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public class AbstractEntity {
    private int Id;

    public AbstractEntity(){
        System.out.println("first in Abstract");
        this.Id = ThreadLocalRandom.current().nextInt(0,100 + 1);
            }

    public int getID(){
        return this.Id;
    }

}
