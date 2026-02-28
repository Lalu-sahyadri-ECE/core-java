class RecipeBook {
public static void getSteps(String orderItem) {
System.out.println("Getting recipe steps for: " + orderItem);
IngredientList.checkStock(orderItem);
    }
}