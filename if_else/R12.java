public class R12 {
    public static void main(String args[]){
        int cost_price=500;
        int selling_price=600,profit,loss;
        if(selling_price>cost_price){
             profit=selling_price-cost_price;
             System.out.print("your profit : " + profit);
        }else if(selling_price<cost_price){
               loss= cost_price-selling_price;
            System.out.print("your loss : " + loss);
        }
    }
    
}
