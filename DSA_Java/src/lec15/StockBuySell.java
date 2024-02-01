package lec15;

public class StockBuySell {
	
	    public int maxProfit(int[] prices) {
	        int maxProfit =0;
	        int minsofar = prices[0];
	        for(int i =0 ; i<prices.length ; i++){
	            minsofar = Math.min(minsofar , prices[i] );
	            int profit = prices[i] - minsofar ;
	            maxProfit = Math.max(maxProfit ,   profit);

	        }
	        return maxProfit ;
	    }
	}

