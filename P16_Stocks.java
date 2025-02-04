public class P16_Stocks {

    public static int buyOrSell(int price[]) {
        int buyPrice = price[0];
        int maxProfit = 0;

        for(int i=1;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice; //Today's Profit
                maxProfit = Math.max(maxProfit, profit); //Max Profit
            } else {
                buyPrice = price[i]; //Update Buy Price
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 7, 4};
        System.out.println("Max Price : " + buyOrSell(price));
    }
}
