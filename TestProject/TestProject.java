package TestProject;

class Animal
{

    private Boolean is_set = false;
    private String species;
    String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public void setSpecies(String species)
    {
        this.species = species;
        this.is_set = true;
    }

    public String getSpecies()
    {
        if(!is_set)
            return "Species not set";
        return "[Species]: " + this.species;
    }
}

public class TestProject
{
    public static void main(String[] args)
    {
        System.out.println("\n[TestProject]\n");
        Animal animal = new Animal("Dog");
        animal.setSpecies("Canis familiaris");
        System.out.println(animal.getSpecies());
    }
}