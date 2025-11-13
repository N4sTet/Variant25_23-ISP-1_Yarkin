package Lab9.Hero;

public class Hero {
    private String name;
    private int energy;
    private String role;

    public Hero(String name, int energy, String role) {
        setName(name);
        setEnergy(energy);
        setRole(role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Hero{name='" + name + "', energy=" + energy + ", role='" + role + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return energy == hero.energy && name.equals(hero.name) && role.equals(hero.role);
    }
}
