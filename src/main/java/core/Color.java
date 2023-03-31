package core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class Color {
    private static List<Color> values = new ArrayList<>();
    public final static Color RED = new Color("RED");
    public final static Color BLUE = new Color("BLUE");
    private final String name;

    private Color(String name) {
        this.name = name;
        System.out.println(name);
        values.add(this);
    }

    public String name() {
        return name;
    }

    public static Color valueOf(String name) {
        Optional<Color> first = values().stream()
                .filter(color -> Objects.equals(color.name, name))
                .findFirst();

        return first.orElse(first.orElseThrow(NoSuchElementException::new));
    }

    public static Collection<Color> values() {
        List<Color> copy = new ArrayList<>(values.size());
        Collections.copy(copy, values);
        return copy;
    }
}
