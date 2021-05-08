package pl.javastart.cookbook.recipe.model;

import javax.persistence.*;

@Entity
public class PreparationInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 1_000)
    private String description;
    @ManyToOne
    private Recipe recipe;

    public PreparationInstruction() {
    }

    public PreparationInstruction(String name, String description, Recipe recipe) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
