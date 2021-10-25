package Aula25.ATP28.Model;

public class Base {
    public String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Base)) return false;

        Base base = (Base) o;

        return id.equals(base.id);
    }

    @Override
    public String toString() {
        return "Base_id: " + id;
    }
}
