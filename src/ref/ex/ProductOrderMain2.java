package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);
        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }
    static void printOrders(ProductOrder[] orders){
        for(int i=0; i<orders.length;i++){
            System.out.println("상품명: "+orders[i].productName+" 가격: "+orders[i].price+" 수량: "+orders[i].quantity);
        }

    }
    static int getTotalAmount(ProductOrder[] orders){
        int total=0;
        for(int i=0; i<orders.length;i++){
            total+= orders[i].price *orders[i].quantity;
        }
        return total;
    }
}
