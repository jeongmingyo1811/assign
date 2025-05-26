package class1.ex1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부"; product1.price = 2000; product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치"; product2.price = 5000; product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라"; product3.price = 1500; product3.quantity = 2;

        ProductOrder[] product = {product1,product2,product3};

        int total=0;

        for(int i=0; i<product.length; i++){
            System.out.println("상품명: "+product[i].productName+" 가격: "+product[i].price+" 수량: "+product[i].quantity);
            total+=(product[i].price*product[i].quantity);
        }
        System.out.println("총 결제 금액: "+total);
    }
}
