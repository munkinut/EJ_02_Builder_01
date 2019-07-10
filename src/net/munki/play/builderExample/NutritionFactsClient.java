package net.munki.play.builderExample;

public class NutritionFactsClient {
    
    public static void main(String args[]) {
        NutritionFacts cocaCola = 
                new NutritionFacts.Builder(240, 8)
                        .calories(100)
                        .sodium(35)
                        .carbohydrate(27)
                        .build();
        System.out.println("Serving Size : " + cocaCola.getServingSize());
        System.out.println("Servings : " + cocaCola.getServings());
        System.out.println("Calories : " + cocaCola.getCalories());
        System.out.println("Fat : " + cocaCola.getFat());
        System.out.println("Sodium : " + cocaCola.getSodium());
        System.out.println("Carbs : " + cocaCola.getCarbohydrate());
    }
}
