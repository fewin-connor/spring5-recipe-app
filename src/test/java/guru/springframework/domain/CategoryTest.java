package guru.springframework.domain;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

    Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void testGetDescription() {
        
    }

    @Test
    public void testGetId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void testGetRecipes() {

    }
}
