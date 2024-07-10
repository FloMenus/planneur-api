package com.planneur.api.feeder;
import com.planneur.api.model.Category;

import java.util.ArrayList;
import java.util.List;

public class InitialCategoriesFeeder {
    public static List<Category> getInitialCategories(Integer appUserId) {
           List<Category> categories = new ArrayList<>();
              categories.add(new Category("Work", "#FF0000", 1, appUserId));
              categories.add(new Category("Personal", "#00FF00", 2, appUserId));
              categories.add(new Category("Health", "#0000FF", 3, appUserId));
        return categories;
    }

}
