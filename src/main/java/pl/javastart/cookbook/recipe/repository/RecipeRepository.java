package pl.javastart.cookbook.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.javastart.cookbook.recipe.model.Category;
import pl.javastart.cookbook.recipe.model.Recipe;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByCategory(Category category);

    List<Recipe> findAllByOrderByLikesCounterDesc();

    @Transactional
    @Modifying
    @Query("UPDATE Recipe recipe SET recipe.isLiked = :isLicked, recipe.likesCounter = :likesCounter WHERE recipe.id = :id")
    void updateRecipeIsLickedById(@Param("isLicked") boolean isLicked, @Param("likesCounter") int likesCounter, @Param("id") Long id);

    @Transactional
    @Modifying
    void deleteRecipeById(Long id);

}
