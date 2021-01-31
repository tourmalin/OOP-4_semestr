import java.util.ArrayList;

public class Telephon {
    private String brand;
    private String model;
    private String color;
    private Integer price;
    private Integer memory;
    private Integer sim;
    private Double diagEkran;

    // конструктор для занесения в базу
    public Telephon(String brand, String model, String color, Integer price, Integer memory, Integer sim, Double diagEkran) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.memory = memory;
        this.sim = sim;
        this.diagEkran = diagEkran;
    }
    // конструктор для поиска Объекта по брэнду и модели
    public Telephon(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // для поиска Объекта по брэнду и модели
    public boolean equals(Object t) {
            Telephon another = (Telephon)t;
        return (brand.compareTo(another.brand) == 0 && model.compareTo(another.model) == 0);
    }

    // для вывода наличия смартфона Объекта по брэнду, модели, цвета
    public String toString() {
        String opisy = "Имееется в наличии, brand : " + brand + ", модель: " + model + ", цвет: " + color ;
        return opisy;
    }

    // геттеры и сеттеры
    public String getBrand() {
        return brand;    }
    public void setBrand(String brand) {
        this.brand = brand;    }
    public String getModel() {
        return model;    }
    public void setModel(String model) {
        this.model = model;    }
    public String getColor() {
        return color;    }
    public void setColor(String color) {
        this.color = color;    }
    public Integer getPrice() {
        return price;    }
    public void setPrice(Integer price) {
        this.price = price;    }
    public Integer getMemory() {
        return memory;    }
    public void setMemory(Integer memory) {
        this.memory = memory;    }
    public Integer getSim() {
        return sim;    }
    public void setSim(Integer sim) {
        this.sim = sim;    }
    public Double getDiagEkran() {
        return diagEkran;    }
    public void setDiagEkran(Double diagEkran) {
        this.diagEkran = diagEkran;    }
}
// главный метод
// создания базы телефонов, изменение смартфона по индексу,
// поиск смартфона марки Xiaomi модель "Redmi Note"
// удалим смартфоны первый и последний в списке
// покажем все оставшиеся телефоны
class Test03 {
    public static void main(String[] args) {
        ArrayList<Telephon> smartfons = new ArrayList<>();
        // добавим в список ряд элементов
        for (int i=0; i < 2; i++) {
            smartfons.add(new Telephon("ITEL","IT5630","black",1790,8,2,2.8));        }
        for (int i=2; i < 4; i++) {
            smartfons.add(new Telephon("ITEL","IT5630","silver",1390,4,2,2.8));        }
        for (int i=4; i < 6; i++) {
            smartfons.add(new Telephon("Vertex","D514","grey",890,4,1,2.4));        }
        for (int i=6; i < 8; i++) {
            smartfons.add(new Telephon("Honor","Honor 10X Lite","green",15000,4000,2,6.67));}
        for (int i=8; i < 10; i++) {
            smartfons.add(new Telephon("Samsung","Galaxy M21","blue",18000,4000,2,6.4)); }

        // изменение смартфона
        smartfons.set(2,new Telephon("Xiaomi", "Redmi Note", "RED", 14980,64000,2,6.8));
        // добавим  смартфон  "Смартфон Xiaomi Redmi Note  Blue (Синий)  14980 64GB 2  6.8 "
        smartfons.add(new Telephon("Xiaomi", "Redmi Note", "Blue", 14980,64000,2,6.8));

        // поиск желаемого смартфона марки Xiaomi модель "Redmi Note"
        Telephon wanted = new Telephon("Xiaomi", "Redmi Note");
        for ( Telephon w : smartfons )
            if ( w.equals(wanted) )
                System.out.println(w);

        // удалим смартфоны первый и последний в списке
        System.out.printf("В наличии %d смартфонов: \n", smartfons.size());
        smartfons.remove(0);
        smartfons.remove(smartfons.size()-1);
        System.out.println();

        // выводим все телефоны в наличие
        System.out.printf("Имеется в наличии %d смартфонов: \n", smartfons.size());
        for(Telephon spisok : smartfons){
            System.out.println(spisok);
        }
    }
}
