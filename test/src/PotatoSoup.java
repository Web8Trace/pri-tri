public class PotatoSoup extends Bouillon {
    double potato;
    double carrot;

    PotatoSoup(Bouillon buuillion, double potato, double carrot){
        super(buuillion.water,buuillion.salt,buuillion.meat);
        this.potato = potato;
        this.carrot = carrot;
    }

    PotatoSoup(SoupBase soupBase, double potato, double carrot){
        super(soupBase.water,soupBase.salt);
        this.potato = potato;
        this.carrot = carrot;
    }

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты картофельного супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
        System.out.println("Картошка: " + potato + " шт.");
        System.out.println("Морковка: " + carrot + " шт.");
    }
}