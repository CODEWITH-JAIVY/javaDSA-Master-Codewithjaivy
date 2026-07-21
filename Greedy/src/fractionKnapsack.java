import java.util.Arrays;

class Item  {
    int value ;
    int weight  ;

    Item  (int  value  ,  int weight  ) {
        this.weight = weight ;
        this.value = value  ;
    }
}
public class fractionKnapsack {

    public static  int   getMaxValue ( Item  [] items ,  int capacity  ) {

        Arrays.sort ( items  ,  (a, b) ->
                Double.compare(
                        (double)a.value / b.weight ,
                        (double)b.value / b.weight
                )
                );
        int totalValue  = 0  ;
        for(Item  item  : items  ) {
          if(capacity  >= item.weight ) {
              totalValue += item.value  ;
              capacity = capacity - item.weight  ;

          } else {
              totalValue +=
                      ( (double)  item.value  / item.weight  ) * capacity   ;
              break;
          }
        }
       return  totalValue  ;
    }

    public static void main(String[] args) {

        Item[] items = {
                new Item(60,10),
                new Item(100,20),
                new Item(120,30)
        };

        int capacity = 50;

        System.out.println(getMaxValue(items, capacity));
    }

}
