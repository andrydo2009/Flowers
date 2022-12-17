

public  class Main {
    public static void main(String[] args) {


        Flower flower_1=new Flower("Роза обыкновенная","Голландия",35.59,0);
        Flower flower_2=new Flower("Хризантема","",15.0,5);
        Flower flower_3=new Flower("Пион","Англия",69.90,1);
        Flower flower_4=new Flower("Гипсофила","Турция",19.5,10);
        Flower flower_5=new Flower("",null,-10,-90);
        System.out.println(flower_1);
        System.out.println(flower_2);
        System.out.println(flower_3);
        System.out.println(flower_4);
        System.out.println(flower_5);


        Bouquet[] flower=new Bouquet[2];
        flower [0]=new Bouquet(flower_3,1);
        flower [1]=new Bouquet(flower_2,1);
        Bouquet.getAllBouquet(flower);
        flower[0].setCount(10);
        Bouquet.getAllBouquet(flower);

    }
}

//