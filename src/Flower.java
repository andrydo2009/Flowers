import java.text.DecimalFormat;
import java.util.Objects;

public class Flower
{
    private final   String  flowerName;         // название цветка
    private final   String country;            // страна происхождения
    private final   double cost;               // цена
    int lifeSpan;                      // срок стояния



    public String getFlowerName() {
        return  flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        lifeSpan = Math.max(lifeSpan, 0);
        this.lifeSpan = lifeSpan;
    }

    Flower (String flowerName, String country, double cost, int lifeSpan){

        if (flowerName==null^ Objects.equals(flowerName, "")){this.flowerName="Тип цветка не указан";}
        else {this.flowerName=flowerName;}
        if (country==null^ Objects.equals(country, "")){this.country="Россия";}
        else {this.country=country;}
        this.cost=Math.max(cost, 0.0);
        Flower.this.setLifeSpan(lifeSpan);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(cost,flower.cost)  &&  Objects.equals(flowerName,flower.flowerName)
                && Objects.equals(country,flower.country) && Objects.equals(lifeSpan, flower.lifeSpan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerName, country, cost, lifeSpan);
    }

    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    public String toString() {
        return "Название цветка: " + getFlowerName() + ", страна происхождения:  " + getCountry() +
                ", цена: " + df.format(getCost()) + ", время стояния: " + getLifeSpan();
    }
}