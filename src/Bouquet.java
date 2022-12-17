

public class Bouquet
{

    private final Flower flowerBouquet;
    private int count;

    public Bouquet(Flower flowerBouquet, int count){
        this.flowerBouquet=flowerBouquet;
        this.count=count;
    }

    public Flower getFlowerBouquet() {
        return flowerBouquet;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private static double getSumCostBouquet(Bouquet[] flowerArray)
    { double sumCost=0;
        for (Bouquet bouquet : flowerArray) {
            sumCost += bouquet.getCount() * bouquet.getFlowerBouquet().getCost();
        }
        sumCost+=sumCost*0.1;
        return sumCost;
    }

    private static int getBouquetLifeSpan(Bouquet[] flowerArray)
    { int lifeMin=Integer.MAX_VALUE;
        for (Bouquet bouquet : flowerArray) {
            if (bouquet.getFlowerBouquet().getLifeSpan() < lifeMin) {
                lifeMin = bouquet.getFlowerBouquet().getLifeSpan();
            }
        }

       return lifeMin;
    }
    public static void getAllBouquet(Bouquet[] flowerArray)
    {
        System.out.println("Букет :");
        for (Bouquet bouquet : flowerArray) {
            System.out.println(bouquet.getFlowerBouquet().getFlowerName() + " " + bouquet.getCount() + " штук");
        }
        System.out.println( "Сумма за букет " + String.format("%.2f",getSumCostBouquet(flowerArray)));
        System.out.println(" Время стояния " + getBouquetLifeSpan(flowerArray));
    }

}

//ok
