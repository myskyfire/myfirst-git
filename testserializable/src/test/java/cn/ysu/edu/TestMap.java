package cn.ysu.edu;

/**
 * <p><b>Description：</b></p>
 * <p>s</p>
 * <p><b>createTime: </b></p>
 * <p>2018/6/28 9:22</p>
 *
 * @author huangjinzhao
 * @since s
 */

public class TestMap {

    public static void main(String[] args) {
        Car car1 = new Car(1, "a");
        Car car2 = new Car(1, "a");
        //why need to rewrite hashCode
        System.out.println(car1.hashCode()); //2101842856
        System.out.println(car2.hashCode()); //1151020327


        System.out.println(car1.equals(car2));

        //why need to rewrite equals
        //Object equals
        //public boolean equals(Object obj) {
        //        return (this == obj);
        //    }
    }


    static class Car {
        long cardNo;
        String cardBrand;

        Car(long cardNo, String cardBrand) {
            this.cardBrand = cardBrand;
            this.cardNo = cardNo;
        }

        public long getCardNo() {
            return cardNo;
        }

        public void setCardNo(long cardNo) {
            this.cardNo = cardNo;
        }

        public String getCardBrand() {
            return cardBrand;
        }

        public void setCardBrand(String cardBrand) {
            this.cardBrand = cardBrand;
        }

        public int hashCode(){
            return (int) (cardNo*cardBrand.hashCode());
        }

        public boolean equals(Car anotherCar){
            return  this.cardNo==anotherCar.cardNo&& this.cardBrand.equals(anotherCar.cardBrand);
        }

    }
}
