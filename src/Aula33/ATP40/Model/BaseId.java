package Aula33.ATP40.Model;

import java.util.Random;

public class BaseId {
    Random random = new Random();
    int id = random.nextInt(100);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseId)) return false;

        BaseId baseId = (BaseId) o;

        return id == baseId.id;
    }
}
