class StockSpanner {

//defining list

  List<Integer> list;

  public StockSpanner() {

    this.list = new ArrayList<>();

  }


  public int next(int price) {


//add the price to list array

    list.add(price);
    int days = 0; // days variable for keep tracking the consecutive days


//Start traversing from last index
//If list prev value is greater then current day price then return 1 else keep traversing

    for (int i = list.size() - 1; i >= 0; i--) {

      if (list.get(i) > price) {
        break;
      }

      else {
        days++;
      }
    }

    return days;

  }
}

