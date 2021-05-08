package pl.javastart.cookbook.recipe.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    private int serves;
    private int likesCounter;
    private boolean isLiked;
    private int preparationTime;
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<PreparationInstruction> preparationInstructions;

    public Recipe() {
    }

    public Recipe(String name, Category category, int serves, int likesCounter, boolean isLiked, int preparationTime,
                  List<Ingredient> ingredients, List<PreparationInstruction> preparationInstructions) {
        this.name = name;
        this.category = category;
        this.serves = serves;
        this.likesCounter = likesCounter;
        this.isLiked = isLiked;
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
        this.preparationInstructions = preparationInstructions;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getServes() {
        return serves;
    }

    public void setServes(int serves) {
        this.serves = serves;
    }

    public int getLikesCounter() {
        return likesCounter;
    }

    public void setLikesCounter(int likesCounter) {
        this.likesCounter = likesCounter;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<PreparationInstruction> getPreparationInstructions() {
        return preparationInstructions;
    }

    public void setPreparationInstructions(List<PreparationInstruction> preparationInstructions) {
        this.preparationInstructions = preparationInstructions;
    }
}
