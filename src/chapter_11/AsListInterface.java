package chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {
}

class Power extends Snow {
}

class Light extends Power {
}

class Heavy extends Power {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Power());
        List<Snow> snow2 = Arrays.asList(new Heavy(), new Light());
        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());
        List<Snow> snow4 = Arrays.<Snow>asList(new Heavy(), new Light());
    }
}
